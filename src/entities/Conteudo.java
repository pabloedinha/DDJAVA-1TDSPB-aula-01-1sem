package entities;

import java.time.LocalDate; //LocalDate importado da biblioteca Java.

public class Conteudo {
    public String titulo;
    public LocalDate dataLancamento; //Ao invés de 'Date', usar 'LocalDate' por questões de fuso-horário.
}
