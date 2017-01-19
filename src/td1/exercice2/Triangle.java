package td1.exercice2;

public class Triangle {

    private int hauteur;

    private static final char PATTERN = '*';
    private static final char SPACE = ' ';

    public Triangle(int h) {
        this.hauteur = h;
    }

    public int getHauteur() { return this.hauteur; }
    public void setHauteur(int h) { this.hauteur = h; }

    public void drawBottomFaceTriangle() {
        for (int i = 0; i < hauteur; i++) {
            for (int j = i; j < hauteur - 1; j++) {
                System.out.print("* ");
            }
           System.out.println("*");
        }
    }

    public void drawTopFaceTriangle() {
       for (int i = 0; i < hauteur; i++) {
           for (int j = hauteur - (i + 1); j < hauteur; j++) {
               System.out.print("* ");
           }
           System.out.println();
       }
    }

}
