package com.cursoceat.controller;
import com.cursoceat.instrumentomusical.Piano;
import com.cursoceat.instrumentomusical.Nota;

public class Controller {

	public static void main(String[] args) {
		Nota cancion[] = {Nota.DO, Nota.SI, Nota.SOL, Nota.RE, Nota.FA}; //notas
		Piano p=new Piano();
		for (Nota nota: cancion) { //añadimos las notas al piano
			p.add(nota);
		}
		p.interpretar();
		
	}

}
