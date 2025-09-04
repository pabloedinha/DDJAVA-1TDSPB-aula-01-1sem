import java.time.LocalDate;

public class Jogo {
    //Atributos/Propriedades/Campos
    String titulo;
    String plataforma;
    LocalDate dataLancamento; //Ao invés de 'Date', usar 'LocalDate' por questões de fuso-horário.

    //Para facilitar a descrição e transformar tudo em String de forma automática, usamos o botão direito do mouse, clicamos em 'generate', logo após em 'tostring()'.
    @Override
    public String toString() {
        return "Jogo{" +
                "titulo = '" + titulo + '\'' +
                ", plataforma = '" + plataforma + '\'' +
                ", dataLancamento = " + dataLancamento +
                '}';
    }
}