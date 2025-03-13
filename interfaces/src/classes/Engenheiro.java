package classes;
import interfaces.Fornecedor;

public class Engenheiro extends Funcionario implements Fornecedor {
    private int id;
    private String nome;
    private String crea;
    private String nivel;
    
    public Engenheiro(String nome, int idade, String cpf, String endereco, String telefone, double salarioBase, int id,
            String nome2, String crea, String nivel) {
        super(nome, idade, cpf, endereco, telefone, salarioBase);
        this.id = id;
        nome = nome2;
        this.crea = crea;
        this.nivel = nivel;
    }

    @Override
    public void realizarPedido(){
        System.out.println("Pedido realizado!");
    }

    public void calcSalario(){
        System.out.println("Salario calculado!");
    }

    public void comissao(){
        System.out.println("Comissão calculada!");
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
    public String getCrea() {
        return crea;
    }
    public void setCrea(String crea) {
        this.crea = crea;
    }
    public String getNivel() {
        return nivel;
    }
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    
}
