package calculadora;

public class Operacion {

    public double suma(double num1, double num2) {
        return num1 + num2;
    }

    public double resta(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }

    public double division(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return num1 / num2;
    }

    public double raizCuadrada(double num) {
        return Math.sqrt(num);
    }

    public double porcentaje(double num) {
        return num / 100;
    }

    public double cuadrado(double num) {
        return num * num;
    }
}