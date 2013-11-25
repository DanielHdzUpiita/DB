package pantallas.de.bd;

import java.awt.Image;
import java.util.List;

public class Presentacion extends javax.swing.JFrame {
    public Presentacion() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label1Nombre = new javax.swing.JLabel();
        Label2Nombre = new javax.swing.JLabel();
        Label3Nombre = new javax.swing.JLabel();
        LabelLogotipo = new javax.swing.JLabel();
        LabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 200, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusable(false);
        setFocusableWindowState(false);
        setIconImages(Logotipo.png);
        setMaximumSize(new java.awt.Dimension(521, 295));
        setMinimumSize(new java.awt.Dimension(521, 295));
        setName("inicio"); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(521, 295));
        setResizable(false);
        getContentPane().setLayout(null);

        Label1Nombre.setFont(new java.awt.Font("Pristina", 0, 36)); // NOI18N
        Label1Nombre.setForeground(new java.awt.Color(255, 255, 255));
        Label1Nombre.setText("Uniformes");
        getContentPane().add(Label1Nombre);
        Label1Nombre.setBounds(298, 63, 122, 44);

        Label2Nombre.setFont(new java.awt.Font("Pristina", 0, 36)); // NOI18N
        Label2Nombre.setForeground(new java.awt.Color(255, 255, 255));
        Label2Nombre.setText("Oscar");
        getContentPane().add(Label2Nombre);
        Label2Nombre.setBounds(337, 122, 67, 44);

        Label3Nombre.setFont(new java.awt.Font("Pristina", 0, 36)); // NOI18N
        Label3Nombre.setForeground(new java.awt.Color(255, 255, 255));
        Label3Nombre.setText("Hernández");
        getContentPane().add(Label3Nombre);
        Label3Nombre.setBounds(366, 181, 127, 44);

        LabelLogotipo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LabelLogotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logotipo.png"))); // NOI18N
        LabelLogotipo.setAutoscrolls(true);
        getContentPane().add(LabelLogotipo);
        LabelLogotipo.setBounds(10, 11, 256, 256);

        LabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoNormal1.png"))); // NOI18N
        getContentPane().add(LabelFondo);
        LabelFondo.setBounds(0, 0, 521, 295);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Presentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Presentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Presentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Presentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Presentacion().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label1Nombre;
    private javax.swing.JLabel Label2Nombre;
    private javax.swing.JLabel Label3Nombre;
    private javax.swing.JLabel LabelFondo;
    private javax.swing.JLabel LabelLogotipo;
    // End of variables declaration//GEN-END:variables

    private static class Logotipo {
        private static List<? extends Image> png;

        public Logotipo() {
        }
    }
}
