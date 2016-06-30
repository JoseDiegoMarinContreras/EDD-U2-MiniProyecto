
import java.awt.Color;
import java.awt.Point;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JoseSantiago
 */
public class Ventana extends javax.swing.JFrame {
private Matriz m;
private final String indicacion="Para hacer la matriz cuentas\ncon 2 opciones.\n1.- Presionas al botón de\n" 
                               +"generar matriz, y especifique\nlas filas y columnas.\n2.- Hacer la matriz de manera\n"
                               +"manual, tecleando algo así.\nEjemplo:\n[4][1]\n[2][3]\n"
                               +"Solo debes escribir los corchetes\ny entre ellos el numero,\nnada más y nada menos.";
    /**
     * Creates new form Ventana1
     */
    public Ventana() {
        initComponents();
        setResizable(false);
        txtAMatriz.setText(indicacion);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDInvertida = new javax.swing.JButton();
        lblFilas = new javax.swing.JLabel();
        lblColumnas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAMatriz = new javax.swing.JTextArea();
        txtColumnas = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        txtResultados = new javax.swing.JTextField();
        txtFilas = new javax.swing.JTextField();
        btnSumar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnDiagonal = new javax.swing.JButton();
        btnGenerar = new javax.swing.JButton();
        txtValor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnDInvertida.setText("Diagonal invertida.");
        btnDInvertida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDInvertidaMouseClicked(evt);
            }
        });
        btnDInvertida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDInvertidaActionPerformed(evt);
            }
        });

        lblFilas.setText("Filas.");

        lblColumnas.setText("Columnas.");

        txtAMatriz.setColumns(20);
        txtAMatriz.setForeground(new java.awt.Color(153, 153, 153));
        txtAMatriz.setRows(5);
        txtAMatriz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAMatrizMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txtAMatriz);

        txtColumnas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColumnasActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Vijaya", 0, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(153, 0, 0));
        lblTitulo.setText("Bienvenido.");

        txtResultados.setEnabled(false);
        txtResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadosActionPerformed(evt);
            }
        });

        txtFilas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFilasActionPerformed(evt);
            }
        });

        btnSumar.setText("Sumar Digitos.");
        btnSumar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSumarMouseClicked(evt);
            }
        });

        btnBuscar.setText("Buscar Valor.");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        btnDiagonal.setText("Diagonal.");
        btnDiagonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDiagonalMouseClicked(evt);
            }
        });
        btnDiagonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagonalActionPerformed(evt);
            }
        });

        btnGenerar.setText("Generar.");
        btnGenerar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenerarMouseClicked(evt);
            }
        });

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGenerar)
                                .addGap(56, 56, 56)
                                .addComponent(lblFilas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFilas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(lblColumnas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnDiagonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDInvertida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtValor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnGenerar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFilas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFilas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDiagonal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDInvertida))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSumar)
                    .addComponent(txtResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadosActionPerformed

    private void txtAMatrizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAMatrizMouseClicked
    if(txtAMatriz.getText().equals(indicacion)){
            txtAMatriz.setText("");
            txtAMatriz.setForeground(Color.BLACK);}
    }//GEN-LAST:event_txtAMatrizMouseClicked

    private void btnDInvertidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDInvertidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDInvertidaActionPerformed

    private void btnDiagonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagonalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDiagonalActionPerformed

    private void btnGenerarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarMouseClicked
        int f,c;
        try{f=Integer.parseInt(txtFilas.getText());
            c=Integer.parseInt(txtColumnas.getText());
            txtAMatriz.setText("");
            txtAMatriz.setForeground(Color.BLACK);
            for(int y=0;y<f;y++){
                for(int x=0; x<c;x++)
                    {txtAMatriz.setText(txtAMatriz.getText()+" ["+(int)(Math.random()*100)+"] ");}
                    txtAMatriz.setText(txtAMatriz.getText()+"\n");
                    }
                    txtAMatriz.setText(txtAMatriz.getText().substring(0,txtAMatriz.getText().length()-2));
        }catch(NumberFormatException err){JOptionPane.showMessageDialog(this,"Puso letras envés de numeros o de plano nada.");}
    }//GEN-LAST:event_btnGenerarMouseClicked

    private void txtColumnasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColumnasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColumnasActionPerformed

    private void txtFilasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFilasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFilasActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void btnSumarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSumarMouseClicked
        try{
            matriz();
            if(m==null){JOptionPane.showMessageDialog(this,"No puedes sumar.");}
            txtResultados.setText("El resultado de la suma es: "+m.suma(0, 0));
        }catch(NumberFormatException err){JOptionPane.showMessageDialog(this,"Hay cracteres direntes a [...] en la matriz.");}
        catch(NullPointerException|StringIndexOutOfBoundsException err){}
    }//GEN-LAST:event_btnSumarMouseClicked

    private void btnDInvertidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDInvertidaMouseClicked
        try{
            matriz();
            ArrayList<Integer>t=m.diagonal(-1);
            if(t==null){JOptionPane.showMessageDialog(this,"Debe ser cuadrada."); return;}
            txtResultados.setText("Diagonal Invert.: "+t.toString());
        }catch(NumberFormatException |NullPointerException|StringIndexOutOfBoundsException err)
        {JOptionPane.showMessageDialog(this,"Esto no es una matriz.");}   
    }//GEN-LAST:event_btnDInvertidaMouseClicked

    private void btnDiagonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDiagonalMouseClicked
        try{
            matriz();
            ArrayList<Integer>t=m.diagonal(1);
            if(t==null){JOptionPane.showMessageDialog(this,"Debe ser cuadrada."); return;}
            txtResultados.setText("Diagonal: "+t.toString());
        }catch(NumberFormatException |NullPointerException|StringIndexOutOfBoundsException err)
        {JOptionPane.showMessageDialog(this,"Esto no es una matriz.");}
    }//GEN-LAST:event_btnDiagonalMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        if(txtValor.getText().equals("")){JOptionPane.showMessageDialog(this, "Esta vacio la casilla."); return;}
        try{
            matriz();
            ArrayList<Point>t=m.busqueda(Integer.parseInt(txtValor.getText()));
            if(t.isEmpty()){JOptionPane.showMessageDialog(this,"No hay nigun valor."); return;}
            txtResultados.setText("Se encontro en: "+puntos(t));
        }catch(NullPointerException|StringIndexOutOfBoundsException err)
        {JOptionPane.showMessageDialog(this,"Esto no es una matriz.");}
        catch(NumberFormatException err){ JOptionPane.showMessageDialog(this,"Hay letras en vez de numeros.");}
    }//GEN-LAST:event_btnBuscarMouseClicked
    
    private String puntos(ArrayList<Point> t){
        String r="";
        for(int i=0;  i<t.size(); i++){
            r+="["+t.get(i).x+","+t.get(i).y+"] ";
        }
        return r;
    }
    
    private void matriz(){
            int f,c;
            int [][] tem=generarMatriz(txtAMatriz.getText());
            if(tem == null){m=null; return;}
            f=Integer.parseInt(txtFilas.getText());
            c=Integer.parseInt(txtColumnas.getText());
            m=new Matriz(tem,f,c);
    }
    
    private int[][] generarMatriz(String ar){
        if(ar.equals("")){JOptionPane.showMessageDialog(this,"No hay nada en el textArea"); return null;}
        ar=ar.replaceAll(" ","");
        List<String>f = Arrays.asList(ar.split("\n")); 
        ArrayList<List<String>> c= new ArrayList<>();
        for(int i=0; i<f.size();i++){
            c.add(Arrays.asList(f.get(i).split("]")));
            if(i>0 && c.get(i-1).size() != c.get(i).size()){
                return null;
            }
        }
        int [][]m=new int[c.size()][c.get(0).size()];
        for(int y=0;y<c.size();y++){
            for(int x=0; x<c.get(y).size(); x++){
             m[y][x]=Integer.parseInt(c.get(y).get(x).substring(1, c.get(y).get(x).length()));
            }
        }
        txtFilas.setText(c.size()+"");
        txtColumnas.setText(c.get(0).size()+"");
         return m;       
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDInvertida;
    private javax.swing.JButton btnDiagonal;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnSumar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblColumnas;
    private javax.swing.JLabel lblFilas;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txtAMatriz;
    private javax.swing.JTextField txtColumnas;
    private javax.swing.JTextField txtFilas;
    private javax.swing.JTextField txtResultados;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}