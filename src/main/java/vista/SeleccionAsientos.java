/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo.Funcion;
import java.awt.Color;
import javax.swing.JButton;


/**
 *
 * @author hgabr
 */
public class SeleccionAsientos extends javax.swing.JFrame {
    Funcion funcion;
    private int ancho = 100;
    private int alto = 100;
    
    public SeleccionAsientos(Funcion funcion) {
        initComponents();
        this.funcion = funcion;
        paintMatriz();
    }
    
    private void paintMatriz() {
        int x = 0;
        
        for (int i = 0; i < funcion.getMatrizAsiento().length; i++) {
            for (int j = 0; j < funcion.getMatrizAsiento()[0].length; j++) {
                JButton boton = new JButton(funcion.getMatrizAsiento()[i][j].getID());
                
                if(funcion.getMatrizAsiento()[i][j].isActive())
                    boton.setBackground(Color.RED);
                else
                    boton.setBackground(Color.GREEN);
                layeredPane.add(boton);
                if (j%4 == 0)
                    x = 0;
            
                boton.setLocation(ancho*x++, i/4*alto);
                boton.setSize(ancho, alto);
            }
        }
    }

        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layeredPane = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layeredPaneLayout = new javax.swing.GroupLayout(layeredPane);
        layeredPane.setLayout(layeredPaneLayout);
        layeredPaneLayout.setHorizontalGroup(
            layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
        );
        layeredPaneLayout.setVerticalGroup(
            layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layeredPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layeredPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane layeredPane;
    // End of variables declaration//GEN-END:variables
}
