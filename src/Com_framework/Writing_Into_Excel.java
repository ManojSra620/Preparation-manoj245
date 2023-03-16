package Com_framework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.ITestListener;

public class Writing_Into_Excel {

	public static void main(String[] args) throws Throwable 
	{
		// C:\Users\manoj\eclipse-workspace\Framework_test\src\Com_framework
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sh=wb.createSheet("Data Sheet");
		Row r=sh.createRow(0);
		Cell c=r.createCell(0);
		c.setCellValue("Manoj");
		File f=new File("C:\\Users\\manoj\\eclipse-workspace\\Framework_test\\src\\Com_framework\\Testdata.xlsx");
		FileOutputStream fo=new FileOutputStream(f);
		wb.write(fo);
		System.out.println("writing is done");
		
		
		
	}

}
