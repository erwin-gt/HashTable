/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.source.app;
import Model.Asistentes;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Asus
 */
public class frmIngreso extends javax.swing.JFrame {
    
    
    LinkedList<Asistentes> as = new LinkedList<>();
    frmListar list = new frmListar();
   
    public frmIngreso() {
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

        jLabel1 = new javax.swing.JLabel();
        jtxtName = new javax.swing.JTextField();
        jtxtNit = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtAddress = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jdtFecha = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingreso de Asistentes");

        jLabel2.setText("NIT");

        jLabel3.setText("Nombre");

        jLabel4.setText("Fecha Nacimiento");

        jLabel5.setText("Direccion");

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jdtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jtxtNit)
                            .addComponent(jtxtName)
                            .addComponent(jtxtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jtxtNit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        Asistentes a = new Asistentes();
        AppMain p = new AppMain();
        
        
        a.setMax(as.size());
        a.setNit(Integer.parseInt(jtxtNit.getText()));
        a.setNombre(jtxtName.getText()); 
        SimpleDateFormat fecha = new SimpleDateFormat("yyyy-MM-dd");
        fecha.format(jdtFecha.getDate());
        //a.setFecha(String.valueOf(fecha));
        a.setFecha(String.valueOf(jdtFecha.getDate()));
        a.setDireccion(jtxtAddress.getText());
       //p.GuardarCSV();
        
        as.add(a);
        
        jtxtNit.setText("");
        jtxtName.setText("");
        //jdtFecha.setDateFormatString("");
        jtxtAddress.setText("");
        
        
        cargarArchivo();
        //llenarDatos();
        guardar();
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmIngreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator2;
    private com.toedter.calendar.JDateChooser jdtFecha;
    private javax.swing.JTextField jtxtAddress;
    private javax.swing.JTextField jtxtName;
    private javax.swing.JTextField jtxtNit;
    // End of variables declaration//GEN-END:variables


    public void llenarDatos(){ 
        frmListar ls = new frmListar();
        DefaultTableModel tb = new DefaultTableModel(new String[]{"HASH","NIT","Nombre","Fecha Nacimiento","Direccion"},as.size());
        Asistentes s = new Asistentes();
        
        ls.jtDatos.setModel(tb);
        
        TableModel tm = ls.jtDatos.getModel();
        
        for(int i=0; i<as.size() ;i++){
            Asistentes a = as.get(i);
            tm.setValueAt(a.getNit(), i, 0);
            tm.setValueAt(a.getNombre(), i, 1);
            tm.setValueAt(a.getFecha(), i, 2);
            tm.setValueAt(a.getDireccion(), i, 3 );

        }
        
    }
    public void cargarArchivo(){
        
        FileReader fr = null;
        BufferedReader br = null;
        
        try{
            fr = new FileReader("C:\\TEMP\\prueba.csv");
            br = new BufferedReader(fr);
            
            String line;
            
            while ((line=br.readLine())!=null){
            Asistentes a = new Asistentes();
            String arreglo [] = line.split(",");
            if(arreglo.length<=4){
                a.setNit(Integer.parseInt(arreglo[0]));
                a.setNombre(arreglo[1]);
                a.setFecha(arreglo[2]);
                a.setDireccion(arreglo[3]);
                as.add(a);
            }
        }
            llenarDatos();
        } catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{
                if(fr!= null){
                    fr.close();
                }
            }catch(Exception e){
                e.printStackTrace();
                }
        }
        
    }
    
    public void guardar(){
        FileWriter csv = null;
        PrintWriter pw = null;
        
        try{
            csv = new FileWriter("C:\\TEMP\\prueba.csv");
            pw = new PrintWriter(csv);
            
            for(Asistentes a: as){
                String line = a.getNit()+","+a.getNombre()+","+a.getFecha()+","+a.getDireccion();
                pw.println(line);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            try{
                if(csv!=null){
                    csv.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
    }

}
