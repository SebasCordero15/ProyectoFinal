/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Agenda;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author grupo2
 */
public class JfmEditarR extends javax.swing.JFrame {

    /**
     * Creates new form JfmEditarR
     */
    public JfmEditarR() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        cargarDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPerro = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCFechaIngreso = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jCFechaSalida = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        bntRestar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bntSumar = new javax.swing.JButton();
        txtCedula = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCantidadN = new javax.swing.JTextField();
        txtHabitacion = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtSemana = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 36)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Login.png"))); // NOI18N
        jLabel15.setText("HOTEL ROOF");

        btnLimpiar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/borrar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/esquema-de-boton-circular-de-flecha-hacia-atras-izquierda.png"))); // NOI18N
        jLabel9.setText("Agendar");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Complete la informacion solicitada:");

        txtPerro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerroActionPerformed(evt);
            }
        });

        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Nombre del Cliente:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Fecha de ingreso");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Fecha de salida");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Nombre del Perro:");

        bntRestar.setText("-");
        bntRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntRestarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Cantidad de noches:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Cedula:");

        bntSumar.setText("+");
        bntSumar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bntSumarMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Habitacion");

        txtCantidadN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidadN.setText("1");

        txtHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHabitacionActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jtSemana.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Cliente", "Nombre Perro", "Cedula", "Cantida Noches", "Habitacion", "Fecha Ingreso", "Fecha Salida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtSemana.setSelectionBackground(new java.awt.Color(255, 255, 204));
        jtSemana.setShowHorizontalLines(true);
        jtSemana.setShowVerticalLines(true);
        jtSemana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtSemanaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtSemana);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jCFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jCFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtPerro, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(2, 2, 2))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCedula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bntSumar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCantidadN, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(bntRestar))))
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(btnLimpiar)))
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPerro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jCFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCantidadN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bntRestar)
                            .addComponent(bntSumar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(53, 53, 53)
                .addComponent(btnEditar)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHabitacionActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed
    public void cargarDatos() {
        DefaultTableModel model = (DefaultTableModel) jtSemana.getModel();
        model.setNumRows(0); // Limpiar filas existentes

        DatosEstadia estad = new DatosEstadia();
        ArrayList<Agendar> reservaciones = estad.todasEstadias(); // Obtener datos

        String datos[] = new String[7];
        int i = 0;
        for (Agendar agend : reservaciones) {
            datos[0] = reservaciones.get(i).getNombre();
            datos[1] = reservaciones.get(i).getNombreP();
            datos[2] = reservaciones.get(i).getCedula();
            datos[3] = String.valueOf(reservaciones.get(i).getCantidadN());
            datos[4] = reservaciones.get(i).getHabitacion();
            datos[5] = String.valueOf(reservaciones.get(i).getFechaIngreso());
            datos[6] = String.valueOf(reservaciones.get(i).getFechaSalida());
            i++;
            model.addRow(datos);
        }
        jtSemana.setModel(model);
    }
    //LIMPIAR TXT

    public void Limpiar() {
        txtCliente.setText(null);
        txtPerro.setText(null);
        txtCedula.setText(null);
        txtCantidadN.setText(null);
        txtHabitacion.setText(null);
        jCFechaIngreso.setDate(null);
        jCFechaSalida.setDate(null);
        txtCliente.requestFocus();
    }

    //BOTON RESTAR
    private void bntRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntRestarActionPerformed
        int cantidad = 0;

        try {
            cantidad = Integer.parseInt(txtCantidadN.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }

        if (cantidad > 1) {
            cantidad--;
            txtCantidadN.setText(String.valueOf(cantidad));
        } else {
            JOptionPane.showMessageDialog(null, "Debe reservar almenos un dia");
        }
    }//GEN-LAST:event_bntRestarActionPerformed

    private void bntSumarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntSumarMouseClicked
        int cantidad = 1;

        try {
            cantidad = Integer.parseInt(txtCantidadN.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }

        if (cantidad < 7) {
            cantidad++;
            txtCantidadN.setText(String.valueOf(cantidad));
        } else {
            JOptionPane.showMessageDialog(null, "El días de estadia  maximo son 7");
        }
    }//GEN-LAST:event_bntSumarMouseClicked

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void txtPerroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPerroActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        int Seleccionada;
        Seleccionada = jtSemana.getSelectedRow();

        if (Seleccionada == -1) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
            return;
        }

        String nombre = (String) jtSemana.getValueAt(Seleccionada, 0);
        String nombreP = (String) jtSemana.getValueAt(Seleccionada, 1);
        String cedula = (String) jtSemana.getValueAt(Seleccionada, 2);
        String cantidadN = (String) jtSemana.getValueAt(Seleccionada, 3);
        String habitacion = (String) jtSemana.getValueAt(Seleccionada, 4);
        String fechaIngreso = (String) jtSemana.getValueAt(Seleccionada, 5); ///creamos la variable tipo String , columna 5 de la tabla
        String fechaSalida = (String) jtSemana.getValueAt(Seleccionada, 6);

        //creamos nuevas variables
        String nuevonombreP = txtPerro.getText();
        String nuevacedula = txtCedula.getText();
        int nuevocantidadN = Integer.parseInt(txtCantidadN.getText());
        String nuevohabitacion = txtHabitacion.getText();

        // 2.damos el formato a la fecha
        java.sql.Date fechaIngresoN = new java.sql.Date(jCFechaIngreso.getDate().getTime());
        java.sql.Date fechaSalidaN = new java.sql.Date(jCFechaSalida.getDate().getTime());

        //3. creamos variables fechas
        DatosEstadia dtEstadia = new DatosEstadia();
        //4. Modificamos en base de datos
        try {
            dtEstadia.modificarReserva(nombre, nuevonombreP, nuevacedula, nuevocantidadN, nuevohabitacion,
                    fechaIngresoN, fechaSalidaN);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        cargarDatos();

    }//GEN-LAST:event_btnEditarActionPerformed

    private void jtSemanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtSemanaMouseClicked

        int filaSeleccionada;
        try {
            filaSeleccionada = jtSemana.getSelectedRow();
            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
                return;
            }

            // 1. Obtener valores de la fila seleccionada
            String nombre = (String) jtSemana.getValueAt(filaSeleccionada, 0);
            String nombreP = (String) jtSemana.getValueAt(filaSeleccionada, 1);
            String cedula = (String) jtSemana.getValueAt(filaSeleccionada, 2);
            String cantidadNString = (String) jtSemana.getValueAt(filaSeleccionada, 3);
            String habitacion = (String) jtSemana.getValueAt(filaSeleccionada, 4);
            String fechaIngreso = (String) jtSemana.getValueAt(filaSeleccionada, 5); ///creamos la variable tipo String , columna 5 de la tabla
            String fechaSalida = (String) jtSemana.getValueAt(filaSeleccionada, 6);

            // 2.damos el formato
            SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");

            //3. creamos variables
            java.util.Date fecha;
            java.util.Date fechaS;
            //4.convertimos

            fecha = (java.util.Date) s.parse(fechaIngreso);
            fechaS = (java.util.Date) s.parse(fechaSalida);
            jCFechaIngreso.setDate(fecha);
            jCFechaSalida.setDate(fechaS);

            //5. Llenar campos con la fila seleccionada
            txtCliente.setText(nombre);
            txtPerro.setText(nombreP);
            txtCedula.setText(cedula);
            txtCantidadN.setText(cantidadNString);
            txtHabitacion.setText(habitacion);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());

        }
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
            java.util.logging.Logger.getLogger(JfmEditarR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfmEditarR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfmEditarR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfmEditarR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfmEditarR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntRestar;
    private javax.swing.JButton bntSumar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnLimpiar;
    private com.toedter.calendar.JDateChooser jCFechaIngreso;
    private com.toedter.calendar.JDateChooser jCFechaSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtSemana;
    private javax.swing.JTextField txtCantidadN;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtHabitacion;
    private javax.swing.JTextField txtPerro;
    // End of variables declaration//GEN-END:variables
}
