import java.util.Scanner;

public class Dicionario {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        Scanner scanner = new Scanner(System.in);

        boolean executando = true;
        while (executando) {
            System.out.println("========= DICIONÁRIO =========");
            System.out.println("1. Cadastrar termo");
            System.out.println("2. Remover termo");
            System.out.println("3. Exibir dicionário");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o termo: ");
                    String termo = scanner.nextLine();
                    System.out.print("Digite a definição: ");
                    String definicao = scanner.nextLine();
                    dicionario.cadastarTermo(termo, definicao);
                    System.out.println("Termo adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o termo a ser removido: ");
                    termo = scanner.nextLine();
                    boolean removido = dicionario.removerTermo(termo);
                    if (removido) {
                        System.out.println("Termo removido com sucesso!");
                    } else {
                        System.out.println("Termo não encontrado.");
                    }
                    break;
                case 3:
                    dicionario.exibirDicionario();
                    break;
                case 4:
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
