/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class TelaInicial extends javax.swing.JFrame {
    public TelaInicial() {
        initComponents();
    }
    //Variaveis para funcionamento do sistema
       int minTemp = 1001;
       int maxTemp = 0;
       int qMin = -1;
       int qMax = -1; 
       int NJogo = 1;
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        lbMaiorP = new javax.swing.JLabel();
        lbMaxP = new javax.swing.JLabel();
        lbMenorP = new javax.swing.JLabel();
        lbMinP = new javax.swing.JLabel();
        lbQuebraMaior = new javax.swing.JLabel();
        lbQmax = new javax.swing.JLabel();
        lbQuebraMenor = new javax.swing.JLabel();
        lbQmin = new javax.swing.JLabel();
        btnIncluir = new javax.swing.JButton();
        txtPontuacao = new javax.swing.JTextField();
        lbPlacar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jogo", "Placar", "Mínimo da temporada", "Máximo da temporada", "Quebra recorde min.", "Quebra recode max."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 48, Short.MAX_VALUE))
        );

        lbMaiorP.setText("Maior Pontuação:");

        lbMaxP.setText("0");

        lbMenorP.setText("Menor Pontução:");

        lbMinP.setText("0");

        lbQuebraMaior.setText("Quebras de recordes máximo:");

        lbQmax.setText("0");

        lbQuebraMenor.setText("Quebras de recordes mínimo:");

        lbQmin.setText("0");

        btnIncluir.setText("Adicionar na tabela");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        lbPlacar.setText("Placar do Jogo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIncluir)
                    .addComponent(lbPlacar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbMaiorP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbMaxP))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbMenorP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbMinP))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbQuebraMaior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbQmax))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbQuebraMenor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbQmin))
                    .addComponent(txtPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbPlacar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIncluir)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaiorP)
                    .addComponent(lbMaxP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMenorP)
                    .addComponent(lbMinP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbQuebraMaior)
                    .addComponent(lbQmax))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbQuebraMenor)
                    .addComponent(lbQmin))
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        //Busca de modelo de tabela
        DefaultTableModel dtmTabela = (DefaultTableModel) tabela.getModel();
        //Condição para realizar cálculo de pontuação mínima da temporada e quantidade de quebras de recordes mínimos.
        if ( Integer.parseInt(txtPontuacao.getText()) < minTemp) { 
           minTemp = Integer.parseInt(txtPontuacao.getText());
           qMin = qMin + 1;
        }
        //Condição para realizar cálculo de pontuação máxima da temporada e quantidade de quebras de recordes máximos.
        if ( Integer.parseInt(txtPontuacao.getText()) > maxTemp) {
            maxTemp = Integer.parseInt(txtPontuacao.getText());
            qMax = qMax + 1;   
        }
        //Array usado para receber dados das variáveis e preencher na tabela
        Object[] tabela = {NJogo, txtPontuacao.getText(), minTemp, maxTemp, qMin, qMax};
        //Adiciona dados na tabela
        dtmTabela.addRow(tabela);
        //calculo para enumeração de jogos
        NJogo = NJogo + 1;
        //Consulta da pontuação máxima da temporada
        lbMaxP.setText(Integer.toString(maxTemp));
        //Consulta de quantidades de quebras de recordes máximos 
        lbQmax.setText(Integer.toString(qMax));
        //Consulta de pontuação mínima da temporada
        lbMinP.setText(Integer.toString(minTemp));
        //Consulta de quantidades de quebras de recordes mínimos
        lbQmin.setText(Integer.toString(qMin));
       
    }//GEN-LAST:event_btnIncluirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIncluir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbMaiorP;
    private javax.swing.JLabel lbMaxP;
    private javax.swing.JLabel lbMenorP;
    private javax.swing.JLabel lbMinP;
    private javax.swing.JLabel lbPlacar;
    private javax.swing.JLabel lbQmax;
    private javax.swing.JLabel lbQmin;
    private javax.swing.JLabel lbQuebraMaior;
    private javax.swing.JLabel lbQuebraMenor;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtPontuacao;
    // End of variables declaration//GEN-END:variables
}
