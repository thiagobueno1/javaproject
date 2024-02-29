/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avaliativoo;

/**
 *
 * @author Usuario
 */
public class Medico extends Pessoa {
    private String numeroCarteiraTrabalho;
    private String numeroPIS;
    private String crm;
    private String especializacao;

    public Medico(String numeroCarteiraTrabalho, String numeroPIS, String crm, String especializacao, String cpf, String nome, String endereco, String telefone) {
        super(cpf, nome, endereco, telefone);
        this.numeroCarteiraTrabalho = numeroCarteiraTrabalho;
        this.numeroPIS = numeroPIS;
        this.crm = crm;
        this.especializacao = especializacao;
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

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    @Override
   public double[] calcularSalario() { 
     double salarioBase = 10000;
     double descontoImposto = salarioBase * 0.25;
     double salarioLiquido = salarioBase - descontoImposto;
     return new double[]{salarioBase, salarioLiquido}; 
}
}
