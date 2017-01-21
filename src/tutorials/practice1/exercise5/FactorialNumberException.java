package tutorials.td1.exercise5;

public class FactorialNumberException extends Exception {

    public FactorialNumberException() {
        System.out.print("> Error: a factorial number can only be a positive integer.");
    }

    public FactorialNumberException(String errorMessage) {
        System.out.print("> " + errorMessage);
    }

}
