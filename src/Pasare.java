public class Pasare extends Animal {

    private double anverguraAripi;
    private boolean poateZbura;
    private String tipCioc;
    private String culoarePenaj;
    private String tipCuib;

    public Pasare() {
        super();
    }

    public Pasare(String nume, int varsta, double greutate,
                  double anverguraAripi, boolean poateZbura,
                  String tipCioc, String culoarePenaj,
                  String tipCuib) {

        super(nume, varsta, greutate);
        this.anverguraAripi = anverguraAripi;
        this.poateZbura = poateZbura;
        this.tipCioc = tipCioc;
        this.culoarePenaj = culoarePenaj;
        this.tipCuib = tipCuib;
    }

    public Pasare(Pasare altul) {
        super(altul);
        this.anverguraAripi = altul.anverguraAripi;
        this.poateZbura = altul.poateZbura;
        this.tipCioc = altul.tipCioc;
        this.culoarePenaj = altul.culoarePenaj;
        this.tipCuib = altul.tipCuib;
    }

    public double getAnverguraAripi() {
        return anverguraAripi;
    }

    public void setAnverguraAripi(double anverguraAripi) {
        this.anverguraAripi = anverguraAripi;
    }

    public boolean isPoateZbura() {
        return poateZbura;
    }

    public void setPoateZbura(boolean poateZbura) {
        this.poateZbura = poateZbura;
    }

    public String getTipCioc() {
        return tipCioc;
    }

    public void setTipCioc(String tipCioc) {
        this.tipCioc = tipCioc;
    }

    public String getCuloarePenaj() {
        return culoarePenaj;
    }

    public void setCuloarePenaj(String culoarePenaj) {
        this.culoarePenaj = culoarePenaj;
    }

    public String getTipCuib() {
        return tipCuib;
    }

    public void setTipCuib(String tipCuib) {
        this.tipCuib = tipCuib;
    }

    @Override
    public String scoateSunet() {
        return "Sunet specific unei pasari";
    }

    @Override
    public String modDeplasare() {
        return "Deplasare specifica unei pasari";
    }

    @Override
    public String toString() {
        return "Pasare{" + super.toString() +
                ", Anvergura aripi: " + anverguraAripi +
                ", Poate zbura: " + poateZbura +
                ", Tip cioc: " + tipCioc +
                ", Culoare penaj: " + culoarePenaj +
                ", Tip cuib: " + tipCuib + "}";
    }
}
