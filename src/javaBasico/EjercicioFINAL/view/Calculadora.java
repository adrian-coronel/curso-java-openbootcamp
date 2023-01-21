package javaBasico.EjercicioFINAL.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JTextPane textPane1;
    private JButton button1;
    private JPanel MainCalculadora;
    private JButton siete;
    private JButton ocho;
    private JButton nueve;
    private JButton cuatro;
    private JButton cinco;
    private JButton seis;
    private JButton uno;
    private JButton dos;
    private JButton tres;
    private JButton igual;
    private JButton suma;
    private JButton resta;
    private JButton borrar;
    private JButton borrarTodo;

    double valorAcumulado = 0.0;
    double numero = 0.0;

    public Calculadora() {

        igual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(valorAcumulado);
            }
        });
        uno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = Double.parseDouble(uno.getText());
            }
        });
        dos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = Double.parseDouble(dos.getText());
            }
        });
        tres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = Double.parseDouble(tres.getText());
            }
        });
        cuatro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = Double.parseDouble(cuatro.getText());
            }
        });
        cinco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = Double.parseDouble(cinco.getText());
            }
        });
        seis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = Double.parseDouble(seis.getText());
            }
        });
        siete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = Double.parseDouble(siete.getText());
            }
        });
        ocho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = Double.parseDouble(ocho.getText());
            }
        });
        nueve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero = Double.parseDouble(nueve.getText());
            }
        });
        suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(numero);
                valorAcumulado = sumar(valorAcumulado,numero);

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(new Calculadora().MainCalculadora);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


    public double sumar(double valorAcumulado, double numero){
        valorAcumulado += numero;
        return valorAcumulado;
    }

}
