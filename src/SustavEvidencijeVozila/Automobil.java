package SustavEvidencijeVozila;

public class Automobil extends Vozilo {
    private int brojVrata;

    public Automobil(String reg_br, String marka, int god_proizv, int brojVrata) throws NeispravniPodaciException {
        super(reg_br, marka, god_proizv);
        if (brojVrata < 0) {
            throw new NeispravniPodaciException("Broj vrata ne može biti negativan.");
        }
        this.brojVrata = brojVrata;
    }

    public int getBrojVrata() {
        return brojVrata;
    }

    public void setBrojVrata(int brojVrata) throws NeispravniPodaciException {
        if (brojVrata < 0) {
            throw new NeispravniPodaciException("Broj vrata ne može biti negativan.");
        }
        this.brojVrata = brojVrata;
    }

    @Override
    public void prikaziPodatke() {
        super.prikaziPodatke();
        System.out.print("\t\tBroj vrata: " + getBrojVrata());
    }
}
