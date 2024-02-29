/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avaliativoo;

/**
 *
 * @author Usuario
 */
public class Enfermeiro extends Pessoa {
    private String numeroCarteriraTrabalho;
    private String numeroPIS;
    private String numeroCoren;

    public Enfermeiro(String numeroCarteriraTrabalho, String numeroPIS, String numeroCoren, String cpf, String nome, String endereco, String telefone) {
        super(cpf, nome, endereco, telefone);
        this.numeroCarteriraTrabalho = numeroCarteriraTrabalho;
        this.numeroPIS = numeroPIS;
        this.numeroCoren = numeroCoren;
    }

    public String getNumeroCarteriraTrabalho() {
        return numeroCarteriraTrabalho;
    }

    public void setNumeroCarteriraTrabalho(String numeroCarteriraTrabalho) {
        this.numeroCarteriraTrabalho = numeroCarteriraTrabalho;
    }

    public String getNumeroPIS() {
        return numeroPIS;
    }

    public void setNumeroPIS(String numeroPIS) {
        this.numeroPIS = numeroPIS;
    }

    public String getNumeroCoren() {
        return numeroCoren;
    }

    public void setNumeroCoren(String numeroCoren) {
        this.numeroCoren = numeroCoren;
    }
    @Override
    public double[] calcularSalario(){
     double salarioBase = 4000;
     double descontoImposto = salarioBase * 0.20;
     double salarioLiquido = salarioBase - descontoImposto;
     return new double[]{salarioBase, salarioLiquido};
    }
    
}
