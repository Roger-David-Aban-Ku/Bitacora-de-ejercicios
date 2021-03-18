package metodosnumericos;

import java.util.Scanner;

public class MetodosNumericos {

    public static void main(String[] args) {
        int op;
        double x, a, b, c;
        Formulas formula;
        Scanner teclado = new Scanner(System.in);
        System.out.println("-----------Integrantes del Equipo-----------"
                    + "\n**Roger David Aban Ku ----------- 19070025"
                    + "\n**Axel Salvador Aguilar Nuñez --- 19070005"
                    + "\n**Jesus Armando Cabrera Piña ---- 19070007");
            System.out.println("--------------------------------------------");
        do {
            System.out.println("Selecciona lo siguiente: "
                    + "\n 1.- Operacion con Euler"
                    + "\n 2.- Factorización"
                    + "\n 3.- Salir");
            System.out.print("R: ");
            op = teclado.nextInt();
            switch (op) {
                case 1:
                    formula = new Formulas();
                    System.out.print("Ingrese el valor de x: ");
                    x = teclado.nextDouble();
                    System.out.println("Euler^"+x+": " + formula.euler(x));
                    System.out.println("Euler^-"+x+": " + (1 / formula.euler(x)));
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Ingrese los valores de a, b, y c, que son los coeficientes de cada variable de una ecuacion cuadratica");
                    System.out.print("a: ");
                    a = teclado.nextDouble();
                    System.out.print("b: ");
                    b = teclado.nextDouble();
                    System.out.print("c: ");
                    c = teclado.nextDouble();
                    System.out.println("Valor de a: " + a
                            + "\nValor de b: " + b
                            + "\nValor de c: " + c);
                    formula = new Formulas(a, b, c);
                    formula.factorizacion1();
                    formula.factorizacion2();
                    break;
                case 3:
                    System.out.println("Saliendo del Programa");
                    break;
                default:
                    System.out.println("Vuelva a ingresar una OPCIÓN VALIDA");
                    break;
            }

        } while (op != 3);

    }

}
