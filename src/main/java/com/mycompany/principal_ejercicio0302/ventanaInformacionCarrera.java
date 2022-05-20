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
import javax.swing.SwingConstants;

/**
 *
 * @author alexa
 */
public class ventanaInformacionCarrera extends JFrame {
    
    private JPanel jPanel1;
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JPanel> jPanelList;
    private JComboBox jComboBoxCarreras;
    private JComboBox jComboBoxModalidad;
    private JComboBox jComboBoxCampus;
    private JComboBox jComboBoxSede;    
    private JComboBox jComboBoxJornada;    
    //private JButton jButton1;
    private List<JButton> jButtonList;
    
    public ventanaInformacionCarrera(String title) throws HeadlessException {
        super(title);
        this.setSize(400,400);
        this.setLocation(30, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }
    
    public void iniciarComponentes(){
        this.jPanel1 = new JPanel();
        this.jPanel1.setBackground(Color.WHITE);
        this.jPanel1.setLayout(new GridLayout(9,1));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
//        this.iniciarTextos();
        this.iniciarBoton();
        this.iniciarComboCarreras();
        this.iniciarComboModalidad();
        this.iniciarComboSede();        
        this.iniciarComboCampus();        
        this.iniciarComboJornada();      
    }
    
    public void iniciarPaneles(){
        this.jPanelList = new ArrayList<>();
        
        for(var i=0;i<9;i++)
            this.jPanelList.add(new JPanel());
        //this.jPanelList.add(new JPanel());
        
        this.jPanelList.get(0).setBackground(Color.CYAN);
        this.jPanelList.get(1).setBackground(Color.WHITE);
        this.jPanelList.get(2).setBackground(Color.WHITE);
        this.jPanelList.get(3).setBackground(Color.WHITE);        
        this.jPanelList.get(4).setBackground(Color.WHITE);        
        this.jPanelList.get(5).setBackground(Color.WHITE);
        this.jPanelList.get(6).setBackground(Color.WHITE);
        this.jPanelList.get(7).setBackground(Color.WHITE);        
        this.jPanelList.get(8).setBackground(Color.WHITE);        

        
        for (var j=0;j<9;j++)
            this.jPanel1.add(this.jPanelList.get(j));
        //this.jPanel1.add(this.jPanelList.get(1));
        
    }
    
    public void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel(" INFORMACIÓN DE CARRERA "));
        this.jLabelList.add(new JLabel("Periodo Académico: 2022 - 2022 "));
        this.jLabelList.add(new JLabel("Carrera: * "));
        this.jLabelList.add(new JLabel("Modalidad: * ")); 
        this.jLabelList.add(new JLabel("Sede: * "));         
        this.jLabelList.add(new JLabel("Campus: * "));         
        this.jLabelList.add(new JLabel("Jornada: * "));       
        this.jLabelList.add(new JLabel("Fecha de Registro: 29/04/2022"));       
        this.jLabelList.add(new JLabel());               
        
        for(var i=0;i<9;i++)
            this.jPanelList.get(i).add(this.jLabelList.get(i));
        //this.jPanelList.get(0).add(this.jLabelList.get(0));
        
    }
    
