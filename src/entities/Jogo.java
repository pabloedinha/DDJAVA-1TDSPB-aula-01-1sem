package entities;

public class Jogo extends Conteudo { //Reaproveitar atributos desde que você deixe explicito a herança, jogo extende de conteúdo.
    //Atributos/Propriedades/Campos
    public String plataforma;

    //Para facilitar a descrição e transformar tudo em String de forma automática, usamos o botão direito do mouse, clicamos em 'generate', logo após em 'tostring()'.
    @Override
    public String toString() {
        return "entities.Jogo {" +
                "titulo = '" + titulo + '\'' +
                ", plataforma = '" + plataforma + '\'' +
                ", data de lançamento = " + dataLancamento +
                '}';
    }
}