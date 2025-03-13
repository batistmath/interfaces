package classes;

import interfaces.Autenticavel;

public class Cliente extends Pessoa implements Autenticavel{
private String nome;

@Override
public void login(){
    System.out.println("Login Realizado!");
}
@Override
public void trabalhar(){
    System.out.println(getNome() + "Está trabalhando...");
}
@Override
public void estudar(){
    System.out.println(getNome() + "Está estudando...");
}

public Cliente(String nome, int idade, String cpf, String endereco, String telefone, String nome2) {
    super(nome, idade, cpf, endereco, telefone);
    nome = nome2;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}


}