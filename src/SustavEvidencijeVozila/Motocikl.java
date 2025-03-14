package SustavEvidencijeVozila;

public class Motocikl extends Vozilo {
    private String tipMotora;

    public Motocikl(String regBr, String marka, int godiste, String tipMotora) throws NeispravniPodaciException {
        super(regBr, marka, godiste);
        if (tipMotora == null || tipMotora.isEmpty()) {
            throw new NeispravniPodaciException("Tip motora ne može biti prazno polje.");
        }
        this.tipMotora = tipMotora;
    }

    public String getTipMotora() {
        return tipMotora;
    }

    public void setTipMotora(String tipMotora) {
        this.tipMotora = tipMotora;
    }

    @Override
    public String prikaziPodatke() {
        return super.prikaziPodatke() + "\t\tTip motora: " + tipMotora;
    }
}