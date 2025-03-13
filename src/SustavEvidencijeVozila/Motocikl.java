package SustavEvidencijeVozila;

public class Motocikl extends Vozilo {
    private String tipMotora;

    public Motocikl(String reg_br, String marka, int god_proizv, String tipMotora) throws NeispravniPodaciException{
        super(reg_br, marka, god_proizv);
        if (tipMotora.isEmpty()) {
            throw new NeispravniPodaciException("Tip motora mora se definirati.");
        }
        this.tipMotora = tipMotora;
    }

    public String getTipMotora() {
        return tipMotora;
    }

    public void setTipMotora(String tipMotora) throws NeispravniPodaciException {
        if (tipMotora.isEmpty()) {
            throw new NeispravniPodaciException("Tip motora mora se definirati.");
        }
        this.tipMotora = tipMotora;
    }

    @Override
    public void prikaziPodatke() {
        super.prikaziPodatke();
        System.out.print("\t\tTip motora: " + getTipMotora());
    }
}
