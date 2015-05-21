package com.llx.ocsys.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class JavaDateConverter {
	
	private JavaDateConverter(){}
	
	public static Date StringConverterDate(String date){
		Date parse =null;
		try {
			Long time = Long.valueOf(date);
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );
			String format = simpleDateFormat.format(time);
			parse = simpleDateFormat.parse(format);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return parse;
	}
}
