package td1.exercice2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TestTriangle {

    public static void main(String []args) {

        try {
            clearConsole();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int hauteur = 0, choixOrientation = 0, nombreEssaiRestant = 3;
        boolean passer = false;
        Scanner scanner = new Scanner(System.in);

        // The name of the file to open.
        String fileName = "help.txt";

        // This will reference one line at a time
        String line;
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch(IOException e) {
            e.printStackTrace();
        }

        while (nombreEssaiRestant != 0 && !passer) {
            System.out.println(String.format("\nDonne moi la taille du triangle (%d essai restant): ", nombreEssaiRestant));
            System.out.print("> ");
            hauteur = scanner.nextInt();
            if (hauteur >= 3 && hauteur <= 10) {
                System.out.println(String.format("\nTu as choisi de dessiner un triangle dont le coté mesure %d lignes", hauteur));
                passer = true;
            } else nombreEssaiRestant--;
        }
        if (nombreEssaiRestant == 0) {
            System.out.print("> Au revoir !");
            System.exit(0);
        }
        do {
           System.out.println("\nDonne moi le choix de l’orientation (0 = BAS et 1 = HAUT): ");
           System.out.print("> ");
           choixOrientation = scanner.nextInt();
        } while (choixOrientation != 0 && choixOrientation != 1);

        Triangle triangle = new Triangle(hauteur);

        System.out.println("\nHoola je vous dessine un triangle oriente vers le " + (choixOrientation == 1 ? "haut" : "bas") + " de taille " + hauteur + "\n");
        switch (choixOrientation) {
            case 0: triangle.drawBottomFaceTriangle(); break;
            case 1: triangle.drawTopFaceTriangle(); break;
            default: break;
        }
        System.out.println();
    }

    public static void clearConsole() throws IOException {
        Runtime.getRuntime().exec("clear");
    }

}
