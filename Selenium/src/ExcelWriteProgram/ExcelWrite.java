package ExcelWriteProgram;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	public static void main(String[] args) throws IOException {
		File source = new File("C://Heena//ExcelData//DemoData.xls");
		FileInputStream  input  = new FileInputStream(source);

		HSSFWorkbook wb = new HSSFWorkbook(input);
		HSSFSheet sheet = wb.getSheetAt(0);
		
		int rowcount = sheet.getLastRowNum()+1;
		int cl = sheet.getRow(0).getLastCellNum();
		System.out.println(rowcount);
		System.out.println(cl);
		
		System.out.println(" Writting Excel");	
		for(int i=0;i<rowcount;i++)
		{
			for(int j=0;j<cl;j++)
			{
				String name = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(name);
				
				if(name.equals("Y"))
				{
					System.out.println("helloooo");
					sheet.getRow(i).getCell(j+1).setCellValue("pass");
					System.out.println("Wrtting is Done");
				}
				else if(name.equals("n"))
				{
					sheet.getRow(i).getCell(j+1).setCellValue("fail");
					System.out.println("Wrtting is Done");
				}
				
				
			}
		}
		FileOutputStream Output = new FileOutputStream(source);
		wb.write(Output);
		wb.close();
		/*sheet.getRow(0).createCell(1).setCellValue("Pass");
		sheet.getRow(1).createCell(1).setCellValue("Fail");
		sheet.getRow(2).createCell(1).setCellValue("Fail");
		sheet.getRow(3).createCell(1).setCellValue("9/11/2019");
		sheet.getRow(4).createCell(1).setCellValue("562.452");
		*/
		
	}

}
