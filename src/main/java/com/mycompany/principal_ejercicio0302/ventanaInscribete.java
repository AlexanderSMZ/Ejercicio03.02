/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal_ejercicio0302;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author alexa
 */
public class ventanaInscribete extends JFrame {
    
   private JPanel jPanel1;
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JPanel> jPanelList;
    private JComboBox jComboBox1;
    private JComboBox jComboBox2;
    //private JButton jButton1;
    private List<JButton> jButtonList;
    
    public ventanaInscribete(String title) throws HeadlessException {
        super(title);
        this.setSize(400,250);
        this.setLocation(30, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }
    
    public void iniciarComponentes(){
        this.jPanel1 = new JPanel();
        this.jPanel1.setBackground(Color.WHITE);
        this.jPanel1.setLayout(new GridLayout(5,1));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarTextos();
        this.iniciarBoton();
        this.iniciarCombo1();
        this.iniciarCombo2();    
    }
    
    public void iniciarPaneles(){
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.get(0).setBackground(Color.CYAN);
        this.jPanelList.get(1).setBackground(Color.WHITE);
        this.jPanelList.get(2).setBackground(Color.WHITE);
        this.jPanelList.get(3).setBackground(Color.WHITE);        
        this.jPanelList.get(4).setBackground(Color.WHITE);        

        this.jPanel1.add(this.jPanelList.get(0));
        this.jPanel1.add(this.jPanelList.get(1));
        this.jPanel1.add(this.jPanelList.get(2));
        this.jPanel1.add(this.jPanelList.get(3));
        this.jPanel1.add(this.jPanelList.get(4));
        
        /*    this.jPanelList.get(0).setBackground(Color.WHITE);
        this.jPanelList.get(1).setBackground(Color.BLUE);
        this.jPanelList.get(2).setBackground(Color.CYAN);
        this.jPanelList.get(3).setBackground(Color.YELLOW);*/        
        
    }
    
    public void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel(" INSCRÍBETE "));
        this.jLabelList.add(new JLabel("Seleccione una Sede: * "));
        this.jLabelList.add(new JLabel("Tipo Documento: * "));
        this.jLabelList.add(new JLabel("Ingrese su Identificación: * "));        
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(1).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jLabelList.get(2));
        this.jPanelList.get(3).add(this.jLabelList.get(3));
    }
    
    public void iniciarTextos(){
        this.jTextFieldList = new ArrayList<>();
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.get(0).setColumns(10);
        this.jPanelList.get(3).add(this.jTextFieldList.get(0));
    }
    
    public void iniciarBoton(){
        this.jButtonList = new ArrayList<>();
        this.jButtonList.add(new JButton(" Ingresar "));
        this.jPanelList.get(4).add(this.jButtonList.get(0));  
    }
    
    
    public void iniciarCombo1(){
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem(" ELEGIR SEDE ");
        this.jComboBox1.addItem(" MATRIZ CUENCA ");
        this.jComboBox1.addItem(" MATRIZ QUITO ");
        this.jComboBox1.addItem(" MATRIZ GUAYAQUIL ");
        
        this.jPanelList.get(1).add(this.jComboBox1);
    }        
    
    public void iniciarCombo2(){
        this.jComboBox2 = new JComboBox();
        this.jComboBox2.addItem(" ELEGIR DOCUMENTO ");
        this.jComboBox2.addItem(" CÉDULA ");
        this.jComboBox2.addItem(" PASAPORTE ");
        
        this.jPanelList.get(2).add(this.jComboBox2);
    } 
    
}

