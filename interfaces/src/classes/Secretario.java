package classes;

public class Secretario extends Funcionario {
    public Secretario(String nome, int idade, String cpf, String endereco, String telefone, double salarioBase){
        super(nome, idade, cpf, endereco, telefone, salarioBase);
    }
    public void calcSalario(){
    System.out.println("Salario Calculado!");
}
}
