package ejercicios;

import java.time.LocalDate;

public class reto {

	public static void main(String[] args) {
		LocalDate fecha1 = LocalDate.now();
		LocalDate fecha2 = LocalDate.of(2025,11,14);
		Funciones2.mediadeFechaDias(fecha1, fecha2);
		
	}

}
