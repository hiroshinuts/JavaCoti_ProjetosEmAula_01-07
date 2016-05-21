package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatacaoData {

	//m�todo para receber um Date e retorna-lo
	//no padr�o yyyy-MM-dd
	public static String convertToString(Date data){
		
		//classe para formata��o de datas no java..
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(data); //retornando a data formatada..		
	}
	
}
