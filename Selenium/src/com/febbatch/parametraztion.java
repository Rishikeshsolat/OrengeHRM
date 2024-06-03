package com.febbatch;
import org.apache.poi.ss.usermodel.Sheet;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class parametraztion {
	public static void main(String[] args) throws IOException 
	{
		FileInputStream inputstrem = new FileInputStream("C:\\Users\\sai\\Videos\\infty1.xlsx");
		Sheet ks =	WorkbookFactory.create(inputstrem).getSheet("Sheet1");
		String infty =	ks.getRow(1).getCell(1).getStringCellValue();
		System.out.println(infty);
		
		
		
	}

}
