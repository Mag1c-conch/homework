package HHH;

import java.util.Scanner;

class jisuan {
    int a, b;
    boolean denominatorIsZero;
    boolean divisorIsZero;

    public jisuan(int a, int b) {
        this(a, b, b == 0, false);
    }

    public jisuan(int a, int b, boolean denominatorIsZero, boolean divisorIsZero) {
        this.a = a;
        this.b = b;
        this.denominatorIsZero = denominatorIsZero;
        this.divisorIsZero = divisorIsZero;
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public jisuan add(jisuan b) {
        return new jisuan(
                this.a * b.b + this.b * b.a,
                this.b * b.b,
                this.denominatorIsZero || b.denominatorIsZero,
                this.divisorIsZero || b.denominatorIsZero).simplify();
    }

    public jisuan minus(jisuan b) {
        return new jisuan(
                this.a * b.b - this.b * b.a,
                this.b * b.b,
                this.denominatorIsZero || b.denominatorIsZero,
                this.divisorIsZero || b.denominatorIsZero).simplify();
    }

    public jisuan multiply(jisuan b) {
        return new jisuan(
                this.a * b.a,
                this.b * b.b,
                this.denominatorIsZero || b.denominatorIsZero,
                this.divisorIsZero || b.denominatorIsZero).simplify();
    }

    public jisuan divide(jisuan b) {
        return new jisuan(
                this.a * b.b,
                this.b * b.a,
                this.denominatorIsZero || b.denominatorIsZero,
                this.divisorIsZero || b.denominatorIsZero || b.a == 0).simplify();
    }

    public jisuan simplify() {
        int c = gcd(this.a, this.b);
        this.a = this.a / c;
        this.b = this.b / c;
        return this;
    }

    public void print() {
        simplify();
        if (this.denominatorIsZero) {
            System.out.print("The denominator cannot be zero！");
        } else if (this.divisorIsZero) {
            System.out.print("The divisor cannot be zero！");
        } else {
            System.out.print(this.a+"/"+this.b);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            String line = in.nextLine();
            Scanner lineIn = new Scanner(line);
            jisuan a = new jisuan(lineIn.nextInt(), lineIn.nextInt());
            while (lineIn.hasNextInt()) {
                switch (lineIn.nextInt()) {
                    case 1:
                        a = a.add(new jisuan(lineIn.nextInt(), lineIn.nextInt()));
                        break;
                    case 2:
                        a = a.minus(new jisuan(lineIn.nextInt(), lineIn.nextInt()));
                        break;
                    case 3:
                        a = a.multiply(new jisuan(lineIn.nextInt(), lineIn.nextInt()));
                        break;
                    case 4:
                        a = a.divide(new jisuan(lineIn.nextInt(), lineIn.nextInt()));
                        break;
                   
                }
            }
            a.print();
            System.out.println();
        }
    }


}
