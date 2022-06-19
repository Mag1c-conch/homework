package C;

import java.util.Scanner;

class Circle extends Shape {
    Point o;
    double r;

    public Circle(double X, double Y, double R) {
        this.o = new Point(X, Y);
        this.r = R;
    }

    public Circle(Point O, double R) {
        this.o = O;
        this.r = R;
    }


    public void move(double dx, double dy) {
        this.o.move(dx, dy);
    }


    public void spin(Point p, double angle) {
        this.o.spin(p, angle);
    }


    public void print() {
        this.o.print();
        System.out.printf("Radius:%.2f", this.r);
    }

}

class Trangle extends Shape {
    Point a, b, c;

    public Trangle(double ax, double ay, double bx, double by, double cx, double cy) {
        this.a = new Point(ax, ay);
        this.b = new Point(bx, by);
        this.c = new Point(cx, cy);
    }

    public Trangle(Point A, Point B, Point C) {
        this.a = A;
        this.b = B;
        this.c = C;
    }


    public void move(double dx, double dy) {
        this.a.move(dx, dy);
        this.b.move(dx, dy);
        this.c.move(dx, dy);
    }


    public void spin(Point p, double angle) {
        this.a.spin(p, angle);
        this.b.spin(p, angle);
        this.c.spin(p, angle);
    }

    public void print() {
        this.a.print();
        System.out.print("-");
        this.b.print();
        System.out.print("-");
        this.c.print();
    }

}
abstract class Shape {
    abstract public void move(double dx, double dy);

    abstract public void spin(Point p, double angle);

    abstract public void print();

}

class Point extends Shape {
    double x, y;

    public Point(double X, double Y) {
        this.x = X;
        this.y = Y;
    }


    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }


    public void spin(Point p, double angle) {
        double dx = this.x - p.x;
        double dy = this.y - p.y;
        double ex = Math.cos(angle * Math.PI / 180) * dx - Math.sin(angle * Math.PI / 180) * dy;
        double ey = Math.cos(angle * Math.PI / 180) * dy + Math.sin(angle * Math.PI / 180) * dx;
        this.x = p.x + ex;
        this.y = p.y + ey;
    }


    public void print() {
        System.out.printf("(%.2f,%.2f)", x, y);
    }

}

class Line extends Shape {
    Point a, b;

    public Line(double ax, double ay, double bx, double by) {
        this.a = new Point(ax, ay);
        this.b = new Point(bx, by);
    }

    public Line(Point A, Point B) {
        this.a = A;
        this.b = B;
    }


    public void move(double dx, double dy) {
        this.a.move(dx, dy);
        this.b.move(dx, dy);
    }


    public void spin(Point p, double angle) {
        this.a.spin(p, angle);
        this.b.spin(p, angle);
    }


    public void print() {
        this.a.print();
        System.out.print("-");
        this.b.print();
    }

}


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Shape m;
        while (in.hasNextInt()) {
            switch (in.nextInt()) {
            case 1:
                m = new Point(in.nextDouble(), in.nextDouble());
                break;
            case 2:
                m = new Line(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble());
                break;
            case 3:
                m = new Circle(in.nextDouble(), in.nextDouble(), in.nextDouble());
                break;
            case 4:
                m = new Trangle(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble());
                break;
            default:
                return;
            }
            switch (in.nextInt()) {
            case 1:
                m.move(in.nextDouble(), in.nextDouble());
                break;
            case 2:
                Point o = new Point(in.nextDouble(), in.nextDouble());
                m.spin(o, in.nextDouble());
                break;
            }
            m.print();
            System.out.println();
        }
    }

}
