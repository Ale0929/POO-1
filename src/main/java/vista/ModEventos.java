/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Control.Controlador;
import Modelo.Evento;
import Modelo.Funcion;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

/**
 *
 * @author hgabr
 */
public class ModEventos extends javax.swing.JFrame {

    Controlador controlador = MainWindow.controlador;
    private JFrame main;
    private JFrame currentFrame = this;
//    private int ancho = 100;
//    private int alto = 100;
    
    BufferedImage read;
    JLabel background = new JLabel();
    
    
    public ModEventos(JFrame main) {
        initComponents();
        this.main = main;
        setEventos();
    }

    private void setEventos() {
        try {
            File f = new File("C:\\Users\\hgabr\\OneDrive\\Documentos\\TEC\\Primer Semestre 2023\\POO\\PROGRA #1\\Imagenes\\auditorio.jpg");
            read = ImageIO.read(f);
            background.setIcon(new ImageIcon(read));
            background.setSize(read.getWidth(), read.getHeight());

            jLayeredPane.add(background,JLayeredPane.DEFAULT_LAYER);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        
        this.setLocationRelativeTo(null);

        if (Controlador.getAuditorio().getListaEventos().isEmpty()){
            JLabel noEventos = new JLabel("No hay eventos registrados");
            noEventos.setBackground(Color.WHITE);
            noEventos.setOpaque(true);
            noEventos.setForeground(Color.black);
            Border border = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
            noEventos.setBorder(border);
            noEventos.setFont(new Font("Times New Roman", Font.BOLD, 24));
            noEventos.setBounds(150, 180, 400, 50);
            noEventos.setHorizontalAlignment(SwingConstants.CENTER);
            noEventos.setVerticalAlignment(SwingConstants.CENTER);

            jLayeredPane.add(noEventos, Integer.valueOf(1));
        }
        
        else {
            Evento[] eventosArray = new Evento[100];
            eventosArray = Controlador.getAuditorio().getListaEventos().toArray(eventosArray);
            JList eventos = new JList(eventosArray);
            eventos.setCellRenderer(new DefaultListCellRenderer(){
                JLabel rv = new JLabel();
                @Override
                public Component getListCellRendererComponent(JList list,
                    Object value, int index, boolean isSelected,
                    boolean cellHasFocus){
                        String s = (value != null && value instanceof Evento)? ((Evento)value).getNombre():"";
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
            
            eventos.addMouseListener(new MouseAdapter() {
                public void mouseClicked (MouseEvent ev) {
                    JList list = (JList) ev.getSource();
                    if (ev.getClickCount() == 2){
                        dispose();
                        Evento selectedValue = (Evento)list.getSelectedValue();
                        String[] options = new String[] {"Eliminar", "Modificar"};
                        int respuesta = JOptionPane.showOptionDialog(null, "Escoja una opción", "Opciones",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                            null, options, options[0]);
                        if (respuesta == 0 && !controlador.getAuditorio().getEvento(selectedValue).yaVendio()) {
                            controlador.getAuditorio().getListaEventos().remove(selectedValue);
                        }
                        else if (respuesta == 1 && !controlador.getAuditorio().getEvento(selectedValue).yaVendio()) {
                            JTextField nombre = new JTextField();
                            JTextField precio = new JTextField();
                            JComboBox funciones = new JComboBox();
                            
                            Object[] atributos = {
                                "Nombre", nombre,
                                "Precio", precio,
                                "Funciones", funciones
                            };
                            
                            ItemListener listener = (e) -> {
                                if (e.getStateChange() == ItemEvent.SELECTED) {
                                    if (e.getSource() == funciones) {
                                        Funcion escogida = (Funcion) funciones.getSelectedItem();
                                        JTextField txfFecha = new JTextField();
                                        JTextField txfHora = new JTextField();
                                        
                                        Object[] atributosFuncion = {
                                            "Fecha (dd/mm/aaaa)", txfFecha,
                                            "Hora/militar (00:00)", txfHora,
                                        };
                                        
                                        int opcion = JOptionPane.showConfirmDialog(null, atributosFuncion, "AtributosFuncion", JOptionPane.OK_CANCEL_OPTION);
                                        if (opcion == JOptionPane.OK_OPTION && !txfFecha.getText().isEmpty() && !txfHora.getText().isEmpty()){
                                            String fechaS[] = txfFecha.getText().split("/");
                                            String horaS[] = txfFecha.getText().split(":");
                                            
                                            int fecha[] = new int[fechaS.length];
                                            for (int i = 0; i < fechaS.length; i++) {
                                                fecha[i] = Integer.parseInt(fechaS[i]);
                                            }
                                            
                                            int hora[] = new int[horaS.length];
                                            for (int i = 0; i < horaS.length; i++) {
                                                hora[i] = Integer.parseInt(fechaS[i]);
                                            }
                                            
                                            controlador.getAuditorio().getEvento(selectedValue).getFuncion(escogida).setFecha(fecha[0], fecha[1], fecha[2]);
                                            controlador.getAuditorio().getEvento(selectedValue).getFuncion(escogida).setHora(hora[0], hora[1]);
                                        }
                                    }
                                }
                            };
                            funciones.addItemListener(listener);
                            
                            JOptionPane.showConfirmDialog(null, atributos, "Atributos", JOptionPane.OK_CANCEL_OPTION);
                        }
                        else
                            JOptionPane.showMessageDialog(currentFrame, "Hay venta de entradas registradas", "Error", 1);
                    }
                }
            });
            
            eventos.setBackground(new Color(74, 75, 94));
            eventos.setOpaque(true);
            eventos.setForeground(Color.black);
            Border border = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
            eventos.setBorder(border);
            eventos.setFont(new Font("Times New Roman", Font.BOLD, 22));                
            eventos.setBounds(460, 230, 300, 280);
            //x, y, widht, height
            JScrollPane scrollPane = new JScrollPane(eventos);
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
