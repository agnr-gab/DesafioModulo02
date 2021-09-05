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
        String nome = "Nome";
        String telefone = "Tefelone123456987";
        String email = "email@email.com";
        String cpf = "999887744856";
        //chaveCadastro = leitorFuncionarios.next();

        System.out.println("-----Sistema de Cadastro de Funcionários-----");
        System.out.println("Insira o nome do funcionario:");
        nome = leitorFuncionarios.nextLine();
        System.out.println("Insira o telefone do funcionario:");
        telefone = leitorFuncionarios.next();
        System.out.println("Insira o e-mail do funcionario:");
        email = leitorFuncionarios.next();
        System.out.println("Insira o CPF do funcionario:");
        cpf = leitorFuncionarios.next();

        listaFuncionarios.put("cpf", "Nome: "+nome+"\n"+"Telefone: "+telefone+"\n"+"E-mail: "+email+"\n"+"CPF: "+cpf);
        for (String referencia : listaFuncionarios.values()) {
            System.out.println(referencia);
        }
        //System.out.println(listaFuncionarios.values(cpf));


    }
}
