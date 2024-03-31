/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Agenda;

import Agenda.Agendar;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author indir
 */
public class Agenda extends javax.swing.JFrame {

    private Agendar estadia;

    /**
     * Creates new form Agenda
     */
    public Agenda() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        estadia = new Agendar();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCantidadN = new javax.swing.JTextField();
        txtDueño = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPerro = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        chbLunes = new javax.swing.JCheckBox();
        chbMartes = new javax.swing.JCheckBox();
        chbMiercoles = new javax.swing.JCheckBox();
        chbJueves = new javax.swing.JCheckBox();
        chbViernes = new javax.swing.JCheckBox();
        chbSabado = new javax.swing.JCheckBox();
        chbDomingo = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtSemana = new javax.swing.JTable();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jCheckBox6.setText("jCheckBox6");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Nombre del Dueño:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Nombre del Perro:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Numero Telefono:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Cantidad de noches:");

        txtDueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDueñoActionPerformed(evt);
            }
        });

        btnGuardar.setText("Agregar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jLabel9.setText("Agendar");

        jLabel10.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel10.setText("Complete la informacion solicitada:");

        txtPerro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerroActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1"},
                {"2"},
                {"3"},
                {"4"},
                {"5"},
                {"6"},
                {"7"},
                {"8"},
                {"9"},
                {null}
            },
            new String [] {
                "Habitacion"
            }
        ));
        jTable2.setEnabled(false);
        jTable2.setGridColor(new java.awt.Color(0, 0, 0));
        jTable2.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTable2.setShowHorizontalLines(true);
        jTable2.setShowVerticalLines(true);
        jScrollPane3.setViewportView(jTable2);

        chbLunes.setText("Lunes");
        chbLunes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbLunesActionPerformed(evt);
            }
        });

        chbMartes.setText("Martes");
        chbMartes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbMartesActionPerformed(evt);
            }
        });

        chbMiercoles.setText("miercoles");

        chbJueves.setText("Jueves");
        chbJueves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbJuevesActionPerformed(evt);
            }
        });

        chbViernes.setText("Viernes");

        chbSabado.setText("Sabado");

        chbDomingo.setText("Domingo");

        jtSemana.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"
            }
        ));
        jtSemana.setShowHorizontalLines(true);
        jtSemana.setShowVerticalLines(true);
        jtSemana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtSemanaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtSemana);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDueño, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCantidadN, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPerro, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(chbLunes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chbMartes)
                        .addGap(18, 18, 18)
                        .addComponent(chbMiercoles)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chbJueves)
                        .addGap(18, 18, 18)
                        .addComponent(chbViernes)
                        .addGap(18, 18, 18)
                        .addComponent(chbSabado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chbDomingo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtPerro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtCantidadN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 368, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chbLunes)
                            .addComponent(chbMartes)
                            .addComponent(chbMiercoles)
                            .addComponent(chbJueves)
                            .addComponent(chbViernes)
                            .addComponent(chbSabado)
                            .addComponent(chbDomingo))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar)
                        .addContainerGap(21, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {
        String nombre = txtDueño.getText();
        String telefono = txtTelefono.getText();
        String nombreP = txtPerro.getText();
        int CantidaN = Integer.parseInt(txtCantidadN.getText());
        Agendar reserva = new Agendar(nombre, telefono, nombreP, CantidaN);
        JOptionPane.showMessageDialog(null, "Estadia agendada");
        txtDueño.setText("");
        txtDueño.requestFocus();
        txtTelefono.setText("");
        txtPerro.setText("");
        txtCantidadN.setText("");

        //------------------------------------------------------------------------------------------
        int fila = jtSemana.getSelectedRow();
        Conexion con = new Conexion();
        String lunes = (String) jtSemana.getValueAt(fila, 0);
        String martes = (String) jtSemana.getValueAt(fila, 1);
        String miercoles = (String) jtSemana.getValueAt(fila, 2);
        String jueves = (String) jtSemana.getValueAt(fila, 3);
        String viernes = (String) jtSemana.getValueAt(fila, 4);
        String sabado = (String) jtSemana.getValueAt(fila, 5);
        String domingo = (String) jtSemana.getValueAt(fila, 6);
        DatosEstadia dtEstadia = new DatosEstadia();
        Habitacion arti = new Habitacion(lunes, martes, miercoles, jueves, viernes, sabado, domingo);
        dtEstadia.insertarEstadia(arti);
        cargarDatos();

        /**          *
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nombre = txtDueño.getText(); String telefono =
      * txtTelefono.getText(); String nombreP = txtPerro.getText(); int CantidaN
      * = Integer.parseInt(txtCantidadN.getText()); Agendar reserva = new
      * Agendar(nombre, telefono, nombreP, CantidaN);
      * JOptionPane.showMessageDialog(null, "Estadia agendada");
      * txtDueño.setText(""); txtDueño.requestFocus(); txtTelefono.setText("");
      * txtPerro.setText(""); txtCantidadN.setText("");
      *
      * //------------------------------------------------------------------------------------------
      * int fila = jtSemana.getSelectedRow(); Conexion con = new Conexion();
      * String lunes = (String) jtSemana.getValueAt(fila, 1); String martes =
      * (String) jtSemana.getValueAt(fila, 2); String miercoles = (String)
      * jtSemana.getValueAt(fila, 3); String jueves = (String)
      * jtSemana.getValueAt(fila, 4); String viernes = (String)
      * jtSemana.getValueAt(fila, 5); String sabado = (String)
      * jtSemana.getValueAt(fila, 6); String domingo = (String)
      * jtSemana.getValueAt(fila, 7);
      *
      * try { PreparedStatement insert = con.crearPrepareStatement("UPDATE
      * estadia SET lunes='" + lunes+"',
      * marte='"+martes+"',miercoles='"+miercoles+
      * "',jueves='"+jueves+"',viernes='"+viernes+"',sabado='"+sabado+"',domingo='"+domingo+"'");
      * insert.executeUpdate(); cargarDatos(); } catch (Exception e) {
      * JOptionPane.showMessageDialog(null, "nO SE LOGRO");
      *
      * }
      * /**
      * Habitacion habi = new Habitacion(lunes, martes, miercoles, jueves,
      * viernes, sabado, domingo);
      *
      * DatosEstadia dtEstadia = new DatosEstadia();
      * dtEstadia.insertarEstadia(habi); cargarDatos();
      * System.out.println(estadia.toString());
        *
      */
    }//GEN-LAST:event_btnGuardarActionPerformed

    /**
     * private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {
     * String nombre = txtDueño.getText(); String telefono =
     * txtTelefono.getText(); String nombreP = txtPerro.getText(); int CantidaN
     * = Integer.parseInt(txtCantidadN.getText()); Agendar reserva = new
     * Agendar(nombre, telefono, nombreP, CantidaN);
     * JOptionPane.showMessageDialog(null, "Estadia agendada");
     * txtDueño.setText(""); txtDueño.requestFocus(); txtTelefono.setText("");
     * txtPerro.setText(""); txtCantidadN.setText("");
     *
     * //------------------------------------------------------------------------------------------
     * int fila = jtSemana.getSelectedRow(); Conexion con = new Conexion();
     * String lunes = (String) jtSemana.getValueAt(fila, 1); String martes =
     * (String) jtSemana.getValueAt(fila, 2); String miercoles = (String)
     * jtSemana.getValueAt(fila, 3); String jueves = (String)
     * jtSemana.getValueAt(fila, 4); String viernes = (String)
     * jtSemana.getValueAt(fila, 5); String sabado = (String)
     * jtSemana.getValueAt(fila, 6); String domingo = (String)
     * jtSemana.getValueAt(fila, 7);
     *
     * try { PreparedStatement insert = con.crearPrepareStatement("UPDATE
     * estadia SET lunes='" + lunes+"',
     * marte='"+martes+"',miercoles='"+miercoles+
     * "',jueves='"+jueves+"',viernes='"+viernes+"',sabado='"+sabado+"',domingo='"+domingo+"'");
     * insert.executeUpdate(); cargarDatos(); } catch (Exception e) {
     * JOptionPane.showMessageDialog(null, "nO SE LOGRO");
     *
     * }
     *
     *
     *
     */
    public void cargarDatos() {
        DefaultTableModel model = (DefaultTableModel) jtSemana.getModel();
        model.setNumRows(0);

        DatosEstadia estad = new DatosEstadia();
        ArrayList<Habitacion> miListaArticulo = estad.todosArticulo();//trae todo los articulos de la bd
        String datos[] = new String[7];
        int i = 0;
        for (Habitacion habitacion : miListaArticulo) {
            datos[0] = miListaArticulo.get(i).getLunes();
            datos[1] = miListaArticulo.get(i).getMartes();
            datos[2] = miListaArticulo.get(i).getMiercoles();
            datos[3] = miListaArticulo.get(i).getJueves();
            datos[4] = miListaArticulo.get(i).getViernes();
            datos[5] = miListaArticulo.get(i).getSabado();
            datos[6] = miListaArticulo.get(i).getDomingo();

            i++;
            model.addRow(datos);
        }
        jtSemana.setModel(model);
    }


    private void txtPerroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPerroActionPerformed

    private void txtDueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDueñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDueñoActionPerformed

    private void chbLunesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbLunesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbLunesActionPerformed

    private void chbMartesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbMartesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbMartesActionPerformed

    private void chbJuevesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbJuevesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbJuevesActionPerformed

    private void jtSemanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtSemanaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jtSemanaMouseClicked

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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JCheckBox chbDomingo;
    private javax.swing.JCheckBox chbJueves;
    private javax.swing.JCheckBox chbLunes;
    private javax.swing.JCheckBox chbMartes;
    private javax.swing.JCheckBox chbMiercoles;
    private javax.swing.JCheckBox chbSabado;
    private javax.swing.JCheckBox chbViernes;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jtSemana;
    private javax.swing.JTextField txtCantidadN;
    private javax.swing.JTextField txtDueño;
    private javax.swing.JTextField txtPerro;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
