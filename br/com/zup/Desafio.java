package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {  //DESAFIO - MÓDULO 2
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

        //Tentando corrigir o bug (mudando o código)

        // Novas Variaveis
        boolean loop = true;
        int opcaonovocadastro;


        Map<String, String> cadastroDefuncionario = new HashMap<String, String>();
        Scanner leitor = new Scanner(System.in);

//Principal menu (recebendo a opção do menu do funcionario)
        while (loop == true) {
            System.out.println("~~~~          Lojas Mais Barato             ~~~~");
            System.out.println(" ");
            System.out.println("");
            System.out.println("     Digite  a opção desejada:");
            System.out.println("     Opcão 1- Exibir lista de funcionários.");
            System.out.println("     Opção 2- Adicionar novo funcionário.");
            System.out.println("     Opção 3- Excluir funcionário.");
            System.out.println("     Opção 4- Encerrar o sistema.");
            int menuEscolhido = leitor.nextInt();
            leitor.nextLine();
//Açoes do menu
            switch (menuEscolhido) {


                case 1:
                    if (cadastroDefuncionario.size() == 0) {
                        System.out.println("Não Há Funcionários Cadastrados");
                    } else {

                        System.out.println("Na lista há " + cadastroDefuncionario.size() + " funcionários cadastrados");
                        //Exibindo a lista de uma maneira mais bonita
                        for (String chaveFuncionario : cadastroDefuncionario.keySet()) {
                            System.out.println(cadastroDefuncionario.get(chaveFuncionario) + chaveFuncionario);

                        }
                        System.out.println("Lista Exibida Com Sucesso");

                    }
                    break;

                case 2:
                    System.out.println("~~~~ Programa Para Cadastramento De Funcionários");

                    System.out.println("Informe o CPF novo funcionário");
                    String cpf = leitor.nextLine();
                    System.out.println("Informe o nome do novo funcionário");
                    String nome = leitor.nextLine();
                    System.out.println("Informe o telefone do novo funcionário");
                    String telefone = leitor.nextLine();
                    System.out.println("Informe o e-mail do novo funcionário");
                    String email = leitor.nextLine();
                    cadastroDefuncionario.put(cpf, "Nome: " + nome + "E-mail: " + email + "Telefone: " + telefone);



                    for(String chavecpf:cadastroDefuncionario.keySet()){
                       if(chavecpf.equals(cpf)){
                           System.out.println("Funcionário Já Cadastrado.");
                       }else{
                           cadastroDefuncionario.put(cpf, "Nome: " + nome + "E-mail: " + email + "Telefone: " + telefone);
                       }

                   }



                    break;
                case 3:
                    System.out.println("Informe o CPF que você deseja excluir");
                    String cpfAserExcluido = leitor.nextLine();
                    String cpfExcluido = "";

                    for (String chaveCpf : cadastroDefuncionario.keySet()) {
                        if (chaveCpf.equals(cpfAserExcluido)) {
                            System.out.println("Cadastro Encontrado E Removido Com Sucesso");
                            cpfExcluido = cpfAserExcluido;


                        }


                    }
                    cadastroDefuncionario.remove(cpfExcluido);


                    break;
                case 4:
                    System.out.println("Programa Encerrado");
                    System.out.println("Bom Trabalho");
                    loop = false;
                    break;
                default:
                    System.out.println("Digite uma opção válida.");
                    //caso não digite uma opção válida do menu
                    break;
            }

        }


    }
}