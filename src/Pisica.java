public class Pisica extends Animal {

    private String rasa;
    private String culoare;
    private boolean sterilizata;
    private boolean esteDeInterior;
    private String nivelActivitate;

    public Pisica() {
        super();
    }

    public Pisica(String nume, int varsta, double greutate,
                  String rasa, String culoare, boolean sterilizata,
                  boolean esteDeInterior, String nivelActivitate) {

        super(nume, varsta, greutate);
        this.rasa = rasa;
        this.culoare = culoare;
        this.sterilizata = sterilizata;
        this.esteDeInterior = esteDeInterior;
        this.nivelActivitate = nivelActivitate;
    }

    public Pisica(Pisica altul) {
        super(altul);
        this.rasa = altul.rasa;
        this.culoare = altul.culoare;
        this.sterilizata = altul.sterilizata;
        this.esteDeInterior = altul.esteDeInterior;
        this.nivelActivitate = altul.nivelActivitate;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public boolean isSterilizata() {
        return sterilizata;
    }

    public void setSterilizata(boolean sterilizata) {
        this.sterilizata = sterilizata;
    }

    public boolean isEsteDeInterior() {
        return esteDeInterior;
    }

    public void setEsteDeInterior(boolean esteDeInterior) {
        this.esteDeInterior = esteDeInterior;
    }

    public String getNivelActivitate() {
        return nivelActivitate;
    }

    public void setNivelActivitate(String nivelActivitate) {
        this.nivelActivitate = nivelActivitate;
    }

    @Override
    public String scoateSunet() {
        return "Miau!";
    }

    @Override
    public String modDeplasare() {
        return "Merge, alearga si sare";
    }

    @Override
    public String toString() {
        return "Pisica{" + super.toString() +
                ", Rasa: " + rasa +
                ", Culoare: " + culoare +
                ", Sterilizata: " + sterilizata +
                ", Este de interior: " + esteDeInterior +
                ", Nivel activitate: " + nivelActivitate + "}";
    }
}
