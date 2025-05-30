package aplicacao;

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
        Produto produto = new Produto();
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite as informações do produto:");
        System.out.println("Nome: ");
        produto.setNome(leia.next());
        System.out.println("Preço: ");
        produto.setPrice(leia.nextDouble());
        System.out.println("Quantidade em estoque: ");
        produto.setQuantly(leia.nextInt());

        System.out.println("Informações do produto: "+produto.getNome());


    }
}
