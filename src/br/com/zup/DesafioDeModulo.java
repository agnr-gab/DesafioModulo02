package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DesafioDeModulo {

    public static void main(String[] args) {
	/*
	Crie um programa para gerenciar uma lista de funcionários de uma empresa, cada funcionário tem nome, telefone, email e CPF. No final do programa deve ser exibida a lista de funcionários cadastrados.
	 */
        //HashMap listaFuncionários
        Map<String, String> listaFuncionarios = new HashMap<String, String>();
        //Inicio do Scanner
        Scanner leitorFuncionarios = new Scanner(System.in);

        //Variáveis
        String nome = "Maria Ferraz da Silva Souza";
        String telefone = "55+61+999-999-999";
        String email = "email@email.com.br";
        String cpf = "761.350.300-35";
        // Mensagens para o usuário
        System.out.println("-----Sistema de Cadastro de Funcionários-----");
        while (true) {
            //Menu de opções
            System.out.println("Para ---cadastrar--- funcionário, DIGITE 1.");
            System.out.println("Para ---verificar--- funcionários cadastrados, DIGITE 2.");
            System.out.println("Para ---excluir--- algum funcionário cadastrado, DIGITE 3.");
            System.out.println("Para ---encerrar--- o programa, DIGITE 4.");
            int opcaoEscolhida = leitorFuncionarios.nextInt(); //opção escolhida pelo usuário
            leitorFuncionarios.nextLine();
            // Condições do programa
            // Cadastro dos funcionários
            if (opcaoEscolhida == 1) {
                System.out.println("Insira o nome do funcionario:");
                nome = leitorFuncionarios.nextLine();
                System.out.println("Insira o telefone do funcionario:");
                telefone = leitorFuncionarios.nextLine();
                System.out.println("Insira o e-mail do funcionario:");
                email = leitorFuncionarios.nextLine();
                System.out.println("Insira o CPF do funcionario:");
                cpf = leitorFuncionarios.nextLine();
                System.out.println("Cadastro realizado com sucesso!!!");
            } while (listaFuncionarios.containsKey(cpf)) {
                System.out.println("Usuário já consta cadastrado! Digite um novo CPF: ");
                cpf = leitorFuncionarios.nextLine();
            }
            //verifica se tem cpf igual na base de dados
            /*if (listaFuncionarios.containsValue(cpf)) {
                System.out.println("Usuário já consta cadastrado!");
            }*/
            //lista de funcionários cadastrados
            if (opcaoEscolhida == 2) {
                System.out.println("Lista de funcionários já cadastrados: ");
                listaFuncionarios.put("CPF: " + cpf, " | " + "Nome: " + nome + " | " + "Telefone: " + telefone + " | " + "E-mail: " + email + "\n");
                System.out.println(listaFuncionarios);
                System.out.print("\n"); //saltar uma linha
            } //remove funcionário do cadastro
            if (opcaoEscolhida == 3) {
                System.out.println("Digite o CPF do funcionário para excluir o cadastro:");
                cpf = leitorFuncionarios.next();
                listaFuncionarios.remove(cpf);
                System.out.println("Funcionário " + cpf + " removido do cadastro com sucesso!");
            }//entrada inválida
            if (opcaoEscolhida > 4 || opcaoEscolhida < 1) {
                System.out.println("Opção de entrada inválida. Verifique novamente!");//finaliza o programa
            }
            if (opcaoEscolhida == 4) {
                break;

            }
        }
    }
}


