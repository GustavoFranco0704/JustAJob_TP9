package Projeto_JustJob_infnet.Models;

public class Funcionario extends Pessoa {

    public String gerente;
    public String faxineiro;

    public Funcionario(String nome, String telefone, String email, String cpf, String gerente, String faxineiro){
        super(nome, telefone, email, cpf);
        this.gerente = gerente;
        this.faxineiro = faxineiro;
    }




}
