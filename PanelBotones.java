package calculadora;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PanelBotones extends JPanel {

    private String[] botones = {
        "7", "8", "9", "/",
        "4", "5", "6", "*",
        "1", "2", "3", "-",
        "0", ".", "=", "+",
        "√", "%", "x²", "C"
    };

    public PanelBotones() {
        setLayout(new GridLayout(5, 4, 10, 10));
        for (String texto : botones) {
            JButton boton = new JButton(texto);
            boton.setFont(new Font("Arial", Font.BOLD, 20));
            add(boton);
        }
    }

    public void addActionListener(ActionListener listener) {
        for (Component comp : getComponents()) {
            if (comp instanceof JButton) {
                ((JButton) comp).addActionListener(listener);
            }
        }
    }
}