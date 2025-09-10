import java.time.LocalDate; //Import do LocalDate, nova utilidade da biblioteca que veremos mais a frente.
import java.util.ArrayList; //Import do ArrayList para criar a lista de conteúdos.
import java.util.Scanner; //Import do Scanner para ser usado pelo nosso sistema.

//Var numero = 0; exemplo simples de uma variável com número vázia, int vazia (dúvida que tirei na sala com professor).
//Caso haja uma 'var' vazia, é recomendável deixar ela fora do laço de repetição para ele não se apagar direto.

public class Main {
    public static void main(String[] args) {

        var scan = new Scanner(System.in); //Criada a variável scan para o programa identificar dados fornecidos pelo usuário.
        var conteudo = new ArrayList<Conteudo>(); //Criamos um ArrayList 'targetando' o objeto 'Conteudo' que criei fora da main para cadastras (jogos, filmes e series) e suas propriedades especificadas na classe.
        var JogoService = new JogoService();

        while (true) { //manter o sistema sempre em execução até eu parar manualmente o programa.
            System.out.println("""
                    Bem vindo ao sistema de gerenciamento de mídias!
                    Digite o conteúdo que deseja gerenciar:
                    1- Jogos
                    2 - Filmes
                    3 - Séries
                    """);
            var conteudoOpcao = scan.nextInt(); //Scanner o próximo número inteiro que o usuário digitar na próxima linha.
            scan.nextLine(); //Ler a próxima linha que vai ser responsável por scanner a int.

            if (conteudoOpcao == 1) { //Caso o usuário escolha a primeira opção, o programa vai rodar o gerenciamento de *jogos*.
                System.out.println("----------------------------");
                System.out.println("""
                        Digite a opção desejada:
                        1 - Cadastrar novo jogo
                        2 - Listar jogos cadastrados
                        3 - Remover jogo
                        4 - Sair
                        ----------------------------
                        """);
                var opcao = scan.nextInt(); //Scan a próxima int, selecionando uma das 4 opções.
                scan.nextLine(); //Scan.nextLine() SEMPRE após o scan.nextInt().

                if (opcao == 1) { //se a opção for igual a 1, o programa vai apresentar o que está dentro dele, '==' é uma comparação, '=' é uma atribuição.
                    JogoService.AdicionarJogo(scan, conteudo);
                } else if (opcao == 2) {
                    JogoService.listarJogos(conteudo);
                } else if (opcao == 3) {
                JogoService.RemoverJogo(scan, conteudo);
                } else if (opcao == 4) //Caso selecionada a opção 4, o programa vai fechar com 'System.exit'.
                    System.exit(0);
                else
                    System.out.println("Opção inválida!"); //Caso selecionada qualquer outra opção que não seja as que temos disponíveis, display de mensagem 'opção inválida'.
            }
        }
    }
}