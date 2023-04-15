/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Properties;
import modelo.Auditorio;
import javax.mail.internet.*;
import javax.activation.*;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.swing.JOptionPane;
import modelo.Factura;
/**
 *
 * @author hgabr
 */
public class Controlador {
    //FALTA CREAR COPY PASTEAR TODOS LOS METODOS CREADOS EN LAS OTRAS CLASES
    //PARA QUE TODO SEA LLAMADO DESDE EL CONTROLADOR
    private static Auditorio auditorio = new Auditorio();
    private AdmClientes clientes;

    public Controlador(AdmClientes clientes) {
        this.clientes = clientes;
    }

    public Controlador () {
        clientes = new AdmClientes();
    }

    public static Auditorio getAuditorio() {
        return auditorio;
    }

    public static void setAuditorio(Auditorio auditorio) {
        Controlador.auditorio = auditorio;
    }
    
    public AdmClientes getClientes() {
        return clientes;
    }

    public void setClientes(AdmClientes clientes) {
        this.clientes = clientes;
    }
    
    public void Email(String correo) throws AddressException, MessagingException {
            
            String correoEnvia = "correoProyectosProgras@gmail.com";
            String contrasena = "nomtfkwtrfamrbvh";
            String receptor = correo;
            String asunto = "Factura de la compra de entradas";
           
        
            Properties propiedad = new Properties();
                propiedad.put("mail.smtp.host", "smtp.gmail.com");
                propiedad.setProperty("mail.smtp.starttls.enable", "true");
                propiedad.put("mail.smtp.ssl.trust","smtp.gmail.com");
                propiedad.setProperty("mail.smtp.port", "587");
                propiedad.setProperty("mail.smtp.user",correoEnvia);
                propiedad.setProperty("mail.smtp.auth", "true");
            Session session = Session.getDefaultInstance(propiedad);
            BodyPart texto = new MimeBodyPart();
                texto.setText("Factura de la compra de sus asientos");
            BodyPart adjunto = new MimeBodyPart(); 
            try{
                String string = System.getProperty("user.dir");
                string += "/src/main/java/Imagenes/qr_code.png";
            FileDataSource path = new FileDataSource(string);
            adjunto.setDataHandler(new DataHandler(path));
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
            adjunto.setFileName("qr_code.png");
            MimeMultipart m = new MimeMultipart();
            m.addBodyPart(texto);
            m.addBodyPart(adjunto);
            
            
            
            MimeMessage mensaje = new MimeMessage(session);
            mensaje.setFrom(new InternetAddress(correoEnvia));
            mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(receptor));
            mensaje.setSubject(asunto);
            mensaje.setContent(m);
            
        try (Transport t = session.getTransport("smtp")) {
            t.connect(correoEnvia, contrasena);
            t.sendMessage(mensaje, mensaje.getAllRecipients());
        }
            JOptionPane.showMessageDialog(null, "Mensaje enviado" );
    }
    
        public void generarCodigoQR(Factura factura) throws WriterException {
        // Obtener los datos de la factura
            Calendar fecha = factura.getFecha();
            int numeroFactura = factura.getNumero();
            int cedulaCliente = factura.getCliente().getID();
            String nombreCliente = factura.getCliente().getNombre();
            String correoCliente = factura.getCliente().getCorreo();
            int celularCliente = factura.getCliente().getCelular();
//      cantidad entradas adquiridas
//      detalle de los asientos
            String numerosTarjeta = factura.tarjeta.getLastFour();
           String totaldelaCompra = factura.getDetalleTotalCompra();
           double compraSinIVA = factura.getTotalSinIVA();

        // Construir el contenido del código QR
            String contenido = "Fecha: " + fecha.getTime() + "\n" + "Número de la factura: " + numeroFactura + "\n"
                    + "Cedula del cliente: " + cedulaCliente + "\n"
                    + "Nombre Cliente: " + nombreCliente + "\n" 
                    + "Correo del cliente: " + correoCliente + "\n"
                    + "Celular cliente: " + celularCliente + "\n"
//                + "Cantidad de entradas adquiridas: " + 
//                + "Detalle de los asientos: " + 
                + "Detalles de la tarjeta con la que se hizo la compra: " + numerosTarjeta  
                    + "Total de la compra: " + totaldelaCompra + "\n"
                    + "Total de la compra sin IVA: " + compraSinIVA + "\n";
            
        try{
           BitMatrix matriz = new MultiFormatWriter().encode(contenido, BarcodeFormat.QR_CODE, 500, 500);
           MatrixToImageWriter.writeToStream(matriz, "PNG", new FileOutputStream("main.java.Imagenes/qr_code.png"));
        }catch (IOException e) {
                e.printStackTrace();
            }
    }
}
