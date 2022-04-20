/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Joako
 */
public class Juego extends javax.swing.JFrame {

    String  torneo = "", jugador1 = "", jugador2 = "",sets="",destreazaJugador1="",destrezaJugador2="";
     int desJuga1, desJuga2;

    /**
     * Creates new form Juego
     */
    public Juego() {
        initComponents();

        setSize(589, 546);
        setResizable(false);
        setTitle("TenniSlap");
        setLocationRelativeTo(null);
        
        

        ImageIcon wallpaper = new ImageIcon("src/image/cancha.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(),
                jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();
    }

    @Override
    public Image getIconImage() {
        //aca como ya especificamos en design q va a usar una imagen para la interface no hace falta poner "src" en la url
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("image/ball.png"));
        return retValue;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_sets = new javax.swing.JLabel();
        jLabel_torneaName = new javax.swing.JLabel();
        jLabel_jugador1 = new javax.swing.JLabel();
        jLabel_destrezaJugador1 = new javax.swing.JLabel();
        jLabel_jugador2 = new javax.swing.JLabel();
        jLabel_destrezaJugador2 = new javax.swing.JLabel();
        jButton_jugar = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_sets.setFont(new java.awt.Font("Broadway", 1, 18)); // NOI18N
        jLabel_sets.setForeground(new java.awt.Color(255, 255, 153));
        getContentPane().add(jLabel_sets, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 220, 30));

        jLabel_torneaName.setFont(new java.awt.Font("Broadway", 1, 18)); // NOI18N
        jLabel_torneaName.setForeground(new java.awt.Color(255, 255, 153));
        getContentPane().add(jLabel_torneaName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 200, 30));

        jLabel_jugador1.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        jLabel_jugador1.setForeground(new java.awt.Color(51, 51, 255));
        getContentPane().add(jLabel_jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 130, 20));

        jLabel_destrezaJugador1.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        jLabel_destrezaJugador1.setForeground(new java.awt.Color(51, 51, 255));
        getContentPane().add(jLabel_destrezaJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 130, 20));

        jLabel_jugador2.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        jLabel_jugador2.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabel_jugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, 120, 20));

        jLabel_destrezaJugador2.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        jLabel_destrezaJugador2.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabel_destrezaJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 120, 20));

        jButton_jugar.setBackground(new java.awt.Color(255, 255, 153));
        jButton_jugar.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jButton_jugar.setText("Iniciar");
        jButton_jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_jugarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_jugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 140, 50));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_jugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_jugarActionPerformed
    
    int band=1;
    sets=jLabel_sets.getText();
    jugador1=jLabel_jugador1.getText();
    jugador2=jLabel_jugador2.getText();
    torneo=jLabel_torneaName.getText();
    destreazaJugador1=jLabel_destrezaJugador1.getText();
    destrezaJugador2=jLabel_destrezaJugador2.getText();
    desJuga1=Integer.parseInt(destreazaJugador1);
    desJuga2=Integer.parseInt(destrezaJugador2);

     //Indico a cuantos sets es
     if(sets.equals("Al mejor de 3")){
     do{
     //Mostrar de quien es el saque
       if(band%2==0){
           JOptionPane.showMessageDialog(null, "Saque de "+ jugador1);
       }else{
           JOptionPane.showMessageDialog(null, "Saque de "+ jugador2);
       }
        




       }while(band < 4);        
     }else{
     
     }
    }//GEN-LAST:event_jButton_jugarActionPerformed

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
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_jugar;
    private javax.swing.JLabel jLabel_Wallpaper;
    public static javax.swing.JLabel jLabel_destrezaJugador1;
    public static javax.swing.JLabel jLabel_destrezaJugador2;
    public static javax.swing.JLabel jLabel_jugador1;
    public static javax.swing.JLabel jLabel_jugador2;
    public static javax.swing.JLabel jLabel_sets;
    public static javax.swing.JLabel jLabel_torneaName;
    // End of variables declaration//GEN-END:variables
}