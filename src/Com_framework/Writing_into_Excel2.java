package Com_framework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing_into_Excel2 
{
	public static void main(String[] args) throws IOException 
	{
		
		
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sh=wb.createSheet();
		XSSFRow r=sh.createRow(0);
		XSSFCell c=r.createCell(0);
		c.setCellValue("Manoj");
		File f=new File("C:\\Users\\manoj\\OneDrive\\Desktop\\Writetoexcel\\seleniumexcel.xlsx");
		FileOutputStream fo=new FileOutputStream(f);
		wb.write(fo);
		wb.close();
		System.out.println("wrote in seleniumexcel");
		
	}

}
