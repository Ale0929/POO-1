/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import modelo.Evento;
import modelo.Funcion;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

/**
 *
 * @author hgabr
 */
public class FuncionesEvento extends javax.swing.JFrame {
//    private int ancho = 100;
//    private int alto = 100;
//    
    BufferedImage read;
    JLabel background = new JLabel();
    Evento evento;
    private JFrame main;
    
    public FuncionesEvento(Evento evento, JFrame main) {
        initComponents();
        this.main = main;
        this.evento = evento;
        setFunciones();
    }
    
    private void setFunciones() {
        try {
            File f = new File("Imagenes\\auditorio.jpg");
            read = ImageIO.read(f);
            background.setIcon(new ImageIcon(read));
            background.setSize(read.getWidth(), read.getHeight());

            jLayeredPane.add(background,JLayeredPane.DEFAULT_LAYER);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        
        this.setLocationRelativeTo(null);
        
        if (evento.getListaFunciones().isEmpty()){
            JLabel noFunciones = new JLabel("No hay funciones disponibles");
            noFunciones.setBackground(Color.WHITE);
            noFunciones.setOpaque(true);
            noFunciones.setForeground(Color.black);
            Border border = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
            noFunciones.setBorder(border);
            noFunciones.setFont(new Font("Times New Roman", Font.BOLD, 24));
            noFunciones.setBounds(150, 180, 400, 50);
            noFunciones.setHorizontalAlignment(SwingConstants.CENTER);
            noFunciones.setVerticalAlignment(SwingConstants.CENTER);

            jLayeredPane.add(noFunciones, Integer.valueOf(1));
        }
        else {
            Funcion[] funcionesArray = new Funcion[100];
            funcionesArray = evento.getListaFunciones().toArray(funcionesArray);
            JList funciones = new JList(funcionesArray);
            funciones.setCellRenderer(new DefaultListCellRenderer(){
                JLabel rv = new JLabel();
                @Override
                public Component getListCellRendererComponent(JList list,
                    Object value, int index, boolean isSelected,
                    boolean cellHasFocus){
                        String s = (value != null && value instanceof Funcion)? "Fecha:"+((Funcion)value).getFecha()+"\nHora:"+((Funcion)value).getHora():"";
                        rv.setText(s);
                        if (isSelected) {
                            rv.setBackground(list.getSelectionBackground());
                            rv.setForeground(list.getSelectionForeground());
                        } else {
                            rv.setBackground(list.getBackground());
                            rv.setForeground(list.getForeground());
                        }
                        rv.setEnabled(list.isEnabled());
                        rv.setFont(list.getFont());
                        rv.setOpaque(true);
                        return rv;
                }
            });
            
            funciones.addMouseListener(new MouseAdapter() {
                public void mouseClicked (MouseEvent ev) {
                    JList list = (JList) ev.getSource();
                    if (ev.getClickCount() == 2){
                        dispose();
                        Funcion selectedValue = (Funcion)list.getSelectedValue();
                        SeleccionaAsientos g = new SeleccionaAsientos();
                        g.setVisible(true);
                    }
                }
            });
            
            funciones.setBackground(new Color(74, 75, 94));
            funciones.setOpaque(true);
            funciones.setForeground(Color.black);
            Border border = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
            funciones.setBorder(border);
            funciones.setFont(new Font("Times New Roman", Font.BOLD, 22));                
            funciones.setBounds(460, 230, 300, 280);
            //x, y, widht, height
            JScrollPane scrollPane = new JScrollPane(funciones);
            scrollPane.setBackground(new Color(74, 75, 94));
            scrollPane.setOpaque(true);
            scrollPane.setForeground(Color.black);                
            scrollPane.setBounds(100, 100, 320, 260);
            
            jLayeredPane.add(scrollPane, Integer.valueOf(1));
        }
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane = new javax.swing.JLayeredPane();
        exitbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        exitbtn.setBackground(new java.awt.Color(127, 0, 41));
        exitbtn.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        exitbtn.setForeground(new java.awt.Color(153, 153, 153));
        exitbtn.setText("Atras");
        exitbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        jLayeredPane.setLayer(exitbtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPaneLayout = new javax.swing.GroupLayout(jLayeredPane);
        jLayeredPane.setLayout(jLayeredPaneLayout);
        jLayeredPaneLayout.setHorizontalGroup(
            jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPaneLayout.createSequentialGroup()
                .addContainerGap(603, Short.MAX_VALUE)
                .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jLayeredPaneLayout.setVerticalGroup(
            jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPaneLayout.createSequentialGroup()
                .addContainerGap(391, Short.MAX_VALUE)
                .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        this.dispose();
        main.setVisible(true);
    }//GEN-LAST:event_exitbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitbtn;
    private javax.swing.JLayeredPane jLayeredPane;
    // End of variables declaration//GEN-END:variables
}
