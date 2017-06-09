/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Business.PeliculaBusiness;
import Data.CirculeDoubleListPeliculas;
import Data.PeliculaData;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Heller
 */
public class Cargar extends JInternalFrame {

    PeliculaBusiness pb = new PeliculaBusiness();
    CirculeDoubleListPeliculas cp=new CirculeDoubleListPeliculas();
    PeliculaData p = new PeliculaData();

    public Cargar() {
        super();
        initComponents();
    }//constructor

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Title", "Gender", "Total", "Subtitled", "Premier"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(230);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
            jTable2.getColumnModel().getColumn(5).setResizable(false);
        }

        jButton1.setText("Accion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Comedy");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Ficcion");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Romance");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Childish");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Drama");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(101, 101, 101))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4)
                    .addComponent(jButton2))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton6)
                    .addComponent(jButton5))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            
            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
            dtm.setNumRows(0);
            p.fileReader();
            for (int i = 0; i < p.listaChildsh.size(); i++) {
                if (p.listaChildsh != null) {
                    Object[] e = new Object[6];
                    e[0] = p.listaChildsh.get(i).getCode();
                    e[1] = p.listaChildsh.get(i).getTitle();
                    e[2] = p.listaChildsh.get(i).getGender();
                    e[3] = p.listaChildsh.get(i).getTotal();
                    e[4] = p.listaChildsh.get(i).getSubtitled();
                    e[5] = p.listaChildsh.get(i).getPremier();
                    dtm.addRow(e);
                }
            }
            jTable2.setModel(dtm);
        } catch (IOException ex) {
            Logger.getLogger(Cargar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            
            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
            dtm.setNumRows(0);
            p.fileReader();
            for (int i = 0; i < p.listaAction.size(); i++) {
                if (p.listaAction != null) {
                    Object[] e = new Object[6];
                    e[0] = p.listaAction.get(i).getCode();
                    e[1] = p.listaAction.get(i).getTitle();
                    e[2] = p.listaAction.get(i).getGender();
                    e[3] = p.listaAction.get(i).getTotal();
                    e[4] = p.listaAction.get(i).getSubtitled();
                    e[5] = p.listaAction.get(i).getPremier();
                    dtm.addRow(e);
                }
            }
            jTable2.setModel(dtm);
        } catch (IOException ex) {
            Logger.getLogger(Cargar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
            dtm.setNumRows(0);
            p.fileReader();
            for (int i = 0; i < p.listaFiccion.size(); i++) {
                if (p.listaFiccion != null) {
                    Object[] e = new Object[6];
                    e[0] = p.listaFiccion.get(i).getCode();
                    e[1] = p.listaFiccion.get(i).getTitle();
                    e[2] = p.listaFiccion.get(i).getGender();
                    e[3] = p.listaFiccion.get(i).getTotal();
                    e[4] = p.listaFiccion.get(i).getSubtitled();
                    e[5] = p.listaFiccion.get(i).getPremier();
                    dtm.addRow(e);
                }
            }
            jTable2.setModel(dtm);
        } catch (IOException ex) {
            Logger.getLogger(Cargar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
            dtm.setNumRows(0);
            p.fileReader();
            for (int i = 0; i < p.listaRomance.size(); i++) {
                if (p.listaRomance != null) {
                    Object[] e = new Object[6];
                    e[0] = p.listaRomance.get(i).getCode();
                    e[1] = p.listaRomance.get(i).getTitle();
                    e[2] = p.listaRomance.get(i).getGender();
                    e[3] = p.listaRomance.get(i).getTotal();
                    e[4] = p.listaRomance.get(i).getSubtitled();
                    e[5] = p.listaRomance.get(i).getPremier();
                    dtm.addRow(e);
                }
            }
            jTable2.setModel(dtm);
        } catch (IOException ex) {
            Logger.getLogger(Cargar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
            dtm.setNumRows(0);
            p.fileReader();
            for (int i = 0; i < p.listaDrama.size(); i++) {
                if (p.listaDrama != null) {
                    Object[] e = new Object[6];
                    e[0] = p.listaDrama.get(i).getCode();
                    e[1] = p.listaDrama.get(i).getTitle();
                    e[2] = p.listaDrama.get(i).getGender();
                    e[3] = p.listaDrama.get(i).getTotal();
                    e[4] = p.listaDrama.get(i).getSubtitled();
                    e[5] = p.listaDrama.get(i).getPremier();
                    dtm.addRow(e);
                }
            }
            jTable2.setModel(dtm);
        } catch (IOException ex) {
            Logger.getLogger(Cargar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
            dtm.setNumRows(0);
            p.fileReader();
            for (int i = 0; i < p.listaComedy.size(); i++) {
                
                if (p.listaComedy != null) {
                    Object[] e = new Object[6];
                    e[0] = p.listaComedy.get(i).getCode();
                    e[1] = p.listaComedy.get(i).getTitle();
                    e[2] = p.listaComedy.get(i).getGender();
                    e[3] = p.listaComedy.get(i).getTotal();
                    e[4] = p.listaComedy.get(i).getSubtitled();
                    e[5] = p.listaComedy.get(i).getPremier();
                    dtm.addRow(e);
                }
            }
            System.out.println(p.listaComedy.toString());
            jTable2.setModel(dtm);
        } catch (IOException ex) {
            Logger.getLogger(Cargar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

}
