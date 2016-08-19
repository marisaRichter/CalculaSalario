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
public class Funcionario {
    private String nome;
    private String email;
    private BigDecimal salarioBase;
    private String cargo;
    private BigDecimal salarioLiquido;

    public Funcionario(String nome, String email, BigDecimal salarioBase, String cargo) {
        this.nome = nome;
        this.email = email;
        this.salarioBase = salarioBase;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigDecimal getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(BigDecimal salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public BigDecimal getSalarioLiquido() {
        CalculaSalario liquido = new CalculaSalario();
        salarioLiquido = liquido.getSalario(cargo, salarioBase);
        return salarioLiquido;
    }

    public void setSalarioLiquido() {
        
    }
    
    
    
    
}
