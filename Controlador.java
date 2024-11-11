package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
    private Display display;
    private Operacion operacion;
    private double num1 = 0, num2 = 0;
    private String operador = "";

    public Controlador(Display display) {
        this.display = display;
        this.operacion = new Operacion();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        try {
            switch (comando) {
                case "C":
                    limpiar();
                    break;

                case "+":
                case "-":
                case "*":
                case "/":
                    num1 = Double.parseDouble(display.getText());
                    operador = comando;
                    display.setText("");
                    break;

                case "=":
                    num2 = Double.parseDouble(display.getText());
                    double resultado = realizarOperacion(num1, num2, operador);
                    display.setText(String.valueOf(resultado));
                    num1 = resultado;
                    operador = "";
                    break;

                case "√":
                    num1 = Double.parseDouble(display.getText());
                    display.setText(String.valueOf(operacion.raizCuadrada(num1)));
                    break;

                case "%":
                    num1 = Double.parseDouble(display.getText());
                    display.setText(String.valueOf(operacion.porcentaje(num1)));
                    break;

                case "x²":
                    num1 = Double.parseDouble(display.getText());
                    display.setText(String.valueOf(operacion.cuadrado(num1)));
                    break;

                default:
                    display.setText(display.getText() + comando);
                    break;
            }
        } catch (NumberFormatException ex) {
            display.setText("Error");
        } catch (ArithmeticException ex) {
            display.setText("Error: " + ex.getMessage());
        }
    }

    private void limpiar() {
        display.setText("");
        num1 = 0;
        num2 = 0;
        operador = "";
    }

    private double realizarOperacion(double num1, double num2, String operador) {
        switch (operador) {
            case "+":
                return operacion.suma(num1, num2);
            case "-":
                return operacion.resta(num1, num2);
            case "*":
                return operacion.multiplicacion(num1, num2);
            case "/":
                return operacion.division(num1, num2);
            default:
                return 0;
        }
    }
}