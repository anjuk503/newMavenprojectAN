package mavenproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
XSSFSheet sh;
 public String readData(int i,int j)
 {
Row r=sh.getRow(i);
Cell c=r.getCell(j);
int in=c.getCellType();
//System.out.println(in);

switch(in) {
case Cell.CELL_TYPE_NUMERIC:
{
	double d=c.getNumericCellValue();
	return String.valueOf(d);
}
case Cell.CELL_TYPE_STRING:
{
	String s=c.getStringCellValue();
	return s;
}

}

return null;
 }
	Excel() throws IOException
	{
	FileInputStream f= new FileInputStream("D:\\Book1.xlsx");

	XSSFWorkbook w= new XSSFWorkbook(f);
			sh= w.getSheet("Sheet1");

	}
	

}
