package calculadora;

import javax.swing.*;
import java.awt.*;

public class Display extends JTextField {

    public Display() {
        setFont(new Font("Calibri", Font.BOLD, 24));
        setHorizontalAlignment(SwingConstants.RIGHT);
        setEditable(false);
    }
}