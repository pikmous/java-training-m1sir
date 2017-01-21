package tutorials.td1.exercise7;

import tutorials.td1.exercise6.Point;

public class Cercle {

    private Point centre;
    private double rayon;

    private Cercle(double r) { this.rayon = r; }

    public Cercle(Point p, double r) {
        this(r);
        this.centre = p;
    }

    public Cercle(double abs, double ord, double r) {
        this(r);
        this.centre = new Point(abs, ord);
    }

    public Cercle(double abs, double ord, byte couleur, double r) {
        this(r);
        this.centre = new Point(abs, ord, couleur);
    }

    public double surface() {
        return Math.PI * Math.pow(this.rayon, 2);
    }

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
}
