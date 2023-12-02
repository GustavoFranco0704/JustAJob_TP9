package Projeto_JustJob_infnet.Models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor

public class Fatura {

    private double valor;
    private LocalDateTime dataEmissao;
    private LocalDateTime dataVencimento;
    private double valorPago;
    Servico servico;

    public void atualizarPagamentoParcial(double valorPago) {
        this.valorPago += valorPago;
    }

}
