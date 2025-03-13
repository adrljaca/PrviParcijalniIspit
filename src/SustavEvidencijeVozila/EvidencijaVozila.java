package SustavEvidencijeVozila;

import java.io.*;
import java.util.List;

public class EvidencijaVozila {
    private static List<Vozilo> vozila;
    private static String putanja = "C:/Users/arija/Desktop/Vozila.txt";

    public static void spremiPodatkeUDatoteku(String datoteka) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(datoteka));
        for (Vozilo v : vozila) {
            writer.write(v.getClass().getSimpleName() + "\n");
            writer.write(v.getReg_br() + "\n");
            writer.write(v.getMarka() + "\n");
            writer.write(v.getGod_proizv() + "\n");
            if (v instanceof Automobil) {
                writer.write(((Automobil) v).getBrojVrata() + "\n");
            } else if (v instanceof Motocikl) {
                writer.write(((Motocikl) v).getTipMotora() + "\n");
            }
        }
        writer.close();
    }

    public static void ucitajPodatkeIzDatoteke(String datoteka) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(datoteka));
        String linija;

        while ((linija = reader.readLine()) != null) {
            System.out.println(linija);
        }

        reader.close();
    }

    public static void main(String[] args) throws IOException, NeispravniPodaciException {
        Vozilo auto = new Automobil("OS1996", "Opel", 2020,4);
        Vozilo motor = new Motocikl("ZG555", "Yamaha", 2022,"Trkači");

        vozila.add(auto);
        vozila.add(motor);

        for (Vozilo v : vozila) {
            System.out.println(v);
        }

        //spremiPodatkeUDatoteku(putanja);

        //ucitajPodatkeIzDatoteke(putanja);
    }
}