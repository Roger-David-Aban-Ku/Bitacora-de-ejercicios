package metodosnumericos;

public class Formulas {

    double a, b, c;

    public Formulas() {
    }

    public Formulas(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    long Factorial(int j) {
        long prod = 1;
        for (int i = 1; i < j; i++) {
            prod = prod * i;

        }
        return prod;
    }

    double euler(double x) {
        int f = 0;
        double e = 0;
        for (int i = 1; i < 20; i++) {
            e = e + (Math.pow(x, f)) / (double) (Factorial(i));
            f++;
        }
        return e;
    }

    double F1factx1() {
        double x1;
        x1 = (-b + Math.sqrt((Math.pow(b, 2)) - (4 * a * c))) / (2 * a);
        return x1;
    }

    double F1factx2() {
        double x2;
        x2 = (-b - Math.sqrt((Math.pow(b, 2)) - (4 * a * c))) / (2 * a);
        return x2;
    }

    void factorizacion1() {
        System.out.println("\nPrimera formula de Factorización(Formula general)");
        System.out.println("---Raiz Positiva(x1): " + F1factx1());
        System.out.println("---Raiz Negativa(x2): " + F1factx2());
    }

    double F2factx1() {
        double x1;
        x1 = (-2 * c) / (b + Math.sqrt((Math.pow(b, 2)) - (4 * a * c)));
        return x1;
    }

    double F2factx2() {
        double x2;
        x2 = (-2 * c) / (b - Math.sqrt((Math.pow(b, 2)) - (4 * a * c)));
        return x2;
    }

    void factorizacion2() {
        System.out.println("\nSegunda formula de Factorización");
        System.out.println("---Raiz Positiva(x1): " + F2factx1());
        System.out.println("---Raiz Negativa(x2): " + F2factx2());
        System.out.println("");
    }

}
