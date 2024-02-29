package com.mycompany.avaliativoo;

import java.util.ArrayList;

/**
 *
 * @author sp300lab
 */
public class Avaliativoo {

    public static void main(String[] args) {
    ArrayList<Pessoa> funcionarios = new ArrayList<>();
    funcionarios.add(new Motorista("13625678843","346","H234","12-12-2030","13630467512","Cleytin do pneu","Rua do BAR","19943215632"));
    funcionarios.add(new Medico("54354","23","11343","Urologista","13630506640","Doutor Thiaguin","Rua das orquideas","35992526453"));
    funcionarios.add(new Enfermeiro("GY24","229","674","34567432689","Patricia Abravanel","Rua dos pinheiros","19965437654"));
  
    imprimirFolhaPagamento(funcionarios);
    
    }
    public static void imprimirFolhaPagamento(ArrayList<Pessoa> funcionarios){
        System.out.println("Folha de Pagamento: \n");
        for(Pessoa funcionario : funcionarios){
            double[] salarios = funcionario.calcularSalario();
            double salarioBruto = salarios[0];
            double salarioLiquido = salarios[1];
            double desconto = salarioBruto - salarioLiquido;
            
            
            
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("CPF: " + funcionario.getCpf());
            System.out.println("Salario Bruto: " + salarioBruto);
            System.out.println("Desconto: " + desconto);
            System.out.println("Salario Liquido: " + salarioLiquido);
            
             System.out.println();
            
            
            
            
        }
    }
}