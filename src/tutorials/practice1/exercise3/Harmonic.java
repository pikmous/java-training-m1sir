package tutorials.td1.exercise3;

public class Harmonic {

    private int n;

    public Harmonic(int n) {
        this.n = n;
    }

    public int getN() {
        return this.n;
    }

    public void setN(int n) throws ValidHarmonicDegreException {
        if (n < 1) throw new ValidHarmonicDegreException();
        else this.n = n;
    }

    public double compute() {
        double r = 0;
        for (int i = 1; i <= this.n; i++) {
            r += (double) 1/i;
        }
        return r;
    }

}
