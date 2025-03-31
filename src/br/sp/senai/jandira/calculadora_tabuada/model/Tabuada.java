package br.sp.senai.jandira.calculadora_tabuada.model;

public class Tabuada {
	private double multiplicando;
	private double minimoMultiplicador;
	private double maximoMultiplicador;
	
	public double getMultiplicando() {
		return multiplicando;
	}
	public void setMultiplicando(double multiplicando) {
		this.multiplicando = multiplicando;
	}
	public double getMinimoMultiplicador() {
		return minimoMultiplicador;
	}
	public void setMinimoMultiplicador(double minimoMultiplicador) {
		this.minimoMultiplicador = minimoMultiplicador;
	}
	public double getMaximoMultiplicador() {
		return maximoMultiplicador;
	}
	public void setMaximoMultiplicador(double maximoMultiplicador) {
		this.maximoMultiplicador = maximoMultiplicador;
	}
	
	
	public void calcularTabuada() {
		//Verificar se os valores estão invertidos
		if(minimoMultiplicador > maximoMultiplicador) {
			double temp = minimoMultiplicador;
			minimoMultiplicador = maximoMultiplicador;
			maximoMultiplicador = temp;
		}
		
		//Calcular e mostrar tabuada
		while (minimoMultiplicador <= maximoMultiplicador) {
			double produto = multiplicando * minimoMultiplicador;
			System.out.printf("%s X %s = %s\n", multiplicando, minimoMultiplicador, produto);
			minimoMultiplicador++;
		}
		System.err.println("acabou...");
	}
	
}
