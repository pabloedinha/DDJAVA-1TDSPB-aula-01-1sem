import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class JogoService {
    public void AdicionarJogo(Scanner scan, ArrayList<Conteudo> conteudo){
        System.out.println("Digite o nome do jogo que deseja cadastrar:");
        var titulo = scan.nextLine();
        System.out.println("Digite a plataforma do jogo:");
        var plataforma = scan.nextLine();
        System.out.println("Digite a data de lançamento do jogo (YYYY-MM-DD):");
        var dataLancamento = scan.nextLine();

        var jogo = new Jogo(); //Inicia um objeto (instanciação), no caso a classe separada da main que criamos.
        jogo.titulo = titulo; //Indicamos para o programa que as variáveis estão conectadas à classe 'Jogo.java'.
        jogo.plataforma = plataforma;
        jogo.dataLancamento = LocalDate.parse(dataLancamento); //'.parse' transforma a variável de data em uma string
        conteudo.add(jogo); //adiciona na minha lista de jogos o jogo cadastrado.
        System.out.println("Jogo " + jogo.titulo + " cadastrado com sucesso!");
    }

    public void listarJogos(ArrayList<Conteudo> conteudo) {
        System.out.println("Listando jogos cadastrados: ");
        var index = 1; //índice
        for (var jogo : conteudo) { //para cada jogo em jogos, imprima um jogo, ao invés de dar um 'System.out.println' para cada um dos elementos no array, podemos usar 'for' para otimizar e mostrar todos os elementos, (jogo) dentro de (jogos - array).
            System.out.println(index + " - " + jogo);
            index++; //índice +1 para cada novo jogo adicionado
        }
    }
    public void RemoverJogo(Scanner scan,ArrayList<Conteudo> conteudo) {
        System.out.println("Digite o número do jogo que deseja remover:");
        var numJogo = scan.nextInt(); //Vai verificar a posição do jogo que o usuário digitar para assim deletá-lo.
        scan.nextLine(); //sempre que usar nextInt, usar nextLine após
        conteudo.remove(numJogo - 1); //O computador começa o índice a partir do zero, por isso precisamos colocar '-1' para ser possível listar o jogo escolhido.
    }
}
