/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.interfaces;


import com.clases.MetodosDB;

import javax.swing.ImageIcon;

/**
 *
 * @author Jhoan
 */
public class Eliminar extends javax.swing.JFrame {

    
   MetodosDB metdb = new MetodosDB();
    int y,x;
    /**
     * Creates new form Eliminar
     */
    public Eliminar() {
        initComponents();
        this.Errordatosincorrectos.setVisible(false);
        
        this.setLocationRelativeTo(null);
         setIconImage(new ImageIcon(getClass().getResource("/Recursos/Iconos/Iconobarra2.png")).getImage());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelVender = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtEliminar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Errordatosincorrectos = new javax.swing.JLabel();
        Minimizar = new javax.swing.JLabel();
        Regresarbtn = new javax.swing.JLabel();
        Eliminar = new javax.swing.JLabel();
        Cerrar1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        PanelVender.setBackground(new java.awt.Color(255, 255, 255));
        PanelVender.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        PanelVender.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                PanelVenderMouseDragged(evt);
            }
        });
        PanelVender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelVenderMousePressed(evt);
            }
        });
        PanelVender.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Eliminar Producto");
        PanelVender.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        txtEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanelVender.add(txtEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 170, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setText("Nombre del producto");
        PanelVender.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        Errordatosincorrectos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Errordatosincorrectos.setForeground(new java.awt.Color(204, 51, 0));
        Errordatosincorrectos.setText("Datos incorrectos ");
        PanelVender.add(Errordatosincorrectos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Minimize.png"))); // NOI18N
        Minimizar.setText("jLabel2");
        Minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarMouseClicked(evt);
            }
        });
        PanelVender.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 20, 20));

        Regresarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/atrasnegro.png"))); // NOI18N
        Regresarbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegresarbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegresarbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegresarbtnMouseExited(evt);
            }
        });
        PanelVender.add(Regresarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/delete (3).png"))); // NOI18N
        Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EliminarMouseExited(evt);
            }
        });
        PanelVender.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 50, 50));

        Cerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/cerrar-sesion.png"))); // NOI18N
        Cerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cerrar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Cerrar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Cerrar1MouseExited(evt);
            }
        });
        PanelVender.add(Cerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 50, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel3.setText("Eliminar");
        PanelVender.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel4.setText("Cerrar");
        PanelVender.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 252, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelVender, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 405, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelVender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_MinimizarMouseClicked

    private void RegresarbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarbtnMouseClicked
        this.regresar();
    }//GEN-LAST:event_RegresarbtnMouseClicked

    private void RegresarbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarbtnMouseEntered
        Regresarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/atras azul.png")));
    }//GEN-LAST:event_RegresarbtnMouseEntered

    private void RegresarbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarbtnMouseExited
        Regresarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/atrasnegro.png")));
    }//GEN-LAST:event_RegresarbtnMouseExited

    private void PanelVenderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelVenderMousePressed
       x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_PanelVenderMousePressed

    private void PanelVenderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelVenderMouseDragged
      
this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_PanelVenderMouseDragged

    private void EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseClicked
        try {
             this.metdb.BorrarProducto(this.txtEliminar.getText());
             this.Errordatosincorrectos.setVisible(false);
             
             
             this.txtEliminar.setText("");
             
        } catch (Exception e) {
            System.out.println("Error en eliminarpanel eliminarmouse"+e);
            this.Errordatosincorrectos.setVisible(true);
        }
      
    }//GEN-LAST:event_EliminarMouseClicked

    private void Cerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cerrar1MouseClicked
        this.regresar();
    }//GEN-LAST:event_Cerrar1MouseClicked

    private void EliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseEntered
        Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/delete (2).png"))); // NOI18N
       
    }//GEN-LAST:event_EliminarMouseEntered

    private void EliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseExited
       Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/delete (3).png"))); // NOI18N
       
    }//GEN-LAST:event_EliminarMouseExited

    private void Cerrar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cerrar1MouseEntered
       Cerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/cerrar-sesion (1).png"))); // NOI18N
        
    }//GEN-LAST:event_Cerrar1MouseEntered

    private void Cerrar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cerrar1MouseExited
       Cerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/cerrar-sesion.png"))); // NOI18N
        
    }//GEN-LAST:event_Cerrar1MouseExited
    public void regresar() {
        Principal principal = new Principal();
        principal.setVisible(true);
        this.dispose();
    }

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
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eliminar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cerrar1;
    private javax.swing.JLabel Eliminar;
    private javax.swing.JLabel Errordatosincorrectos;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JPanel PanelVender;
    private javax.swing.JLabel Regresarbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtEliminar;
    // End of variables declaration//GEN-END:variables
}
