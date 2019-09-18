package Today;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class MyProgramExcelRead {
	public static void main(String[] args) throws IOException {
		File file = new File("C://Heena//SheetData.xls");
		FileInputStream input = new FileInputStream(file) ;
		
		HSSFWorkbook wb = new HSSFWorkbook(input);
		HSSFSheet sheet = wb.getSheet("sheet1");
		
		System.out.println("Sheet1 has been created");
		
		int rowcount = sheet.getLastRowNum()+1;
		int cl = sheet.getRow(0).getLastCellNum();
		System.out.println("Row Count " +rowcount);
		System.out.println("Cloumn "+cl);
		String data0 = null;
	
		
		for(int i=0;i<rowcount;i++)
		{
			for(int j=0;j<cl;j++)
			{
				String name = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(name);
				
				if(name.equals("x"))
				{
					sheet.getRow(i).getCell(j+1).setCellValue("Pass");
					System.out.println("Wrtting is Done");
					System.out.println("\n");
				}
				else if(name.equals("N"))
				{
					sheet.getRow(i).getCell(j+1).setCellValue("fail");
					System.out.println("Writting is done");
				}	
			}
			System.out.println("\n");
		}
		FileOutputStream output = new FileOutputStream(file);
		wb.write(output);
		wb.close();
		
		/*System.out.println(" Writting Excel");	
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
		FileOutputStream Output = new FileOutputStream(file);
		wb.write(Output);
		wb.close();*/
	
		
	}

}