//    public void iniciarTextos(){
//        this.jTextFieldList = new ArrayList<>();
//        this.jTextFieldList.add(new JTextField());
//        this.jTextFieldList.get(0).setColumns(10);
//        this.jPanelList.get(1).add(this.jTextFieldList.get("hola",0));
//    }
    
    public void iniciarBoton(){
        this.jButtonList = new ArrayList<>();
        this.jButtonList.add(new JButton(" Siguiente "));
        this.jPanelList.get(8).add(this.jButtonList.get(0));  
    }
    
    
    public void iniciarComboCarreras(){
        this.jComboBoxCarreras = new JComboBox();
        this.jComboBoxCarreras.addItem(" ELEGIR CARRERA ");
        this.jComboBoxCarreras.addItem(" ADMINISTRACIÓN DE EMPRESAS ");
        this.jComboBoxCarreras.addItem(" ARQUITECTURA ");
        this.jComboBoxCarreras.addItem(" BIOMEDICINA ");        
        this.jComboBoxCarreras.addItem(" BIOTECNOLOGÍA ");
        this.jComboBoxCarreras.addItem(" COMUNICACIÓN ");
        this.jComboBoxCarreras.addItem(" COMPUTACIÓN ");
        this.jComboBoxCarreras.addItem(" CONTABILIDAD Y AUDITORÍA ");
        this.jComboBoxCarreras.addItem(" DERECHO ");
        this.jComboBoxCarreras.addItem(" DISEÑO MULTIMEDIA ");        
        this.jComboBoxCarreras.addItem(" EDUCACIÓN BÁSICA ");
        this.jComboBoxCarreras.addItem(" EDUCACIÓN INICIAL ");
        this.jComboBoxCarreras.addItem(" ECONOMÍA ");
        this.jComboBoxCarreras.addItem(" ELECTRICIDAD ");
        this.jComboBoxCarreras.addItem(" ELECTRÓNICA Y AUTOMATIZACIÓN ");
        this.jComboBoxCarreras.addItem(" INGENIERÍA AMBIENTAL ");        
        this.jComboBoxCarreras.addItem(" INGENIERÍA AUTOMOTRIZ ");
        this.jComboBoxCarreras.addItem(" INGENIERÍA CIVIL ");
        this.jComboBoxCarreras.addItem(" INGENIERÍA INDUSTRIAL ");        
        this.jComboBoxCarreras.addItem(" MECÁNICA ");
        this.jComboBoxCarreras.addItem(" MECATRÓNICA ");
        this.jComboBoxCarreras.addItem(" MEDICINA VETERINARIA ");
        this.jComboBoxCarreras.addItem(" NEGOCIOS DIGITALES ");        
        this.jComboBoxCarreras.addItem(" PEDAGOGÍA ");
        this.jComboBoxCarreras.addItem(" PSICOLOGÍA ");
        this.jComboBoxCarreras.addItem(" TELECOMUNICACIONES ");          
        
        
        this.jPanelList.get(2).add(this.jComboBoxCarreras);
    }        
    
    public void iniciarComboModalidad(){
        this.jComboBoxModalidad = new JComboBox();
        this.jComboBoxModalidad.addItem(" ELEGIR MODALIDAD ");
        this.jComboBoxModalidad.addItem(" PRESENCIAL ");
        
        this.jPanelList.get(3).add(this.jComboBoxModalidad);
    } 
    
    public void iniciarComboSede(){
        this.jComboBoxSede = new JComboBox();
        this.jComboBoxSede.addItem(" ELEGIR SEDE ");
        this.jComboBoxSede.addItem(" SEDE CUENCA ");
        this.jComboBoxSede.addItem(" SEDE QUITO ");
        this.jComboBoxSede.addItem(" SEDE GUAYAQUIL ");        
        
        this.jPanelList.get(4).add(this.jComboBoxSede);
    }     
    
    public void iniciarComboCampus(){
        this.jComboBoxCampus = new JComboBox();
        this.jComboBoxCampus.addItem(" ELEGIR CAMPUS ");
        this.jComboBoxCampus.addItem(" CAMPUS EL VECINO ");
        this.jComboBoxCampus.addItem(" CAMPUS EL GIRÓN ");
        this.jComboBoxCampus.addItem(" CAMPUS CENTENARIO ");        
        
        this.jPanelList.get(5).add(this.jComboBoxCampus);
    }      
    
    public void iniciarComboJornada(){
        this.jComboBoxJornada = new JComboBox();
        this.jComboBoxJornada.addItem(" ELEGIR JORNADA ");
        this.jComboBoxJornada.addItem(" JORNADA DIURNA ");
        this.jComboBoxJornada.addItem(" JORNADA NOCTURNA ");
        
        this.jPanelList.get(6).add(this.jComboBoxJornada);
    }    
    
    
}
