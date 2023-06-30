package trabalhoLDEC;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ListaPrincipal listaPrincipal = new ListaPrincipal();
        

        int op = 0;
        do {
            System.out.println("\n===== Menu =====");
            System.out.println("1. Cadastrar termo;");
            System.out.println("2. Remover termo;");
            System.out.println("3. Exibir definição de um termo;");
            System.out.println("4. Editar termo;");
            System.out.println("5. Exibir os termos em ordem alfabética;");
            System.out.println("6. Exibir termos por letra;");
            System.out.println("0. Sair");

            System.out.print("Escolha uma opção: ");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Informe o nome do termo: ");
                    String nome = scanner.nextLine();
                    System.out.print("Informe a definição do termo: ");
                    String definicao = scanner.nextLine();

                    Termo termo = new Termo(nome, definicao);                   

                    char primeiraLetra = Character.toLowerCase(nome.charAt(0));

                    
                    if (listaPrincipal.isEmpty() || !letraExists(listaPrincipal.primeiro, primeiraLetra)) {
                        listaPrincipal.inserirLetra(primeiraLetra);
                    }

                    ListaSecundaria listaSecundaria = getListaSecundaria(listaPrincipal.primeiro, primeiraLetra);

                    
                    listaSecundaria.inserirTermo(termo);

                    System.out.println("Termo cadastrado com sucesso.");
                    break;
        }
    }
}
