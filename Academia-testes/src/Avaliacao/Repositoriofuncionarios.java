package Avaliacao;

import java.util.ArrayList;

public class Repositoriofuncionarios {

	public static void main(String[] args) {
		
		// criar objeto
		ArrayList<String> nomes = new ArrayList<String>();
		System.out.println("Tamanho inicial: " + nomes.size());
		//adicionar elementos

		nomes.add("1) Hugo");      //0
		nomes.add("2) Ana");       //1
		nomes.add("3) Allyce");    //2
		
		System.out.println("Novo tamanho: " + nomes.size());
		//remove elementos
		nomes.remove("Hugo");
		nomes.remove(0);
		System.out.println("Conteudo: " + nomes);
		}	
		// TODO Auto-generated method stub

	}

