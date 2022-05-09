package com.syngenta.model;

public class Hotel {
	
	/***
	 * Um "Bean" que representa um tipo de Hotel e seus atributos
	 * Possuí o atributo "sumOfValues" que recebe a soma das hospedagens
	 * que o User inserir 
	 */
	
	private String name;
	private Integer classification;
	private Double valueWeekRegularClient;
	private Double valueWeekEndRegularClient;
	private Double valueWeekRewardClient;
	private Double valueWeekEndRewardClient;
	private Double sumOfValues = 0.00;
	
	public Double getsumOfValues() {
		return sumOfValues;
	}

	public void setsumOfValues(Double sumOfValues) {
		this.sumOfValues = sumOfValues;
	}
	
	public void sumValueMethod(Double sumOfValues) {
		this.sumOfValues += sumOfValues;
	}

	public Hotel() {
	}

	public Hotel(String name, Integer classification, Double valueWeekRegularClient,
			Double valueWeekEndRegularClient, Double valueWeekRewardClient, Double valueWeekEndRewardClient,
			Double sumOfValues) {
		this.name = name;
		this.classification = classification;
		this.valueWeekRegularClient = valueWeekRegularClient;
		this.valueWeekEndRegularClient = valueWeekEndRegularClient;
		this.valueWeekRewardClient = valueWeekRewardClient;
		this.valueWeekEndRewardClient = valueWeekEndRewardClient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getClassification() {
		return classification;
	}

	public void setClassification(Integer classification) {
		this.classification = classification;
	}

	public Double getValueWeekRegularClient() {
		return valueWeekRegularClient;
	}

	public void setValueWeekRegularClient(Double valueWeekRegularClient) {
		this.valueWeekRegularClient = valueWeekRegularClient;
	}

	public Double getValueWeekEndRegularClient() {
		return valueWeekEndRegularClient;
	}

	public void setValueWeekEndRegularClient(Double valueWeekEndRegularClient) {
		this.valueWeekEndRegularClient = valueWeekEndRegularClient;
	}

	public Double getValueWeekRewardClient() {
		return valueWeekRewardClient;
	}

	public void setValueWeekRewardClient(Double valueWeekRewardClient) {
		this.valueWeekRewardClient = valueWeekRewardClient;
	}

	public Double getValueWeekEndRewardClient() {
		return valueWeekEndRewardClient;
	}

	public void setValueWeekEndRewardClient(Double valueWeekEndRewardClient) {
		this.valueWeekEndRewardClient = valueWeekEndRewardClient;
	}
	
}
