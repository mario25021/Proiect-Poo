public class Cal extends Mamifer {

    private String rasa;
    private double vitezaMaxima;
    private boolean esteDresat;
    private String utilizare;
    private double inaltimeGreaban;

    public Cal() {
        super();
    }

    public Cal(String nume, int varsta, double greutate,
               String tipBlana, boolean nastePuiVii,
               boolean alapteazaPui, String habitat,
               int durataGestatieZile,
               String rasa, double vitezaMaxima,
               boolean esteDresat, String utilizare,
               double inaltimeGreaban) {

        super(nume, varsta, greutate, tipBlana, nastePuiVii,
                alapteazaPui, habitat, durataGestatieZile);

        this.rasa = rasa;
        this.vitezaMaxima = vitezaMaxima;
        this.esteDresat = esteDresat;
        this.utilizare = utilizare;
        this.inaltimeGreaban = inaltimeGreaban;
    }

    public Cal(Cal altul) {
        super(altul);
        this.rasa = altul.rasa;
        this.vitezaMaxima = altul.vitezaMaxima;
        this.esteDresat = altul.esteDresat;
        this.utilizare = altul.utilizare;
        this.inaltimeGreaban = altul.inaltimeGreaban;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public double getVitezaMaxima() {
        return vitezaMaxima;
    }

    public void setVitezaMaxima(double vitezaMaxima) {
        this.vitezaMaxima = vitezaMaxima;
    }

    public boolean isEsteDresat() {
        return esteDresat;
    }

    public void setEsteDresat(boolean esteDresat) {
        this.esteDresat = esteDresat;
    }

    public String getUtilizare() {
        return utilizare;
    }

    public void setUtilizare(String utilizare) {
        this.utilizare = utilizare;
    }

    public double getInaltimeGreaban() {
        return inaltimeGreaban;
    }

    public void setInaltimeGreaban(double inaltimeGreaban) {
        this.inaltimeGreaban = inaltimeGreaban;
    }

    @Override
    public String scoateSunet() {
        return "Calul necheaza.";
    }

    @Override
    public String modDeplasare() {
        return "Calul merge, trap si galop.";
    }

    @Override
    public String toString() {
        return "Cal{" + super.toString() +
                ", Rasa: " + rasa +
                ", Viteza maxima: " + vitezaMaxima +
                ", Este dresat: " + esteDresat +
                ", Utilizare: " + utilizare +
                ", Inaltime greaban: " + inaltimeGreaban + "}";
    }
}
