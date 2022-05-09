package com.syngenta.control;

import java.util.ArrayList;
import java.util.List;

import com.syngenta.model.Hotel;

public class Algorithm {
	
	/***
	 * Classe responsável por efetuar a soma dos dias de estadia
	 * verificando se são (true) ou não (false) finais de semana
	 * com o tipo do cliente (Regular = 0 ou Rewards = 1)
	 */
	
	private Hotel hotelLakewood = new Hotel("Lakewood", 3, 110.00, 90.00, 80.00, 80.00, 0.00);
	private Hotel hotelBridgewood = new Hotel("Bridgewood", 4, 160.00, 60.00, 110.00, 50.00, 0.00);
	private Hotel hotelRidgewood = new Hotel("Ridgewood", 5, 220.00, 150.00, 100.00, 40.00, 0.00);
	
	//Verifica-se o tipo do cliente e as entradas de estadia. Somando o valor de cada hotel
	//em seu atributo "sumOfValues". No final, havalia qual o menor valor e se houver igualdade
	//é retornado o com maior Classificação
	public Hotel runAlgorithm(List<String> weekend, Integer typeClient) {
		List<Hotel> hotelList = new ArrayList<Hotel>();
		hotelList.add(hotelLakewood);
		hotelList.add(hotelBridgewood);
		hotelList.add(hotelRidgewood);
		
		for(int j =1;j<weekend.size();j++) {		
		if(Boolean.parseBoolean(weekend.get(j)) && typeClient == 0) {
			hotelList.get(0).sumValueMethod(hotelList.get(0).getValueWeekEndRegularClient());
			hotelList.get(1).sumValueMethod(hotelList.get(1).getValueWeekEndRegularClient());
			hotelList.get(2).sumValueMethod(hotelList.get(2).getValueWeekEndRegularClient());
		}
		
		else if(!Boolean.parseBoolean(weekend.get(j)) && typeClient == 0) {
			hotelList.get(0).sumValueMethod(hotelList.get(0).getValueWeekRegularClient());
			hotelList.get(1).sumValueMethod(hotelList.get(1).getValueWeekRegularClient());
			hotelList.get(2).sumValueMethod(hotelList.get(2).getValueWeekRegularClient());
		}
		
		else if(Boolean.parseBoolean(weekend.get(j)) && typeClient == 1) {
			hotelList.get(0).sumValueMethod(hotelList.get(0).getValueWeekEndRewardClient());
			hotelList.get(1).sumValueMethod(hotelList.get(1).getValueWeekEndRewardClient());
			hotelList.get(2).sumValueMethod(hotelList.get(2).getValueWeekEndRewardClient());
		}
				
		else if(!Boolean.parseBoolean(weekend.get(j)) && typeClient == 1) {
			hotelList.get(0).sumValueMethod(hotelList.get(0).getValueWeekRewardClient());
			hotelList.get(1).sumValueMethod(hotelList.get(1).getValueWeekRewardClient());
			hotelList.get(2).sumValueMethod(hotelList.get(2).getValueWeekRewardClient());
		}
	}

		hotelList.add(3, hotelList.get(0));
		for(int i=1;i<4;i++) {
			if(hotelList.get(i-1).getsumOfValues() <= hotelList.get(i).getsumOfValues()
					&& hotelList.get(i-1).getsumOfValues() <= hotelList.get(3).getsumOfValues()) {
				//Avalia se é igual e se for, retorna o com maior classificação
					if(hotelList.get(i-1).getsumOfValues().equals(hotelList.get(3).getsumOfValues())) {
						if(hotelList.get(i-1).getClassification() > hotelList.get(3).getClassification()) {
							System.out.println("Iguais");
							hotelList.set(3, hotelList.get(i-1));
						}
					}
					else {
						hotelList.set(3, hotelList.get(i-1));
					}
			}
		}
		
		System.out.println("De acordo com seu tipo de fidelidade e as datas informadas,\no hotel " +
				hotelList.get(3).getName() + " teria os valores mais baixos. Valor total da reserva: " + 
		hotelList.get(3).getsumOfValues() + "\n" + "\n" + hotelList.get(0).getName() + " Valor total da reserva: " + 
		hotelList.get(0).getsumOfValues()
		 + "\n" + hotelList.get(1).getName() + " Valor total da reserva: " + 
			hotelList.get(1).getsumOfValues()
			 + "\n" + hotelList.get(2).getName() + " Valor total da reserva: " + 
				hotelList.get(2).getsumOfValues());
		
		return hotelList.get(3);
	}
	
}
