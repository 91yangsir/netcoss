package com.yangsir.project.convertor;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

public class GlobalUtilDateConverter implements Converter<String, Date> {

	@Override
	public Date convert(String text) {
		// TODO Auto-generated method stub
		Date date = null;
		if (StringUtils.hasLength(text)) {
			int lenth = text.length();
			try {
				if (lenth == 10) {
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					date = sdf.parse(text);
				} else {
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
					date = sdf.parse(text);
				}
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return date;
	}

}