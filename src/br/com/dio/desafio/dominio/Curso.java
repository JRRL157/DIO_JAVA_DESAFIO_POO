package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Curso extends Conteudo{
    private int cargaHoraria;

    public Curso() {
    }

    @Override
    public double calcularXP() {
        return DefaultXP * this.cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + this.getTitulo() + '\'' +
                ", descricao='" + this.getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
