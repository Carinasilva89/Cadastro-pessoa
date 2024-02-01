import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroPessoas {
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        List<Pessoa> listaPessoas = new ArrayList<>();

        while (true) {
            System.out.println(" \n||||||||||||| CADASTRO DE PESSOAS |||||||||||||");
            System.out.println();
            System.out.println(" 1 === Cadastrar Novo === ");
            System.out.println(" 2 === Buscar Pessoas === ");
            System.out.println(" 3 === Sair Do Sistema ===");
            System.out.println("''''''''' ESCOLHA UMA OPÇAO ABAIXO ''''''''''");


            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    cadastrarPessoa(scanner, listaPessoas);
                    break;

                    

                case 2:

                    listarPessoas(listaPessoas);
                    break;

                    

                case 3:

                    System.out.println("Saindo do programa. Até logo!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    
            }
            
        }

    }

    private static void cadastrarPessoa(Scanner scanner, List<Pessoa> listaPessoas){

        System.out.println("Informe o Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Informe a Idade: ");
        int idade = scanner.nextInt();

        System.out.println(" Informe o CPF: ");
        String cpf = scanner.nextLine();
        scanner.nextLine();

        Pessoa pessoa = new Pessoa(nome, idade, cpf);

        System.out.println(" Cadastro Realizado com Sucesso !!! ");
                
    }

    private static void listarPessoas(List<Pessoa> listaPessoas){
        System.out.println(" ------- Lista de Pessoas -------");
        System.out.println();

        if (listaPessoas.isEmpty()){
            System.out.println(" Nehuma pessoa cadastrada ");
        } else {
            for (Pessoa pessoa : listaPessoas ) {

                System.out.println("Nome : " + pessoa.getNome()+
                                    ", Idade : " + pessoa.getIdade() +
                                    ", CPF: " + pessoa.getCpf());
            }
        }
    }


    
    
}
