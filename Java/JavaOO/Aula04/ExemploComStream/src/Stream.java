import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Celular", 1500.0, "Iphone"));
        produtos.add(new Produto("Notebook", 3000.0, "Apple"));
        produtos.add(new Produto("TV", 2000.0, "LG"));
        produtos.add(new Produto("Fone", 150.0, "Apple"));

        List<ProdutoSemPreco> nomesProdutos = produtos.stream() // fluxo de dados dessa lista
                .filter(produto -> produto.getPreco() > 1000.0) //filtra produtos com preços maior que 1000
                .sorted(Comparator.comparing(Produto::getNome)) //Ordena produtos por nome
                .map((produto) -> {
                    return new ProdutoSemPreco(produto.getNome(), produto.getModelo());
                })
                //mapear apenas os nomes dos produtos
                //recebe um objeto e transforma em outro objeto
                //Map tem função de transformação
                //(Um objeto) -> (outro objeto)
                .toList();

        //imprimir resultados
        for (ProdutoSemPreco nome :  nomesProdutos) {
            System.out.println(nome);
        }

    }
}
