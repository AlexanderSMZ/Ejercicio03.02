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
import javax.swing.JButton;
import javax.swing.JCheckBox;
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
public class ventanaCrearGrupo extends JFrame {
    
    private JPanel jPanel1;
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JPanel> jPanelList;
    private JPanel jPanelPersonal;
    private List<JLabel> jLabelPersonalList;
    private JComboBox jComboBoxAutorizacion;
    private JComboBox jComboBoxJornada;            
    private JComboBox jComboBoxCambio;                
    private JCheckBox jCheckBox;

    
    
    public ventanaCrearGrupo (String title) throws HeadlessException {
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
        this.jPanel1.setLayout(new GridLayout(14,1));
        this.jPanel1.setBorder(BorderFactory.createTitledBorder(
                    BorderFactory.createEtchedBorder(),"Personal"));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarTextos();    
        this.iniciarComboAutorización();
        this.iniciarComboJornada();
        this.iniciarCheckBox();
        this.iniciarComboCambio();
    }
    
    public void iniciarPaneles(){
        this.jPanelList = new ArrayList<>();
        
        for(var a=0;a<13;a++){
            this.jPanelList.add(new JPanel());
            this.jPanelList.get(a).setBackground(Color.WHITE);
            this.jPanel1.add(this.jPanelList.get(a));  
        }
    }
    
    public void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        for (var i=0;i<13;i++){
            this.jLabelList.add(new JLabel()); 
            this.jPanelList.get(i).add(this.jLabelList.get(i));         
        }
        
        this.jLabelList.get(0).setText(" Periodo Académico: ");
        this.jLabelList.get(1).setText(" Sede: ");        
        this.jLabelList.get(2).setText(" Campus/Extensión: ");
        this.jLabelList.get(3).setText(" Modalidad: ");                
        this.jLabelList.get(4).setText(" Carrera: ");
        this.jLabelList.get(5).setText(" Código de Proyecto: ");        
        this.jLabelList.get(6).setText(" Asignatura: ");
        this.jLabelList.get(7).setText(" Nombre de grupo: ");
        this.jLabelList.get(8).setText(" Cupos por Grupo: ");
        this.jLabelList.get(9).setText(" Autorización calificación sobre 100: ");
        this.jLabelList.get(10).setText(" Seleccionar Jornada del Grupo: ");
        this.jLabelList.get(11).setText(" Oferta para estudiantes: ");        
        this.jLabelList.get(12).setText(" Aplica Cambio de Grupo: ");        
        
//        for(var j=0;j<9;j++)
//            this.jPanelList.get(j).add(this.jLabelList.get(j));  
        
    }
    
    public void iniciarTextos(){
        this.jTextFieldList= new ArrayList<>();
        this.jTextFieldList.add(new JTextField(" 2022 - 2022 "));
        this.jTextFieldList.add(new JTextField(" MATRIZ CUENCA "));
        this.jTextFieldList.add(new JTextField(" EL VECINO "));
        this.jTextFieldList.add(new JTextField(" PRESENCIAL "));
        this.jTextFieldList.add(new JTextField(" AGROPEPECUARIA "));
        this.jTextFieldList.add(new JTextField(" AGROPEPECUARIA [REDISEÑO] - NUEVA O REDISEÑO "));
        this.jTextFieldList.add(new JTextField(" E-CV-IAG-003 BOTÁNICA "));
        this.jTextFieldList.add(new JTextField(" GRUPO - 1 "));
        this.jTextFieldList.add(new JTextField(" 40 "));        
//        this.jTextFieldList.add(new JTextField());
//        this.jTextFieldList.add(new JTextField());
//        this.jTextFieldList.add(new JTextField());
//        this.jTextFieldList.add(new JTextField());        
        
        
        for (var i=0;i<9;i++){
            this.jTextFieldList.get(i).setColumns(20);
            this.jPanelList.get(i).add(this.jTextFieldList.get(i));            
        }
        
    }

    public void iniciarComboAutorización(){
        this.jComboBoxAutorizacion = new JComboBox();
        this.jComboBoxAutorizacion.addItem(" NO ");
        this.jComboBoxAutorizacion.addItem(" S1 ");
        
        this.jPanelList.get(9).add(this.jComboBoxAutorizacion);
    }    

    public void iniciarComboJornada(){
        this.jComboBoxJornada = new JComboBox();
        this.jComboBoxJornada.addItem(" JORNADAS DISPONIBLES ");
        this.jComboBoxJornada.addItem(" JORNADA DIURNA ");
        this.jComboBoxJornada.addItem(" JORNADA NOCTURNA ");
        
        this.jPanelList.get(10).add(this.jComboBoxJornada);
    }
    
    public void iniciarComboCambio(){
        this.jComboBoxCambio = new JComboBox();
        this.jComboBoxCambio.addItem(" NO ");
        this.jComboBoxCambio.addItem(" SI ");
        
        this.jPanelList.get(12).add(this.jComboBoxCambio);
    }    
    
    public void iniciarCheckBox(){
        this.jCheckBox=new JCheckBox("Nuevos");
        this.jCheckBox.setBackground(Color.WHITE);
        this.jPanelList.get(11).add(this.jCheckBox);
    }    
    

    
    
}
