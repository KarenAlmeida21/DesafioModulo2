package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        //DESAFIO - MÓDULO 2
        //Crie um programa para gerenciar uma lista de funcionários de uma empresa,
        //cada funcionário tem nome, telefone, email e CPF. No final do programa deve ser
        //exibida a lista de funcionários cadastrados.
        //Entrega Mínima: O sistema permite, via terminal, inserir pelo menos 1 funcionário
        //em uma lista e retornar o mesmo na tela.
        //Entrega Média: O sistema permite adicionar mais de um funcionário e apresenta
        //um menu para decidir se deverá:
        //1. Adicionar mais funcionários.
        //2. Exibir a lista de todos os funcionários cadastrados.
        //3. Encerrar o programa.
        //Entrega Máxima: O Sistema permite excluir um funcionário usando como
        //parâmetro o CPF e não permite inserir um funcionário com o CPF repetido.

        //Variaveis
        boolean novoCadastro = true;
        int opcaonovocadastro;


        Map<String, String> cadastroDefuncionario = new HashMap<String, String>();


        //fazendo o menu principal:
        System.out.println("~~~~ Programa Para Cadastro De Funcionários ~~~~");
        System.out.println("     Opcão 1- Exibir lista de funcionários.");
        System.out.println("     Opção 2- Adicionar novo funcionário.");
        System.out.println("     Opção 3- Excluir funcionário.");
        System.out.println("     Opção 4- Encerrar o sistema.");


        //Recebendo a opçao do menu:


        Scanner leitor = new Scanner(System.in);
        System.out.println("     Digite  a opção desejada:");
        int menuEscolhido = leitor.nextInt();
        leitor.nextLine();


        while (menuEscolhido != 4) {


            switch (menuEscolhido) {


                case 1:
                    System.out.println(cadastroDefuncionario);
                    System.out.println("Lista Exibida Com Sucesso");

                    break;

                case 2:
           //Estrutura para cadastrar ou não um novo funcionario

                    while (novoCadastro == true) {
                        System.out.println("Voce deseja cadastrar um novo funcionário?");
                        System.out.println(" 1- Para Sim       2- Para Não");
                        opcaonovocadastro = leitor.nextInt();
                        leitor.nextLine();

                        if (opcaonovocadastro == 1) {

                            System.out.println("~~~~ Cadastrando Novo Funcionário: ~~~~");

                            System.out.println("Digite o CPF do novo funcionário:  ");
                            String cpf = leitor.nextLine();
                            System.out.println("Digite o nome completo do novo funcionário: ");
                            String nome = leitor.nextLine();
                            System.out.println("Digite o telefone do novo funcionário:");
                            String telefone = leitor.nextLine();
                            System.out.println("Digite o do e-mail completo funcionário:  ");
                            String email = leitor.nextLine();
                            System.out.println("Funcionário Cadastrado Com Sucesso");

                            //armazenando o valor das variaveis de cadastro:
                            cadastroDefuncionario.put(cpf, " Nome do funcionário : " + nome + " Telefone do funcionário " + telefone + " E-mail do funcionário: " + email);

                        } else if (opcaonovocadastro == 2) {
                            novoCadastro = false;
                            //caso não queira cadastrar mais funcionarios
                        } else {
                            System.out.println("Digite um valor válido");
                            //caso a pessoa não digite 1 ou 2
                        }

                    }
                    break;

                case 3:
                    System.out.println("excluir funcionario");
                    break;
                default:
                    System.out.println("Digite uma opção válida.");
                    //caso não digite uma opção válida do menu
                    break;
            }
            System.out.println("     Digite  a opção desejada:");
            System.out.println("     Opcão 1- Exibir lista de funcionários.");
            System.out.println("     Opção 2- Adicionar novo funcionário.");
            System.out.println("     Opção 3- Excluir funcionário.");
            System.out.println("     Opção 4- Encerrar o sistema.");
            menuEscolhido = leitor.nextInt();


        }
        System.out.println("Programa Encerrado");
        System.out.println("  Bom trabalho!   ");

    }
}
