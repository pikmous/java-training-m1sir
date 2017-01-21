package tutorials.td1.exercise2;

class Triangle
{

    private int hauteur;

    Triangle(int h) {
        this.hauteur = h;
    }

    public int getHauteur() { return this.hauteur; }
    public void setHauteur(int h) { this.hauteur = h; }

    void drawDownwardTriangle() {
        for (int i = 0; i < hauteur; i++) {
            for (int j = i; j < hauteur - 1; j++) {
                System.out.print("* ");
            }
           System.out.println("*");
        }
    }

    void drawUpwardTriangle() {
       for (int i = 0; i < hauteur; i++) {
           for (int j = hauteur - (i + 1); j < hauteur; j++) {
               System.out.print("* ");
           }
           System.out.println();
       }
    }

}
