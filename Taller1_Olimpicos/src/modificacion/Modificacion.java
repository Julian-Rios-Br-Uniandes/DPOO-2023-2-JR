package modificacion;

import java.io.FileNotFoundException;
import java.io.IOException;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class Modificacion {
	
//	private CalculadoraEstadisticas calc;

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		System.out.println("Hola, mundo!");
		
		CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
		System.out.println("El pais con mas medallistas es:"+calc.paisConMasMedallistas());

	}

}
