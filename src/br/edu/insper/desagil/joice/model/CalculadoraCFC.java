package br.edu.insper.desagil.joice.model;

public class CalculadoraCFC extends Calculadora{
	public CalculadoraCFC() {
		super("Cúbica de Face Centrada");
	}
		
	public double calcula(double peso, double raio) {
		double massa;
		double volume;
		double densidade;
		
		raio *= Math.pow(10.0, -7.0);
		massa = (peso*4)/(6.023*Math.pow(10, 23));
		volume = Math.pow((4*raio)/Math.pow(2, 0.5), 3);
		densidade = massa/volume;
		return densidade;
		
	}
}
