/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.vista;

import com.kenwalger.mongoJava.MongoJava;
import static com.kenwalger.mongoJava.MongoJava.crearConexion;
import com.mongodb.DB;
import com.mongodb.MongoClient;
import ec.edu.espe.controlador.Jugador;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class RegistrarJugadores extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarJugadores
     */
    
    MongoClient mongo = crearConexion();
        
        // SI NO EXISTE LA BASE DE DATOS LA CREAMOS
    DB db = mongo.getDB("Futbol");
            
    
    Jugador jugador = new Jugador();
    MongoJava mongoJava = new MongoJava();
    public RegistrarJugadores() {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 583, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(83, 83, 83)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreJugador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCedulaJugador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEquipoJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRegistrarJugador)
                                    .addComponent(txtPaisJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(37, 37, 37)
                    .addComponent(btnRegresarJugador)
                    .addContainerGap(83, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 346, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCedulaJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPaisJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(txtEquipoJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRegistrarJugador)
                        .addComponent(btnRegresarJugador))
                    .addContainerGap(44, Short.MAX_VALUE)))
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
        MainVista main = new MainVista();
        main.setVisible(true);
    }//GEN-LAST:event_btnRegresarJugadorActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarJugadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarJugador;
    private javax.swing.JButton btnRegresarJugador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCedulaJugador;
    private javax.swing.JTextField txtEquipoJugador;
    private javax.swing.JTextField txtNombreJugador;
    private javax.swing.JTextField txtPaisJugador;
    // End of variables declaration//GEN-END:variables
}
