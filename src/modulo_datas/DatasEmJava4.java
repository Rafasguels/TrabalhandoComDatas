package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DatasEmJava4 {

	public static void main(String[] args) throws ParseException {

				
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("1994-11-22"), LocalDate.now()); /*localDate.now data de agora*/
		
		System.out.println("Possui: " + dias + " dias entre faixa de datas");
			
	}

}
