package Praktikum.Jobsheet3.SpatialShape;

public class Ball {
    int radius;
    public Ball(int radius) {
        this.radius = radius;
    }

    public void printArea() {
        System.out.println("ball Area: " + (4 * Math.PI * radius * radius));
    }

    public void printVolume() {
        System.out.println("Sphere Volume : " + ((4.0 / 3.0) * Math.PI * radius * radius * radius));
    }
}
