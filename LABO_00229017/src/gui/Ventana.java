package gui;

import labo_00229017.Conversiones.Conversor;
import labo_00229017.Factory.AbstractFactory;
import labo_00229017.Factory.FactoryProducer;
import labo_00229017.Operaciones.Aritmetica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author LN710Q
 */
public class Ventana extends JFrame{
    private int WIDTH = 600, HEIGHT = 270, withTF = 150, heightTF = 30, widthBT = 50, heightBT = 30;
    JButton suma, resta, multiplicacion, division, binario;
    JTextField val1, val2, result, cajaC, resultC;

    public Ventana() {
        super("CalculadoraBajera.exe");
        initComponent();
    }

    public void initComponent() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        Container container = getContentPane();

        suma = new JButton("+");
        suma.setBounds(10,80, widthBT, heightBT);
        container.add(suma);

        resta = new JButton("-");
        resta.setBounds(60,80, widthBT, heightBT);
        container.add(resta);

        multiplicacion = new JButton("*");
        multiplicacion.setBounds(110,80, widthBT, heightBT);
        container.add(multiplicacion);

        division = new JButton("/");
        division.setBounds(160,80, widthBT, heightBT);
        container.add(division);

        binario = new JButton("Binary");
        binario.setBounds(210,170, widthBT+50, heightBT);
        container.add(binario);

        val1 = new JTextField();
        val1.setBounds(10, 30, withTF, heightTF);
        container.add(val1);

        val2 = new JTextField();
        val2.setBounds(210, 30, withTF, heightTF);
        container.add(val2);

        result = new JTextField();
        result.setBounds(10,170, withTF, heightTF);
        container.add(result);

        cajaC = new JTextField();
        cajaC.setBounds(400,30, withTF, heightTF);
        container.add(cajaC);

        resultC = new JTextField();
        resultC.setBounds(400,170, withTF, heightTF);
        container.add(resultC);


        suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                AbstractFactory factory;
                factory = FactoryProducer.getFactory("aritmetica");
                Aritmetica suma = factory.getAritmetica("suma");
                String cont1 = val1.getText();
                String cont2 = val2.getText();

                Pattern patron = Pattern.compile("\\d*");
                Matcher matcher = patron.matcher(cont1);
                Matcher matcher2 = patron.matcher(cont2);

                while(true){
                    if(matcher.matches() && matcher2.matches()){
                        double resultado = suma.operar(Double.parseDouble(val1.getText()),Double.parseDouble(val2.getText()));
                        result.setText(Double.toString(resultado));
                        break;
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "No es un numero, ingreselo nuevamente.");
                        break;
                    }
                }                }
        });
        resta.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                AbstractFactory factory;
                factory =  FactoryProducer.getFactory("aritmetica");
                Aritmetica resta = factory.getAritmetica("resta");
                String cont1 = val1.getText();
                String cont2 = val2.getText();
                Pattern patron = Pattern.compile("\\d*");
                Matcher matcher = patron.matcher(cont1);
                Matcher matcher2 = patron.matcher(cont2);

                while(true){
                    if(matcher.matches() && matcher2.matches()){
                        double resultado = resta.operar(Double.parseDouble(val1.getText()),Double.parseDouble(val2.getText()));
                        result.setText(Double.toString(resultado));
                        break;
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "No es un numero, ingreselo nuevamente.");
                        break;
                    }
                }
            }
        });
        multiplicacion.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                AbstractFactory factory;
                factory =  FactoryProducer.getFactory("aritmetica");
                Aritmetica multi = factory.getAritmetica("multiplicacion");
                String cont1 = val1.getText();
                String cont2 = val2.getText();
                Pattern patron = Pattern.compile("\\d*");
                Matcher matcher = patron.matcher(cont1);
                Matcher matcher2 = patron.matcher(cont2);

                while(true){
                    if(matcher.matches() && matcher2.matches()){
                        double resultado = multi.operar(Double.parseDouble(val1.getText()),Double.parseDouble(val2.getText()));
                        result.setText(Double.toString(resultado));
                        break;
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "No es un numero, ingreselo nuevamente.");
                        break;
                    }
                }
            }
        });
        division.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                AbstractFactory factory;
                factory =  FactoryProducer.getFactory("aritmetica");
                Aritmetica div = factory.getAritmetica("division");
                String cont1 = val1.getText();
                String cont2 = val2.getText();
                Pattern patron = Pattern.compile("\\d*");
                Matcher matcher = patron.matcher(cont1);
                Matcher matcher2 = patron.matcher(cont2);

                while(true){
                    if(matcher.matches() && matcher2.matches()){
                        double resultado = div.operar(Double.parseDouble(val1.getText()),Double.parseDouble(val2.getText()));
                        result.setText(Double.toString(resultado));
                        break;
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "No es un numero, ingreselo nuevamente.");
                        break;
                    }
                }
            }
        });
        binario.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                AbstractFactory factory;
                factory =  FactoryProducer.getFactory("conversor");
                Conversor conver = factory.getConversor("Binario");
                String cont3 = cajaC.getText();

                Pattern patron = Pattern.compile("\\d*");
                Matcher matcher = patron.matcher(cont3);

                while(true){
                    if(matcher.matches()){
                        String result = conver.Convertir(Integer.parseInt(cajaC.getText()));
                        resultC.setText(String.valueOf(result));
                        break;
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "No es un numero o no es positivo, intenta denuevo");
                        break;
                    }
                }

            }
        });
        setSize(WIDTH,HEIGHT);
    }
    public static void main(String[] args){
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run(){
                new Ventana().setVisible(true);
            }
        });
    }
    }



