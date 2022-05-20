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
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author alexa
 */
public class ventanaFinal extends JFrame {
    
    private JPanel jPanel1;
    private List<JLabel> jLabelList;
    private List<JPanel> jPanelList;
    private JComboBox jComboBox1;
    private JComboBox jComboBoxSede;
    private JComboBox jComboBoxCarreras;
    private JComboBox jComboBoxCodigo;
    private JComboBox jComboBoxModalidad;  
    private JComboBox jComboBoxPeriodo;
    private List<JTextField> jTextFieldList;    
    
    public ventanaFinal (String title) throws HeadlessException {
        super(title);
        this.setSize(1200,175);
        this.setLocation(440, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }     
    
    public void iniciarComponentes (){
        this.jPanel1 = new JPanel();
        this.jPanel1.setBackground(Color.WHITE);
        this.jPanel1.setLayout(new GridLayout(3,3));
        this.jPanel1.setBorder(BorderFactory.createTitledBorder(
                    BorderFactory.createEtchedBorder(),""));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarCombo1();
        this.iniciarComboSede();
        this.iniciarComboCarreras();
        this.iniciarComboCodigo();
        this.iniciarComboModalidad();   
        this.iniciarComboPeriodo();
        this.iniciarTextos();    
//        this.iniciarComboAutorización();
//        this.iniciarComboJornada();
//        this.iniciarCheckBox();
    }    
        
    public void iniciarPaneles(){
        this.jPanelList = new ArrayList<>();
        
        for(var a=0;a<7;a++){
            this.jPanelList.add(new JPanel());
            this.jPanelList.get(a).setBackground(Color.WHITE);
            this.jPanel1.add(this.jPanelList.get(a));  
        }
    }    
    
    public void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        for (var i=0;i<7;i++){
            this.jLabelList.add(new JLabel()); 
            this.jPanelList.get(i).add(this.jLabelList.get(i));         
            this.jPanelList.get(i).setBorder(BorderFactory.createTitledBorder(
                    BorderFactory.createEtchedBorder(),""));
        }
        
        this.jLabelList.get(0).setText(" Sede: ");  
        this.jLabelList.get(1).setText(" Campus/Extensión: ");
        this.jLabelList.get(2).setText(" Carrera: ");
        this.jLabelList.get(3).setText(" Código de Proyecto: ");        
        this.jLabelList.get(4).setText(" Modalidad: ");
        this.jLabelList.get(5).setText(" Periodo Académico: ");
        this.jLabelList.get(6).setText(" Fecha Inicio de Clases: ");      
        
    }    
    
    public void iniciarCombo1(){
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem(" ELEGIR SEDE ");
        this.jComboBox1.addItem(" MATRIZ CUENCA ");
        this.jComboBox1.addItem(" MATRIZ QUITO ");
        this.jComboBox1.addItem(" MATRIZ GUAYAQUIL ");
        
        this.jPanelList.get(0).add(this.jComboBox1);
    }    
    
    public void iniciarComboSede(){
        this.jComboBoxSede = new JComboBox();
        this.jComboBoxSede.addItem(" ELEGIR SEDE ");
        this.jComboBoxSede.addItem(" SEDE CUENCA ");
        this.jComboBoxSede.addItem(" SEDE QUITO ");
        this.jComboBoxSede.addItem(" SEDE GUAYAQUIL ");        
        
        this.jPanelList.get(1).add(this.jComboBoxSede);
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
    
    public void iniciarComboCodigo(){
        this.jComboBoxSede = new JComboBox();
        this.jComboBoxSede.addItem(" E-CV-IAG-003 BOTÁNICA ");
        
        this.jPanelList.get(3).add(this.jComboBoxSede);
    }     
    
    public void iniciarComboModalidad(){
        this.jComboBoxModalidad = new JComboBox();
        this.jComboBoxModalidad.addItem(" PRESENCIAL ");
        
        this.jPanelList.get(4).add(this.jComboBoxModalidad);
    }     
    
    public void iniciarComboPeriodo(){
        this.jComboBoxPeriodo = new JComboBox();
        this.jComboBoxPeriodo.addItem(" 2022 - 2022 ");
        
        this.jPanelList.get(5).add(this.jComboBoxPeriodo);
    }     
    
    public void iniciarTextos(){
        this.jTextFieldList= new ArrayList<>();
        this.jTextFieldList.add(new JTextField(" 28/03/2022 al 06/08/2022 "));   
        this.jTextFieldList.get(0).setColumns(20);            
        this.jPanelList.get(6).add(this.jTextFieldList.get(0));   
        
    }    
    
    
}
