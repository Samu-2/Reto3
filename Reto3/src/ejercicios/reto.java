package ejercicios;

import java.time.LocalDate;

import java.util.Scanner;


public class reto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LocalDate fecha2;
		int difmeses=0;
		String nombre="";
		String corto="";
		String corto2="";
		double media=0;
	LocalDate fecha1; 
do {
	fecha1= Funciones1.dimeFecha("Introduce una fecha", sc);

		 fecha2 = Funciones1.dimeFecha("Introduce segunda fecha", sc);
	
} while (!fecha1.isBefore(fecha2));		


	if(	fecha1.getYear()==fecha2.getYear()) {
		 difmeses=Funciones1.diferenciaMeses(fecha1, fecha2);
		 if(difmeses<3) {
				
		
		
			
			for (int i = 0; i <4; i++) {
			
			nombre=Funciones1.dimeCadenaTexto("Introduce un nombre", sc);
		     corto=Funciones1.nombreMasCorto(nombre);
			}
			System.out.println(corto);
			
	     }else {
		
	for(int i=0;i<=difmeses;i++) {
		 nombre=Funciones1.dimeCadenaTexto("Introduce un nombre", sc);
		 corto2=Funciones1.nombreMasCorto(nombre);
		 


		

	}
	     }
	}
	
	if(	!(fecha1.getYear()==fecha2.getYear())) {
		media=Funciones2.mediadeFechaDias(fecha1, fecha2);
		System.out.println(media);
	}
	
		
		 
		
	


	

}
	
	}

	

