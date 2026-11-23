public class Caine extends Animal {

    private String rasa;
    private boolean dresat;
    private String talie;
    private String nivelEnergie;
    private boolean esteDeCompanie;

    public Caine() {
        super();
    }

    public Caine(String nume, int varsta, double greutate,
                 String rasa, boolean dresat, String talie,
                 String nivelEnergie, boolean esteDeCompanie) {

        super(nume, varsta, greutate);
        this.rasa = rasa;
        this.dresat = dresat;
        this.talie = talie;
        this.nivelEnergie = nivelEnergie;
        this.esteDeCompanie = esteDeCompanie;
    }

    public Caine(Caine altul) {
        super(altul);
        this.rasa = altul.rasa;
        this.dresat = altul.dresat;
        this.talie = altul.talie;
        this.nivelEnergie = altul.nivelEnergie;
        this.esteDeCompanie = altul.esteDeCompanie;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public boolean isDresat() {
        return dresat;
    }

    public void setDresat(boolean dresat) {
        this.dresat = dresat;
    }

    public String getTalie() {
        return talie;
    }

    public void setTalie(String talie) {
        this.talie = talie;
    }

    public String getNivelEnergie() {
        return nivelEnergie;
    }

    public void setNivelEnergie(String nivelEnergie) {
        this.nivelEnergie = nivelEnergie;
    }

    public boolean isEsteDeCompanie() {
        return esteDeCompanie;
    }

    public void setEsteDeCompanie(boolean esteDeCompanie) {
        this.esteDeCompanie = esteDeCompanie;
    }

    @Override
    public String scoateSunet() {
        return "Ham ham!";
    }

    @Override
    public String modDeplasare() {
        return "Merge si alearga";
    }

    @Override
    public String toString() {
        return "Caine{" + super.toString() +
                ", Rasa: " + rasa +
                ", Dresat: " + dresat +
                ", Talie: " + talie +
                ", Nivel energie: " + nivelEnergie +
                ", Este de companie: " + esteDeCompanie + "}";
    }
}
