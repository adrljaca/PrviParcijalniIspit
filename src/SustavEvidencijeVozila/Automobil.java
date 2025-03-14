package SustavEvidencijeVozila;

public class Automobil extends Vozilo {
    private int brojVrata;

    public Automobil(String regBr, String marka, int godiste, int brojVrata) throws NeispravniPodaciException {
        super(regBr, marka, godiste);
        if (brojVrata <= 0) {
            throw new NeispravniPodaciException("Broj vrata ne može biti negativan ili nula.");
        }
        this.brojVrata = brojVrata;
    }

    public int getBrojVrata() {
        return brojVrata;
    }

    public void setBrojVrata(int brojVrata) {
        this.brojVrata = brojVrata;
    }

    @Override
    public String prikaziPodatke() {
        return super.prikaziPodatke() + "\t\tBroj vrata: " + brojVrata;
    }

    @Override
    public String toString() {
        return super.toString() + "\t\tBroj vrata: " + brojVrata;
    }
}