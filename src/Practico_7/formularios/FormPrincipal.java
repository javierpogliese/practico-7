/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practico_7.formularios;

import Practico_7.entidades.*;
import java.util.*;

/**
 *
 * @author Usuario
 */
public class FormPrincipal extends javax.swing.JFrame {
    private HashSet<Alumno> alumnos = new HashSet<>();
    private HashSet<Materia> materias = new HashSet<>();
    /**
     * Creates new form FormPrincipal
     */
    public FormPrincipal() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDpEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMAltas = new javax.swing.JMenu();
        jMiAlumnos = new javax.swing.JMenuItem();
        jMiMaterias = new javax.swing.JMenuItem();
        jMiInscripcion = new javax.swing.JMenuItem();
        jMSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDpEscritorioLayout = new javax.swing.GroupLayout(jDpEscritorio);
        jDpEscritorio.setLayout(jDpEscritorioLayout);
        jDpEscritorioLayout.setHorizontalGroup(
            jDpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDpEscritorioLayout.setVerticalGroup(
            jDpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
        );

        jMAltas.setText("Altas");

        jMiAlumnos.setText("Alta de Alumnos");
        jMiAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMiAlumnosActionPerformed(evt);
            }
        });
        jMAltas.add(jMiAlumnos);

        jMiMaterias.setText("Alta de Materias");
        jMiMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMiMateriasActionPerformed(evt);
            }
        });
        jMAltas.add(jMiMaterias);

        jMiInscripcion.setText("Formulario de inscripción");
        jMiInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMiInscripcionActionPerformed(evt);
            }
        });
        jMAltas.add(jMiInscripcion);

        jMenuBar1.add(jMAltas);

        jMSalir.setText("Salir");
        jMenuBar1.add(jMSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDpEscritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDpEscritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMiAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMiAlumnosActionPerformed
        jDpEscritorio.removeAll(); 
        jDpEscritorio.repaint();
        AltaAlumnos aa = new AltaAlumnos(alumnos);
        aa.setVisible(true);
        jDpEscritorio.add(aa);
        jDpEscritorio.moveToFront(aa);
        aa.setFocusable(true);
        aa.requestFocusInWindow();
        aa.requestFocus(true);
        aa.requestFocus();     
    }//GEN-LAST:event_jMiAlumnosActionPerformed

    private void jMiMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMiMateriasActionPerformed
        jDpEscritorio.removeAll(); 
        jDpEscritorio.repaint();
        AltaMaterias am = new AltaMaterias(materias);
        am.setVisible(true);
        jDpEscritorio.add(am);
        jDpEscritorio.moveToFront(am);
        am.setFocusable(true);
        am.requestFocusInWindow();
        am.requestFocus(true);
        am.requestFocus(); // TODO add your handling code here:
    }//GEN-LAST:event_jMiMateriasActionPerformed

    private void jMiInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMiInscripcionActionPerformed
        jDpEscritorio.removeAll(); 
        jDpEscritorio.repaint();
        FormInscripcion fi = new FormInscripcion(alumnos, materias);
        fi.setVisible(true);
        jDpEscritorio.add(fi);
        jDpEscritorio.moveToFront(fi);
        fi.setFocusable(true);
        fi.requestFocusInWindow();
        fi.requestFocus(true);
        fi.requestFocus();
    }//GEN-LAST:event_jMiInscripcionActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDpEscritorio;
    private javax.swing.JMenu jMAltas;
    private javax.swing.JMenu jMSalir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMiAlumnos;
    private javax.swing.JMenuItem jMiInscripcion;
    private javax.swing.JMenuItem jMiMaterias;
    // End of variables declaration//GEN-END:variables
}
