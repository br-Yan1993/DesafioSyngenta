package com.syngenta.testes;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.DisplayName;

import com.syngenta.control.DateControl;
import com.syngenta.view.Input;

public class InputTest {
	
	/***
	 * Classe para realização de testes
	 * Entrada 1: Regular: 16Mar2009(mon), 17Mar2009(tues), 18Mar2009(wed)
	 * Entrada 2: Regular: 20Mar2009(fri), 21Mar2009(sat), 22Mar2009(sun)
	 * Entrada 3: Rewards: 26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)
	 */
	
	private String[] outTest = {"Lakewood", "Bridgewood", "Ridgewood"};

	@org.junit.Test
	@DisplayName("Verifica o teste com as entradas proposta no enunciado")
	public void inputTest() {
		AlgorithmTest a = new AlgorithmTest();
		Input in = new Input();
		DateControl dc = new DateControl();
		System.out.println("Digite o tipo do cliente seguido pelas datas de hospedagem."
				+ "\nExemplo: Rewards: 26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat):");
		Scanner sc = new Scanner(System.in);
		in.setIn(sc.nextLine());
		
		assertEquals(outTest[0], a.runAlgorithm(
				dc.isWeekEnd(dc.setDate(in.parseDate(in.parseString()))), 
				in.changeClientType(in.parseString())));
		
		//Teste com retorno Bridgewood
//		assertEquals(outTest[1], a.runAlgorithm(
//				dc.isWeekEnd(dc.setDate(in.parseDate(in.parseString()))), 
//				in.changeClientType(in.parseString())));
		
		//Teste com retorno Ridgewood
//		assertEquals(outTest[2], a.runAlgorithm(
//				dc.isWeekEnd(dc.setDate(in.parseDate(in.parseString()))), 
//				in.changeClientType(in.parseString())));
		sc.close();
	}
}
