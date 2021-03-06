/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package otros;

import java.awt.Color;
import java.awt.Event;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gabriel
 */
public class dialogModificarProveedor extends javax.swing.JDialog {
    
Proveedor proveedorclase = new Proveedor();
SQLProveedor sqlproveedor = new SQLProveedor();
    
Icon iconoAlerta  =  new ImageIcon("C:/Sistema Muninn/Imagenes/alertaIcono.png");
Icon iconoBueno  =  new ImageIcon("C:/Sistema Muninn/Imagenes/aceptadoIcono.png");
Icon iconoError  =  new ImageIcon("C:/Sistema Muninn/Imagenes//errorIcono.png");
Icon iconoInfo  =  new ImageIcon("C:/Sistema Muninn/Imagenes/infoIcono.png"); 
//  ,"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
    
    public dialogModificarProveedor(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        sqlproveedor.tablaTodosProv.addColumn("Codigo");
        sqlproveedor.tablaTodosProv.addColumn("Nombre");
    }

    
        
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btModificProv = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCodProvMod = new javax.swing.JTextField();
        txtProvNombMod = new javax.swing.JTextField();
        txtProvDirMod = new javax.swing.JTextField();
        txtProvFonoMod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtProvCiuMod = new javax.swing.JTextField();
        txtProvMailMod = new javax.swing.JTextField();
        txtProvWebSMod = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MUNINN - Modificación de un Proveedor");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(217, 230, 217));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 27)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonEditProveedor.png"))); // NOI18N
        jLabel8.setText("Modificar Registro Proveedor");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(60, 10, 422, 100);

        btModificProv.setBackground(new java.awt.Color(95, 107, 95));
        btModificProv.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        btModificProv.setForeground(new java.awt.Color(255, 255, 255));
        btModificProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoNuevo.png"))); // NOI18N
        btModificProv.setText("   Agregar Cambios");
        btModificProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificProvActionPerformed(evt);
            }
        });
        jPanel3.add(btModificProv);
        btModificProv.setBounds(11, 345, 545, 60);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("Codigo Proveedor");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(11, 133, 99, 17);

        txtCodProvMod.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtCodProvMod.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCodProvMod.setEnabled(false);
        txtCodProvMod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodProvModKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodProvModKeyTyped(evt);
            }
        });
        jPanel3.add(txtCodProvMod);
        txtCodProvMod.setBounds(128, 130, 184, 30);

        txtProvNombMod.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtProvNombMod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProvNombModKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProvNombModKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProvNombModKeyTyped(evt);
            }
        });
        jPanel3.add(txtProvNombMod);
        txtProvNombMod.setBounds(128, 159, 428, 30);

        txtProvDirMod.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtProvDirMod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProvDirModKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProvDirModKeyTyped(evt);
            }
        });
        jPanel3.add(txtProvDirMod);
        txtProvDirMod.setBounds(128, 188, 428, 30);

        txtProvFonoMod.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtProvFonoMod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProvFonoModKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProvFonoModKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProvFonoModKeyTyped(evt);
            }
        });
        jPanel3.add(txtProvFonoMod);
        txtProvFonoMod.setBounds(128, 217, 428, 30);

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(11, 162, 46, 17);

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Dirección");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(11, 191, 53, 17);

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Telefono");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(11, 220, 49, 17);

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setText("Ciudad");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(11, 249, 38, 17);

        txtProvCiuMod.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtProvCiuMod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProvCiuModKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProvCiuModKeyTyped(evt);
            }
        });
        jPanel3.add(txtProvCiuMod);
        txtProvCiuMod.setBounds(128, 246, 428, 30);

        txtProvMailMod.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtProvMailMod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProvMailModKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProvMailModKeyTyped(evt);
            }
        });
        jPanel3.add(txtProvMailMod);
        txtProvMailMod.setBounds(128, 275, 428, 30);

        txtProvWebSMod.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtProvWebSMod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProvWebSModKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProvWebSModKeyTyped(evt);
            }
        });
        jPanel3.add(txtProvWebSMod);
        txtProvWebSMod.setBounds(128, 304, 428, 30);

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setText("Correo Electronico");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(11, 278, 104, 17);

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel7.setText("Sitio Web");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(11, 307, 53, 17);

        jButton1.setBackground(new java.awt.Color(95, 107, 95));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cerrar Ventana");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(11, 409, 545, 60);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoProveedores.png"))); // NOI18N
        jPanel3.add(jLabel9);
        jLabel9.setBounds(0, -40, 840, 560);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btModificProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificProvActionPerformed


        if(validarCamposProv())
        {System.out.print("Obteniendo información \n");
        
        //conversiones de String a int
        
            String id = txtCodProvMod.getText();
            int idprov= Integer.parseInt(id);
                
            String tfono = txtProvFonoMod.getText();
            int telefno= Integer.parseInt(tfono);
            
        //ingreso de variables a la clase Cliente 
            
            //Conversion a mayuscula
            String editnombprov = txtProvNombMod.getText();
            editnombprov = editnombprov.toUpperCase();
            
            String editDirProv = txtProvDirMod.getText();
            editDirProv = editDirProv.toUpperCase();
            
            String editCiudProv = txtProvCiuMod.getText();
            editCiudProv = editCiudProv.toUpperCase();
            
            String editMailPorv = txtProvMailMod.getText();
            editMailPorv = editMailPorv.toUpperCase();
            
            String editWebSProv = txtProvWebSMod.getText();
            editWebSProv = editWebSProv.toUpperCase();
            
            proveedorclase.setId_proveedor(idprov);
            proveedorclase.setNombre_proveedor(editnombprov);
            proveedorclase.setDireccion_proveedor(editDirProv);
            proveedorclase.setTelefono_proveedor(telefno);
            proveedorclase.setCiudad_proveedor(editCiudProv);
            proveedorclase.setEmail_proveedor(editMailPorv);
            proveedorclase.setSitioweb_proveedor(editWebSProv);
            
        //envia los datos a la clase y al metodo agregarCliente();            
            sqlproveedor.actualizarProveedor(proveedorclase);
            
            this.dispose();
            
        }


    }//GEN-LAST:event_btModificProvActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         
         String id = txtCodProvMod.getText();
         
         ArrayList datos=new ArrayList();
         datos=sqlproveedor.buscarProvSelecc(id);         
         
         txtCodProvMod.setText(datos.get(0).toString());// aca obtengo los datos de arreglo
         txtProvNombMod.setText(datos.get(1).toString());
         txtProvDirMod.setText(datos.get(2).toString());
         txtProvFonoMod.setText(datos.get(3).toString());
         txtProvCiuMod.setText(datos.get(4).toString());
         txtProvMailMod.setText(datos.get(5).toString());
         txtProvWebSMod.setText(datos.get(6).toString());   
    }//GEN-LAST:event_formWindowOpened

    private void txtProvNombModKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProvNombModKeyTyped
        if(txtProvNombMod.getText().length()== 45) {
            evt.consume();
        }
    }//GEN-LAST:event_txtProvNombModKeyTyped

    private void txtProvDirModKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProvDirModKeyTyped
        if(txtProvDirMod.getText().length()== 45) {
            evt.consume();
        }
    }//GEN-LAST:event_txtProvDirModKeyTyped

    private void txtProvFonoModKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProvFonoModKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c) == false) {
            evt.consume();
        }    
        if(txtProvFonoMod.getText().length()== 45) {
            evt.consume();
        }
        
    }//GEN-LAST:event_txtProvFonoModKeyTyped

    private void txtProvCiuModKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProvCiuModKeyTyped
        if(txtProvCiuMod.getText().length()== 45) {
            evt.consume();
        }
    }//GEN-LAST:event_txtProvCiuModKeyTyped

    private void txtProvMailModKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProvMailModKeyTyped
       if(txtProvMailMod.getText().length()== 45) {
            evt.consume();
        }
    }//GEN-LAST:event_txtProvMailModKeyTyped

    private void txtProvWebSModKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProvWebSModKeyTyped
        if(txtProvWebSMod.getText().length()== 45) {
            evt.consume();
        }
    }//GEN-LAST:event_txtProvWebSModKeyTyped

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    private void txtProvNombModKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProvNombModKeyReleased
        String valor = txtProvNombMod.getText();        
        if(valor.equals(""))        {
            txtProvNombMod.setBackground(new Color (255,255,204));
        }
        else        {
            txtProvNombMod.setBackground(new Color (255,255,255));
        }
    }//GEN-LAST:event_txtProvNombModKeyReleased

    private void txtProvFonoModKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProvFonoModKeyReleased
        String valor = txtProvFonoMod.getText();        
        if(valor.equals(""))        {
            txtProvFonoMod.setBackground(new Color (255,255,204));
        }
        else        {
            txtProvFonoMod.setBackground(new Color (255,255,255));
        }
    }//GEN-LAST:event_txtProvFonoModKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int mensaje= JOptionPane.showConfirmDialog(rootPane, " ¿Confirma Cancelar esta operación? \n Todos los cambios sin guardar se Perderan", "\tConfirmación",
    JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,iconoAlerta);

     if(mensaje==JOptionPane.YES_NO_OPTION)
            {
            this.dispose();
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int mensaje= JOptionPane.showConfirmDialog(rootPane, "Atención: Todos los cambios no Guardados se perderan\n¿Confirma Cerrar esta ventana??", 
                        "\tCerrar", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,iconoAlerta);
                if(mensaje==JOptionPane.YES_NO_OPTION)
                {
                    this.dispose();
                }
    }//GEN-LAST:event_formWindowClosing

    private void txtCodProvModKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodProvModKeyTyped
