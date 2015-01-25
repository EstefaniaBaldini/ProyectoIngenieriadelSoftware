/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorRegistro;
import javax.swing.JTextField;

/**
 * 
 * @author Abel Márquez
 */
public class VentanaRegistro extends VentanaBase {

    /**
     * Creates new form VentanaRegistro
     */
    public VentanaRegistro() {
        initComponents();
        EtiquetaError.setVisible(false);
        setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BotonRegistrar = new javax.swing.JButton();
        ApellidoTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        NombreTextField = new javax.swing.JTextField();
        EtiquetaDireccion = new javax.swing.JLabel();
        EtiquetaNombre = new javax.swing.JLabel();
        CedulaTextField = new javax.swing.JTextField();
        ComprobacionPassfield = new javax.swing.JPasswordField();
        EtiquetaComprobacion = new javax.swing.JLabel();
        EtiquetaFechaNacimiento = new javax.swing.JLabel();
        UsernameTextField = new javax.swing.JTextField();
        EtiquetaNombreUsuario = new javax.swing.JLabel();
        EtiquetaApellido = new javax.swing.JLabel();
        ContrasenaPassfield = new javax.swing.JPasswordField();
        EtiquetaError = new javax.swing.JLabel();
        EtiquetaContraseña = new javax.swing.JLabel();
        EtiquetaCedula = new javax.swing.JLabel();
        VECombo = new javax.swing.JComboBox();
        EmailTextField = new javax.swing.JTextField();
        EtiquetaEmail = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        TituloRegistro1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        DoB = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1172, 138, -1, 294));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 469, -1, -1));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 469, -1, -1));

        BotonRegistrar.setText("Registrar");
        BotonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 460, -1, -1));
        jPanel1.add(ApellidoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 200, 234, 28));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 212, -1));
        jPanel1.add(NombreTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 212, 28));

        EtiquetaDireccion.setText("Dirección");
        jPanel1.add(EtiquetaDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, -1, -1));

        EtiquetaNombre.setText("Nombre");
        jPanel1.add(EtiquetaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));
        jPanel1.add(CedulaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 144, 25));
        jPanel1.add(ComprobacionPassfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 330, 234, 27));

        EtiquetaComprobacion.setText("Comprobacion Contraseña");
        jPanel1.add(EtiquetaComprobacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 330, -1, -1));

        EtiquetaFechaNacimiento.setText("Fecha Nacimiento");
        jPanel1.add(EtiquetaFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, -1, -1));
        jPanel1.add(UsernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 212, 28));

        EtiquetaNombreUsuario.setText("Nickname");
        jPanel1.add(EtiquetaNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));

        EtiquetaApellido.setText("Apellido(s)");
        jPanel1.add(EtiquetaApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, 62, -1));
        jPanel1.add(ContrasenaPassfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 212, 26));

        EtiquetaError.setText("*EtiquetaERROR*");
        jPanel1.add(EtiquetaError, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 118, -1, -1));

        EtiquetaContraseña.setText("Contraseña");
        jPanel1.add(EtiquetaContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));

        EtiquetaCedula.setText("C.I");
        jPanel1.add(EtiquetaCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 37, -1));

        VECombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "V-", "E-" }));
        jPanel1.add(VECombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 53, 28));
        jPanel1.add(EmailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 290, 234, 28));

        EtiquetaEmail.setText("Email");
        jPanel1.add(EtiquetaEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloRegistro1.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        TituloRegistro1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel10.add(TituloRegistro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 92, -1, -1));
        jPanel10.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1144, 11, -1, 189));
        jPanel10.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 176, -1, -1));
        jPanel10.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 151, -1, 48));
        jPanel10.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 199, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/logoP.png"))); // NOI18N
        jPanel10.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 0, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/separador.png"))); // NOI18N
        jLabel20.setText("jLabel20");
        jPanel10.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1360, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/homesmall.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel10.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 50, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton1.setText("Agregar Método de Pago");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 380, 234, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/credit-cardsmall.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 380, -1, -1));
        jPanel1.add(DoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 250, 230, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VentanaAgrActMetodoPago pago = new VentanaAgrActMetodoPago();
        pago.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setVisible(false);
        BusquedaProductos casa = new BusquedaProductos();
        casa.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void BotonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarActionPerformed
        //   JTextField DireccionTextField = null;
        ControladorRegistro.chequeoCampos(NombreTextField, ApellidoTextField,
            CedulaTextField, jTextArea1, EmailTextField,
            ContrasenaPassfield, ComprobacionPassfield, EtiquetaError,
            UsernameTextField, DoB, this);
    }//GEN-LAST:event_BotonRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegistro().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoTextField;
    private javax.swing.JButton BotonRegistrar;
    private javax.swing.JTextField CedulaTextField;
    private javax.swing.JPasswordField ComprobacionPassfield;
    private javax.swing.JPasswordField ContrasenaPassfield;
    private com.toedter.calendar.JDateChooser DoB;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JLabel EtiquetaApellido;
    private javax.swing.JLabel EtiquetaCedula;
    private javax.swing.JLabel EtiquetaComprobacion;
    private javax.swing.JLabel EtiquetaContraseña;
    private javax.swing.JLabel EtiquetaDireccion;
    private javax.swing.JLabel EtiquetaEmail;
    private javax.swing.JLabel EtiquetaError;
    private javax.swing.JLabel EtiquetaFechaNacimiento;
    private javax.swing.JLabel EtiquetaNombre;
    private javax.swing.JLabel EtiquetaNombreUsuario;
    private javax.swing.JTextField NombreTextField;
    private javax.swing.JLabel TituloRegistro1;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JComboBox VECombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    void SetVisible(boolean b) {
        this.setVisible(true); //To change body of generated methods, choose Tools | Templates.
    }
}
