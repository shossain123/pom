package lib;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	String filename;
	String sheetName;
	Sheet sh;
	public ExcelReader(String f, String st) throws IOException {
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		sh=	wb.getSheet(st);
	}
	
	public Object[][] excelToArray(){
		Object[][]table;
		
		int Rows = sh.getPhysicalNumberOfRows();
		int Cols = sh.getRow(0).getPhysicalNumberOfCells();
		table = new Object[Rows-1][Cols];
		
		for(int r=1;r<Rows;r=r+1) {
			for(int c=0;c<Cols;c=c+1) {
				Cell cell = sh.getRow(r).getCell(c);
				if(cell.getCellType()==Cell.CELL_TYPE_STRING ) {
					String value = cell.getStringCellValue();
					table[r-1][c] = value;
					
				}
				else {
					if(cell.getNumericCellValue()% 1 ==0) {
						int v = (int)cell.getNumericCellValue();
						table[r-1][c]= ""+v;
					}
				
				else {
					double d =cell.getNumericCellValue();
					table[r-1][c]=""+d;
				}	
			}
		}
		}
		
		return table;
	}
	
	
	
}
