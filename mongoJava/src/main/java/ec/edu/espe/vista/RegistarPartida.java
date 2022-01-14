
package ec.edu.espe.vista;

import com.kenwalger.mongoJava.MongoJava;
import static com.kenwalger.mongoJava.MongoJava.crearConexion;
import com.mongodb.DB;
import com.mongodb.MongoClient;
import ec.edu.espe.controlador.Equipo;
import ec.edu.espe.controlador.Partida;

public class RegistarPartida extends javax.swing.JFrame {
    
    MongoClient mongo = crearConexion();
        
        // SI NO EXISTE LA BASE DE DATOS LA CREAMOS
    DB db = mongo.getDB("Futbol");
            
    
    Equipo equipo = new Equipo();
    Partida partida = new Partida();
    
    
    public RegistarPartida() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaEquipo2 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaEquipo1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        btnResultadoPartido = new javax.swing.JButton();
        txtResultadoEquipo1 = new javax.swing.JTextField();
        txtResultadoEquipo2 = new javax.swing.JTextField();
        btnGuadarResultado = new javax.swing.JButton();
        btnEmparejarJuego = new javax.swing.JButton();
        btnRegresarPartida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 250));
        setResizable(false);

        jLabel1.setText("ES HORA DE EMPEZAR EL JUEGO");

        txtAreaEquipo2.setColumns(20);
        txtAreaEquipo2.setRows(5);
        jScrollPane1.setViewportView(txtAreaEquipo2);

        txtAreaEquipo1.setColumns(20);
        txtAreaEquipo1.setRows(5);
        jScrollPane2.setViewportView(txtAreaEquipo1);

        jLabel2.setText("VS");

        btnResultadoPartido.setText("Resultado");
        btnResultadoPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoPartidoActionPerformed(evt);
            }
        });

        btnGuadarResultado.setText("Guargar Juego");

        btnEmparejarJuego.setText("Emparejar");
        btnEmparejarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmparejarJuegoActionPerformed(evt);
            }
        });

        btnRegresarPartida.setText("Regresar");
        btnRegresarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarPartidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addComponent(btnEmparejarJuego, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtResultadoEquipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnResultadoPartido)
                        .addGap(83, 83, 83)
                        .addComponent(txtResultadoEquipo2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuadarResultado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresarPartida)
                        .addGap(123, 123, 123))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEmparejarJuego)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtResultadoEquipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResultadoEquipo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResultadoPartido))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuadarResultado)
                    .addComponent(btnRegresarPartida))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResultadoPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoPartidoActionPerformed
        // TODO add your handling code here:
        txtResultadoEquipo1.setText(String.valueOf(partida.emparejarEquipo1()));
        txtResultadoEquipo2.setText(String.valueOf(partida.emparejarEquipo2()));
    }//GEN-LAST:event_btnResultadoPartidoActionPerformed

    private void btnEmparejarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmparejarJuegoActionPerformed
        // TODO add your handling code here:
        MongoJava.mostrarColeccion(db, "Equipo");
        int emparejarEquipo1 = partida.emparejarEquipo1();
        int emparejarEquipo2 = partida.emparejarEquipo2();
        
        while(emparejarEquipo1 == emparejarEquipo2){
            emparejarEquipo1 = partida.emparejarEquipo1();
            emparejarEquipo2 = partida.emparejarEquipo2();
            
        }
        
        txtAreaEquipo1.setText(MongoJava.buscarPorId(db, "Equipo", emparejarEquipo1));
        txtAreaEquipo2.setText(MongoJava.buscarPorId(db, "Equipo", emparejarEquipo2));
    }//GEN-LAST:event_btnEmparejarJuegoActionPerformed

    private void btnRegresarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarPartidaActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        MainV main = new MainV();
        main.setVisible(true);
    }//GEN-LAST:event_btnRegresarPartidaActionPerformed

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
            java.util.logging.Logger.getLogger(RegistarPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistarPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistarPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistarPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistarPartida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmparejarJuego;
    private javax.swing.JButton btnGuadarResultado;
    private javax.swing.JButton btnRegresarPartida;
    private javax.swing.JButton btnResultadoPartido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtAreaEquipo1;
    private javax.swing.JTextArea txtAreaEquipo2;
    private javax.swing.JTextField txtResultadoEquipo1;
    private javax.swing.JTextField txtResultadoEquipo2;
    // End of variables declaration//GEN-END:variables
}
