package ejercicios;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class  Funciones2 {
	public static double mediadeFechaDias(LocalDate fecha1, LocalDate fecha2) {
		int meses = (int) ChronoUnit.MONTHS.between(fecha1, fecha2);
		Math.abs(meses);
		int cont = 0;
		double dias = 0;
		for(int i = 0; i<meses; i++) {
			cont=cont+fecha1.lengthOfMonth();
			fecha1= fecha1.plusMonths(1);
			
			
		}
		dias = cont / meses;
		return dias;
	}

	

}
