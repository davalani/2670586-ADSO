/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package principal;

import java.awt.Image;
import javax.swing.table.DefaultTableModel;
import utils.BaseDatos;
import utils.Persona;

/**
 *
 * @author vcarv
 */
public class PanelListar extends javax.swing.JPanel {

   DefaultTableModel modelo;
    BaseDatos basedatos;
    public PanelListar(BaseDatos basedatos) {
        initComponents();
        this.basedatos = basedatos;
        initAlternComponent();
        imprimirPersonas();
        
    }

  public void initAlternComponent(){
        
        modelo = (DefaultTableModel) tablaPersonas.getModel();
        
        tablaPersonas.getColumnModel().getColumn(0).setPreferredWidth(20);
        tablaPersonas.getColumnModel().getColumn(1).setPreferredWidth(150);
        tablaPersonas.getColumnModel().getColumn(2).setPreferredWidth(300);
        tablaPersonas.getColumnModel().getColumn(3).setPreferredWidth(100);
        tablaPersonas.getColumnModel().getColumn(4).setPreferredWidth(200);
    }
    @SuppressWarnings("unchecked")
     public void imprimirPersonas(){
        Persona lista [] = basedatos.extraerPersonas();
        modelo.setRowCount(0);
        for (int i=0; i<lista.length && lista[i]!=null; i++) {
            String documento = lista[i].getDocumento();
            String nombres = lista[i].getNombres()+" "+lista[i].getApellidos();
            String telefono = lista[i].getTelefono();
            String correo = lista[i].getCorreo();
            
            Object datos[] = new Object[]{ (i+1), documento, nombres, telefono, correo};
            modelo.addRow(datos);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPersonas = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 204, 204));
        setForeground(new java.awt.Color(255, 204, 204));
        setToolTipText("");

        btnAgregar1.setBackground(new java.awt.Color(204, 204, 204));
        btnAgregar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAgregar1.setText("CANCELAR");
        btnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar1ActionPerformed(evt);
            }
        });

        tablaPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Cedula", "Nombres", "Telefono", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaPersonas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar1ActionPerformed
        dispose();
    }//GEN-LAST:event_btnAgregar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPersonas;
    // End of variables declaration//GEN-END:variables

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
