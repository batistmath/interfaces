package classes;

public class Funcionario extends Pessoa {
    private double salarioBase;

    public Funcionario(String nome, int idade, String cpf, String endereco, String telefone, double salarioBase) {
        super(nome, idade, cpf, endereco, telefone);
        this.salarioBase = salarioBase;
    }
    @Override
    public void trabalhar(){
        System.out.println("Trabalhando...");
    }
    @Override
    public void estudar(){
        System.out.println("Estudando...");
    }
    
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    


}
