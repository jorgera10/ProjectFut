package ec.edu.espe.vista;

import com.kenwalger.mongoJava.MongoJava;
import static com.kenwalger.mongoJava.MongoJava.crearConexion;
import com.mongodb.DB;
import com.mongodb.MongoClient;
import ec.edu.espe.controlador.Equipo;
import ec.edu.espe.controlador.Jugador;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RegistrarJugador extends javax.swing.JFrame {
    
    MongoClient mongo = crearConexion();
    DB db = mongo.getDB("Futbol");
    Jugador jugador = new Jugador();
    MongoJava mongoJava = new MongoJava();
    
    Equipo equipo = new Equipo();

    public RegistrarJugador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        txtCedulaJugador = new javax.swing.JTextField();
        txtEquipoJugador = new javax.swing.JTextField();
        txtNombreJugador = new javax.swing.JTextField();
        txtPaisJugador = new javax.swing.JTextField();
        btnRegistrarJugador = new javax.swing.JButton();
        btnRegresarJugador = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbEquiposDisponibles = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaListadoJugadores = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 250));

        jLabel6.setText("Pais");

        txtCedulaJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaJugadorActionPerformed(evt);
            }
        });

        txtEquipoJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEquipoJugadorActionPerformed(evt);
            }
        });

        txtNombreJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreJugadorActionPerformed(evt);
            }
        });

        txtPaisJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaisJugadorActionPerformed(evt);
            }
        });

        btnRegistrarJugador.setText("Registrar");
        btnRegistrarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarJugadorActionPerformed(evt);
            }
        });

        btnRegresarJugador.setText("Regresar");
        btnRegresarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarJugadorActionPerformed(evt);
            }
        });

        jLabel1.setText("JUGADORES");

        jLabel3.setText("Cedula");

        jLabel4.setText("Nombre");

        jLabel5.setText("Equipo");

        cmbEquiposDisponibles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Equipos" }));
        cmbEquiposDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEquiposDisponiblesActionPerformed(evt);
            }
        });

        txtAreaListadoJugadores.setColumns(20);
        txtAreaListadoJugadores.setRows(5);
        jScrollPane1.setViewportView(txtAreaListadoJugadores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCedulaJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(108, 108, 108)
                                .addComponent(btnRegistrarJugador)
                                .addGap(87, 87, 87)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEquipoJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPaisJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(btnRegresarJugador)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmbEquiposDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbEquiposDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCedulaJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEquipoJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPaisJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarJugador)
                    .addComponent(btnRegresarJugador))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaJugadorActionPerformed

    private void txtEquipoJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEquipoJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEquipoJugadorActionPerformed

    private void txtNombreJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreJugadorActionPerformed

    private void txtPaisJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaisJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaisJugadorActionPerformed

    private void btnRegistrarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarJugadorActionPerformed
        // TODO add your handling code here:
        MongoJava.mostrarColeccion(db, "Jugadores");

        jugador.setCedula(txtCedulaJugador.getText());
        jugador.setNombre(txtNombreJugador.getText());
        jugador.setEquipo(txtEquipoJugador.getText());
        jugador.setPais(txtPaisJugador.getText());

        mongoJava.insertarJugador(db, "Jugadores", Integer.parseInt(MongoJava.numeroEquipos(db, "Jugadores"))+1, jugador.getCedula(), jugador.getNombre(), jugador.getEquipo(), jugador.getPais());
        JOptionPane.showMessageDialog(null, "Jugador Registrado");

        //txtIdJugador.setText("");
        txtCedulaJugador.setText("");
        txtNombreJugador.setText("");
        txtEquipoJugador.setText("");
        txtPaisJugador.setText("");
        txtPaisJugador.setText("");
    }//GEN-LAST:event_btnRegistrarJugadorActionPerformed

    private void btnRegresarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarJugadorActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        MainV main = new MainV();
        main.setVisible(true);
    }//GEN-LAST:event_btnRegresarJugadorActionPerformed

    private void cmbEquiposDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEquiposDisponiblesActionPerformed

        MongoJava.mostrarColeccion(db, "Equipo");
        
        
        for(int i=1; i<=Integer.parseInt(MongoJava.numeroEquipos(db, "Equipo"));i++){
            cmbEquiposDisponibles.addItem(MongoJava.buscarPorIdCombo(db, "Equipo", i));
        }
        
        /*String seleccionado = cmbEquiposDisponibles.getSelectedItem().toString();
        int indexSeleccionado = cmbEquiposDisponibles.getSelectedIndex();
        
        System.out.println(seleccionado);
        System.out.println(indexSeleccionado);
        
        txtAreaListadoJugadores.setText(MongoJava.buscarPorEquipo(db, "Jugadores", seleccionado));

        */
        
    }//GEN-LAST:event_cmbEquiposDisponiblesActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarJugador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarJugador;
    private javax.swing.JButton btnRegresarJugador;
    private javax.swing.JComboBox<String> cmbEquiposDisponibles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaListadoJugadores;
    private javax.swing.JTextField txtCedulaJugador;
    private javax.swing.JTextField txtEquipoJugador;
    private javax.swing.JTextField txtNombreJugador;
    private javax.swing.JTextField txtPaisJugador;
    // End of variables declaration//GEN-END:variables
}
