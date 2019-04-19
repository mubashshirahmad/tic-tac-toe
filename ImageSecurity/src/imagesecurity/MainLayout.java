/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagesecurity;

import imagesecurity.ImageTotext.*;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Container;
import javax.swing.*;
import javax.swing.ImageIcon;

/**
 *
 * @author Suman
 */
public class MainLayout extends javax.swing.JFrame {

    /**
     * Creates new form MainLayout
     */
    public MainLayout() {
        initComponents();
        //createcustompanel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DashBoard = new javax.swing.JPanel();
        ImageChooser = new javax.swing.JPanel();
        ImageConversion = new javax.swing.JPanel();
        CaptchaValidation = new javax.swing.JPanel();
        ViewHistory = new javax.swing.JPanel();
        TextChooser = new javax.swing.JPanel();
        TextConverter = new javax.swing.JPanel();
        MenuBar = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        file_new = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        file_history = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        file_exit = new javax.swing.JMenuItem();
        back = new javax.swing.JMenuItem();
        Help = new javax.swing.JMenu();
        help_contents = new javax.swing.JMenuItem();
        help_report = new javax.swing.JMenuItem();
        AboutUs = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        DashBoard.setBackground(new java.awt.Color(191, 181, 173));
        DashBoard.setMaximumSize(new java.awt.Dimension(700, 500));
        DashBoard.setMinimumSize(new java.awt.Dimension(700, 500));
        DashBoard.setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().add(DashBoard, "card2");
        DashBoard_layout layout = new DashBoard_layout();
        layout.run(DashBoard,getContentPane());
        DashBoard.setName("1");

        ImageChooser.setLayout(new javax.swing.BoxLayout(ImageChooser, javax.swing.BoxLayout.Y_AXIS));
        getContentPane().add(ImageChooser, "card3");
        ImageChooser.setBackground(new java.awt.Color(191, 181, 173));
        ImageChooser.setName("2");
        ImageChooser_layout ic_layout = new ImageChooser_layout();
        ic_layout.run(ImageChooser, getContentPane());

        ImageConversion.setLayout(new javax.swing.BoxLayout(ImageConversion, javax.swing.BoxLayout.Y_AXIS));
        getContentPane().add(ImageConversion, "card4");
        //ImageConversion.setBackground(new java.awt.Color(191, 181, 173));

        ImageConversion_layout ICON_layout = new ImageConversion_layout();
        ICON_layout.run(ImageConversion, getContentPane());
        ImageConversion.setName("3");

        CaptchaValidation.setBackground(new java.awt.Color(191, 181, 173));
        CaptchaValidation.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 100, 100));
        getContentPane().add(CaptchaValidation, "card5");
        History_layout HLayout = new History_layout();
        HLayout.run(CaptchaValidation,getContentPane());
        CaptchaValidation.setName("4");

        ViewHistory.setBackground(new java.awt.Color(191, 181, 173));
        ViewHistory.setLayout(new java.awt.GridLayout(1, 2, 2, 0));
        getContentPane().add(ViewHistory, "card6");
        ViewHistory.setName("5");
        tableimage i = new tableimage();
        i.run(ViewHistory, getContentPane());

        javax.swing.GroupLayout TextChooserLayout = new javax.swing.GroupLayout(TextChooser);
        TextChooser.setLayout(TextChooserLayout);
        TextChooserLayout.setHorizontalGroup(
            TextChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 994, Short.MAX_VALUE)
        );
        TextChooserLayout.setVerticalGroup(
            TextChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(TextChooser, "card7");
        TextChooser.setName("6");

        javax.swing.GroupLayout TextConverterLayout = new javax.swing.GroupLayout(TextConverter);
        TextConverter.setLayout(TextConverterLayout);
        TextConverterLayout.setHorizontalGroup(
            TextConverterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 994, Short.MAX_VALUE)
        );
        TextConverterLayout.setVerticalGroup(
            TextConverterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(TextConverter, "card8");
        TextConverter.setName("7");

        MenuBar.setBackground(new java.awt.Color(255, 0, 51));
        MenuBar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MenuBar.setMaximumSize(new java.awt.Dimension(60, 50));
        MenuBar.setMinimumSize(new java.awt.Dimension(60, 50));
        MenuBar.setName(""); // NOI18N
        MenuBar.setPreferredSize(new java.awt.Dimension(60, 50));

        file.setText("File");
        file.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        file.setPreferredSize(new java.awt.Dimension(70, 19));

        file_new.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        file_new.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        file_new.setText("New");
        file_new.setPreferredSize(new java.awt.Dimension(150, 27));
        file_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file_newActionPerformed(evt);
            }
        });
        file.add(file_new);
        file.add(jSeparator1);

        file_history.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        file_history.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        file_history.setText("History");
        file_history.setPreferredSize(new java.awt.Dimension(119, 27));
        file_history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file_historyActionPerformed(evt);
            }
        });
        file.add(file_history);
        file.add(jSeparator2);

        file_exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        file_exit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        file_exit.setText("Exit");
        file_exit.setPreferredSize(new java.awt.Dimension(119, 27));
        file_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file_exitActionPerformed(evt);
            }
        });
        file.add(file_exit);

        back.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_LEFT, 0));
        back.setText("Back");
        back.setPreferredSize(new java.awt.Dimension(119, 27));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        file.add(back);

        MenuBar.add(file);

        Help.setText("Help");
        Help.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Help.setPreferredSize(new java.awt.Dimension(70, 25));

        help_contents.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        help_contents.setText("Help Contents");
        help_contents.setPreferredSize(new java.awt.Dimension(131, 27));
        Help.add(help_contents);

        help_report.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        help_report.setText("Report Issues");
        help_report.setPreferredSize(new java.awt.Dimension(131, 27));
        Help.add(help_report);

        MenuBar.add(Help);

        AboutUs.setText("About Us");
        AboutUs.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AboutUs.setPreferredSize(new java.awt.Dimension(100, 25));
        MenuBar.add(AboutUs);

        setJMenuBar(MenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void file_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_newActionPerformed
        CardLayout card = (CardLayout) getContentPane().getLayout();
        card.show(getContentPane(), "card2");
    }//GEN-LAST:event_file_newActionPerformed

    private void file_historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_historyActionPerformed
       CardLayout card = (CardLayout) getContentPane().getLayout();
        card.show(getContentPane(), "card5");
    }//GEN-LAST:event_file_historyActionPerformed

    private void file_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_file_exitActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {                                     
        Container container = getContentPane();
        JPanel card = null;
        CardLayout  layout = (CardLayout) container.getLayout();;

        for(Component comp : container.getComponents())
        {
            card = (JPanel) comp;
            if(card.isVisible() == true){
                if(card.getName().equals("1"))
                    System.exit(0);
                else 
                if(card.getName().equals("2")){
                    layout.show(container, "card2");
                }
                else
                if(card.getName().equals("3")){
                    layout.show(container, "card3");
                }
                else
                if(card.getName().equals("4"))
                    layout.show(container, "card2");
                else
                if(card.getName().equals("5"))
                    layout.show(container, "card2");
                else
                if(card.getName().equals("6"))
                    layout.show(container, "card2");
                else
                if(card.getName().equals("7"))
                    layout.show(container, "card2");
            }
        }
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
            java.util.logging.Logger.getLogger(MainLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainLayout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AboutUs;
    private javax.swing.JPanel CaptchaValidation;
    private javax.swing.JPanel DashBoard;
    private javax.swing.JMenu Help;
    private javax.swing.JPanel ImageChooser;
    private javax.swing.JPanel ImageConversion;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JPanel TextChooser;
    private javax.swing.JPanel TextConverter;
    private javax.swing.JPanel ViewHistory;
    private javax.swing.JMenuItem back;
    private javax.swing.JMenu file;
    private javax.swing.JMenuItem file_exit;
    private javax.swing.JMenuItem file_history;
    private javax.swing.JMenuItem file_new;
    private javax.swing.JMenuItem help_contents;
    private javax.swing.JMenuItem help_report;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    // End of variables declaration//GEN-END:variables

}
