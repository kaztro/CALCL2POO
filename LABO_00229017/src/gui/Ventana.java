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
    private int WIDTH = 500, HEIGHT = 300, withTF = 240, heightTF = 40, widthBT = 60, heightBT = 30;
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
        suma.setBounds(200, 115, widthBT, heightBT);
        container.add(suma);

        resta = new JButton("-");
        resta.setBounds(200, 115, widthBT, heightBT);
        container.add(resta);

        multiplicacion = new JButton("*");
        multiplicacion.setBounds(200, 115, widthBT, heightBT);
        container.add(multiplicacion);

        division = new JButton("/");
        division.setBounds(200, 115, widthBT, heightBT);
        container.add(division);

        binario = new JButton("Binary");
        binario.setBounds(200, 115, widthBT, heightBT);
        container.add(binario);

        val1 = new JTextField("Valor 1");
        val1.setBounds(145, 40, withTF, heightTF);
        container.add(val1);

        val2 = new JTextField("Valor 2");
        val2.setBounds(145, 60, withTF, heightTF);
        container.add(val2);

        result = new JTextField("Resultado");
        result.setBounds(145, 80, withTF, heightTF);
        container.add(result);

        cajaC = new JTextField("A Binario");
        cajaC.setBounds(145, 80, withTF, heightTF);
        container.add(cajaC);

        resultC = new JTextField("A Binario");
        resultC.setBounds(145, 80, withTF, heightTF);
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
                        System.out.println("No es un numero o no es entero, ingreselo nuevamente.");
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
                        System.out.println("No es un numero o no es entero, ingreselo nuevamente.");
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
                        System.out.println("No es un numero o no es entero, ingreselo nuevamente.");
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
                        System.out.println("No es un numero o no es entero, ingreselo nuevamente.");
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
                Conversor conver = factory.getConversor("binario");
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
                        System.out.println("No puede convertirse a binario porque no es un numero o no es positivo.");
                        System.out.println("Ingreselo nuevamente");
                        break;
                    }
                }

            }
        });
        setSize(600,270);
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



