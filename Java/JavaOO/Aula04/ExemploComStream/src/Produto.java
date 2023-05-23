public class Produto {
    private String nome;
    private Double preco;
    private String modelo;

    public Produto(String nome, Double preco, String modelo) {
        this.nome = nome;
        this.preco = preco;
        this.modelo = modelo;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public String getModelo() {
        return modelo;
    }
}
