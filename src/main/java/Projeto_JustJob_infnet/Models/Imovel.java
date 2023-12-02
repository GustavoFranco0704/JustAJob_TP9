package Projeto_JustJob_infnet.Models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class Imovel {
    private String descricao;

    public Cliente dadosCliente ( Cliente cliente) {
        return cliente;
    }

    public void visualizarDadosDoImovel() {
        System.out.println("Descrição do Imóvel: " + descricao);

    }






}
