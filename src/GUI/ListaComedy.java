/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Business.PeliculaBusiness;
import Data.PeliculaData;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Heller
 */
public class ListaComedy extends javax.swing.JInternalFrame {

    /**
     * Creates new form ListaComedy
     */
    public ListaComedy() {
        initComponents();
        llenarTabla();
    }
        public void llenarTabla(){
      try {
           PeliculaBusiness pb = new PeliculaBusiness();
            PeliculaData p = new PeliculaData();
            DefaultTableModel dtm = (DefaultTableModel) jTable3.getModel();
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
            jTable3.setModel(dtm);
        } catch (IOException ex) {
            Logger.getLogger(Cargar.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
            jTable3.getColumnModel().getColumn(1).setPreferredWidth(300);
            jTable3.getColumnModel().getColumn(2).setResizable(false);
            jTable3.getColumnModel().getColumn(3).setResizable(false);
            jTable3.getColumnModel().getColumn(4).setResizable(false);
            jTable3.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
