/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal_ejercicio0302;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
//import javax.swing.JTextField;

/**
 *
 * @author alexa
 */
public class ventanaDatosPersonales extends JFrame {
    
    private JPanel jPanel1;
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JPanel> jPanelList;
    private JPanel jPanelPersonal;
    private List<JLabel> jLabelPersonalList;
    
    
    
    public ventanaDatosPersonales (String title) throws HeadlessException {
        super(title);
        this.setSize(500,500);
        this.setLocation(440, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }    
    
    public void iniciarComponentes (){
        this.jPanel1 = new JPanel();
        this.jPanel1.setBackground(Color.WHITE);
        this.jPanel1.setLayout(new GridLayout(9,1));
        this.jPanel1.setBorder(BorderFactory.createTitledBorder(
                    BorderFactory.createEtchedBorder(),"Personal"));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarTextos();       
    }
    
    public void iniciarPaneles(){
        this.jPanelList = new ArrayList<>();
        
        for(var a=0;a<9;a++){
            this.jPanelList.add(new JPanel());
            this.jPanelList.get(a).setBackground(Color.WHITE);
            this.jPanel1.add(this.jPanelList.get(a));  
        }
    }
    
    public void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        for (var i=0;i<9;i++){
            this.jLabelList.add(new JLabel()); 
            this.jPanelList.get(i).add(this.jLabelList.get(i));         
        }
        
        this.jLabelList.get(0).setText(" Apellidos: ");
        this.jLabelList.get(1).setText(" Nombres: ");        
        this.jLabelList.get(2).setText(" Nacionalidad: ");
        this.jLabelList.get(3).setText(" Género: ");                
        this.jLabelList.get(4).setText(" Correo electrónico personal: ");
        this.jLabelList.get(5).setText(" Fecha Nacimiento: ");        
        this.jLabelList.get(6).setText(" Teléfono Domicilio: ");
        this.jLabelList.get(7).setText(" Teléfono Celular: ");
        this.jLabelList.get(8).setText(" WhatsApp: ");
        
//        for(var j=0;j<9;j++)
//            this.jPanelList.get(j).add(this.jLabelList.get(j));  
        
    }
    
    public void iniciarTextos(){
        this.jTextFieldList= new ArrayList<>();
        this.jTextFieldList.add(new JTextField("Maxi Zhunio"));
        this.jTextFieldList.add(new JTextField("Alexander Stalyn"));
        this.jTextFieldList.add(new JTextField("Ecuatoriana"));
        this.jTextFieldList.add(new JTextField("Masculino"));
        this.jTextFieldList.add(new JTextField("alexanderstalynm99@gmail.com"));
        this.jTextFieldList.add(new JTextField("30/04/1999"));
        this.jTextFieldList.add(new JTextField("072400528"));
        this.jTextFieldList.add(new JTextField("0998058143"));
        this.jTextFieldList.add(new JTextField());
        
        for (var i=0;i<9;i++){
            this.jTextFieldList.get(i).setColumns(20);
            this.jPanelList.get(i).add(this.jTextFieldList.get(i));            
        }
        
    }
    
}
