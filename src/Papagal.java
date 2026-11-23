public class Papagal extends Pasare {

    private String specie;
    private boolean poateImitaSunete;
    private int vocabularAproximativ;
    private String culoarePrincipala;
    private boolean poateVorbi;

    public Papagal() {
        super();
    }

    public Papagal(String nume, int varsta, double greutate,
                   double anverguraAripi, boolean poateZbura,
                   String tipCioc, String culoarePenaj, String tipCuib,
                   String specie, boolean poateImitaSunete,
                   int vocabularAproximativ, String culoarePrincipala,
                   boolean poateVorbi) {

        super(nume, varsta, greutate, anverguraAripi,
                poateZbura, tipCioc, culoarePenaj, tipCuib);

        this.specie = specie;
        this.poateImitaSunete = poateImitaSunete;
        this.vocabularAproximativ = vocabularAproximativ;
        this.culoarePrincipala = culoarePrincipala;
        this.poateVorbi = poateVorbi;
    }

    public Papagal(Papagal altul) {
        super(altul);
        this.specie = altul.specie;
        this.poateImitaSunete = altul.poateImitaSunete;
        this.vocabularAproximativ = altul.vocabularAproximativ;
        this.culoarePrincipala = altul.culoarePrincipala;
        this.poateVorbi = altul.poateVorbi;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public boolean isPoateImitaSunete() {
        return poateImitaSunete;
    }

    public void setPoateImitaSunete(boolean poateImitaSunete) {
        this.poateImitaSunete = poateImitaSunete;
    }

    public int getVocabularAproximativ() {
        return vocabularAproximativ;
    }

    public void setVocabularAproximativ(int vocabularAproximativ) {
        this.vocabularAproximativ = vocabularAproximativ;
    }

    public String getCuloarePrincipala() {
        return culoarePrincipala;
    }

    public void setCuloarePrincipala(String culoarePrincipala) {
        this.culoarePrincipala = culoarePrincipala;
    }

    public boolean isPoateVorbi() {
        return poateVorbi;
    }

    public void setPoateVorbi(boolean poateVorbi) {
        this.poateVorbi = poateVorbi;
    }

    @Override
    public String scoateSunet() {
        return "Papagalul imita sunete si poate reproduce cuvinte.";
    }

    @Override
    public String modDeplasare() {
        return "Papagalul zboara si se catara.";
    }

    @Override
    public String toString() {
        return "Papagal{" + super.toString() +
                ", Specie: " + specie +
                ", Poate imita sunete: " + poateImitaSunete +
                ", Vocabular aproximativ: " + vocabularAproximativ +
                ", Culoare principala: " + culoarePrincipala +
                ", Poate vorbi: " + poateVorbi + "}";
    }
}
