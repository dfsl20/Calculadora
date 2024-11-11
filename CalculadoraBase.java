package calculadora;

import javax.swing.*;
import java.awt.*;

public class CalculadoraBase extends JFrame {
    protected Display display;
    protected PanelBotones panelBotones;

    public CalculadoraBase() {
        setTitle("Calculadora Base");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        display = new Display();
        panelBotones = new PanelBotones();

        // Añadir display y panel de botones
        add(display, BorderLayout.NORTH);
        add(panelBotones, BorderLayout.CENTER);
    }

    public void showCalculator() {
        setVisible(true);
    }
}