if(txtCodProvMod.getText().length()== 8) {
            evt.consume();
        }  
    }//GEN-LAST:event_txtCodProvModKeyTyped

    private void txtCodProvModKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodProvModKeyPressed
InputMap map2 = txtCodProvMod.getInputMap(txtCodProvMod.WHEN_FOCUSED);
      map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");         // TODO add your handling code here:
    }//GEN-LAST:event_txtCodProvModKeyPressed

    private void txtProvNombModKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProvNombModKeyPressed
InputMap map2 = txtProvNombMod.getInputMap(txtProvNombMod.WHEN_FOCUSED);
      map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");         // TODO add your handling code here:
    }//GEN-LAST:event_txtProvNombModKeyPressed

    private void txtProvDirModKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProvDirModKeyPressed
InputMap map2 = txtProvDirMod.getInputMap(txtProvDirMod.WHEN_FOCUSED);
      map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");         // TODO add your handling code here:
    }//GEN-LAST:event_txtProvDirModKeyPressed

    private void txtProvFonoModKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProvFonoModKeyPressed
InputMap map2 = txtProvFonoMod.getInputMap(txtProvFonoMod.WHEN_FOCUSED);
      map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");         // TODO add your handling code here:
    }//GEN-LAST:event_txtProvFonoModKeyPressed

    private void txtProvCiuModKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProvCiuModKeyPressed
