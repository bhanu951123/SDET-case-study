package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("C:/Users/BHANUSANGARAJU/eclipse-workspace/selenium.cucumber/Excel/signup.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);		
			
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int rowCount=sheet.getPhysicalNumberOfRows();
		
		for(int noofrows=1;noofrows<=rowCount;noofrows++){
			
			for(int i=0;i<=7;i++) {
				System.out.println(sheet.getRow(noofrows).getCell(i).getStringCellValue());
			}
			
			
		}
		
		
		
		
		

	}

}
