public class AnimalSalbatic extends Animal {

    private String habitatNatural;
    private String regiuneGeografica;
    private String regimAlimentar;
    private boolean esteProtejat;
    private int nivelPericulozitate;

    public AnimalSalbatic() {
        super();
    }

    public AnimalSalbatic(String nume, int varsta, double greutate,
                          String habitatNatural,
                          String regiuneGeografica,
                          String regimAlimentar,
                          boolean esteProtejat,
                          int nivelPericulozitate) {

        super(nume, varsta, greutate);
        this.habitatNatural = habitatNatural;
        this.regiuneGeografica = regiuneGeografica;
        this.regimAlimentar = regimAlimentar;
        this.esteProtejat = esteProtejat;
        this.nivelPericulozitate = nivelPericulozitate;
    }

    public AnimalSalbatic(AnimalSalbatic altul) {
        super(altul);
        this.habitatNatural = altul.habitatNatural;
        this.regiuneGeografica = altul.regiuneGeografica;
        this.regimAlimentar = altul.regimAlimentar;
        this.esteProtejat = altul.esteProtejat;
        this.nivelPericulozitate = altul.nivelPericulozitate;
    }

    public String getHabitatNatural() {
        return habitatNatural;
    }

    public void setHabitatNatural(String habitatNatural) {
        this.habitatNatural = habitatNatural;
    }

    public String getRegiuneGeografica() {
        return regiuneGeografica;
    }

    public void setRegiuneGeografica(String regiuneGeografica) {
        this.regiuneGeografica = regiuneGeografica;
    }

    public String getRegimAlimentar() {
        return regimAlimentar;
    }

    public void setRegimAlimentar(String regimAlimentar) {
        this.regimAlimentar = regimAlimentar;
    }

    public boolean isEsteProtejat() {
        return esteProtejat;
    }

    public void setEsteProtejat(boolean esteProtejat) {
        this.esteProtejat = esteProtejat;
    }

    public int getNivelPericulozitate() {
        return nivelPericulozitate;
    }

    public void setNivelPericulozitate(int nivelPericulozitate) {
        this.nivelPericulozitate = nivelPericulozitate;
    }

    @Override
    public String scoateSunet() {
        return "Sunet specific unui animal salbatic.";
    }

    @Override
    public String modDeplasare() {
        return "Se deplaseaza in habitatul natural.";
    }

    @Override
    public String toString() {
        return "AnimalSalbatic{" + super.toString() +
                ", Habitat natural: " + habitatNatural +
                ", Regiune geografica: " + regiuneGeografica +
                ", Regim alimentar: " + regimAlimentar +
                ", Este protejat: " + esteProtejat +
                ", Nivel periculozitate: " + nivelPericulozitate + "}";
    }
}
