public abstract class Animal {

    private String nume;
    private int varsta;
    private double greutate;

    public Animal() {
    }

    public Animal(String nume, int varsta, double greutate) {
        this.nume = nume;
        this.varsta = varsta;
        this.greutate = greutate;
    }

    public Animal(Animal altul) {
        this.nume = altul.nume;
        this.varsta = altul.varsta;
        this.greutate = altul.greutate;
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

    @Override
    public String toString() {
        return "Nume: " + nume +
                ", Varsta: " + varsta +
                ", Greutate: " + greutate + " kg";
    }
}
