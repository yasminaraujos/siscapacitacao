package aplicacao;

import entidades.Funcionario;
import entidades.Produto;
import entidades.ServidorPublico;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
//        ServidorPublico isabela = new ServidorPublico();
//        isabela.setNome("Isabela");
//        isabela.setCargo("Auditor");
//        isabela.setOrgao("ANVISA");
//        isabela.setLotacao("Brasilia");
//        isabela.setEmail("isabela@gmail.");
//        isabela.setSalario(2500);
//
//        System.out.println(isabela.calcularSalarioHorasExtras(5.60, 10 , 10));
//        System.out.println("Servidor: "+ isabela.getNome());
//        System.out.printf("Salário servidor: R$%.2f ",isabela.getHorasExtras());
//
//        ServidorPublico joao = new ServidorPublico();
//        ServidorPublico maria = new ServidorPublico(123,"Maria");
//        System.out.println("Servidor: "+ maria.getNome());
//        ServidorPublico taylor = new ServidorPublico(134, "Taylor", "Professora");
//        System.out.println("Servidor: "+ taylor.getNome());
//        Produto produto = new Produto();
        Funcionario funcionario = new Funcionario();
        Scanner leia = new Scanner(System.in);
        System.out.print("Nome funcionário: ");
        funcionario.setNome(leia.nextLine());
        System.out.print("Salário Bruto: ");
        funcionario.setSalarioBruto(leia.nextDouble());
        System.out.print("Imposto: ");
        funcionario.setImposto(leia.nextDouble());
        System.out.println("Funcionário: "+funcionario.toString());
        System.out.print("Qual a porcentagem de aumento do salário? ");
        double porcentagem = leia.nextDouble();
        funcionario.aumentarSalario(porcentagem);
        System.out.println("Dados atualizados: "+funcionario.toString());
    }
}
