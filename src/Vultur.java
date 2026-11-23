public class Vultur extends Pasare {

    private String specie;
    private double altitudineMaximaZbor;
    private String tipVanatoare;
    private double acuitateVizuala;
    private boolean esteRapitor;

    public Vultur() {
        super();
    }

    public Vultur(String nume, int varsta, double greutate,
                  double anverguraAripi, boolean poateZbura,
                  String tipCioc, String culoarePenaj, String tipCuib,
                  String specie, double altitudineMaximaZbor,
                  String tipVanatoare, double acuitateVizuala,
                  boolean esteRapitor) {

        super(nume, varsta, greutate, anverguraAripi,
                poateZbura, tipCioc, culoarePenaj, tipCuib);

        this.specie = specie;
        this.altitudineMaximaZbor = altitudineMaximaZbor;
        this.tipVanatoare = tipVanatoare;
        this.acuitateVizuala = acuitateVizuala;
        this.esteRapitor = esteRapitor;
    }

    public Vultur(Vultur altul) {
        super(altul);
        this.specie = altul.specie;
        this.altitudineMaximaZbor = altul.altitudineMaximaZbor;
        this.tipVanatoare = altul.tipVanatoare;
        this.acuitateVizuala = altul.acuitateVizuala;
        this.esteRapitor = altul.esteRapitor;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public double getAltitudineMaximaZbor() {
        return altitudineMaximaZbor;
    }

    public void setAltitudineMaximaZbor(double altitudineMaximaZbor) {
        this.altitudineMaximaZbor = altitudineMaximaZbor;
    }

    public String getTipVanatoare() {
        return tipVanatoare;
    }

    public void setTipVanatoare(String tipVanatoare) {
        this.tipVanatoare = tipVanatoare;
    }

    public double getAcuitateVizuala() {
        return acuitateVizuala;
    }

    public void setAcuitateVizuala(double acuitateVizuala) {
        this.acuitateVizuala = acuitateVizuala;
    }

    public boolean isEsteRapitor() {
        return esteRapitor;
    }

    public void setEsteRapitor(boolean esteRapitor) {
        this.esteRapitor = esteRapitor;
    }

    @Override
    public String scoateSunet() {
        return "Vulturul scoate tipete specifice.";
    }

    @Override
    public String modDeplasare() {
        return "Vulturul zboara si planeaza.";
    }

    @Override
    public String toString() {
        return "Vultur{" + super.toString() +
                ", Specie: " + specie +
                ", Altitudine maxima zbor: " + altitudineMaximaZbor +
                ", Tip vanatoare: " + tipVanatoare +
                ", Acuitate vizuala: " + acuitateVizuala +
                ", Este rapitor: " + esteRapitor + "}";
    }
}
