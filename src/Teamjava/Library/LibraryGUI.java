/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Teamjava.Library;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author tyler
 */
public class LibraryGUI extends javax.swing.JFrame
{

    /**
     * Creates new form LibraryGUI
     */
    public LibraryGUI()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        libraryFileChooser = new javax.swing.JFileChooser();
        libraryInfoPanel = new javax.swing.JPanel();
        OpenLibraryFileBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        dateAdvanceSpinner = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        allBooksTxtArea = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        overdueBooksTxtArea = new javax.swing.JTextArea();
        patronInfoPanel = new javax.swing.JPanel();
        patronNameComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        patronAvailBooksList = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        checkedOutBooksList = new javax.swing.JList();
        jLabel9 = new javax.swing.JLabel();
        checkOutBtn = new javax.swing.JButton();
        checkInBtn = new javax.swing.JButton();

        libraryFileChooser.setDialogTitle("Open Library File");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Team Java Library");

        libraryInfoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Library Info", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N

        OpenLibraryFileBtn.setText("Open");
        OpenLibraryFileBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                OpenLibraryFileBtnActionPerformed(evt);
            }
        });

        jLabel6.setText("Select File:");

        dateAdvanceSpinner.setModel(new javax.swing.SpinnerDateModel());

        jLabel8.setText("Current Date:");

        jLabel1.setText("All Books:");

        jLabel4.setText("Overdue Books:");

        allBooksTxtArea.setColumns(20);
        allBooksTxtArea.setRows(5);
        jScrollPane5.setViewportView(allBooksTxtArea);

        overdueBooksTxtArea.setColumns(20);
        overdueBooksTxtArea.setRows(5);
        jScrollPane6.setViewportView(overdueBooksTxtArea);

        javax.swing.GroupLayout libraryInfoPanelLayout = new javax.swing.GroupLayout(libraryInfoPanel);
        libraryInfoPanel.setLayout(libraryInfoPanelLayout);
        libraryInfoPanelLayout.setHorizontalGroup(
            libraryInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(libraryInfoPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(libraryInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(libraryInfoPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(libraryInfoPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(libraryInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(libraryInfoPanelLayout.createSequentialGroup()
                                .addComponent(OpenLibraryFileBtn)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(libraryInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateAdvanceSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(144, 144, 144))
                            .addGroup(libraryInfoPanelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(216, 216, 216))))))
        );
        libraryInfoPanelLayout.setVerticalGroup(
            libraryInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(libraryInfoPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(libraryInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateAdvanceSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(OpenLibraryFileBtn))
                .addGap(18, 18, 18)
                .addGroup(libraryInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(libraryInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        patronInfoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Patron Info/Checkout", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N

        patronNameComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "john", "marry", "yourMom" }));
        patronNameComboBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                patronNameComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Select Patron:");

        jScrollPane3.setViewportView(patronAvailBooksList);

        jLabel3.setText("Available Books:");

        jScrollPane4.setViewportView(checkedOutBooksList);

        jLabel9.setText("Checked Out Books:");

        checkOutBtn.setText("Check Out");
        checkOutBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                checkOutBtnActionPerformed(evt);
            }
        });

        checkInBtn.setText("Check In");

        javax.swing.GroupLayout patronInfoPanelLayout = new javax.swing.GroupLayout(patronInfoPanel);
        patronInfoPanel.setLayout(patronInfoPanelLayout);
        patronInfoPanelLayout.setHorizontalGroup(
            patronInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patronInfoPanelLayout.createSequentialGroup()
                .addGroup(patronInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(patronInfoPanelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(patronNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(patronInfoPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(patronInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(patronInfoPanelLayout.createSequentialGroup()
                                .addComponent(checkOutBtn)
                                .addGap(144, 144, 144))
                            .addGroup(patronInfoPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(patronInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(patronInfoPanelLayout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(checkInBtn))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patronInfoPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patronInfoPanelLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(93, 93, 93))
        );
        patronInfoPanelLayout.setVerticalGroup(
            patronInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patronInfoPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(patronInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patronNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(patronInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(patronInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(patronInfoPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkInBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkOutBtn)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(patronInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(libraryInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(libraryInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(patronInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void patronNameComboBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_patronNameComboBoxActionPerformed
    {//GEN-HEADEREND:event_patronNameComboBoxActionPerformed
        String itemSelected = patronNameComboBox.getSelectedItem().toString();
        System.out.println(itemSelected);
    }//GEN-LAST:event_patronNameComboBoxActionPerformed

    private void OpenLibraryFileBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_OpenLibraryFileBtnActionPerformed
    {//GEN-HEADEREND:event_OpenLibraryFileBtnActionPerformed
//        JOptionPane.showMessageDialog(libraryInfoPanel, "Pressed button",
//                "Warning", JOptionPane.WARNING_MESSAGE);
        
        int returnVal = libraryFileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION)
        {
            File file = libraryFileChooser.getSelectedFile();
            System.out.println(file.getAbsolutePath());
        }
    }//GEN-LAST:event_OpenLibraryFileBtnActionPerformed

    private void checkOutBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_checkOutBtnActionPerformed
    {//GEN-HEADEREND:event_checkOutBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkOutBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(LibraryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(LibraryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(LibraryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(LibraryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new LibraryGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OpenLibraryFileBtn;
    private javax.swing.JTextArea allBooksTxtArea;
    private javax.swing.JButton checkInBtn;
    private javax.swing.JButton checkOutBtn;
    private javax.swing.JList checkedOutBooksList;
    private javax.swing.JSpinner dateAdvanceSpinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JFileChooser libraryFileChooser;
    private javax.swing.JPanel libraryInfoPanel;
    private javax.swing.JTextArea overdueBooksTxtArea;
    private javax.swing.JList patronAvailBooksList;
    private javax.swing.JPanel patronInfoPanel;
    private javax.swing.JComboBox patronNameComboBox;
    // End of variables declaration//GEN-END:variables
}
