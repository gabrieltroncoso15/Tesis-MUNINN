/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arriendos;
import clientes.dialogNuevoCliente;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GabrielNote
 */
public class dialogAgregarClienteArr extends javax.swing.JDialog {
    
SQLArriendo sqlarriendo = new SQLArriendo();
Arriendo arriendoclase = new Arriendo();

Icon iconoAlerta  =  new ImageIcon("C:/Sistema Muninn/Imagenes/alertaIcono.png");
Icon iconoBueno  =  new ImageIcon("C:/Sistema Muninn/Imagenes/aceptadoIcono.png");
Icon iconoError  =  new ImageIcon("C:/Sistema Muninn/Imagenes//errorIcono.png");
Icon iconoInfo  =  new ImageIcon("C:/Sistema Muninn/Imagenes/infoIcono.png"); 



    public dialogAgregarClienteArr( javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        
        sqlarriendo.tablaTodosCli.addColumn("ID");
        sqlarriendo.tablaTodosCli.addColumn("Rut");        
        sqlarriendo.tablaTodosCli.addColumn("Nombre"); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientesAdd = new javax.swing.JTable();
        txtBuscadorProd = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbNombreUsuario = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lb_cod = new javax.swing.JLabel();
        lbClientRut = new javax.swing.JLabel();
        lbClientNomb = new javax.swing.JLabel();
        btAnexarCliente = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btAnexarCliente1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MUNINN - Anexo de Cliente a un Nuevo Arriendo");
        setIconImage(null);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel5.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel5.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(38, 87, 163));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 60, 124)));
        jPanel2.setOpaque(false);

        jPanel4.setOpaque(false);

        tablaClientesAdd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaClientesAdd.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaClientesAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesAddMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaClientesAddMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaClientesAdd);

        txtBuscadorProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscadorProdKeyReleased(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscado:  Rut Nombre y Apellido");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtBuscadorProd)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscadorProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setBackground(new java.awt.Color(65, 85, 128));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(219, 218, 218));
        jButton1.setText("Agregar Registro de Cliente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel2);
        jPanel2.setBounds(11, 12, 302, 354);

        jPanel1.setBackground(new java.awt.Color(219, 228, 235));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(19, 60, 124), 1, true));
        jPanel1.setOpaque(false);

        lbNombreUsuario.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lbNombreUsuario.setText("admin");

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Usuario:");

        jPanel3.setBackground(new java.awt.Color(38, 87, 163));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Informacion Obtenida", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Codigo");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Rut");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre");

        lb_cod.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lb_cod.setForeground(new java.awt.Color(255, 255, 255));
        lb_cod.setBorder(new javax.swing.border.MatteBorder(null));

        lbClientRut.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbClientRut.setForeground(new java.awt.Color(255, 255, 255));
        lbClientRut.setBorder(new javax.swing.border.MatteBorder(null));

        lbClientNomb.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbClientNomb.setForeground(new java.awt.Color(255, 255, 255));
        lbClientNomb.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbClientRut, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                    .addComponent(lbClientNomb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_cod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_cod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbClientRut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbClientNomb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btAnexarCliente.setBackground(new java.awt.Color(65, 85, 128));
        btAnexarCliente.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btAnexarCliente.setForeground(new java.awt.Color(219, 218, 218));
        btAnexarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoNuevo.png"))); // NOI18N
        btAnexarCliente.setText("Agregar  Cliente al Formulario de Arriendo");
        btAnexarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnexarClienteActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Anexo de Cliente a un Nuevo Arriendo");

        btAnexarCliente1.setBackground(new java.awt.Color(65, 85, 128));
        btAnexarCliente1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btAnexarCliente1.setForeground(new java.awt.Color(219, 218, 218));
        btAnexarCliente1.setText("Cancelar");
        btAnexarCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnexarCliente1ActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoAddClienteMini2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel7))
                                    .addComponent(jLabel8))))
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btAnexarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btAnexarCliente1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lbNombreUsuario)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btAnexarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btAnexarCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.add(jPanel1);
        jPanel1.setBounds(319, 12, 529, 359);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoArriendos3.png"))); // NOI18N
        jPanel5.add(jLabel2);
        jLabel2.setBounds(0, 0, 900, 410);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscadorProdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscadorProdKeyReleased
        String buscador = txtBuscadorProd.getText();
        sqlarriendo.buscarCliente(buscador);
        tablaClientesAdd.setModel(sqlarriendo.tablaTodosCli);
    }//GEN-LAST:event_txtBuscadorProdKeyReleased

    private void tablaClientesAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesAddMouseClicked
        
        
        
    }//GEN-LAST:event_tablaClientesAddMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btAnexarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnexarClienteActionPerformed
