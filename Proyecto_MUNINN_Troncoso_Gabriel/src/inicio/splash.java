
package inicio;

//import com.sun.awt.AWTUtilities;
import com.sun.awt.AWTUtilities;
import inicio.ventanaLogin;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class splash extends javax.swing.JFrame {

    private splash splashinicio = this;
    
    public splash() {
        initComponents();
        AWTUtilities.setWindowOpacity(splashinicio, new Float(1));
        this.setLocationRelativeTo(null);
        startThread();
    }

    private void startThread()
    {
    Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.print("Iniciando Splash..\n");
                ventanaLogin logeo = new ventanaLogin(splashinicio);
                logeo.setLocationRelativeTo(null);
                logeo.setVisible(true);
                dispose();
                
                //throw new UnsupportedOperationException("Not supported yet.");
            }
        });
        thread.start();
    }
    
    public JProgressBar getJProgressBar()
    {
    return progressBar;
    }
    public JLabel getJLabel()
    {
    return label;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progressBar = new javax.swing.JProgressBar();
        label = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagenes/miniLogo.png")).getImage());
        setResizable(false);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(progressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 530, 20));

        label.setText("Cargando...");
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/splash.png"))); // NOI18N
        getContentPane().add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new splash().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel label;
    private javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables
}
