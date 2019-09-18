package ExcelWriteProgram;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {
	private static final char Y= 0;
	public static void main(String[] args) throws IOException {
		File file = new File("C://Heena//ExcelData//DemoData.xls");
		FileInputStream fls = new FileInputStream(file);

		HSSFWorkbook wb = new HSSFWorkbook(fls);

		HSSFSheet sheet1 = wb.getSheet("sheet1");
		
		int rowcount = sheet1.getLastRowNum();
		int cl = sheet1.getRow(0).getLastCellNum();

		System.out.println("Total Number of rows is " + rowcount);
		System.out.println("Total Number of column is " + cl);
		System.out.println("\n");
		String data0 = null;
		
		
		data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("UserName : "+data0);
		data0 = sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("TestToRun :"+data0);
		data0 = sheet1.getRow(0).getCell(2).getStringCellValue();
		System.out.println("Status :"+data0);
		System.out.println("\n ");
		data0 = sheet1.getRow(1).getCell(0).getStringCellValue();
		System.out.println("UserName :"+data0);
		data0 = sheet1.getRow(1).getCell(1).getStringCellValue();
		System.out.println("TestToRun :"+data0);
		data0 = sheet1.getRow(1).getCell(2).getStringCellValue();
		System.out.println("Status :"+data0);
		System.out.println("\n");
		data0 = sheet1.getRow(2).getCell(0).getStringCellValue();
		System.out.println("UserName :"+data0);
		data0 = sheet1.getRow(2).getCell(1).getStringCellValue();
		System.out.println("UserName :"+data0);
		
		data0 = sheet1.getRow(1).getCell(2).getStringCellValue();
		System.out.println("Status :"+data0);
		
		
		/*String data0 = null;
		for (int i = 0; i <= rowcount; i++) {
			for (int j = 0; j < cl; j++) {

				data0 = sheet1.getRow(i).getCell(j).getStringCellValue();
				if(data0.equals("Y"))
				{
					String name= sheet1.getRow(i).getCell(j-1).getStringCellValue();
					System.out.println("Data From Excel " + i + " X " + j + " is " + name);
					
				}
			}
		System.out.println();*/
	}
	}

