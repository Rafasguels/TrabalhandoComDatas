package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava3 {

	public static void main(String[] args) throws ParseException {

		Calendar calendar = Calendar.getInstance(); /*Pega a data atual*/
		
		/*Simular que a data vem do banco de dados ou qualquer outro input*/
		
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2021")); /*Definindo uma data qualquer*/
		
		calendar.add(Calendar.DAY_OF_MONTH, -40); /*Data de hoje em dias*/
		System.out.println("Somando dias do mes: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.MONTH, 1); 
		System.out.println("Somando mes: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.YEAR, 1); 
		System.out.println("Somando 1 anos: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		
				
		

	}

}
