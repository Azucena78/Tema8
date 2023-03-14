package com.cursoceat.instrumentomusical;
import java.util.Arrays;
import com.cursoceat.instrumentomusical.Nota;

//clase abstracta
public abstract class Instrumento {
	protected Nota[] melodia; //tabla que almacena las notas a interpretar
	public Instrumento() {
		melodia = new Nota[0]; //creamos la tabla
	}
	//Usa el algoritmo de inserción no ordenada
	public void add(Nota n) {
		melodia = Arrays.copyOf(melodia, melodia.length +1); //redimensionamos
		melodia[melodia.length -1] = n; //insertamos el nuevo elemento al final
	}
	abstract void interpretar (); //a implementar en cada subclase
}
