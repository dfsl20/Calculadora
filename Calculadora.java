package calculadora;

import javax.swing.*;

public class Calculadora extends CalculadoraBase {
    private Controlador controlador;

    public Calculadora() {
        super();  // Llamada al constructor de la clase base
        setTitle("Calculadora");

        // Crear y asignar el controlador a los botones
        controlador = new Controlador(display);
        panelBotones.addActionListener(controlador);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculadora calculadora = new Calculadora();
            calculadora.showCalculator();
        });
    }
}