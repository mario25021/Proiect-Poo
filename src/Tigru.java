public class Tigru extends AnimalSalbatic {

    private String subspecie;
    private String modelDungi;
    private double vitezaMaxima;
    private double greutateMedie;
    private boolean esteSolitar;

    public Tigru() {
        super();
    }

    public Tigru(String nume, int varsta, double greutate,
                 String habitatNatural, String regiuneGeografica,
                 String regimAlimentar, boolean esteProtejat,
                 int nivelPericulozitate,
                 String subspecie, String modelDungi,
                 double vitezaMaxima, double greutateMedie,
                 boolean esteSolitar) {

        super(nume, varsta, greutate, habitatNatural,
                regiuneGeografica, regimAlimentar,
                esteProtejat, nivelPericulozitate);

        this.subspecie = subspecie;
        this.modelDungi = modelDungi;
        this.vitezaMaxima = vitezaMaxima;
        this.greutateMedie = greutateMedie;
        this.esteSolitar = esteSolitar;
    }

    public Tigru(Tigru altul) {
        super(altul);
        this.subspecie = altul.subspecie;
        this.modelDungi = altul.modelDungi;
        this.vitezaMaxima = altul.vitezaMaxima;
        this.greutateMedie = altul.greutateMedie;
        this.esteSolitar = altul.esteSolitar;
    }

    public String getSubspecie() {
        return subspecie;
    }

    public void setSubspecie(String subspecie) {
        this.subspecie = subspecie;
    }

    public String getModelDungi() {
        return modelDungi;
    }

    public void setModelDungi(String modelDungi) {
        this.modelDungi = modelDungi;
    }

    public double getVitezaMaxima() {
        return vitezaMaxima;
    }

    public void setVitezaMaxima(double vitezaMaxima) {
        this.vitezaMaxima = vitezaMaxima;
    }

    public double getGreutateMedie() {
        return greutateMedie;
    }

    public void setGreutateMedie(double greutateMedie) {
        this.greutateMedie = greutateMedie;
    }

    public boolean isEsteSolitar() {
        return esteSolitar;
    }

    public void setEsteSolitar(boolean esteSolitar) {
        this.esteSolitar = esteSolitar;
    }

    @Override
    public String scoateSunet() {
        return "Tigrul rage.";
    }

    @Override
    public String modDeplasare() {
        return "Tigrul merge, alearga si inoata.";
    }

    @Override
    public String toString() {
        return "Tigru{" + super.toString() +
                ", Subspecie: " + subspecie +
                ", Model dungi: " + modelDungi +
                ", Viteza maxima: " + vitezaMaxima +
                ", Greutate medie: " + greutateMedie +
                ", Este solitar: " + esteSolitar + "}";
    }
}
