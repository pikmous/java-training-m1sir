package com.eliaswalyba.m1sir.tutorials.practice1.exercise6;

public class Point {

    private double abs, ord;
    private byte couleur;

    public Point(double x, double y) {
        this.abs = x;
        this.ord = y;
    }

    public Point() {
        this(0 ,0);
    }

    public Point(double x, double y, byte c) {
        this(x, y);
        this.couleur = c;
    }

    public void translater(double dx, double dy) {
        this.abs += dx;
        this.ord += dy;
    }

    public boolean coincide(Point p) {
        return p.abs == this.abs && p.ord == this.ord;
    }

    public String toString() {
        return String.format("(%f ; %f)", this.abs, this.ord);
    }

    public double getAbs() {
        return abs;
    }

    public void setAbs(double abs) {
        this.abs = abs;
    }

    public double getOrd() {
        return ord;
    }

    public void setOrd(double ord) {
        this.ord = ord;
    }

    public byte getCouleur() {
        return couleur;
    }

    public void setCouleur(byte couleur) {
        this.couleur = couleur;
    }
}
