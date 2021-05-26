/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.andre.javacalculadora.controle;

import br.com.andre.javacalculadora.enums.EnumOperacao;

/**
 *
 * @author Andre
 */
public class CalculadoraController {
    private Double total;
    
        
    public CalculadoraController(){
        total =0.0;
    }  
            
    
    public Double realizaOperacao(EnumOperacao operacao, Double valor){
        if (operacao.equals(EnumOperacao.SOMA)){
            total += valor;
        }else if (operacao.equals(EnumOperacao.SUBTRACAO)){
            total -= valor;
        }else if (operacao.equals(EnumOperacao.DIVISAO)){
            total /= valor;
        }else if (operacao.equals(EnumOperacao.MULTIPLICACAO)){
            total *= valor;
        }
        return total;
    }
     public Double getTotal(){
         return this.total;
    }
     
     public void zerar(){
         total = 0.0;
     }
}
