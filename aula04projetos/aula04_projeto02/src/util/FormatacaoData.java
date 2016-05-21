package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatacaoData {

	//método para receber um Date e retorna-lo
	//no padrão yyyy-MM-dd
	public static String convertToString(Date data){
		
		//classe para formatação de datas no java..
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(data); //retornando a data formatada..		
	}
	
}
