public class Mamifer extends Animal {

    private String tipBlana;
    private boolean nastePuiVii;
    private boolean alapteazaPui;
    private String habitat;
    private int durataGestatieZile;

    public Mamifer() {
        super();
    }

    public Mamifer(String nume, int varsta, double greutate,
                   String tipBlana, boolean nastePuiVii,
                   boolean alapteazaPui, String habitat,
                   int durataGestatieZile) {

        super(nume, varsta, greutate);
        this.tipBlana = tipBlana;
        this.nastePuiVii = nastePuiVii;
        this.alapteazaPui = alapteazaPui;
        this.habitat = habitat;
        this.durataGestatieZile = durataGestatieZile;
    }

    public Mamifer(Mamifer altul) {
        super(altul);
        this.tipBlana = altul.tipBlana;
        this.nastePuiVii = altul.nastePuiVii;
        this.alapteazaPui = altul.alapteazaPui;
        this.habitat = altul.habitat;
        this.durataGestatieZile = altul.durataGestatieZile;
    }

    public String getTipBlana() {
        return tipBlana;
    }

    public void setTipBlana(String tipBlana) {
        this.tipBlana = tipBlana;
    }

    public boolean isNastePuiVii() {
        return nastePuiVii;
    }

    public void setNastePuiVii(boolean nastePuiVii) {
        this.nastePuiVii = nastePuiVii;
    }

    public boolean isAlapteazaPui() {
        return alapteazaPui;
    }

    public void setAlapteazaPui(boolean alapteazaPui) {
        this.alapteazaPui = alapteazaPui;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getDurataGestatieZile() {
        return durataGestatieZile;
    }

    public void setDurataGestatieZile(int durataGestatieZile) {
        this.durataGestatieZile = durataGestatieZile;
    }

    @Override
    public String scoateSunet() {
        return "Sunet specific unui mamifer";
    }

    @Override
    public String modDeplasare() {
        return "Deplasare specifica unui mamifer";
    }

    @Override
    public String toString() {
        return "Mamifer{" + super.toString() +
                ", Tip blana: " + tipBlana +
                ", Naste pui vii: " + nastePuiVii +
                ", Alapteaza pui: " + alapteazaPui +
                ", Habitat: " + habitat +
                ", Durata gestatie: " + durataGestatieZile + " zile}";
    }
}
