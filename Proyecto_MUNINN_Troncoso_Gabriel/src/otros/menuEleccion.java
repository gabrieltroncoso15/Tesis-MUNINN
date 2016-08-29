/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package otros;

import inicio.inicioRapido;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Gabriel
 */
public class menuEleccion extends javax.swing.JFrame {
Icon iconoAlerta  =  new ImageIcon("C:/Sistema Muninn/Imagenes/alertaIcono.png");
Icon iconoBueno  =  new ImageIcon("C:/Sistema Muninn/Imagenes/aceptadoIcono.png");
Icon iconoError  =  new ImageIcon("C:/Sistema Muninn/Imagenes//errorIcono.png");
Icon iconoInfo  =  new ImageIcon("C:/Sistema Muninn/Imagenes/infoIcono.png"); 
//  ,"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
    public menuEleccion() {
        initComponents();
        setResizable(false);
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

        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lbNombreUsuarioOtros = new javax.swing.JLabel();
        btModifProduct2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MUNINN - Menu Otros");
        setMaximumSize(new java.awt.Dimension(813, 435));
        setMinimumSize(new java.awt.Dimension(813, 435));
        setPreferredSize(new java.awt.Dimension(813, 435));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel5.setText("Proveedores");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(160, 250, 154, 39);

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel4.setText("Categorias");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(540, 250, 147, 39);

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel7.setText("Seleccione una Opción");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(240, 340, 224, 30);

        jButton1.setBackground(new java.awt.Color(95, 107, 95));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoProveedor.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(80, 20, 270, 220);

        jButton2.setBackground(new java.awt.Color(125, 150, 164));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoCategoria.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(460, 20, 260, 220);

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel6.setText("Usuario:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 350, 60, 20);

        lbNombreUsuarioOtros.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        lbNombreUsuarioOtros.setText("Nombre usuario");
        getContentPane().add(lbNombreUsuarioOtros);
        lbNombreUsuarioOtros.setBounds(20, 370, 120, 20);

        btModifProduct2.setBackground(new java.awt.Color(51, 51, 51));
        btModifProduct2.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btModifProduct2.setForeground(new java.awt.Color(255, 255, 255));
        btModifProduct2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonProveedor.png"))); // NOI18N
        btModifProduct2.setText("Volver al Inicio Rapido");
        btModifProduct2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModifProduct2ActionPerformed(evt);
            }
        });
        getContentPane().add(btModifProduct2);
        btModifProduct2.setBounds(500, 320, 300, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoInicio.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 830, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btModifProduct2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModifProduct2ActionPerformed
        consultaSalir();
    }//GEN-LAST:event_btModifProduct2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int mensaje= JOptionPane.showConfirmDialog(rootPane, "¿Confirma Salir de la aplicación?\n Si desea volver a Ventana inicio, "
                + "presione Volver al Inicio Rapido", "\tConfirmacion de Salida", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, iconoAlerta);

     if(mensaje==JOptionPane.YES_NO_OPTION)
            {
            System.exit(0);
            }

        else{
            this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
            }
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.print("Abriendo Menu Principal de 'Proveedores'...\n");
        menuProveedores menuprov = new menuProveedores();

        menuprov.lbNombreUsuarioProv.setText(lbNombreUsuarioOtros.getText());

        menuprov.setVisible(true);
        menuprov.show();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.out.print("Abriendo Menu Principal de 'Categorias'...\n");      
        menuCategorias menucategoria = new menuCategorias();
        
        menucategoria.lbNombreUsuarioCateg.setText(lbNombreUsuarioOtros.getText());
        
        menucategoria.setVisible(true);
        menucategoria.show();
        this.dispose();
           
    }//GEN-LAST:event_jButton2ActionPerformed

public void consultaSalir()
    {
    int mensaje= JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea ir al Inicio Rapido?", "\tConfirmacion al Inicio Rapido",
    JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,iconoAlerta);

     if(mensaje==JOptionPane.YES_NO_OPTION)
            {
            this.hide();
            inicioRapido principal = new inicioRapido();
            principal.pack();
            principal.setLocationRelativeTo(null);
            principal.setVisible(true);
            principal.lbNombreUusario.setText(lbNombreUsuarioOtros.getText());
            
            }

        else{
            this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
            }
    }    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menuEleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuEleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuEleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuEleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new menuEleccion().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btModifProduct2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel lbNombreUsuarioOtros;
    // End of variables declaration//GEN-END:variables
}
