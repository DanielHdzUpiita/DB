package pantallas.de.bd;

import ObjetosDB.ConexionBD;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogIn extends javax.swing.JFrame {
    ConexionBD con = new ConexionBD();
    public LogIn() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CerrarLogIn = new javax.swing.JButton();
        LabelNombre = new javax.swing.JLabel();
        TextFieldNombre = new javax.swing.JTextField();
        LabelPassword = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        TituloLogIn = new javax.swing.JLabel();
        BotonAceptar = new javax.swing.JButton();
        FondoLogIn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 200, 0, 0));
        setIconImages(null);
        setMaximumSize(new java.awt.Dimension(520, 293));
        setMinimumSize(new java.awt.Dimension(520, 293));
        setPreferredSize(new java.awt.Dimension(520, 293));
        setResizable(false);
        setUndecorated(true);
        getContentPane().setLayout(null);

        CerrarLogIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar.png"))); // NOI18N
        CerrarLogIn.setBorder(null);
        CerrarLogIn.setBorderPainted(false);
        CerrarLogIn.setMaximumSize(new java.awt.Dimension(64, 19));
        CerrarLogIn.setMinimumSize(new java.awt.Dimension(64, 19));
        CerrarLogIn.setPreferredSize(new java.awt.Dimension(64, 19));
        CerrarLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarLogInActionPerformed(evt);
            }
        });
        getContentPane().add(CerrarLogIn);
        CerrarLogIn.setBounds(456, 0, 64, 19);

        LabelNombre.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        LabelNombre.setText("Nombre:");
        getContentPane().add(LabelNombre);
        LabelNombre.setBounds(100, 80, 60, 30);

        TextFieldNombre.setBackground(new java.awt.Color(153, 0, 255));
        TextFieldNombre.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TextFieldNombre.setForeground(new java.awt.Color(255, 255, 255));
        TextFieldNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNombreActionPerformed(evt);
            }
        });
        getContentPane().add(TextFieldNombre);
        TextFieldNombre.setBounds(120, 110, 170, 30);

        LabelPassword.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        LabelPassword.setText("Contraseña:");
        getContentPane().add(LabelPassword);
        LabelPassword.setBounds(135, 170, 80, 30);

        PasswordField.setBackground(new java.awt.Color(153, 0, 255));
        PasswordField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        PasswordField.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(PasswordField);
        PasswordField.setBounds(155, 200, 170, 30);

        TituloLogIn.setFont(new java.awt.Font("Pristina", 3, 36)); // NOI18N
        TituloLogIn.setForeground(new java.awt.Color(255, 255, 51));
        TituloLogIn.setText("Iniciar Sesion");
        getContentPane().add(TituloLogIn);
        TituloLogIn.setBounds(130, 20, 220, 50);

        BotonAceptar.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        BotonAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonAzul1.png"))); // NOI18N
        BotonAceptar.setText("ACEPTAR");
        BotonAceptar.setBorder(null);
        BotonAceptar.setBorderPainted(false);
        BotonAceptar.setContentAreaFilled(false);
        BotonAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonAceptar.setDefaultCapable(false);
        BotonAceptar.setFocusTraversalPolicyProvider(true);
        BotonAceptar.setHideActionText(true);
        BotonAceptar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        BotonAceptar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BotonAceptar.setIconTextGap(-160);
        BotonAceptar.setMargin(new java.awt.Insets(0, 20, 0, 0));
        BotonAceptar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonAzul2.png"))); // NOI18N
        BotonAceptar.setVerifyInputWhenFocusTarget(false);
        BotonAceptar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        BotonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonAceptar);
        BotonAceptar.setBounds(320, 90, 250, 210);

        FondoLogIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        FondoLogIn.setMaximumSize(new java.awt.Dimension(521, 295));
        FondoLogIn.setMinimumSize(new java.awt.Dimension(521, 295));
        FondoLogIn.setPreferredSize(new java.awt.Dimension(521, 295));
        getContentPane().add(FondoLogIn);
        FondoLogIn.setBounds(0, 0, 521, 295);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNombreActionPerformed

    private void CerrarLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarLogInActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_CerrarLogInActionPerformed

    private void BotonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAceptarActionPerformed
        int priv = log(TextFieldNombre.getText(),PasswordField.getText());
        switch(priv){
            case 0:
                Cliente Cli = new Cliente();
                Cli.setVisible(true);
                break;
            case 1:
                Administrador adm = new Administrador();
                adm.setVisible(true);
                break;
            case 2:
                Vendedor v = new Vendedor();
                v.setVisible(true);
                break;
        }
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_BotonAceptarActionPerformed
    
    public int log(String user, String pass)
    {
        con.iniciar();
        String procedure = "call login('" + user + "','" + pass + "')";
        int priv = 0;
        if(con.consultar(procedure))
        {
            ResultSet rs = con.resultado;
            try {
                while(rs.next()){
                    priv = rs.getInt("res");
                }
            } catch (SQLException ex) {
                Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        con.detener();
        return priv;
    
    }
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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAceptar;
    private javax.swing.JButton CerrarLogIn;
    private javax.swing.JLabel FondoLogIn;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JLabel LabelPassword;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JTextField TextFieldNombre;
    private javax.swing.JLabel TituloLogIn;
    // End of variables declaration//GEN-END:variables
}
