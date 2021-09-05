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

        String chaveCadastro;
        String nome = "Nome";
        String telefone = "Tefelone123456987";
        String email = "email@email.com";
        String cpf = "99988774456";

        listaFuncionarios.put("chaveCadastro", nome+telefone+email+cpf);
        System.out.println(listaFuncionarios);


    }
}
