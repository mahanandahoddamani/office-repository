package xlSupport;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class XLFileReader {

	

		public String xlFile(int rw, int cc){
		File file = new File("D:\\Workspace\\Resources.xlsx");
		
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		XSSFWorkbook workbook = null;
		try {
			workbook = new XSSFWorkbook(inputStream);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		Sheet xlSht = workbook.getSheet("Sheet1");
		
		Row rw1= xlSht.getRow(rw);
		Cell c1  = rw1.getCell(cc);	;
		String data = c1.toString();
		
	return data;

	}}

