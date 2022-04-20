/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Joako
 */
public class DatosPlayer extends javax.swing.JFrame {

    String torneo = "", jugador1 = "", jugador2 = "", destrezaJugador1 = "", destrezaJugador2 = "", sets;
    int desJuga1, desJuga2;
    /**
     * Creates new form DatosPlayer
     */
    public DatosPlayer() {
        initComponents();

        setSize(494, 369);
        setResizable(false);
        setTitle("Datos de los jugadores");
        setLocationRelativeTo(null);

        ImageIcon wallpaper = new ImageIcon("src/image/WallPaper2.jpg");
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

        txt_jugador1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_jugador2 = new javax.swing.JTextField();
        txt_nombreTorneo = new javax.swing.JTextField();
        txt_destrezaJugador1 = new javax.swing.JTextField();
        txt_destrezaJugador2 = new javax.swing.JTextField();
        cmb_sets = new javax.swing.JComboBox<>();
        jButton_jugar = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_jugador1.setBackground(new java.awt.Color(255, 255, 153));
        getContentPane().add(txt_jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 160, -1));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 153));
        jLabel2.setText("Cantidad de sets:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 170, 60));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 153));
        jLabel3.setText("Jugador 1:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 150, 60));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 153));
        jLabel4.setText("Jugador 2:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 150, 60));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 153));
        jLabel8.setText("Nombre del torneo:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 190, 60));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 153));
        jLabel5.setText("Destreza Jugador 2:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 200, 60));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 153));
        jLabel6.setText("Destreza Jugador 1:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 200, 60));

        txt_jugador2.setBackground(new java.awt.Color(255, 255, 153));
        getContentPane().add(txt_jugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 160, -1));

        txt_nombreTorneo.setBackground(new java.awt.Color(255, 255, 153));
        getContentPane().add(txt_nombreTorneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 160, -1));

        txt_destrezaJugador1.setBackground(new java.awt.Color(255, 255, 153));
        getContentPane().add(txt_destrezaJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 160, -1));

        txt_destrezaJugador2.setBackground(new java.awt.Color(255, 255, 153));
        getContentPane().add(txt_destrezaJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 160, -1));

        cmb_sets.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        cmb_sets.setForeground(new java.awt.Color(102, 0, 255));
        cmb_sets.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Al mejor de 3", "Al mejor de 5" }));
        cmb_sets.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(cmb_sets, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 130, -1));

        jButton_jugar.setBackground(new java.awt.Color(255, 255, 153));
        jButton_jugar.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jButton_jugar.setText("Jugar");
        jButton_jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_jugarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_jugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 140, 50));

        jLabel_Wallpaper.setBackground(new java.awt.Color(102, 255, 102));
        jLabel_Wallpaper.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel_Wallpaper.setForeground(new java.awt.Color(255, 255, 102));
        jLabel_Wallpaper.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_jugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_jugarActionPerformed

        int validar = 0, desJuga1, desJuga2;

        torneo = txt_nombreTorneo.getText().trim();
        jugador1 = txt_jugador1.getText().trim();
        jugador2 = txt_jugador2.getText().trim();
        destrezaJugador1 = txt_destrezaJugador1.getText().trim();
        destrezaJugador2 = txt_destrezaJugador2.getText().trim();
        sets = cmb_sets.getSelectedItem().toString();

        desJuga1= validarDestreza(destrezaJugador1);
        desJuga2 = validarDestreza(destrezaJugador2);
       
        //Valido los datos
        if (torneo.equals("")) {
            txt_nombreTorneo.setBackground(Color.red);
            validar++;
        }
        if (jugador1.equals("")) {
            txt_jugador1.setBackground(Color.red);
            validar++;
        }
        if (jugador2.equals("")) {
            txt_jugador2.setBackground(Color.red);
            validar++;
        }
        if (destrezaJugador1.equals("")) {
            txt_destrezaJugador1.setBackground(Color.red);
            validar++;
        }
        if (destrezaJugador2.equals("")) {
            txt_destrezaJugador2.setBackground(Color.red);
            validar++;
        }

        if (desJuga1 < 0 || desJuga1 > 100) {
            txt_destrezaJugador1.setBackground(Color.red);
            validar = +10;
        }
        if (desJuga2 < 0 || desJuga2 > 100) {
            txt_destrezaJugador2.setBackground(Color.red);
            validar = +10;
        }

        if (validar == 0) {
            Juego juego = new Juego();
            juego.setVisible(true);

            Juego.jLabel_torneaName.setText(txt_nombreTorneo.getText().trim());
            Juego.jLabel_jugador1.setText(jugador1);
            Juego.jLabel_jugador2.setText(jugador2);
            Juego.jLabel_sets.setText(sets);
            Juego.jLabel_destrezaJugador1.setText(destrezaJugador1);
            Juego.jLabel_destrezaJugador2.setText(destrezaJugador2);

            this.dispose();
        } else if (validar > 0 && validar < 10) {
            JOptionPane.showMessageDialog(null, "Debes completar todos los campos");
        } else {
            JOptionPane.showMessageDialog(null, "La destreza de los Jugadores debe ser entre 0 y 100");
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
            java.util.logging.Logger.getLogger(DatosPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosPlayer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_sets;
    private javax.swing.JButton jButton_jugar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JTextField txt_destrezaJugador1;
    private javax.swing.JTextField txt_destrezaJugador2;
    private javax.swing.JTextField txt_jugador1;
    private javax.swing.JTextField txt_jugador2;
    private javax.swing.JTextField txt_nombreTorneo;
    // End of variables declaration//GEN-END:variables
public void Limpiar() {
        txt_nombreTorneo.setText("");
        txt_nombreTorneo.setBackground(new Color(255, 255, 153));
        txt_jugador1.setText("");
        txt_jugador1.setBackground(new Color(255, 255, 153));
        txt_jugador2.setText("");
        txt_jugador2.setBackground(new Color(255, 255, 153));
        txt_destrezaJugador1.setText("");
        txt_destrezaJugador1.setBackground(new Color(255, 255, 153));
        txt_destrezaJugador2.setText("");
        txt_destrezaJugador2.setBackground(new Color(255, 255, 153));
    }

    public int validarDestreza(String des){
       int result = 0;
        try {
            if(des != null){
             result = Integer.parseInt(des);
            }
        } catch (NumberFormatException e) {
        }
        return result;
    }   
}
