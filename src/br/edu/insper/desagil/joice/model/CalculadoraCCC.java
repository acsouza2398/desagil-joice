package br.edu.insper.desagil.joice.model;

public class CalculadoraCCC extends Calculadora{
	public CalculadoraCCC() {
		super("Cúbica de Corpo Centrado");
	}
		
	public double calcula(double peso, double raio) {
		double massa;
		double volume;
		double densidade;
		
		raio *= Math.pow(10.0, -7.0);
		massa = (peso*2)/(6.023*Math.pow(10, 23));
		volume = Math.pow((4*raio)/Math.sqrt(3), 3);
		densidade = massa/volume;
		return densidade;
		
	}
}
