/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uricer;

import java.math.BigDecimal;

/**
 *
 * @author aluno
 */
public class CalculaSalario {
    
    public static final String DESENVOLVEDOR = "DESENVOLVEDOR";
    public static final String TESTADOR = "TESTADOR";
    public static final String DBA = "DBA";
    public static final String GERENTE = "GERENTE";
    
    public static final int PORCENTAGEM_20 = 20;
    public static final int PORCENTAGEM_30 = 30;
    public static final int PORCENTAGEM_25 = 25;
    public static final int PORCENTAGEM_15 = 15;
    public static final int PORCENTAGEM_10 = 10;
    
    public BigDecimal getSalario(String cargo, BigDecimal salario){
        int porcento = 0;
        BigDecimal liquido;
        if(cargo.equals(DESENVOLVEDOR)){
            porcento = 100 - getPorcentagem(DESENVOLVEDOR, salario);
        }
        if(cargo.equals(TESTADOR)){
            porcento = 100 - getPorcentagem(TESTADOR, salario);
        }
        if(cargo.equals(DBA)){
            porcento = 100 - getPorcentagem(DBA, salario);
        }
        if(cargo.equals(GERENTE)){
            porcento = 100 - getPorcentagem(GERENTE, salario);
        }
        
        liquido = (salario.multiply(new BigDecimal(porcento))).divide(new BigDecimal(100.00));
        
        return liquido;
    }
    
    public int getPorcentagem(String cargo, BigDecimal salario){
        int percent = 0;
        if(cargo.equals(DESENVOLVEDOR)){
            if(salario.compareTo(new BigDecimal(3000)) >= 0){
                percent = PORCENTAGEM_20;
            } else{
                percent = PORCENTAGEM_10;
            }
        }
        if(cargo.equals(TESTADOR) && cargo.equals(DBA)){
            if(salario.compareTo(new BigDecimal(2000)) >= 0){
                percent = PORCENTAGEM_25;
            } else{
                percent = PORCENTAGEM_15;
            }
        } else{
            if(salario.compareTo(new BigDecimal(5000)) >= 0){
                percent = PORCENTAGEM_30;
            } else{
                percent = PORCENTAGEM_20;
            }
        }
        return percent;
    }
    
}
