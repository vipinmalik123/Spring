package org.vmalik.common;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FileNameGenerator {
	private String prefix;
	private String type;
	private String dateFormat;
	
	public String getPrefix() {
		return prefix;
	}
	
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getDateFormat() {
		return dateFormat;
	}
	
	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
	}
	
	public String generateName() {
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		String currentDate = sdf.format(new Date());
		return prefix + "_" + currentDate + "." + type;
	}
}
