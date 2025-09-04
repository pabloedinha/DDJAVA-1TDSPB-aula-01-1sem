import java.time.LocalDate; //Import do LocalDate, nova utilidade da biblioteca que veremos mais a frente.
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var jogos = new ArrayList<Jogo>(); //Criamos um ArrayList de 'targetando' o objeto jogo que criei fora da main para cadastras jogos e suas propriedades especificadas na classe.
        //Já que o var jogo vai estar vazio, é recomendável deixar ele fora do laço de repetição para ele não se apagar direto.
        //Var numero = 0; exemplo simples de uma variável com número vázia, int vazia (dúvida que tirei na sala com professor).
        while (true) { //manter o sistema sempre em execução até eu parar manualmente o programa.
            System.out.println("""
                    ----------------------------
                    Digite a opção desejada:
                    1 - Cadastrar novo jogo
                    2 - Listar jogos cadastrados
                    3 - Remover jogo
                    4 - Sair
                    ----------------------------
                    """);
            var scan = new Scanner(System.in); //Criada a variável scan.
            var opcao = scan.nextInt(); //Scan a próxima int, selecionando uma das 4 opções.
            scan.nextLine();

            if (opcao == 1) { //se a opção for igual a 1, o programa vai apresentar o que está dentro dele, '==' é uma comparação, '=' é uma atribuição.
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
                jogos.add(jogo); //adiciona na minha lista de jogos o jogo cadastrado.
                System.out.println("Jogo " + jogo.titulo + " cadastrado com sucesso!");
            } else if (opcao == 2) {
                System.out.println("Listando jogos cadastrados: ");
                var index = 1; //índice
                for(var jogo : jogos) { //para cada jogo em jogos, imprima um jogo, ao invés de dar um 'System.out.println' para cada um dos elementos no array, podemos usar 'for' para otimizar e mostrar todos os elementos, (jogo) dentro de (jogos - array).
                    System.out.println(index + " - " + jogo);
                    index++; //índice +1 para cada novo jogo adicionado
                }
            }
            else if (opcao == 3){
                System.out.println("Digite o número do jogo que deseja remover:");
                var numJogo = scan.nextInt(); //Vai verificar a posição do jogo que o usuário digitar para assim deletá-lo.
                scan.nextLine(); //sempre que usar nextInt, usar nextLine após
                jogos.remove(numJogo-1); //O computador começa o índice a partir do zero, por isso precisamos colocar '-1' para ser possível listar o jogo escolhido.
            }
            else if (opcao == 4) //Caso selecionada a opção 4, o programa vai fechar com 'System.exit'.
                System.exit(0);
            else
                System.out.println("Opção inválida!"); //Caso selecionada qualquer outra opção que não seja as que temos disponíveis, display de mensagem 'opção inválida'.
        }
    }
}