public class ProdutoSemPreco {
    private String nome;
    private String modelo;

    public ProdutoSemPreco(String nome, String modelo) {
        this.nome = nome;
        this.modelo = modelo;
    }

    public String getNome() {
        return nome;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return getNome() + " : " + getModelo();
    }
}
