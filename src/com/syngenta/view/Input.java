package com.syngenta.view;

import java.util.ArrayList;
import java.util.List;

public class Input {
	
	/***
	 * Classe destinada a receber a entrada de dados e
	 * identifica-las como sendo Tipo do Cliente e Datas;
	 */
	
	private String[] inParse;
	private String formated;
	private String in;
	private String clientType;
	private List<String> listString;
	
	public Input() {
	}

	public String getClientType() {
		return clientType;
	}

	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	public String getIn() {
		return in;
	}

	public void setIn(String in) {
		this.in = in;
	}
	
	//Método que separa a entrada
	public List<String> parseString() {
			listString = new ArrayList<String>();
			if (in.contains(" ")) {
			inParse = in.split(" ");
			for(int i=0;i<inParse.length;i++) {
				listString.add(inParse[i]);
			}
			}
			else {
				System.err.println("Entrada de dados invalida. Exemplo: <tipo_do_cliente>: <data1>, <data2>, <data3>, ...");
				System.exit(0);
			}
		return listString;
	}
	
	//Método que gera uma String válida para ser utilizada como data
	public List<String> parseDate(List<String> parse) {
		try {
			for(int j=1;j<parse.size();j++) {
				String s = parse.get(j).substring(0, 9);
				s = s.substring(2,5);
				switch (s) {
				case "Jan": {
					formated = parse.get(j).substring(0, 9).replace("Jan", "/01/");
					 parse.set(j,formated);
					 break;
				}
				case "Feb":{
					formated = parse.get(j).substring(0, 9).replace("Feb", "/02/");
					parse.set(j,formated);
					break;
				}
				case "Mar":{
					formated = parse.get(j).substring(0, 9).replace("Mar", "/03/");
					parse.set(j,formated);
					break;
				}
				case "Apr":{
					formated = parse.get(j).substring(0, 9).replace("Apr", "/04/");
					parse.set(j,formated);
					break;
				}
				case "May":{
					formated = parse.get(j).substring(0, 9).replace("May", "/05/");
					parse.set(j,formated);
					break;
				}
				case "Jun":{
					formated = parse.get(j).substring(0, 9).replace("Jun", "/06/");
					parse.set(j,formated);
					break;
				}
				case "Jul":{
					formated = parse.get(j).substring(0, 9).replace("Jul", "/07/");
					parse.set(j,formated);
					break;
				}
				case "Aug":{
					formated = parse.get(j).substring(0, 9).replace("Aug", "/08/");
					parse.set(j,formated);
					break;
				}
				case "Sep":{
					formated = parse.get(j).substring(0, 9).replace("Sep", "/09/");
					parse.set(j,formated);
					break;
				}
				case "Oct":{
					formated = parse.get(j).substring(0, 9).replace("Oct", "/10/");
					parse.set(j,formated);
					break;
				}
				case "Nov":{
					formated = parse.get(j).substring(0, 9).replace("Nov", "/11/");
					parse.set(j,formated);
					break;
				}
				case "Dec":{
					formated = parse.get(j).substring(0, 9).replace("Dec", "/12/");
					parse.set(j,formated);
					break;
				}
				}
			}
		} catch (Exception e) {
			System.err.println("Data invalida:");
			System.exit(0);
		}		
		return listString;
	}
	
	//Método que identifica o tipo do cliente (Regular ou Rewards) e atribui um Id para o tipo;
	public int changeClientType(List<String> list) {
		int id = 0;
		try {
		if(list.get(0).equals("regular") || list.get(0).equals("regular:")
				|| list.get(0).equals("Regular") || list.get(0).equals("Regular:")) {
			id = 0;
			list.set(0, "0");
		}
		else if(list.get(0).equals("rewards") || list.get(0).equals("rewards:")
				|| list.get(0).equals("Rewards") || list.get(0).equals("Rewards:")) {
			id = 1;
			list.set(0, "1");
		}
		}catch(Exception e) {
			System.err.println("Tipo de Cliente invalido! Modelo proposto pelo desafio: Regular ou Rewards.");
			System.exit(0);
		}
		return id;
	}
	
}
