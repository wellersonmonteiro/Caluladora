package visao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class Calculadora extends JFrame  {

    public Calculadora() {

        organiarLayout();

        // Create the main frame
        setSize(232,322);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void organiarLayout() {
          setLayout(new BorderLayout());

          Display display = new Display();
          display.setPreferredSize(new Dimension(233,60));
          add(display, BorderLayout.NORTH);

          Teclado teclado = new Teclado();
          add(teclado, BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        new Calculadora();

    }
}
