package util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FormatacaoData {

	//método estatico para receber uma data do java e retorna-la
	//como string no padrão do mysql (yyyy-MM-yy HH:mm:ss)
	public static String convertToString(Date data){
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(data);		
	}
	
	//método estatico para receber uma string e retorna-la como Date
	public static Date convertToDate(String data){
		
		int ano = Integer.parseInt(data.substring(0,4));
		int mes = Integer.parseInt(data.substring(5,7));
		int dia = Integer.parseInt(data.substring(8,10));
		
		int hora = Integer.parseInt(data.substring(11,13));
		int minuto = Integer.parseInt(data.substring(14,16));
		int segundo = Integer.parseInt(data.substring(17,19));
		
		Calendar cal = new GregorianCalendar(ano, mes-1, dia, hora, minuto, segundo);
		return cal.getTime(); //retornando o Callendar como Date..
	}
	
}




