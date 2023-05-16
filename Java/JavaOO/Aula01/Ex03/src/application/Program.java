package application;

import entities.Funcionario;

public class Program {
    public static void main(String[] args) {

        Funcionario gerente = new Funcionario("Maicon", 4000);
        double gerenteSalario = gerente.calcularSalario(10,15);
        System.out.println("O salário do gerente: " +  gerenteSalario);

        Funcionario desenvolvedor = new Funcionario("Iago", 2500);
        double desenvolvedorSalario = desenvolvedor.calcularSalario(0, 10);
        System.out.println("O salário do desenvolvedor: " + desenvolvedorSalario);
    }
}
