/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Control.Controlador;
import Modelo.Cliente;
import Modelo.Tarjeta;
import java.util.GregorianCalendar;
import java.util.regex.Pattern;
import javax.swing.JFrame;

public class FormularioDatos extends javax.swing.JFrame {
    
    Controlador controlador = MainWindow.controlador;
    private JFrame main;
    private final Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
    
    public FormularioDatos(JFrame main, ArrayList<Asiento> asientosComprados, Funcion selectedValue) {
        initComponents();
        setComponents();
        this.main = main;
    }

    private void setComponents() {
        this.setLocationRelativeTo(null);
        
        String txtCedula = "X0XXX0XXX";
        txfCedula.setText(txtCedula);
        
        String txtNombre = "NombreApellidoApellido";
        txfNombre.setText(txtNombre);
        
        String txtCorreo = "example@gmail.com";
        txfCorreo.setText(txtCorreo);
        
        String txtCelular = "88880000";
        txfNumeroCelular.setText(txtCelular);
        
        String txtNumeroTarjeta = "0000111122223333";
        txfNumeroTarjeta.setText(txtNumeroTarjeta);
        
        String txtCodigo = "000";
        txfCodigoVerificacion.setText(txtCodigo);
        
        
        
        txfCedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
               if (txfCedula.getText().equals(txtCedula)) {
                  txfCedula.selectAll();
                }
            }
        });
        
        txfNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
               if (txfNombre.getText().equals(txtNombre)) {
                  txfNombre.selectAll();
                }
            }
        });
        
        txfCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
               if (txfCorreo.getText().equals(txtCorreo)) {
                  txfCorreo.selectAll();
                }
            }
        });
        
        txfNumeroCelular.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
               if (txfNumeroCelular.getText().equals(txtCelular)) {
                  txfNumeroCelular.selectAll();
                }
            }
        });
        
        txfNumeroTarjeta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
               if (txfNumeroTarjeta.getText().equals(txtNumeroTarjeta)) {
                  txfNumeroTarjeta.selectAll();
                }
            }
        });
        
        txfCodigoVerificacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
               if (txfCodigoVerificacion.getText().equals(txtCodigo)) {
                  txfCodigoVerificacion.selectAll();
                }
            }
        });
        
        
        //Setting months
        mesCombo.removeAllItems();
        mesCombo.addItem("");
        mesCombo.addItem("1");
        mesCombo.addItem("2");
        mesCombo.addItem("3");
        mesCombo.addItem("4");
        mesCombo.addItem("5");
        mesCombo.addItem("6");
        mesCombo.addItem("7");
        mesCombo.addItem("8");
        mesCombo.addItem("9");
        mesCombo.addItem("10");
        mesCombo.addItem("11");
        mesCombo.addItem("12");
        
        //Setting years
        añoCombo.removeAllItems();
        añoCombo.addItem("");
        añoCombo.addItem("2024");
        añoCombo.addItem("2025");
        añoCombo.addItem("2026");
        añoCombo.addItem("2027");
        añoCombo.addItem("2028");
        añoCombo.addItem("2029");
        añoCombo.addItem("2030");
    }
    
    public boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false; 
        }
        return pattern.matcher(strNum).matches();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txfCedula = new javax.swing.JTextField();
        txfNombre = new javax.swing.JTextField();
        btnSaveData = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        exitbtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txfCorreo = new javax.swing.JTextField();
        txfNumeroCelular = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txfNumeroTarjeta = new javax.swing.JTextField();
        mesCombo = new javax.swing.JComboBox<>();
        añoCombo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txfCodigoVerificacion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnSaveData.setBackground(new java.awt.Color(0, 0, 153));
        btnSaveData.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        btnSaveData.setForeground(new java.awt.Color(153, 153, 153));
        btnSaveData.setText("Siguiente");
        btnSaveData.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        btnSaveData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveDataActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 3, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(187, 128, 41));
        jLabel4.setText("Datos Cliente");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre Completo:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cedula:");

        exitbtn.setBackground(new java.awt.Color(0, 0, 153));
        exitbtn.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        exitbtn.setForeground(new java.awt.Color(153, 153, 153));
        exitbtn.setText("Atras");
        exitbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Correo electrónico:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Número celular:");

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(187, 128, 41));
        jLabel9.setText("Datos Tarjeta");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Numero de tarjeta:");

        mesCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        añoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Mes/Año vencimiento");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CVV (3 digitos):");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfCedula)
                            .addComponent(txfNombre)
                            .addComponent(txfCorreo)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(33, 33, 33)
                                .addComponent(txfNumeroCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSaveData, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(txfNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txfCodigoVerificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(mesCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(añoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txfCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txfNumeroCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txfNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mesCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(añoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(txfCodigoVerificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveData, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveDataActionPerformed
        if (txfCedula.getText().length()==9 &&
            isNumeric(txfCedula.getText()) &&
            txfNumeroCelular.getText().length()==8 &&
            isNumeric(txfNumeroCelular.getText()) &&
            txfNumeroTarjeta.getText().length()==16 &&
            isNumeric(txfNumeroTarjeta.getText()) &&
            txfCodigoVerificacion.getText().length()==3 &&
            isNumeric(txfCodigoVerificacion.getText()) &&
            !txfNombre.getText().isEmpty() &&
            !txfCorreo.getText().isEmpty() &&
            !mesCombo.getSelectedItem().equals("") &&
            !añoCombo.getSelectedItem().equals("")) {
            String año = añoCombo.getSelectedItem()+"";
            String mes = mesCombo.getSelectedItem()+"";
            
            int añoConversion = Integer.parseInt(año);
            int mesConversion = Integer.parseInt(mes)-1;
            
            Tarjeta tarjeta = new Tarjeta(Integer.parseInt(txfNumeroTarjeta.getText()), 
                                            new GregorianCalendar(añoConversion, mesConversion, 2), 
                                            Integer.parseInt(txfCodigoVerificacion.getText()));
            Cliente toAdd = new Cliente(txfNombre.getText(),
                                        Integer.parseInt(txfCedula.getText()),
                                        txfCorreo.getText(), 
                                        Integer.parseInt(txfNumeroCelular.getText()),
                                        tarjeta);
            controlador.getClientes().añadirCliente(toAdd);
            //Factura nueva = new Factura(fecha, toAdd, precio)
        }
    }//GEN-LAST:event_btnSaveDataActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        this.dispose(); //if needed change for this.setVisible(false)
        main.setVisible(true);
    }//GEN-LAST:event_exitbtnActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> añoCombo;
    private javax.swing.JButton btnSaveData;
    private javax.swing.JButton exitbtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> mesCombo;
    private javax.swing.JTextField txfCedula;
    private javax.swing.JTextField txfCodigoVerificacion;
    private javax.swing.JTextField txfCorreo;
    private javax.swing.JTextField txfNombre;
    private javax.swing.JTextField txfNumeroCelular;
    private javax.swing.JTextField txfNumeroTarjeta;
    // End of variables declaration//GEN-END:variables
}
