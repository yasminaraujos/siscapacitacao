package entidades;

public class Funcionario {
    private String nome;
    private double salarioBruto;
    private double imposto;
    public Funcionario(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    public double calcularSalarioLiquido(){
        double salarioLiquido;
        salarioLiquido = salarioBruto - imposto;
        return salarioLiquido;
    }
    public String toString(){
        return nome
                +", R$"
                + String.format("%.2f", calcularSalarioLiquido());
    }
    public void aumentarSalario(double porcentagem){
        double aumento = salarioBruto * (porcentagem/100);
        salarioBruto += aumento;
        calcularSalarioLiquido();
    }
}
