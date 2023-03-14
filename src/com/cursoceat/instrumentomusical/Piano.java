package com.cursoceat.instrumentomusical;
import com.cursoceat.instrumentomusical.Nota;

public class Piano extends Instrumento {
	
	public Piano() {
		super(); //constructor de la superclase
	}

	@Override //implementamos el metodo abstracto
//	recorremos las notas y las interpretamos de la forma específica del piano
	public void interpretar() {
		for (Nota nota: melodia) {
			switch (nota) {
			case DO ->
				System.out.println("do ");
			case RE ->
				System.out.println("re ");
			case MI ->
				System.out.println("mi ");
			case FA ->
				System.out.println("fa ");
			case SOL ->
				System.out.println("sol ");
			case LA ->
				System.out.println("la ");
			case SI ->
				System.out.println("si ");
			}
		}
				System.out.println("");
	}
	
}
