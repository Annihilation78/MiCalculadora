package MiCalculadora;

import java.util.Scanner;

/**
 * Esta clase implementa una calculadora científica que puede realizar diversas operaciones matemáticas.
 */
public class CalculadoraCientifica {

    /**
     * Realiza la operación de suma entre dos números.
     * @param a Primer número a sumar.
     * @param b Segundo número a sumar.
     * @return Resultado de la suma.
     */
    public double sumar(double a, double b) {
        return a + b;
    }

    /**
     * Realiza la operación de resta entre dos números.
     * @param a Número al que se resta.
     * @param b Número que se resta.
     * @return Resultado de la resta.
     */
    public double restar(double a, double b) {
        return a - b;
    }

    /**
     * Realiza la operación de multiplicación entre dos números.
     * @param a Primer número a multiplicar.
     * @param b Segundo número a multiplicar.
     * @return Resultado de la multiplicación.
     */
    public double multiplicar(double a, double b) {
        return a * b;
    }

    /**
     * Realiza la operación de división entre dos números.
     * @param a Dividendo.
     * @param b Divisor.
     * @return Resultado de la división.
     * @throws ArithmeticException Si se intenta dividir entre cero.
     */
    public double dividir(double a, double b) throws ArithmeticException {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Error: División por cero");
        }
    }

    /**
     * Calcula la potencia de un número elevado a otro.
     * @param base Base de la potencia.
     * @param exponente Exponente de la potencia.
     * @return Resultado de la potencia.
     */
    public double elevar(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    /**
     * Calcula la raíz cuadrada de un número.
     * @param a Número del que se desea calcular la raíz cuadrada.
     * @return Raíz cuadrada del número.
     */
    public double raizCuadrada(double a) {
        return Math.sqrt(a);
    }

    /**
     * Calcula el seno de un ángulo en radianes.
     * @param a Ángulo en radianes.
     * @return Seno del ángulo.
     */
    public double seno(double a) {
        return Math.sin(a);
    }

    /**
     * Calcula el coseno de un ángulo en radianes.
     * @param a Ángulo en radianes.
     * @return Coseno del ángulo.
     */
    public double coseno(double a) {
        return Math.cos(a);
    }

    /**
     * Calcula la tangente de un ángulo en radianes.
     * @param a Ángulo en radianes.
     * @return Tangente del ángulo.
     */
    public double tangente(double a) {
        return Math.tan(a);
    }

    /**
     * Calcula el logaritmo natural de un número.
     * @param a Número del que se desea calcular el logaritmo natural.
     * @return Logaritmo natural del número.
     */
    public double logaritmoNatural(double a) {
        return Math.log(a);
    }

    /**
     * Calcula el logaritmo en base 10 de un número.
     * @param a Número del que se desea calcular el logaritmo en base 10.
     * @return Logaritmo en base 10 del número.
     */
    public double logaritmoBase10(double a) {
        return Math.log10(a);
    }

    /**
     * Calcula la exponencial de un número.
     * @param a Número del que se desea calcular la exponencial.
     * @return Exponencial del número.
     */
    public double exponencial(double a) {
        return Math.exp(a);
    }

    /**
     * Método principal que permite al usuario utilizar la calculadora.
     * Permite seleccionar una operación y proporcionar los números necesarios para dicha operación.
     * @param args Argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculadoraCientifica calculadora = new CalculadoraCientifica();
        double num1, num2 = 0, resultado;
        int opcion;

        while (true) {
            System.out.println("Elige la operación que quieres realizar:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Elevar");
            System.out.println("6. Raíz cuadrada del primer número");
            System.out.println("7. Seno del primer número");
            System.out.println("8. Coseno del primer número");
            System.out.println("9. Tangente del primer número");
            System.out.println("10. Logaritmo natural del primer número");
            System.out.println("11. Logaritmo en base 10 del primer número");
            System.out.println("12. Exponencial del primer número");
            System.out.println("13. Salir");

            opcion = scanner.nextInt();

            if (opcion == 13) {
                break;
            }

            // Verifica si la opción seleccionada requiere un solo número o dos números
            if (opcion >= 6 && opcion <= 12) {
                System.out.println("Introduce el número:");
                num1 = scanner.nextDouble();
            } else {
                System.out.println("Introduce el primer número:");
                num1 = scanner.nextDouble();
                System.out.println("Introduce el segundo número:");
                num2 = scanner.nextDouble();
            }

            // Realiza la operación seleccionada y muestra el resultado
            switch (opcion) {
                case 1:
                    resultado = calculadora.sumar(num1, num2);
                    break;
                case 2:
                    resultado = calculadora.restar(num1, num2);
                    break;
                case 3:
                    resultado = calculadora.multiplicar(num1, num2);
                    break;
                case 4:
                    resultado = calculadora.dividir(num1, num2);
                    break;
                case 5:
                    resultado = calculadora.elevar(num1, num2);
                    break;
                case 6:
                    resultado = calculadora.raizCuadrada(num1);
                    break;
                case 7:
                    resultado = calculadora.seno(num1);
                    break;
                case 8:
                    resultado = calculadora.coseno(num1);
                    break;
                case 9:
                    resultado = calculadora.tangente(num1);
                    break;
                case 10:
                    resultado = calculadora.logaritmoNatural(num1);
                    break;
                case 11:
                    resultado = calculadora.logaritmoBase10(num1);
                    break;
                case 12:
                    resultado = calculadora.exponencial(num1);
                    break;
                default:
                    System.out.println("Opción no válida");
                    continue;
            }

            System.out.println("Resultado de la operación: " + resultado);
        }

        scanner.close();
    }
}
