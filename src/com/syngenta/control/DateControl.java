package com.syngenta.control;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class DateControl {
	
	/***
	 * Classe que realiza o controle de entrada de datas
	 */
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Calendar cal = Calendar.getInstance();
	
	//Método que insere o dia/mes/ano de acordo com a entrada do User
	public List<String> setDate(List<String> dateInput) {
		try {
			for(int i=1;i<dateInput.size();i++) {
				cal.set(Integer.parseInt(dateInput.get(i).substring(6, 10)), Integer.parseInt(dateInput.get(i).substring(3, 5))-1
						,Integer.parseInt(dateInput.get(i).substring(0, 2)));
				dateInput.set(i, sdf.format(cal.getTime()));
				dateInput.set(i, String.valueOf(cal.get(Calendar.DAY_OF_WEEK)));
				}
		}
		catch (Exception e) {
			System.err.println("Data invalida! Modelo proposto pelo desafio:\nEspaco + dia, mes(tres primeiras letras sendo a primeira maiuscula), Ano (Opicional: Dia da semana)"
					+ "\nExemplo: (17Mar2009(tues), 09Mai2022(mon))");
			System.exit(0);
		}
		return dateInput;
	}
	
	//Método que verifica se a data corresponde a um dia da semana ou final de semana
	public List<String> isWeekEnd(List<String> dayOfWeek) {
		for(int i=1;i<dayOfWeek.size();i++) {
			if(Integer.parseInt(dayOfWeek.get(i)) == 1 || Integer.parseInt(dayOfWeek.get(i)) == 7) {
				dayOfWeek.set(i, "true");
			}
			else {
				dayOfWeek.set(i, "false");
			}
		}
		return dayOfWeek;
	}
	
}


