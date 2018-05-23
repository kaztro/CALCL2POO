package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author LN710Q
 */
public class Ventana extends JPanel {
    private int WIDTH = 500, HEIGHT = 300;
    private int withTF = 240, heightTF = 40;
    private int widthBT = 60, heightBT = 30;
    JButton suma, resta, multiplicacion, division, binario;
    JTextField val1, val2, result;
    
    public Ventana() {
        suma = new JButton("+");
        resta = new JButton("-");
        multiplicacion = new JButton("*");
        division = new JButton("/");
        binario = new JButton("Binary");
        val1 = new JTextField("Valor 1");
        val2 = new JTextField("Valor 2");
        result = new JTextField("Resultado");
        val1.setBounds(145, 40, withTF, heightTF);
        val2.setBounds(145, 60, withTF, heightTF);
        result.setBounds(145, 80, withTF, heightTF);
        suma.setBounds(200, 115, widthBT, heightBT);
        resta.setBounds(200, 115, widthBT, heightBT);
        multiplicacion.setBounds(200, 115, widthBT, heightBT);
        division.setBounds(200, 115, widthBT, heightBT);
        binario.setBounds(200, 115, widthBT, heightBT);
        suma.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                result.setText(val1.getText());
            }
    });
        resta.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                result.setText(val1.getText());
            }
    });
        multiplicacion.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                result.setText(val1.getText());
            }
    });
        division.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                result.setText(val1.getText());
            }
    });
        binario.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                result.setText(val1.getText());
            }
    });
    }
    
}