InputMap map2 = txtProvCiuMod.getInputMap(txtProvCiuMod.WHEN_FOCUSED);
      map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");         // TODO add your handling code here:
    }//GEN-LAST:event_txtProvCiuModKeyPressed

    private void txtProvMailModKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProvMailModKeyPressed
InputMap map2 = txtProvMailMod.getInputMap(txtProvMailMod.WHEN_FOCUSED);
      map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");         // TODO add your handling code here:
    }//GEN-LAST:event_txtProvMailModKeyPressed

    private void txtProvWebSModKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProvWebSModKeyPressed
InputMap map2 = txtProvWebSMod.getInputMap(txtProvWebSMod.WHEN_FOCUSED);
      map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");         // TODO add your handling code here:
    }//GEN-LAST:event_txtProvWebSModKeyPressed

void limpiarCampos()
{
txtCodProvMod.setText("");
txtProvNombMod.setText("");
txtProvDirMod.setText("");
txtProvFonoMod.setText("");
txtProvCiuMod.setText("");
txtProvWebSMod.setText("");

}



public boolean validarCamposProv()
    {
    boolean respuesta=true;
    String variable1 = "";
    if(txtCodProvMod.getText().equals(""))
                {
                
                variable1=variable1+ "Debe seleccionar un Proveedor\n";
                System.out.print("\nNo se ah seleccionado un proveedor");
                respuesta=false;
                }
    
    if(txtProvNombMod.getText().equals(""))
                {
                txtProvNombMod.getText();
                variable1=variable1+ "El registro del Proveedor debe tener un Nombre\n";
                System.out.print("\nEl registro del Proveedor debe tener un Nombre");
                respuesta=false;
                }
    if(txtProvFonoMod.getText().equals(""))
                {
                txtProvFonoMod.getText();
                variable1=variable1+ "El registro del Proveedor debe tener un Telefono\n";
                System.out.print("\nEl registro del Proveedor debe tener un Telefono");
                respuesta=false;
                }
    
     if(!respuesta)
    {
      JOptionPane.showMessageDialog(rootPane, variable1, "Notificación", JOptionPane.PLAIN_MESSAGE, iconoAlerta);
        }
    return respuesta;
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
            java.util.logging.Logger.getLogger(dialogModificarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogModificarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogModificarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogModificarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                dialogModificarProveedor dialog = new dialogModificarProveedor(new javax.swing.JDialog(), true);
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
    private javax.swing.JButton btModificProv;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JTextField txtCodProvMod;
    private javax.swing.JTextField txtProvCiuMod;
    private javax.swing.JTextField txtProvDirMod;
    private javax.swing.JTextField txtProvFonoMod;
    private javax.swing.JTextField txtProvMailMod;
    private javax.swing.JTextField txtProvNombMod;
    private javax.swing.JTextField txtProvWebSMod;
    // End of variables declaration//GEN-END:variables

DefaultTableModel tablaoModeloProvedor=new DefaultTableModel()
 {
 /*
  * Codigo que bloquea la edicion de las filas
  */
 @Override
 public boolean isCellEditable (int fila, int columna) {
    return false;
    }
};
}
