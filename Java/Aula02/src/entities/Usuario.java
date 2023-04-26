package entities;

public class Usuario {

   private String nome ;
   private Integer idade;
   private String cidade;
   private  String estado;

   public Usuario(String nome, Integer idade, String cidade, String estado) {
      this.nome = nome;
      this.idade = idade;
      this.cidade = cidade;
      this.estado = estado;
   }

   public String getNome() {
      return nome;
   }

   public Integer getIdade() {
      return idade;
   }

   public String getCidade() {
      return cidade;
   }

   public String getEstado() {
      return estado;
   }

   @Override
   public String toString() {
      return "Olá meu nome é " + nome + ", e tenho " + idade +
              " anos, moro na cidade de " + cidade + ", situada no estado " +
               estado + "." + "\n==============================================";
   }
}
