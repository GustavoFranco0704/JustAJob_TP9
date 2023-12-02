package Projeto_JustJob_infnet.Models;





public class Cliente extends Pessoa{
    private String rua;
    private String cep;
    private String complemento;

    public String getEndereco() {
        return rua + ", " + cep + " - " + complemento;
    }


    public Cliente(String nome, String telefone, String email, String cpf,String rua, String cep, String complemento ) {
        super(nome, telefone, email, cpf);
        this.rua = rua;
        this.cep = cep;
        this.complemento = complemento;
    }
    public void visualizarDadosCliente(String cpf) {
        if (getCpf().equals(cpf)) {
            System.out.println("Nome: " + getNome());
            System.out.println("Telefone: " + getTelefone());
            System.out.println("Email: " + getEmail());
            System.out.println("CPF: " + getCpf());
            System.out.println("Endereço: " + getEndereco());
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    public void visualizarImovel(){
        System.out.println("Lista de imóveis do cliente:");
    }
}
