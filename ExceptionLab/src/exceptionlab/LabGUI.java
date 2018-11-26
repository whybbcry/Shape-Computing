/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionlab;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LabGUI extends JFrame implements ActionListener {
  private JTextField jtfWeight			= new JTextField(10);
  private JTextField jtfHeight   		= new JTextField(10);
  private JTextField jtfCofficient 	= new JTextField(20);
  private JTextField jtfResult   		= new JTextField(20);
  private JButton jbCompute  			= new JButton("Compute");
	
  // Main method
  public static void main(String[ ] args) {
    LabGUI frame = new LabGUI( );
    frame.pack();
    frame.setTitle("Fat Coefficient");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public LabGUI( ) {
    // Panel p1 to hold labels and text fields
    JPanel p1 = new JPanel( );
    p1.setLayout(new GridLayout(4, 2));					
    p1.add(new JLabel("Weight (kg)"));
    p1.add(jtfWeight);										
    p1.add(new JLabel("Height (m)"));
    p1.add(jtfHeight);										
    p1.add(new JLabel("Coefficient, good if 15 to 25"));
    p1.add(jtfCofficient);										
    jtfCofficient.setEditable(false);
    p1.add(new JLabel("Result"));								
    p1.add(jtfResult);
    jtfResult.setEditable(false);								

    // Add p1 to the frame
    this.getContentPane().setLayout(new BorderLayout());
    this.getContentPane().add(p1,BorderLayout.CENTER);
    this.getContentPane().add(jbCompute,BorderLayout.SOUTH);

    // Register listener
    jbCompute.addActionListener(this);						
  }

  public void actionPerformed(ActionEvent e) {
    String kg;
    String m;
    double fc;
      
    if (e.getSource() == jbCompute) {						
       try{
           kg = jtfWeight.getText();
       
       m = jtfHeight.getText();
       
       //SET WEIGHT
       double weight;
       weight = Double.parseDouble(kg);
       
       //SET HEIGHT
       double height;
       height = Double.parseDouble(m);
       
       //CALCULATE THE FC
       fc = weight/(height*height);
       
       //PUT THE RESULT OF FC INTO String result
       String result;
       result = String.valueOf(fc);
       
       jtfCofficient.setText(result);
       
       //RSULT RULE
       if(fc > 25){
          jtfResult.setText("Too Fat, need to keep fat!");
       } else if (fc < 15){
          jtfResult.setText("Too Thin, need to keep fat!");
       } else {
          jtfResult.setText("Just fit, keep on!");
       }
      }catch(Exception iw){
        jtfResult.setText("Exception");
        jtfCofficient.setText("Exception");
      }
    }
  }

}
