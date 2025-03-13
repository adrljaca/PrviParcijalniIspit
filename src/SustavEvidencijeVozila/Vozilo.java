package SustavEvidencijeVozila;

public class Vozilo {
    private String reg_br;
    private String marka;
    private int god_proizv;

    public Vozilo(String reg_br, String marka, int god_proizv) throws NeispravniPodaciException {
        if (god_proizv < 0) {
            throw new NeispravniPodaciException("Godina proizvodnje ne može biti negativna.");
        }
        this.reg_br = reg_br;
        this.marka = marka;
        this.god_proizv = god_proizv;
    }

    public String getReg_br() {
        return reg_br;
    }

    public void setReg_br(String reg_br) {
        this.reg_br = reg_br;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getGod_proizv() {
        return god_proizv;
    }

    public void setGod_proizv(int god_proizv) throws NeispravniPodaciException {
        if (god_proizv < 0) {
            throw new NeispravniPodaciException("Godina proizvodnje ne može biti negativna.");
        }
        this.god_proizv = god_proizv;
    }

    public void ucitajPodatke(String reg_br, String marka, int god_proizv) throws NeispravniPodaciException {
        setReg_br(reg_br);
        setMarka(marka);
        setGod_proizv(god_proizv);
    }

    public void prikaziPodatke() {
        System.out.println("Registarski broj: " + getReg_br() + "\t\tMarka: " + getMarka() +
                "\t\tGodina proizvodnje: " + getGod_proizv());
    }
}