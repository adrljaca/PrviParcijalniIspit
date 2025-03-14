package SustavEvidencijeVozila;

public class NeispravniPodaciException extends RuntimeException {
  public NeispravniPodaciException(String poruka) {
    super(poruka);
  }
}