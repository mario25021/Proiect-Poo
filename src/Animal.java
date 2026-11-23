public abstract class Animal {

    private String nume;
    private int varsta;
    private double greutate;
    private String sex;
    private boolean esteMicrocipat;

    public Animal() {
    }

    public Animal(String nume, int varsta, double greutate,
                  String sex, boolean esteMicrocipat) {
        this.nume = nume;
        this.varsta = varsta;
        this.greutate = greutate;
        this.sex = sex;
        this.esteMicrocipat = esteMicrocipat;
    }

    public Animal(String nume, int varsta, double greutate) {
        this(nume, varsta, greutate, null, false);
    }

    public Animal(Animal altul) {
        this.nume = altul.nume;
        this.varsta = altul.varsta;
        this.greutate = altul.greutate;
        this.sex = altul.sex;
        this.esteMicrocipat = altul.esteMicrocipat;
    }

    public abstract String scoateSunet();

    public abstract String modDeplasare();

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public double getGreutate() {
        return greutate;
    }

    public void setGreutate(double greutate) {
        this.greutate = greutate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean isEsteMicrocipat() {
        return esteMicrocipat;
    }

    public void setEsteMicrocipat(boolean esteMicrocipat) {
        this.esteMicrocipat = esteMicrocipat;
    }

    @Override
    public String toString() {
        return "Nume: " + nume +
                ", Varsta: " + varsta +
                ", Greutate: " + greutate + " kg" +
                ", Sex: " + sex +
                ", Este microcipat: " + esteMicrocipat;
    }
}
