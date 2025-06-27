package entidades;

public class Produto {
    private String nome;
    private double price;
    private int quantity;

    public Produto(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double calcularValoorEstoque(){
        double value;
        value = price * quantity;
        return (value);
    }
    public void adicionarProdutos(int quantidade){
        this.quantity += quantidade;
    }
    public void removerProdutos(int quantidade){
        this.quantity -= quantidade;
    }
    public String toString(){
        return nome
                +", $"
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", calcularValoorEstoque());
    }
}
