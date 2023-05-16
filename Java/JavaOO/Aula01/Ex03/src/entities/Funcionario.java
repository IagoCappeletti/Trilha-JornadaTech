package entities;

public class Funcionario {

    public String nome;
    public double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularSalario(double bonus, double desconto){
        double salarioTotal = salario + (salario * bonus / 100);
        salarioTotal -= salarioTotal * desconto / 100;
        return salarioTotal;
    }
}