/*
  public class Ventana extends JFrame{
    private JTextField caja1, caja2, caja3, caja4, caja5;
    private JButton botonSu, botonRe, botonMu, botonDi, botonCo;
    private JLabel label1, label2;



    public Ventana(){
        super("Titulo de la ventana");
        initComponent();
    }

    public void initComponent(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        Container contenedor = getContentPane();

        label1 = new JLabel("Calculadora");
        label1.setBounds(140,4,500,20);
        contenedor.add(label1);

        caja1 = new JTextField("Numero1");
        caja1.setBounds(10,30,150,30);
        contenedor.add(caja1);

        caja2 = new JTextField("Numero2");
        caja2.setBounds(210,30,150,30);
        contenedor.add(caja2);

        botonSu = new JButton("+");
        botonSu.setBounds(10,80,50,30);
        contenedor.add(botonSu);

        botonRe = new JButton("-");
        botonRe.setBounds(60,80,50,30);
        contenedor.add(botonRe);

        botonMu = new JButton("*");
        botonMu.setBounds(110,80,50,30);
        contenedor.add(botonMu);

        botonDi = new JButton("/");
        botonDi.setBounds(160,80,50,30);
        contenedor.add(botonDi);

        label2 = new JLabel("Conversor");
        label2.setBounds(140,130,500,20);
        contenedor.add(label2);

        caja3 = new JTextField("Numero3");
        caja3.setBounds(10,170,150,30);
        contenedor.add(caja3);

        botonCo = new JButton("a binario");
        botonCo.setBounds(210,170,150,30);
        contenedor.add(botonCo);

        caja4 = new JTextField();
        caja4.setBounds(400,30,150,30);
        contenedor.add(caja4);

        caja5 = new JTextField("");
        caja5.setBounds(400,170,150,30);
        contenedor.add(caja5);

        botonSu.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                AbstractFactory factory;
                factory =  FactoryProducer.getFactory("aritmetica");
                Aritmetica suma = factory.getAritmetica("suma");
                String cont1 = caja1.getText();
                String cont2 = caja2.getText();

                Pattern patron = Pattern.compile("\\d*");
                Matcher matcher = patron.matcher(cont1);
                Matcher matcher2 = patron.matcher(cont2);

                while(true){
                    if(matcher.matches() && matcher2.matches()){
                        float result = suma.operacion(Integer.parseInt(caja1.getText()),Integer.parseInt(caja2.getText()));
                        caja4.setText(Float.toString(result));
                        break;
                    }
                    else{
                        System.out.println("No es un numero o no es entero, ingreselo nuevamente.");
                        break;
                    }
                }
            }
        });

        botonRe.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                AbstractFactory factory;
                factory =  FactoryProducer.getFactory("aritmetica");
                Aritmetica resta = factory.getAritmetica("resta");
                String cont1 = caja1.getText();
                String cont2 = caja2.getText();

                Pattern patron = Pattern.compile("\\d*");
                Matcher matcher = patron.matcher(cont1);
                Matcher matcher2 = patron.matcher(cont2);

            while(true){
                if(matcher.matches() && matcher2.matches()){
                    float result = resta.operacion(Integer.parseInt(caja1.getText()),Integer.parseInt(caja2.getText()));
                    caja4.setText(Float.toString(result));
                    break;
                }
                else{
                    System.out.println("No es un numero o no es entero, ingreselo nuevamente.");
                    break;
                }
            }
            }
        });

        botonMu.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                AbstractFactory factory;
                factory =  FactoryProducer.getFactory("aritmetica");
                Aritmetica multi = factory.getAritmetica("multiplicacion");
                String cont1 = caja1.getText();
                String cont2 = caja2.getText();

                Pattern patron = Pattern.compile("\\d*");
                Matcher matcher = patron.matcher(cont1);
                Matcher matcher2 = patron.matcher(cont2);

                while(true){
                    if(matcher.matches() && matcher2.matches()){
                        float result = multi.operacion(Integer.parseInt(caja1.getText()),Integer.parseInt(caja2.getText()));
                        caja4.setText(Float.toString(result));
                        break;
                    }
                    else{
                        System.out.println("No es un numero o no es entero, ingreselo nuevamente.");
                        break;
                    }
                }
            }
        });

        botonDi.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                AbstractFactory factory;
                factory =  FactoryProducer.getFactory("aritmetica");
                Aritmetica div = factory.getAritmetica("division");
                String cont1 = caja1.getText();
                String cont2 = caja2.getText();

                Pattern patron = Pattern.compile("\\d*");
                Matcher matcher = patron.matcher(cont1);
                Matcher matcher2 = patron.matcher(cont2);

                while(true){
                    if(matcher.matches() && matcher2.matches()){
                        float result = div.operacion(Integer.parseInt(caja1.getText()),Integer.parseInt(caja2.getText()));
                        caja4.setText(Float.toString(result));
                        break;
                    }
                    else{
                        System.out.println("No es un numero o no es entero, ingreselo nuevamente.");
                        break;
                    }
                }

            }
        });

        botonCo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                AbstractFactory factory;
                factory =  FactoryProducer.getFactory("conversor");
                Conversor conver = factory.getConversor("binario");
                String cont3 = caja3.getText();

                Pattern patron = Pattern.compile("\\d*");
                Matcher matcher = patron.matcher(cont3);

                while(true){
                    if(matcher.matches()){
                        String result = conver.convertir(Integer.parseInt(caja3.getText()));
                        caja5.setText(result);
                        break;
                    }
                    else{
                        System.out.println("No puede convertirse a binario porque no es un numero o no es positivo.");
                        System.out.println("Ingreselo nuevamente");
                        break;
                    }
                }

            }
        });

        setSize(600,270);
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
*/