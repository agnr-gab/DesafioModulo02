package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DesafioDeModulo {

    public static void main(String[] args) {
	/*
	Crie um programa para gerenciar uma lista de funcionários de uma empresa, cada funcionário tem nome, telefone, email e CPF. No final do programa deve ser exibida a lista de funcionários cadastrados.
	 */
        Map<String, String> listaFuncionarios = new HashMap<String, String>();
        Scanner leitorFuncionarios = new Scanner(System.in);

        //Variaveis
        //String chaveCadastro = "";
        String nome = "Maria Ferraz da Silva Souza";
        String telefone = "55+61+999-999-999";
        String email = "email@email.com.br";
        String cpf = "761.350.300-35";
        // String chaveCadastro = leitorFuncionarios.next();

        System.out.println("-----Sistema de Cadastro de Funcionários-----");
        while (true) {
            //Menu de opções
            System.out.println("Para ---cadastrar--- funcionário, DIGITE 1.");
            System.out.println("Para ---verificar--- funcionários cadastrados, DIGITE 2.");
            System.out.println("Para ---encerrar--- o programa, DIGITE 3.");
            int opcaoEscolhida = leitorFuncionarios.nextInt();
            leitorFuncionarios.nextLine();
            // Condições do programa
            if (opcaoEscolhida == 1) {
                System.out.println("Insira o nome do funcionario:");
                nome = leitorFuncionarios.nextLine();
                System.out.println("Insira o telefone do funcionario:");
                telefone = leitorFuncionarios.nextLine();
                System.out.println("Insira o e-mail do funcionario:");
                email = leitorFuncionarios.nextLine();
                System.out.println("Insira o CPF do funcionario:");
                cpf = leitorFuncionarios.nextLine();
                System.out.println("Cadastro realizado com sucesso:");
            }
            if (opcaoEscolhida == 2) {
                System.out.println("Funcionários já cadastrados: ");
                listaFuncionarios.put("CPF: " + cpf, " | " + "Nome: " + nome + " | " + "Telefone: " + telefone + " | " + "E-mail: " + email + "\n");
                System.out.println(listaFuncionarios);
                System.out.print("\n");
            }
            if (opcaoEscolhida == 3) {
                break;
            }
        }
    }

}

