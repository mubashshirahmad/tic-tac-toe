/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author max
 */
public class frame extends javax.swing.JFrame {

    /**
     * Creates new form frame
     */
    public frame() {
        initComponents();
        setSize(1000,700);
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
        name = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        b2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        b3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        player1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        l1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        b4 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        b5 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        b6 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        player2 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        l2 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        b7 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        b8 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        b9 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        reset = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        name.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("TIC TAC TOE");
        jPanel1.add(name, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        b1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel3.add(b1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        b2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel4.add(b2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        b3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel5.add(b3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());

        player1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        player1.setText("player x:");
        jPanel6.add(player1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());

        l1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jPanel7.add(l1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        b4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jPanel8.add(b4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        b5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        jPanel9.add(b5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setForeground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());

        b6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        jPanel10.add(b6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setForeground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.BorderLayout());

        player2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        player2.setText("player 0:");
        jPanel11.add(player2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setForeground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new java.awt.BorderLayout());

        l2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jPanel12.add(l2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setForeground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new java.awt.BorderLayout());

        b7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        jPanel13.add(b7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setForeground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new java.awt.BorderLayout());

        b8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        jPanel14.add(b8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setForeground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new java.awt.BorderLayout());

        b9.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        jPanel15.add(b9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setForeground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new java.awt.BorderLayout());

        reset.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel16.add(reset, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setForeground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new java.awt.BorderLayout());

        exit.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel17.add(exit, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel17);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String startGame="X";
    private int xcount=0;
    private int ycount=0;
    
    private void gameScore()
    {   l1.setText(String.valueOf(xcount));
        l2.setText(String.valueOf(ycount));
    }
    private void chose_a_player()
    {
          if(startGame.equalsIgnoreCase("X"))
          {
               startGame="O";
          }
          else 
               {
               startGame="X";
          }
    }
    private void reset1()
    {
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        
                
        
    
    }
    
    private void mx()
    {
          
    }
    private void tie()
    {
        String b11 = b1.getText(); 
        String b22 = b2.getText(); 
        String b33 = b3.getText(); 
        String b44 = b4.getText(); 
        String b55 = b5.getText(); 
        String b66 = b6.getText(); 
        String b77 = b7.getText(); 
        String b88 = b8.getText(); 
        String b99 = b9.getText(); 
        if(b11!=""&&b22!=""&&b33!=""&&b44!=""&&b55!=""&&b66!=""&&b77!=""&&b88!=""&&b99!="")
        {
            JOptionPane.showMessageDialog(this, "Game is tie","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            reset1();
        }
        
    }
    private void win()
    {
        String b11 = b1.getText(); 
        String b22 = b2.getText(); 
        String b33 = b3.getText(); 
        String b44 = b4.getText(); 
        String b55 = b5.getText(); 
        String b66 = b6.getText(); 
        String b77 = b7.getText(); 
        String b88 = b8.getText(); 
        String b99 = b9.getText(); 
        
       if(b11=="X"&&b22=="X"&&b33=="X"||b44=="X"&&b55=="X"&&b66=="X"||b77=="X"&&b88=="X"&&b99=="X")
       {
            xcount++;
            JOptionPane.showMessageDialog(this,"X win the game","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            gameScore();
            reset1();
       }
       if(b11=="O"&&b22=="O"&&b33=="O"||b44=="O"&&b55=="O"&&b66=="O"||b77=="O"&&b88=="O"&&b99=="O")
       {
            ycount++;
            JOptionPane.showMessageDialog(this,"O win the game","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            gameScore();
            reset1();
       }
       if(b11=="O"&&b44=="O"&&b77=="O"||b22=="O"&&b55=="O"&&b88=="O"||b33=="O"&&b66=="O"&&b99=="O")
       {
            ycount++;
            JOptionPane.showMessageDialog(this,"O win the game","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            gameScore();
            reset1();
       }
        if(b11=="X"&&b44=="X"&&b77=="X"||b22=="X"&&b55=="X"&&b88=="X"||b33=="X"&&b66=="X"&&b99=="X")
       {
            xcount++;
            JOptionPane.showMessageDialog(this,"X win the game","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            gameScore();
            reset1();
       }
        if(b11=="X"&&b55=="X"&&b99=="X"||b33=="X"&&b55=="X"&&b77=="X")
       {
            xcount++;
            JOptionPane.showMessageDialog(this,"X win the game","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            gameScore();
            reset1();
       }
        
        if(b11=="O"&&b55=="O"&&b99=="O"||b33=="O"&&b55=="O"&&b77=="O")
       {
            ycount++;
            JOptionPane.showMessageDialog(this,"O win the game","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            gameScore();
            reset1();
       }
        
        
        
        
        
    }
    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
         reset1();
         xcount=0;
         ycount=0;
         l1.setText("");
         l2.setText("");
    }//GEN-LAST:event_resetActionPerformed
private JFrame frame2;
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        frame2=new JFrame("exit");
        if(JOptionPane.showConfirmDialog(frame2,"are you sure you want to close","TIC TAC TOE",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {  
               System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        b1.setText(startGame);
     
        chose_a_player();
        win();
        tie();
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        b2.setText(startGame);
       /* if(startGame.equalsIgnoreCase("X"))
          {
               startGame="O";
          }
          else 
               {
               startGame="X";
          }*/
         chose_a_player();
         win();
         tie();
    }//GEN-LAST:event_b2ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
        b4.setText(startGame);
     
        chose_a_player();
        win();
        tie();
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
b5.setText(startGame);
     
        chose_a_player();
      win();  
       tie();      // TODO add your handling code here:
    }//GEN-LAST:event_b5ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
        b7.setText(startGame);
     
        chose_a_player();
        win();
        tie();
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
        b8.setText(startGame);
     
        chose_a_player();
        win();
        tie();
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        // TODO add your handling code here:
        b9.setText(startGame);
     
        chose_a_player();
        win();
        tie();
    }//GEN-LAST:event_b9ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
        b6.setText(startGame);
     
        chose_a_player();
        win();
        tie();
    }//GEN-LAST:event_b6ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        b3.setText(startGame);
     
        chose_a_player();
        win();
        tie();
    }//GEN-LAST:event_b3ActionPerformed

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
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton exit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel name;
    private javax.swing.JLabel player1;
    private javax.swing.JLabel player2;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}
