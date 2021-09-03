package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {


        Map<String, String> cadastroDefuncionario = new HashMap<String, String>();


        //fazendo o menu:
        System.out.println("~~~~ Programa Para Cadastro De Funcionários ~~~~");
        System.out.println("     Opcão 1- Exibir lista de funcionários.");
        System.out.println("     Opção 2- Adicionar novo funcionário.");
        System.out.println("     Opção 3- Excluir funcionário.");
        System.out.println("     Opção 4- Encerrar o sistema.");


        //Recebendo o menu:


        Scanner leitor = new Scanner(System.in);
        System.out.println("     Digite  a opção desejada:");
        int menuEscolhido = leitor.nextInt();
        leitor.nextLine();


        while (menuEscolhido != 4) {


            switch (menuEscolhido) {


                case 1:
                    System.out.println(cadastroDefuncionario);

                    break;

                case 2:
                    //Recebendo os dados para novo cadastro:
                    System.out.println("~~~~ Cadastrando Novo Funcionário: ~~~~");

                    System.out.println("Digite o CPF do novo funcionário:  ");
                    String cpf = leitor.nextLine();
                    System.out.println("Digite o nome completo do novo funcionário: ");
                    String nome = leitor.nextLine();
                    System.out.println("Digite o telefone do novo funcionário:");
                    String telefone = leitor.nextLine();
                    System.out.println("Digite o do e-mail completo funcionário:  ");
                    String email = leitor.nextLine();


                    //armazenando o valor das variaveis
                    cadastroDefuncionario.put(cpf, " Nome do funcionário : " + nome + " Telefone do funcionário " + telefone + " E-mail do funcionário: " + email);
                    break;
                case 3:
                    System.out.println("excluir funcionario");
                    break;
                default:
                    System.out.println("Digite uma opção válida.");
                    break;
            }
            System.out.println("     Digite  a opção desejada:");
            menuEscolhido = leitor.nextInt();


        }
        System.out.println("Programa Encerrado");

    }
}
