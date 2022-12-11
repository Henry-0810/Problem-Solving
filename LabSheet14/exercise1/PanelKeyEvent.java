package LabSheet14.exercise1;

//PanelKeyEvent.java
/*This program shows how panels can be used with various layout managers to create
* a customised calculator GUI. It also handles some keyboard events*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelKeyEvent extends JFrame {

    private final JButton[] jbuttons;
    private final String[] buttonNames = {"2ndF","DRG","FSE","TAB","OFF","ON","hyp","sin","cos","tan","nCr","CE"};
    JTextField textField;

    public PanelKeyEvent() {
        super("Demonstrating JPanel");

        BorderLayout layout = new BorderLayout(2, 2);

        setLayout(layout);

        JPanel topPanel = new JPanel(new BorderLayout(2, 2));

        textField = new JTextField();
        textField.setHorizontalAlignment(SwingConstants.RIGHT);

        topPanel.add(textField,BorderLayout.NORTH);

        JPanel midPanel = new JPanel(); //this will use a FlowLayout manager by default

        JButton leftButton = new JButton("Scientific");
        JButton middleButton = new JButton("Financial");
        JButton rightButton = new JButton("Standard");

        midPanel.add(leftButton);
        midPanel.add(middleButton);
        midPanel.add(rightButton);

        topPanel.add(midPanel,BorderLayout.SOUTH);

        JPanel bottomPanel = new JPanel(new GridLayout(6,6));

        jbuttons = new JButton[36];

        for (int i = 0; i < jbuttons.length; i++) {
            if(i<12)
                jbuttons[i] = new JButton(buttonNames[i]);
            else
                jbuttons[i] = new JButton("?"); //got lazy entering button names :-)

            jbuttons[i].addActionListener(new ButtonEventHandler());

            bottomPanel.add(jbuttons[i]);
        }

        add(topPanel,BorderLayout.NORTH);
        add(bottomPanel,BorderLayout.CENTER);

        textField.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent e) {

                if(e.getKeyCode()==KeyEvent.VK_X) {
                    System.out.println("Exiting calculator application immediately ....");
                    System.exit(0);
                }
                else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
                    System.out.println("Moving JFrame window 20 pixels to the right ....");
                    Point currentLocation = PanelKeyEvent.this.getLocation();
                    PanelKeyEvent.this.setLocation((int)currentLocation.getX()+20,(int)currentLocation.getY());
                }
                else if(e.getKeyCode()==KeyEvent.VK_LEFT){
                    System.out.println("Moving JFrame window 20 pixels to the left ....");
                    Point currentLocation = PanelKeyEvent.this.getLocation();
                    PanelKeyEvent.this.setLocation((int)currentLocation.getX()-20,(int)currentLocation.getY());
                }
            }

            public void keyReleased(KeyEvent e){
                System.out.println("The " + e.getKeyChar() + " key was just released");
            }

            public void keyTyped(KeyEvent e){
                System.out.println("The " + e.getKeyChar() + " key was just typed");
            }

        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }


    public static void main(String[] args) {
        PanelKeyEvent b = new PanelKeyEvent();
    }

    private class ButtonEventHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            if (e.getActionCommand().equals("OFF"))
                textField.setText("");
            else if (e.getActionCommand().equals("ON")){
                textField.requestFocus();
            }
            else if(e.getActionCommand().equals("sin"))
                System.out.println("Sin of " + textField.getText() + " degrees is " +
                                    Math.sin(Double.parseDouble(textField.getText())*2*Math.PI/360));

        }
    }
}
