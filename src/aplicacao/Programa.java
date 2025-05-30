package aplicacao;

import entidades.ServidorPublico;

import java.sql.SQLOutput;

public class Programa {
    public static void main(String[] args) {
        ServidorPublico isabela = new ServidorPublico();
        isabela.setNome("Isabela");
        isabela.setCargo("Auditor");
        isabela.setOrgao("ANVISA");
        isabela.setLotacao("Brasilia");
        isabela.setEmail("isabela@gmail.");
        isabela.setSalario(2500);

        System.out.println(isabela.calcularSalarioHorasExtras(5.60, 10 , 10));
        System.out.println("Servidor: "+ isabela.getNome());
        System.out.printf("Salário servidor: R$%.2f ",isabela.getHorasExtras());

    }
}
