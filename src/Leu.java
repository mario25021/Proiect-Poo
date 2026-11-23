public class Leu extends AnimalSalbatic {

    private String subspecie;
    private String tipCoama;
    private boolean traiesteInHaita;
    private double greutateMedie;
    private double marimeTeritoriuKm2;

    public Leu() {
        super();
    }

    public Leu(String nume, int varsta, double greutate,
               String habitatNatural, String regiuneGeografica,
               String regimAlimentar, boolean esteProtejat,
               int nivelPericulozitate,
               String subspecie, String tipCoama,
               boolean traiesteInHaita, double greutateMedie,
               double marimeTeritoriuKm2) {

        super(nume, varsta, greutate, habitatNatural,
                regiuneGeografica, regimAlimentar,
                esteProtejat, nivelPericulozitate);

        this.subspecie = subspecie;
        this.tipCoama = tipCoama;
        this.traiesteInHaita = traiesteInHaita;
        this.greutateMedie = greutateMedie;
        this.marimeTeritoriuKm2 = marimeTeritoriuKm2;
    }

    public Leu(Leu altul) {
        super(altul);
        this.subspecie = altul.subspecie;
        this.tipCoama = altul.tipCoama;
        this.traiesteInHaita = altul.traiesteInHaita;
        this.greutateMedie = altul.greutateMedie;
        this.marimeTeritoriuKm2 = altul.marimeTeritoriuKm2;
    }

    public String getSubspecie() {
        return subspecie;
    }

    public void setSubspecie(String subspecie) {
        this.subspecie = subspecie;
    }

    public String getTipCoama() {
        return tipCoama;
    }

    public void setTipCoama(String tipCoama) {
        this.tipCoama = tipCoama;
    }

    public boolean isTraiesteInHaita() {
        return traiesteInHaita;
    }

    public void setTraiesteInHaita(boolean traiesteInHaita) {
        this.traiesteInHaita = traiesteInHaita;
    }

    public double getGreutateMedie() {
        return greutateMedie;
    }

    public void setGreutateMedie(double greutateMedie) {
        this.greutateMedie = greutateMedie;
    }

    public double getMarimeTeritoriuKm2() {
        return marimeTeritoriuKm2;
    }

    public void setMarimeTeritoriuKm2(double marimeTeritoriuKm2) {
        this.marimeTeritoriuKm2 = marimeTeritoriuKm2;
    }

    @Override
    public String scoateSunet() {
        return "Leul rageste.";
    }

    @Override
    public String modDeplasare() {
        return "Leul merge si alearga.";
    }

    @Override
    public String toString() {
        return "Leu{" + super.toString() +
                ", Subspecie: " + subspecie +
                ", Tip coama: " + tipCoama +
                ", Traieste in haita: " + traiesteInHaita +
                ", Greutate medie: " + greutateMedie +
                ", Marime teritoriu: " + marimeTeritoriuKm2 + " km2}";
    }
}
