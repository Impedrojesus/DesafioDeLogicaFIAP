import java.util.Scanner;

public class Agenda {
    static Scanner entrada = new Scanner(System.in);

    public static void exibeMenu() {
        System.out.println("********* M E N U ********");
        System.out.println("1 - Adicionar novo contato");
        System.out.println("2 - Editar contato");
        System.out.println("3 - Pesquisar contato");
        System.out.println("4 - Lista de contatos");
        System.out.println("5 - Apagar um contato");
        System.out.println("6 - Sair");
    }

    public static void main(String[] args) {
        int opcao;
        String nome;

        // Aqui você deve inicializar a matriz de contatos, por exemplo:    
            Contato[] agenda = new Contato[10];

        do {
            exibeMenu();
            System.out.print("Escolha uma opção:");
            opcao = entrada.nextInt();
            System.out.println();

            switch (opcao) {
                case 1:
                    //adicionar um novo contato
                    System.out.println("Opção 1 selecionada - Adicionar novo contato");
                    exibeMenu(agenda,linhaProximoContato(agenda));
                    break;
                case 2:
                    //editar um contato
                    System.out.println("Opção 2 selecionada - Editar contato");
                    break;
                case 3:
                    // pesquisar um contato
                    System.out.println("Opção 3 selecionada - Pesquisar contato");
                    break;
                case 4:
                    //  listar todos os contatos
                    System.out.println("Opção 4 selecionada - Lista de contatos");
                    break;
                case 5:
                    //  apagar um contato
                    System.out.println("Opção 5 selecionada - Apagar um contato");
                    break;
                case 6:
                    System.out.println("OBRIGADO POR UTILIZAR A NOSSA AGENDA :)");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
            System.out.println();
        } while (opcao != 6);
    }

    private static void exibeMenu(Contato[] agenda, Object o) {
    }

    private static Object linhaProximoContato(Contato[] agenda) {
        return null;
    }
}
