package ejercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Funciones1 {
	public static LocalDate dimeFecha(String Texto, Scanner sc) {

		DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		do {
			try {

				System.out.println(Texto);
				String fechaTexto = sc.nextLine();
				LocalDate fecha = LocalDate.parse(fechaTexto, formato1);
		
				return fecha;

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Introduce una fecha coherente");
			}

		} while (true);
	}
	
	public static int diferenciaMeses(LocalDate fecha1,LocalDate fecha2) {
		int meses = (int) ChronoUnit.MONTHS.between(fecha1, fecha2);
		Math.abs(meses);
		return meses;

	}
	public static boolean fechaMasAntigua(LocalDate fecha1,LocalDate fecha2) {
		if(fecha2.isAfter(fecha1))
			return true;
		else
			return false;
	}
}
