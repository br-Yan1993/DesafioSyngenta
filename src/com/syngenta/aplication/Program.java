package com.syngenta.aplication;

import java.util.Scanner;

import com.syngenta.control.Algorithm;
import com.syngenta.control.DateControl;
import com.syngenta.view.Input;

public class Program {
	
	/***
	 * 1-O PROGRAMA EXECUTA CORRETAMENTE COM QUALQUER DATA, MESMO QUE SEJA
	 * FUTURA OU DIFERENTE DAS ENTRADAS DO ENUNCIADO (Exemplo: Hoje 09May2022(mon))
	 * 
	 *2-O PROGRAMA FOI DESENVOLVIDO BASEANDO-SE NA PROPOSTA, ONDE AS ENTRADAs, BEM COMO
	 *OS HOTEIS, SERIAM EM INGLÊS (Exemplo: Agosto~August~Aug)
	 *
	 * O sistema recebe os dados do usuario, verifica se a entrda é válida
	 * , transforma a String em dados legiveis para identificarmos se o cliente 
	 * é Regular ou Rewars e o principal, se as datas em questão são dias da semana ou finais
	 * de semana.
	 * Após gerados os dados compatíveis, efetua uma soma para verificar qual tem os menores valores.
	 * @param args
	 */
	
	public static void main(String[] args) {
		Algorithm a = new Algorithm();
		Input in = new Input();
		DateControl dc = new DateControl();
		System.out.println("Digite o tipo do cliente seguido pelas datas de hospedagem."
				+ "\nExemplo: Rewards: 26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat):");
		Scanner sc = new Scanner(System.in);
		in.setIn(sc.nextLine());
		a.runAlgorithm(
				dc.isWeekEnd(dc.setDate(in.parseDate(in.parseString()))), 
				in.changeClientType(in.parseString()));		
		sc.close();
	}
	
}
