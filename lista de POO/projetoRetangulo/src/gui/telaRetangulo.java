/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;
import classes.Retangulo;
import javax.swing.JOptionPane;
/**
 *
 * @author Computador
 */
public class telaRetangulo extends javax.swing.JFrame {

    /**
     * Creates new form telaRetangulo
     */
    public telaRetangulo() {
        initComponents();
        
        //centraliza a ma tela 
        this.setLocationRelativeTo(null);
        //oculta o butao novo cauculo
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_perimetro = new javax.swing.JLabel();
        jLabel_area = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldComprimento = new javax.swing.JTextField();
        jTextFieldLargura = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaSaida = new javax.swing.JTextArea();
        jButtonCalcular = new javax.swing.JButton();
        jButtonNovoCalculo = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.selection.color1"));
        setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        setType(java.awt.Window.Type.POPUP);

        jLabel_perimetro.setText("Perimetro");

        jLabel_area.setText("Areá");

        jLabel3.setText("saida ");

        jTextFieldComprimento.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldComprimento.setForeground(new java.awt.Color(255, 255, 0));
        jTextFieldComprimento.setCaretColor(new java.awt.Color(153, 0, 0));
        jTextFieldComprimento.setDisabledTextColor(new java.awt.Color(102, 0, 0));

        jTextFieldLargura.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldLargura.setForeground(new java.awt.Color(204, 204, 0));
        jTextFieldLargura.setCaretColor(new java.awt.Color(204, 204, 0));
        jTextFieldLargura.setDisabledTextColor(new java.awt.Color(204, 204, 0));

        jTextAreaSaida.setBackground(new java.awt.Color(0, 0, 0));
        jTextAreaSaida.setColumns(20);
        jTextAreaSaida.setForeground(new java.awt.Color(153, 0, 0));
        jTextAreaSaida.setRows(5);
        jTextAreaSaida.setCaretColor(new java.awt.Color(204, 0, 0));
        jTextAreaSaida.setDisabledTextColor(new java.awt.Color(153, 0, 0));
        jScrollPane1.setViewportView(jTextAreaSaida);

        jButtonCalcular.setText("Gerar resultado");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        jButtonNovoCalculo.setText("novo Cauculo");
        jButtonNovoCalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoCalculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonCalcular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonNovoCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_area, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_perimetro)
                                    .addComponent(jLabel3))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldLargura, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_perimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_area, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLargura, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCalcular)
                    .addComponent(jButtonNovoCalculo))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
      try {
            // Instancia um objeto da classe Retangulo
            Retangulo desenho = new Retangulo();
            
            // Valores dos atributos do objeto
            desenho.setComprimento(Integer.parseInt(jTextFieldComprimento.getText()));
            desenho.setLargura(Integer.parseInt(jTextFieldLargura.getText()));

            // Texto de saída
            jTextAreaSaida.setText(String.format(
                    "DADOS DO RETÂNGULO:\n"
                    + "Comprimento: %d\n"
                    + "Largura: %d\n"
                    + "Perímetro: %d\n"
                    + "Área: %d\n",
                    desenho.getComprimento(),
                    desenho.getLargura(),
                    desenho.calcularPerimetro(),
                    desenho.calcularArea()
            ));
            
            // Desabilita campos
            jTextFieldComprimento.setEnabled(false);
            jTextFieldLargura.setEnabled(false);
            
            // Alterna exibição dos botões
            jButtonCalcular.setVisible(false);
            jButtonNovoCalculo.setVisible(true);
            
            // Move o foco para a área de texto de saída
            jTextAreaSaida.grabFocus();

        } catch (Exception e) {
            // Exibe mensagem em caso de exceção
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Eitalalá", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonCalcularActionPerformed

    private void jButtonNovoCalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoCalculoActionPerformed
       //limpa o conteudo dos campos 
         jTextFieldComprimento.setText("");
        jTextFieldLargura.setText("");
        jTextAreaSaida.setText("");
        
        // Habilita os campos para edição
        jTextFieldComprimento.setEnabled(true);
        jTextFieldLargura.setEnabled(true);
        
        // Alterna a exibição dos botões
        jButtonCalcular.setVisible(true);
        jButtonNovoCalculo.setVisible(false);
        
        // Move o foco para o primeiro campo
        jTextFieldComprimento.grabFocus();
        
        
    }//GEN-LAST:event_jButtonNovoCalculoActionPerformed

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
            java.util.logging.Logger.getLogger(telaRetangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaRetangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaRetangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaRetangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaRetangulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JButton jButtonNovoCalculo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_area;
    private javax.swing.JLabel jLabel_perimetro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextAreaSaida;
    private javax.swing.JTextField jTextFieldComprimento;
    private javax.swing.JTextField jTextFieldLargura;
    // End of variables declaration//GEN-END:variables
}
