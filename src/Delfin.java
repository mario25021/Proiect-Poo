public class Delfin extends Mamifer {

    private String specie;
    private double vitezaInot;
    private int durataScufundareMinute;
    private String tipHabitatMarin;
    private boolean esteMamiferMarin;

    public Delfin() {
        super();
    }

    public Delfin(String nume, int varsta, double greutate,
                  String tipBlana, boolean nastePuiVii,
                  boolean alapteazaPui, String habitat,
                  int durataGestatieZile,
                  String specie, double vitezaInot,
                  int durataScufundareMinute,
                  String tipHabitatMarin,
                  boolean esteMamiferMarin) {

        super(nume, varsta, greutate, tipBlana, nastePuiVii,
                alapteazaPui, habitat, durataGestatieZile);

        this.specie = specie;
        this.vitezaInot = vitezaInot;
        this.durataScufundareMinute = durataScufundareMinute;
        this.tipHabitatMarin = tipHabitatMarin;
        this.esteMamiferMarin = esteMamiferMarin;
    }

    public Delfin(Delfin altul) {
        super(altul);
        this.specie = altul.specie;
        this.vitezaInot = altul.vitezaInot;
        this.durataScufundareMinute = altul.durataScufundareMinute;
        this.tipHabitatMarin = altul.tipHabitatMarin;
        this.esteMamiferMarin = altul.esteMamiferMarin;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public double getVitezaInot() {
        return vitezaInot;
    }

    public void setVitezaInot(double vitezaInot) {
        this.vitezaInot = vitezaInot;
    }

    public int getDurataScufundareMinute() {
        return durataScufundareMinute;
    }

    public void setDurataScufundareMinute(int durataScufundareMinute) {
        this.durataScufundareMinute = durataScufundareMinute;
    }

    public String getTipHabitatMarin() {
        return tipHabitatMarin;
    }

    public void setTipHabitatMarin(String tipHabitatMarin) {
        this.tipHabitatMarin = tipHabitatMarin;
    }

    public boolean isEsteMamiferMarin() {
        return esteMamiferMarin;
    }

    public void setEsteMamiferMarin(boolean esteMamiferMarin) {
        this.esteMamiferMarin = esteMamiferMarin;
    }

    @Override
    public String scoateSunet() {
        return "Delfinul emite fluieraturi si clicuri.";
    }

    @Override
    public String modDeplasare() {
        return "Delfinul inoata.";
    }

    @Override
    public String toString() {
        return "Delfin{" + super.toString() +
                ", Specie: " + specie +
                ", Viteza inot: " + vitezaInot +
                ", Durata scufundare: " + durataScufundareMinute +
                " minute, Habitat marin: " + tipHabitatMarin +
                ", Este mamifer marin: " + esteMamiferMarin + "}";
    }
}
