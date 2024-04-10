/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofinal;
import Agenda.Facturacion;
import Servicios.InfoDogWalking;
import Agenda.*;

import Perro.FormularioPerro;
import Perro.VerLista;
import javax.swing.JOptionPane;

/**
 *
 * @author indir
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Hotel = new javax.swing.JMenu();
        itemHotel = new javax.swing.JMenuItem();
        mitEstadia = new javax.swing.JMenuItem();
        mitDogWalking = new javax.swing.JMenuItem();
        mitGrooming = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mitCrearExpediente = new javax.swing.JMenuItem();
        mitVerLista = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mitAgendar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mitRegistroFactura = new javax.swing.JMenuItem();
        mitVerReporte = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 36)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jLabel2.setText("HOTEL ROOF");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Hotel.setText("Hotel");

        itemHotel.setText("Informacion");
        itemHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemHotelActionPerformed(evt);
            }
        });
        Hotel.add(itemHotel);

        mitEstadia.setText("Estadia");
        Hotel.add(mitEstadia);

        mitDogWalking.setText("DogWalking");
        mitDogWalking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitDogWalkingActionPerformed(evt);
            }
        });
        Hotel.add(mitDogWalking);

        mitGrooming.setText("Grooming");
        Hotel.add(mitGrooming);

        jMenuBar1.add(Hotel);

        jMenu2.setText("Clientes");

        mitCrearExpediente.setText("Crear expediente");
        mitCrearExpediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitCrearExpedienteActionPerformed(evt);
            }
        });
        jMenu2.add(mitCrearExpediente);

        mitVerLista.setText("Lista Clientes");
        mitVerLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitVerListaActionPerformed(evt);
            }
        });
        jMenu2.add(mitVerLista);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Agenda");

        mitAgendar.setText("Agendar");
        mitAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitAgendarActionPerformed(evt);
            }
        });
        jMenu5.add(mitAgendar);

        jMenuBar1.add(jMenu5);

        jMenu3.setText("Añadir Servicio");

        jMenuItem2.setText("Servicio");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Factura");

        mitRegistroFactura.setText("Crear Factura");
        mitRegistroFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitRegistroFacturaActionPerformed(evt);
            }
        });
        jMenu4.add(mitRegistroFactura);

        jMenuBar1.add(jMenu4);

        mitVerReporte.setText("Reportes");

        jMenuItem10.setText("Ver reportes");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        mitVerReporte.add(jMenuItem10);

        jMenuBar1.add(mitVerReporte);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(274, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemHotelActionPerformed
         InformacioH s=new InformacioH();
    }//GEN-LAST:event_itemHotelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mitAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitAgendarActionPerformed
       Agenda dias= new Agenda();
    }//GEN-LAST:event_mitAgendarActionPerformed

    private void mitCrearExpedienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitCrearExpedienteActionPerformed
      FormularioPerro fp= new FormularioPerro(); 
        
    }//GEN-LAST:event_mitCrearExpedienteActionPerformed

    private void mitDogWalkingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitDogWalkingActionPerformed
       InfoDogWalking info = new InfoDogWalking();
    }//GEN-LAST:event_mitDogWalkingActionPerformed

    private void mitVerListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitVerListaActionPerformed
        VerLista vl= new VerLista();
    }//GEN-LAST:event_mitVerListaActionPerformed

    private void mitRegistroFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitRegistroFacturaActionPerformed
        // TODO add your handling code here:
        Facturacion f= new Facturacion();
    }//GEN-LAST:event_mitRegistroFacturaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
      ServiciosFJ  servicioss= new ServiciosFJ();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Hotel;
    private javax.swing.JMenuItem itemHotel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem mitAgendar;
    private javax.swing.JMenuItem mitCrearExpediente;
    private javax.swing.JMenuItem mitDogWalking;
    private javax.swing.JMenuItem mitEstadia;
    private javax.swing.JMenuItem mitGrooming;
    private javax.swing.JMenuItem mitRegistroFactura;
    private javax.swing.JMenuItem mitVerLista;
    private javax.swing.JMenu mitVerReporte;
    // End of variables declaration//GEN-END:variables
}
