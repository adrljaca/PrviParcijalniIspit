package SustavEvidencijeVozila;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvidencijaVozila {
    private static List<Vozilo> vozila = new ArrayList<>();

    public static void main(String[] args) throws IOException, NeispravniPodaciException {
        Scanner scan = new Scanner(System.in);

        //Predefinirana vozila
        Automobil auto1 = new Automobil("OS-535-ZZ", "BMW", 2024, 2);
        Automobil auto2 = new Automobil("ZG-9067-DF", "Audi", 2023, 4);
        Motocikl motor1 = new Motocikl("NA-5678-GI", "Yamaha", 2021,"Sportski");
        Motocikl motor2 = new Motocikl("DJ-134-JU", "Kawasaki", 2018,"Normalni");

        //Dodajemo u listu vozila
        vozila.add(auto1);
        vozila.add(auto2);
        vozila.add(motor1);
        vozila.add(motor2);

        //Metoda pomoću koje učitavamo podatke od korisnika i na osnovu toga kreiramo vozilo
        while (true) {
            System.out.print("Unesite (1 za učitavanje, 2 za izlaz):");
            int opcija = scan.nextInt();
            scan.nextLine();
            if (opcija == 1) {
                ucitajPodatke();
            } else if (opcija == 2) {
                break;
            } else {
                System.out.println("Krivi unos, ponovite!");
            }
        }

        //Za spremanje liste vozila u .txt datoteku
        System.out.print("Unesite putanju datoteke: ");
        String putanja = scan.nextLine();
        spremiPodatkeUDatoteku(putanja);

        //Za učitavanje podataka iz datoteke vozila
        System.out.print("Unesite putanju datoteke učitavanja:");
        putanja = scan.nextLine();
        ucitajPodatkeIzDatoteke(putanja);
    }

    //Kreiramo i spremamo listu vozila u .txt datoteku
    public static void spremiPodatkeUDatoteku(String datoteka) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(datoteka));

        for (Vozilo vozilo : vozila) {
            writer.write(vozilo.prikaziPodatke());
            writer.write("\n");
        }
        System.out.println("Vozila su spremljena na " + datoteka + "\n");

        writer.close();
    }

    //Učitavamo podatke iz .txt datoteke
    public static void ucitajPodatkeIzDatoteke(String datoteka) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(datoteka));

        String linija;

        System.out.println("Učitavanje podataka iz datoteke " + datoteka + "\n");

        while ((linija = reader.readLine()) != null) {
            System.out.println(linija);
        }

        reader.close();
    }

    //Metoda za kreiranje novog vozila unošenjem podataka
    public static void ucitajPodatke() {
        Scanner scanner = new Scanner(System.in);

        //Pitamo korisnika da se odluči za jednu od dvije opcije
        System.out.print("Unesite tip vozila (1 za Auto, 2 za Motocikl): ");
        int tipVozila = scanner.nextInt();
        scanner.nextLine();

        Vozilo vozilo = null;

        //Ukoliko korisnik unese broj 1, unosimo podatke te kreiramo objekt Automobil
        if (tipVozila == 1) {
            System.out.println("Unesite podatke za Automobil:");
            System.out.println("Registarski broj: ");
            String regBr = scanner.nextLine();
            System.out.println("Marka: ");
            String marka = scanner.nextLine();
            System.out.println("Godište: ");
            int godiste = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Broj vrata: ");
            int brojVrata = scanner.nextInt();
            scanner.nextLine();

            vozilo = new Automobil(regBr,marka,godiste,brojVrata);

            //Ukoliko korisnik unese broj 2, unosimo podatke te kreiramo objekt Motocikl
        } else if (tipVozila == 2) {
            System.out.println("Unesite podatke za Motocikl:");
            System.out.println("Registarski broj: ");
            String regBr = scanner.nextLine();
            System.out.println("Marka: ");
            String marka = scanner.nextLine();
            System.out.println("Godište: ");
            int godiste = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Tip motora: ");
            String tipMotora = scanner.nextLine();

            vozilo = new Motocikl(regBr,marka,godiste,tipMotora);

        } else {
            System.out.println("Netočan tip vozila.");
        }

        //Dodajemo kreirano vozilo u listu vozila
        System.out.println("Vozilo kreirano i dodano u listu vozila.");
        vozila.add(vozilo);
    }
}