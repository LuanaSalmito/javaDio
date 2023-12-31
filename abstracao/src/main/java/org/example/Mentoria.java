package org.example;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    LocalDate data;

    public Mentoria(){

    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRO+20d;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo()+ '\'' +
                ", descricao='" + getDescricao()+ '\'' +
                ", data=" + data +
                '}';
    }
}
