package td1.exercice1;

public class Main {
    public static void main(String []args) {
        if(args.length == 0) {
            System.out.println("Error: please provide 2 integers to run this program. :)");
        } else {
            System.out.println(args[0] + " + " + args[1] + " = " + Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
        }
    }
}
