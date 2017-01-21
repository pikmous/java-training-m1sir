package tutorials.td1.exercise5;

public class Factorial {

    private int n;

    public Factorial(int n) {
        try {
            this.setN(n);
        } catch (FactorialNumberException e) {
            e.printStackTrace();
        }
    }

    public void setN(int n) throws FactorialNumberException {
        if (n < 0) throw new FactorialNumberException();
        else this.n = n;
    }

    public int compute() {
        /*int f = 1;
        for (int i = this.n; i > 0; i--) {
            f *= i;
        }
        return f;*/

        return f(n);
    }

    private int f(int n) {
        if (n == 1) return n;
        else return f(n-1);
    }

}
