package javaBasico.Eventos_XML_JSON.Eventos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MiForm {
    private JTextPane precioPane;
    private JTextPane totalPane;
    private JTextPane ivaPane;
    private JButton btnCalcular;
    private JPanel TaxPanel;

    public MiForm() {
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double precio = Double.parseDouble(precioPane.getText());
                double iva = Double.parseDouble(ivaPane.getText());
                double resultado = precio + iva * precio;
                totalPane.setText(Double.toString(resultado));
            }
        });

        /**
         * En este caso he creado un "evento" que realize una acción cada vez
         * que se escribe un caracter
         * */
        precioPane.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                String valorPrecio = precioPane.getText() + " - ";
                precioPane.setText(valorPrecio);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MiFrom");
        frame.setContentPane(new MiForm().TaxPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
