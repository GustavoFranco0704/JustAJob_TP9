package Projeto_JustJob_infnet.Models;

import lombok.Data;

import java.util.Date;

@Data
public class Servico {
    private Cliente cliente;
    private Imovel imovel;
    private Date cotacaoDataHora = new Date();

    private int valor;
    private Date dataHoraExecucao = new Date();


    private Boolean avaliacao;


    public void marcarVisitaParaCotacao(Date cotacaoDataHora , Imovel imovel, Funcionario funcionario) {
        this.cotacaoDataHora = cotacaoDataHora;

    }

    public void marcarRealizacaoDoServico( Date dataHoraExecucao) {
        this.dataHoraExecucao = dataHoraExecucao;
    }


    public void avaliarServico(boolean avaliacao) {
        this.avaliacao = avaliacao;
    }



}
