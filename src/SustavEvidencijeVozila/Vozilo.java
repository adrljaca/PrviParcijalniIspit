package SustavEvidencijeVozila;

public class Vozilo {
    private String regBr;
    private String marka;
    private int godiste;

    public Vozilo(String regBr, String marka, int godiste) throws NeispravniPodaciException {
        if (regBr == null || regBr.isEmpty()) {
            throw new NeispravniPodaciException("Registarski broj ne može biti prazno polje.");
        }
        if (marka == null || marka.isEmpty()) {
            throw new NeispravniPodaciException("Marka ne može biti prazno polje.");
        }
        if (godiste <= 0) {
            throw new NeispravniPodaciException("Godište ne može biti negativan broj.");
        }

        this.regBr = regBr;
        this.marka = marka;
        this.godiste = godiste;
    }

    public String getRegBr() {
        return regBr;
    }

    public void setRegBr(String regBr) {
        this.regBr = regBr;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getGodiste() {
        return godiste;
    }

    public void setGodiste(int godiste) {
        this.godiste = godiste;
    }

    public String prikaziPodatke() {
        return "Registarski broj: " + regBr + "\t\tMarka: " + marka + "\t\tGodište: " + godiste;
    }
}