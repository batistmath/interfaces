package classes;
import interfaces.Fornecedor;
import interfaces.Autenticavel;
import interfaces.Departamento;

public class Gerente extends Funcionario implements Fornecedor, Departamento, Autenticavel {
    private int id;
    private String nome;
    
    public Gerente(String nome, int idade, String cpf, String endereco, String telefone, double salarioBase, int id,
            String nome2) {
        super(nome, idade, cpf, endereco, telefone, salarioBase);
        this.id = id;
        nome = nome2;
    }

    @Override
    public void login(){
        System.out.println("Login realizado!");
    }
    @Override
    public void criaDepartamento(){
        System.out.println("Departamento criado!");
    }
    @Override
    public void CadastraFuncionario(){
        System.out.println("Funcionario cadastrado!");
    }
    @Override
    public void realizarPedido(){
        System.out.println("Pedido realizado!");
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
