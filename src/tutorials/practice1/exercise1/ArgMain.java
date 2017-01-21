package tutorials.practice1.exercise1;

public class ArgMain
{
    /* ---------------------------------------------------------------
     * ArgMain class
     * ---------------------------------------------------------------
     * The aim in this class is to test the importance of the []args
     * parameter of the static void main function in Java.
     * The array String []args allows to pass arguments to the program
     * during execution.
     * It is commonly used to create command line programs. Like UNIX
     * or DOS commands.
     *
     * In this program the user execute it by passing two integers in
     * argument and it outputs their sum.
     *
     * To compile: javac ArgMain.java
     * To execute: java ArgMain
     */

    public static void main(String []args) {
        if(args.length == 0) {
            System.out.println("Error: please provide 2 integers to run this program. :)");
        } else {
            System.out.println(args[0] + " + " + args[1] + " = " + Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
        }
    }

}
