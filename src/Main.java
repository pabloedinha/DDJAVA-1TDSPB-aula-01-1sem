import entities.Conteudo;
import services.FilmeService;
import services.JogoService;

import java.util.ArrayList; //Import do ArrayList para criar a lista de conteúdos.
import java.util.Scanner; //Import do Scanner para ser usado pelo nosso sistema.

import static utils.IOutils.println; //importei do 'utils' para encurtar a mensagem do 'sout'
import static utils.IOutils.scanInt;

//Var numero = 0; exemplo simples de uma variável com número vázia, int vazia (dúvida que tirei na sala com professor).
//Caso haja uma 'var' vazia, é recomendável deixar ela fora do laço de repetição para ele não se apagar direto.
//System.exit(0); Caso selecionada a opção 4, o programa vai fechar com 'System.exit'.

public static void main(String[] args) {

    var scan = new Scanner(System.in); //Criada a variável scan para o programa identificar dados fornecidos pelo usuário.
    var conteudo = new ArrayList<Conteudo>(); //Criamos um ArrayList 'targetando' o objeto 'entities.Conteudo' que criei fora da main para cadastras (jogos, filmes e series) e suas propriedades especificadas na classe.
    var JogoService = new JogoService();
    var filmeService = new FilmeService();

    while (true) { //manter o sistema sempre em execução até eu parar manualmente o programa.
        println(MENU_PRINCIPAL);
        var conteudoOpcao = scanInt(scan); //Scanner o próximo número inteiro que o usuário digitar na próxima linha.

        switch (conteudoOpcao) {
            case 4 -> System.exit(0);
            case 1 -> {
                var voltar = false;
                while (!voltar) {
                    println(JogoService.MENU_JOGOS); //Posso puxar do jogo service o metodo de 'MENU_JOGOS' para deixar o código mais clean.

                    var opcao = scanInt(scan); //Scan a próxima int, selecionando uma das 4 opções.

                    switch (opcao) { //Usado para deixar o código mais clean, só da para ser usado quando criamos uma classe separada da main que faz toda a organização e função.
                        case 1 ->
                                JogoService.AdicionarJogo(scan, conteudo);  //se a opção for igual a 1, o programa vai apresentar o que está dentro dele, '==' é uma comparação, '=' é uma atribuição.
                        case 2 ->
                                JogoService.listarJogos(conteudo); //Não tem 'scan', pois o ele não vai ser usado para listar os jogos da Array.
                        case 3 -> JogoService.RemoverJogo(scan, conteudo);
                        case 4 -> voltar = true;
                        default ->
                                println("Opção inválida!"); //Caso selecionada qualquer outra opção (default) que não seja as que temos disponíveis, display de mensagem 'opção inválida'.
                    }
                }
            }
            case 2 -> {
                var voltar = false;

                while (!voltar) {
                    println(filmeService.MENU_FILME);
                    var opcao = scanInt(scan);
                    switch (opcao) {
                        case 4 -> voltar = true;
                        case 1 -> println("Cadastre novo filme - Em construção");
                        default -> println("opção inválida!");
                    }

                }
            }
        }
    }
}

public static final String MENU_PRINCIPAL = """
        Bem vindo ao sistema de gerenciamento de mídias!
        Digite o conteúdo que deseja gerenciar:
        1 - Jogos
        2 - Filmes
        3 - Séries
        4 - Sair
        """;