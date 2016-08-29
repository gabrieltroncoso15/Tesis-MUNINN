/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

import arriendos.Arriendo;
import arriendos.SQLArriendo;
import java.awt.Event;
import java.awt.event.KeyEvent;
import javax.swing.*;

/**
 *
 * @author Gabriel
 */
public class dialogCantidadProd extends javax.swing.JDialog {

Icon iconoAlerta  =  new ImageIcon("C:/Sistema Muninn/Imagenes/alertaIcono.png");
Icon iconoBueno  =  new ImageIcon("C:/Sistema Muninn/Imagenes/aceptadoIcono.png");
Icon iconoError  =  new ImageIcon("C:/Sistema Muninn/Imagenes//errorIcono.png");
Icon iconoInfo  =  new ImageIcon("C:/Sistema Muninn/Imagenes/infoIcono.png"); 

SQLArriendo sqlarriendo = new SQLArriendo();


    public dialogCantidadProd(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCantidadIngresada = new javax.swing.JTextField();
        btSuma = new javax.swing.JButton();
        btResta = new javax.swing.JButton();
        btCerrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCantidadActual = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lbIdProducto = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setLayout(null);

        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.setOpaque(false);

        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel3.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingrese Cantidad");

        txtCantidadIngresada.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtCantidadIngresada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadIngresadaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadIngresadaKeyTyped(evt);
            }
        });

        btSuma.setBackground(new java.awt.Color(51, 51, 51));
        btSuma.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btSuma.setForeground(new java.awt.Color(255, 255, 255));
        btSuma.setText("Sumar Cantidad");
        btSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSumaActionPerformed(evt);
            }
        });

        btResta.setBackground(new java.awt.Color(51, 51, 51));
        btResta.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btResta.setForeground(new java.awt.Color(255, 255, 255));
        btResta.setText("Restar Cantidad");
        btResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRestaActionPerformed(evt);
            }
        });

        btCerrar.setBackground(new java.awt.Color(51, 51, 51));
        btCerrar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btCerrar.setText("Cerrar Ventana");
        btCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cantidad en Bodega");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cantidad Actual");

        txtCantidadActual.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtCantidadActual.setText("5");
        txtCantidadActual.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCantidadActual.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Id Producto");

        lbIdProducto.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbIdProducto.setForeground(new java.awt.Color(255, 255, 255));
        lbIdProducto.setText("IdProducto");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCantidadIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCantidadActual, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(34, 34, 34)
                                .addComponent(lbIdProducto))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btSuma)
                        .addGap(18, 18, 18)
                        .addComponent(btResta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbIdProducto))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidadActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidadIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btResta)
                    .addComponent(btSuma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(11, 12, 322, 260);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoProductos.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 370, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantidadIngresadaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadIngresadaKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c) == false) {
            evt.consume();
        }
        if(txtCantidadIngresada.getText().length()==8) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadIngresadaKeyTyped

    private void btCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCerrarActionPerformed

    private void btSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSumaActionPerformed
        if(!txtCantidadIngresada.getText().equals(""))
        {
            int valorobtenidoSuma = Integer.parseInt(txtCantidadIngresada.getText());
            if(valorobtenidoSuma>0)
            {
                
                int cantidadActual = Integer.parseInt(txtCantidadActual.getText());
                int SumaTotal =cantidadActual+valorobtenidoSuma;
                sqlarriendo.actualizarcantidad(SumaTotal,lbIdProducto.getText());
                JOptionPane.showMessageDialog(rootPane, "Cantidad Actualizada", "Notificación", JOptionPane.PLAIN_MESSAGE, iconoBueno);
                this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Numero Invalido", "Notificación", JOptionPane.PLAIN_MESSAGE, iconoAlerta);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "No ha ingresado nada", "Notificación", JOptionPane.PLAIN_MESSAGE, iconoAlerta);
        }
    }//GEN-LAST:event_btSumaActionPerformed

    private void btRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRestaActionPerformed
        if(!txtCantidadIngresada.getText().equals(""))
        {
            int CantidadIngr = Integer.parseInt(txtCantidadIngresada.getText());
            int cantidadActual = Integer.parseInt(txtCantidadActual.getText());
            if(CantidadIngr<cantidadActual+1)
            {
                int restaTotal =cantidadActual-CantidadIngr;
                sqlarriendo.actualizarcantidad(restaTotal,lbIdProducto.getText());
                JOptionPane.showMessageDialog(rootPane, "Cantidad Actualizada");
                this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Numero Invalido", "Notificación", JOptionPane.PLAIN_MESSAGE, iconoAlerta);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "No ha ingresado nada", "Notificación", JOptionPane.PLAIN_MESSAGE, iconoAlerta);
        }
    }//GEN-LAST:event_btRestaActionPerformed

    private void txtCantidadIngresadaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadIngresadaKeyPressed
InputMap map2 =  txtCantidadIngresada.getInputMap( txtCantidadIngresada.WHEN_FOCUSED);
      map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null"); 
    }//GEN-LAST:event_txtCantidadIngresadaKeyPressed

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
            java.util.logging.Logger.getLogger(dialogCantidadProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogCantidadProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogCantidadProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogCantidadProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                dialogCantidadProd dialog = new dialogCantidadProd(new javax.swing.JDialog(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCerrar;
    private javax.swing.JButton btResta;
    private javax.swing.JButton btSuma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JLabel lbIdProducto;
    public static javax.swing.JTextField txtCantidadActual;
    private javax.swing.JTextField txtCantidadIngresada;
    // End of variables declaration//GEN-END:variables
}
