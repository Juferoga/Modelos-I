/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClienteFabrica;

import Abstracto.Comun;
import Fabrica.Fabrica;

/**
 *
 * @author juferoga
 */
public class application extends javax.swing.JFrame {

    /**
     * Creates new form application
     */
    public application() {
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

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(50, 170, 170, 23);

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Cargando...");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(350, 250, 300, 80);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(50, 230, 170, 23);

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("URW Gothic", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Convertir");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(70, 280, 120, 50);

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Divisa a hacer la conversión");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 140, 178, 17);

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Pesos Colombinos a convertir");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 210, 189, 17);

        jLabel5.setFont(new java.awt.Font("URW Gothic", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Programa conversor de divisas");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(120, 40, 537, 60);

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("- Dolares ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(580, 200, 62, 17);

        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("- Euros ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(360, 200, 49, 17);

        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("- Libras Esterlinas");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(440, 200, 113, 17);

        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("- Rublos");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(580, 230, 51, 17);

        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("- Yenes");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(440, 230, 47, 17);

        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("- Yuanes");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(360, 230, 55, 17);

        jLabel11.setFont(new java.awt.Font("URW Gothic", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Las divisas a las que puedes hacer conversión son:  ");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(340, 160, 350, 30);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ClienteFabrica/divisas.png"))); // NOI18N
        jLabel13.setToolTipText("");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(0, 0, 710, 370);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //se crea objeto tipo comun
        Comun Micomun;
        
        //se crea objeto tipo fabrica
        Fabrica Mifabrica;
        
        //se guarda la seleccion de la divisa
        System.out.println("Digite la divisa a la cual desea hacer la conversion:   ");
        //String  seleccion=sc.nextLine();
        String seleccion = jTextField1.getText();
        
       //se guarda el dato double (pesos)
        System.out.println("Ingrese cuantos pesos colombianos desea convertir:   ");
        //Double  pes=sc.nextDouble();
        String pesos =  jTextField2.getText();
        double pes = Double.parseDouble(pesos);
        
        //se manda por el constructor la seleccion del usuario
        Mifabrica = new Fabrica(seleccion);
        
        //se llama al metodo crear_seleccion del objeto Mifabrica
        Micomun =  Mifabrica.crear_selecion();
        
        /*Se llama al metodo escojer del objeto MiComun que proviene de la clase abstracta
        Comun, en este caso el metodo escojer lo tendria la clase que fue seleccionada por el usuario */
        String salir=" "+pes+" pesos son igual a "+Micomun.Divisa(pes)+" " + Micomun.Escojer();
        jLabel2.setText(salir);
        //salir del programa
        //System.out.println(salir);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new application().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
