package Projeto_JustJob_infnet.Models;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;


@Data


public class Agenda {
    private Funcionario funcionario;
    private List<Double> diasDaSemanaDeTrabalho ;


    public Agenda(Funcionario funcionario, double data) {
        this.funcionario = funcionario;
        this.diasDaSemanaDeTrabalho = new ArrayList<>();

        if (data > 1 && data < 7) {
            diasDaSemanaDeTrabalho.add(data);
        }
    }

    public void verificarDatasDisponiveis() {

    }

    public boolean verificarSeDataEstaDisponivel(double data) {

        return diasDaSemanaDeTrabalho.contains(data);
    }


    public void verificarCompromissos(double periodo) {

    }


    public void visualizarFuncionario() {

    }

    public void visualizarFuncionarios() {

    }
}