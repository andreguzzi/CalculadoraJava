/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.andre.javacalculadora.visao;

import br.com.andre.javacalculadora.controle.CalculadoraController;
import br.com.andre.javacalculadora.enums.EnumOperacao;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 *
 * @author Andre
 */
public class JFrTela extends javax.swing.JFrame {
    
    private CalculadoraController calculadoraController;
    
    private EnumOperacao ultimaOperacao;

    /**
     * Creates new form jfTela
     */
    public JFrTela() {
        initComponents();
        calculadoraController = new CalculadoraController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfValor = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        limpar = new javax.swing.JButton();
        trocasinal = new javax.swing.JButton();
        porcentagem = new javax.swing.JButton();
        dividir = new javax.swing.JButton();
        numero7 = new javax.swing.JButton();
        numero8 = new javax.swing.JButton();
        numero9 = new javax.swing.JButton();
        vezes = new javax.swing.JButton();
        numero4 = new javax.swing.JButton();
        numero5 = new javax.swing.JButton();
        numero6 = new javax.swing.JButton();
        menos = new javax.swing.JButton();
        numero1 = new javax.swing.JButton();
        numero2 = new javax.swing.JButton();
        numero3 = new javax.swing.JButton();
        mais = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        ponto = new javax.swing.JButton();
        fechar = new javax.swing.JButton();
        igual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tfValor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfValor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfValor.setText("0,00");
        tfValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValorActionPerformed(evt);
            }
        });

        jPanel2.setLayout(new java.awt.GridLayout(5, 4));

        limpar.setText("AC");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });
        jPanel2.add(limpar);

        trocasinal.setText("+/-");
        jPanel2.add(trocasinal);

        porcentagem.setText("%");
        jPanel2.add(porcentagem);

        dividir.setText("/");
        dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividirActionPerformed(evt);
            }
        });
        jPanel2.add(dividir);

        numero7.setText("7");
        numero7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero7ActionPerformed(evt);
            }
        });
        jPanel2.add(numero7);

        numero8.setText("8");
        numero8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero8ActionPerformed(evt);
            }
        });
        jPanel2.add(numero8);

        numero9.setText("9");
        numero9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero9ActionPerformed(evt);
            }
        });
        jPanel2.add(numero9);

        vezes.setText("*");
        vezes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vezesActionPerformed(evt);
            }
        });
        jPanel2.add(vezes);

        numero4.setText("4");
        numero4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero4ActionPerformed(evt);
            }
        });
        jPanel2.add(numero4);

        numero5.setText("5");
        numero5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero5ActionPerformed(evt);
            }
        });
        jPanel2.add(numero5);

        numero6.setText("6");
        numero6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero6ActionPerformed(evt);
            }
        });
        jPanel2.add(numero6);

        menos.setText("-");
        menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosActionPerformed(evt);
            }
        });
        jPanel2.add(menos);

        numero1.setText("1");
        numero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero1ActionPerformed(evt);
            }
        });
        jPanel2.add(numero1);

        numero2.setText("2");
        numero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero2ActionPerformed(evt);
            }
        });
        jPanel2.add(numero2);

        numero3.setText("3");
        numero3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero3ActionPerformed(evt);
            }
        });
        jPanel2.add(numero3);

        mais.setText("+");
        mais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maisActionPerformed(evt);
            }
        });
        jPanel2.add(mais);

        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });
        jPanel2.add(zero);

        ponto.setText(",");
        ponto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pontoActionPerformed(evt);
            }
        });
        jPanel2.add(ponto);

        fechar.setText("Fechar");
        fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharActionPerformed(evt);
            }
        });
        jPanel2.add(fechar);

        igual.setText("=");
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });
        jPanel2.add(igual);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfValor))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfValorActionPerformed

    private void numero7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero7ActionPerformed
       digita("7");
    }//GEN-LAST:event_numero7ActionPerformed

    private void numero8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero8ActionPerformed
          digita("8");
    }//GEN-LAST:event_numero8ActionPerformed

    private void numero9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero9ActionPerformed
          digita("9");
    }//GEN-LAST:event_numero9ActionPerformed

    private void numero4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero4ActionPerformed
         digita("4");
    }//GEN-LAST:event_numero4ActionPerformed

    private void numero5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero5ActionPerformed
         digita("5");
    }//GEN-LAST:event_numero5ActionPerformed

    private void numero6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero6ActionPerformed
          digita("6");
    }//GEN-LAST:event_numero6ActionPerformed

    private void numero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero1ActionPerformed
          digita("1");
    }//GEN-LAST:event_numero1ActionPerformed

    private void numero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero2ActionPerformed
         digita("2");
    }//GEN-LAST:event_numero2ActionPerformed

    private void numero3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero3ActionPerformed
      digita("3");
    }//GEN-LAST:event_numero3ActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
          digita("0");
    }//GEN-LAST:event_zeroActionPerformed

    private void pontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pontoActionPerformed
         digita(",");
    }//GEN-LAST:event_pontoActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
       limpa();
       calculadoraController.zerar();
    }//GEN-LAST:event_limparActionPerformed

    private void fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_fecharActionPerformed

    private void maisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maisActionPerformed
        calculadoraController.realizaOperacao(EnumOperacao.SOMA, stringToDouble(tfValor.getText()));
        ultimaOperacao = EnumOperacao.SOMA;
        limpa();
    }//GEN-LAST:event_maisActionPerformed

    private void menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosActionPerformed
      calculadoraController.realizaOperacao(EnumOperacao.SUBTRACAO, stringToDouble(tfValor.getText()));
      ultimaOperacao = EnumOperacao.SUBTRACAO;
       limpa();
    }//GEN-LAST:event_menosActionPerformed

    private void vezesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vezesActionPerformed
        calculadoraController.realizaOperacao(EnumOperacao.MULTIPLICACAO, stringToDouble(tfValor.getText()));
        ultimaOperacao = EnumOperacao.DIVISAO;
         limpa();
    }//GEN-LAST:event_vezesActionPerformed

    private void dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividirActionPerformed
       calculadoraController.realizaOperacao(EnumOperacao.DIVISAO, stringToDouble(tfValor.getText()));
       ultimaOperacao = EnumOperacao.MULTIPLICACAO;
        limpa();
    }//GEN-LAST:event_dividirActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        calculadoraController.realizaOperacao(ultimaOperacao, stringToDouble(tfValor.getText()));
        tfValor.setText(DoubleToString(calculadoraController.getTotal()));
    }//GEN-LAST:event_igualActionPerformed

    private String DoubleToString(Double numero){
        if (numero != null){
            DecimalFormat formato = new DecimalFormat("##,###,###,##0.00", new DecimalFormatSymbols(new Locale("pt","BR")));
            formato.setParseBigDecimal(true);
            return formato.format(numero);
        }
        return "";
    }
            
    private Double stringToDouble(String numero){
        NumberFormat nf = NumberFormat.getInstance();
        Double dv = 0.0;
        try{
            dv = nf.parse(numero).doubleValue();
        } catch (ParseException ex){
            
        }
        return dv;
    }
    
    private void limpa(){
        tfValor.setText("0,00");
    }
    
    private void digita (String caractere){
        if (tfValor.getText().equals("0,00")){
            tfValor.setText(caractere);
        } else {
            if (caractere.equals(",") && tfValor.getText().contains(",")){
            } else {
                tfValor.setText(tfValor.getText().concat(caractere));
            }
        }
        
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dividir;
    private javax.swing.JButton fechar;
    private javax.swing.JButton igual;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton limpar;
    private javax.swing.JButton mais;
    private javax.swing.JButton menos;
    private javax.swing.JButton numero1;
    private javax.swing.JButton numero2;
    private javax.swing.JButton numero3;
    private javax.swing.JButton numero4;
    private javax.swing.JButton numero5;
    private javax.swing.JButton numero6;
    private javax.swing.JButton numero7;
    private javax.swing.JButton numero8;
    private javax.swing.JButton numero9;
    private javax.swing.JButton ponto;
    private javax.swing.JButton porcentagem;
    private javax.swing.JTextField tfValor;
    private javax.swing.JButton trocasinal;
    private javax.swing.JButton vezes;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