int rows = tablaClientesAdd.getRowCount();
        
        if(rows > 0)
        {
            if(tablaClientesAdd.getSelectedRows().length > 0)
            {
                int mensaje= JOptionPane.showConfirmDialog(rootPane, "¿Confirma agregar a "+lbClientNomb.getText()+"?",
                "\tConfirmación", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,iconoAlerta);
                if(mensaje==JOptionPane.YES_NO_OPTION)
                {
                    this.dispose();
                    dialogNuevoArriendo nuevoarr = new dialogNuevoArriendo(new javax.swing.JDialog(), true); //cambie la herencia de frame a jdialog
        
                    nuevoarr.lbUsuarioCuenta.setText(lbNombreUsuario.getText());
                    nuevoarr.lbCodCliente.setText(lb_cod.getText());
                    nuevoarr.lbRutCliente.setText(lbClientRut.getText());
                    nuevoarr.lbNombreCliente.setText(lbClientNomb.getText());
        
                    nuevoarr.setVisible(true);
                    nuevoarr.setResizable(false);
                    nuevoarr.setLocationRelativeTo(null);
                    nuevoarr.pack();
                }  
                else
                {
                lb_cod.setText("");
                lbClientRut.setText("");
                lbClientNomb.setText("");
                }
            }
            else
            {
            JOptionPane.showMessageDialog(rootPane, "No ah seleccionado ningun Cliente","Notificación", JOptionPane.PLAIN_MESSAGE, iconoAlerta);
            lb_cod.setText("");
            lbClientRut.setText("");
            lbClientNomb.setText("");
            }
        }
        else
        {
         JOptionPane.showMessageDialog(rootPane, "No hay Clientes Registrados en la tabla","Notificación", JOptionPane.PLAIN_MESSAGE, iconoInfo);
        }

    }//GEN-LAST:event_btAnexarClienteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        sqlarriendo.buscarClienteTabla();
        tablaClientesAdd.setModel(sqlarriendo.tablaTodosCli);
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dialogNuevoClienteArr nuevoarr = new dialogNuevoClienteArr(new javax.swing.JDialog(), true); //cambie la herencia de frame a jdialog
        
        nuevoarr.setVisible(true);
        nuevoarr.setResizable(false);
        nuevoarr.setLocationRelativeTo(null);
        nuevoarr.pack();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
tablaClientesAdd.getTableHeader().setReorderingAllowed(false) ;
        sqlarriendo.buscarClienteTabla();
        tablaClientesAdd.setModel(sqlarriendo.tablaTodosCli);
    }//GEN-LAST:event_formWindowActivated

    private void btAnexarCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnexarCliente1ActionPerformed
        int mensaje= JOptionPane.showConfirmDialog(rootPane, " ¿Confirma Cancelar esta operación? \n Todos los cambios sin guardar se Perderan", "\tConfirmación",
    JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,iconoAlerta);

     if(mensaje==JOptionPane.YES_NO_OPTION)
            {
            this.dispose();
            }
     
    }//GEN-LAST:event_btAnexarCliente1ActionPerformed

    private void tablaClientesAddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesAddMousePressed
        btAnexarCliente.setEnabled(true);
        int row = tablaClientesAdd.getSelectedRow();         
         String id=tablaClientesAdd.getValueAt(row, 0).toString();
         
         limpiarjlabels();
         
         ArrayList datos=new ArrayList();
         datos=sqlarriendo.buscarClienteSelecc(id);
         
         lb_cod.setText(datos.get(4).toString());// aca obtengo los datos de arreglo
         lbClientRut.setText(datos.get(0).toString()+"-"+ datos.get(1));
         lbClientNomb.setText(datos.get(2) +" "+ datos.get(3));
    }//GEN-LAST:event_tablaClientesAddMousePressed

void limpiarjlabels()
{
lb_cod.setText("");
lbClientRut.setText("");
lbClientNomb.setText("");
    
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
            java.util.logging.Logger.getLogger(dialogAgregarClienteArr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogAgregarClienteArr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogAgregarClienteArr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogAgregarClienteArr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                dialogAgregarClienteArr dialog = new dialogAgregarClienteArr(new javax.swing.JDialog(), true);
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
    private javax.swing.JButton btAnexarCliente;
    private javax.swing.JButton btAnexarCliente1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbClientNomb;
    private javax.swing.JLabel lbClientRut;
    public static javax.swing.JLabel lbNombreUsuario;
    private javax.swing.JLabel lb_cod;
    private javax.swing.JTable tablaClientesAdd;
    private javax.swing.JTextField txtBuscadorProd;
    // End of variables declaration//GEN-END:variables
  
}

