package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmjava {

	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance();
		
		Date date  =  new Date();
		
		
		
		System.out.println("Data em milisegundo: " +  date.getTime());
		System.out.println("Data em milisegundo: " +  calendar.get(Calendar.DAY_OF_MONTH));
		
		
		System.out.println("Dia do mes: " + date.getDate());
		
		System.out.println("Dia da semana: " + date.getDay());
		
		System.out.println("minutos do dia: " + date.getMinutes());
		
		System.out.println("Segundo " + date.getSeconds());
		
		System.out.println("ano : " + date.getYear());
		
		/******************** Simples Date Format *******************/
		
		SimpleDateFormat simpleDateFormart = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Data atual usando padrão string: " + simpleDateFormart.format(date));
		
		simpleDateFormart = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println("Data em formato para banco de dados: " + simpleDateFormart.format(date));
		
		System.out.println("Objeto Date: " + simpleDateFormart.parse("1994-11-22 15:10:2"));
		
		
		
		
	}

}
