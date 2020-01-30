package br.com.marcelo.testjpa.biblioteca.util;

import java.util.Calendar;

public class FormatarDatas {

	public static Calendar formataData(String data) {
		
		// 0123456789
		// 24-07-1998
		Integer dia = Integer.parseInt(data.substring(0,2));
		Integer mes = Integer.parseInt(data.substring(3,5));
		Integer ano = Integer.parseInt(data.substring(6));
		
		//mes 0 = Janeiro
		mes--;
		
		Calendar c = Calendar.getInstance();
		c.set(ano, mes, dia);
		
		return c;
	}
}