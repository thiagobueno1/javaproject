/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avaliativoo;

/**
 *
 * @author Usuario
 */
public class Motorista extends Pessoa {
    private String numeroCarteiraTrabalho;
    private String numeroPIS;
    private String numeroCarteiraHabilitacao;
   

    public Motorista(String numeroCarteiraTrabalho, String numeroPIS, String numeroCarteiraHabilitacao, String dataVencimentoHabilitacao, String cpf, String nome, String endereco, String telefone) {
        super(cpf, nome, endereco, telefone);
        this.numeroCarteiraTrabalho = numeroCarteiraTrabalho;
        this.numeroPIS = numeroPIS;
        this.numeroCarteiraHabilitacao = numeroCarteiraHabilitacao;
        this.dataVencimentoHabilitacao = dataVencimentoHabilitacao;
    }

    public String getNumeroCarteiraTrabalho() {
        return numeroCarteiraTrabalho;
    }

    public void setNumeroCarteiraTrabalho(String numeroCarteiraTrabalho) {
        this.numeroCarteiraTrabalho = numeroCarteiraTrabalho;
    }

    public String getNumeroPIS() {
        return numeroPIS;
    }

    public void setNumeroPIS(String numeroPIS) {
        this.numeroPIS = numeroPIS;
    }

    public String getNumeroCarteiraHabilitacao() {
        return numeroCarteiraHabilitacao;
    }

    public void setNumeroCarteiraHabilitacao(String numeroCarteiraHabilitacao) {
        this.numeroCarteiraHabilitacao = numeroCarteiraHabilitacao;
    }

    public String getDataVencimentoHabilitacao() {
        return dataVencimentoHabilitacao;
    }

    public void setDataVencimentoHabilitacao(String dataVencimentoHabilitacao) {
        this.dataVencimentoHabilitacao = dataVencimentoHabilitacao;
    }
    private String dataVencimentoHabilitacao;

    @Override
    public double[] calcularSalario() {
     double salarioBase = 3000;
     double descontoImposto = salarioBase * 0.15;
     double salarioLiquido = salarioBase - descontoImposto;
     return new double[]{salarioBase, salarioLiquido};
             
     
    }
    
    
}
