package EEE;

import java.util.Scanner;

class jisuan {
    double a, b;
    boolean valid;

    public jisuan() {
        this(0, 0, true);
    }

    public jisuan(double a, double b) {
        this(a, b, true);
    }

    public jisuan(double a, double b, boolean valid) {
        this.a = a;
        this.b = b;
        this.valid = valid;
    }

    public jisuan add(jisuan B) {
        return new jisuan(this.a + B.a, this.b + B.b, this.valid && B.valid);
    }

    public jisuan minus(jisuan B) {
        return new jisuan(this.a - B.a, this.b - B.b, this.valid && B.valid);
    }

    public jisuan multiply(jisuan B) {
        return new jisuan(this.a * B.a - this.b * B.b, this.a * B.b + this.b * B.a, this.valid && B.valid);
    }

    public jisuan divide(jisuan B) {
        if (B.a == 0 && B.b == 0) {
            return new jisuan(0, 0, false);
        }
        double c = Math.pow(B.a, 2) + Math.pow(B.b, 2);
        return new jisuan((this.a * B.a + this.b * B.b) / c, (this.b * B.a - this.a * B.b) / c, this.valid && B.valid);
    }

}


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String line = in.nextLine();
            Scanner lineIn = new Scanner(line);
            jisuan a = new jisuan(lineIn.nextDouble(), lineIn.nextDouble());
            while (lineIn.hasNextInt()) {
                switch (lineIn.nextInt()) {
                    case 1:
                        a = a.add(new jisuan(lineIn.nextDouble(), lineIn.nextDouble()));
                        break;
                    case 2:
                        a = a.minus(new jisuan(lineIn.nextDouble(), lineIn.nextDouble()));
                        break;
                    case 3:
                        a = a.multiply(new jisuan(lineIn.nextDouble(), lineIn.nextDouble()));
                        break;
                    case 4:
                        a = a.divide(new jisuan(lineIn.nextDouble(), lineIn.nextDouble()));
                        break;
                    default:
                    	return;
                }
            }
            if (a.valid) {
                if (a.b < 0) {
                    System.out.printf("(%.2f%.2fi)", a.a, a.b);
                } else {
                    System.out.printf("(%.2f+%.2fi)", a.a, a.b);
                }
            } else {
                System.out.print("divied by 0!");
            }
            System.out.println("");
        }
    }
}

