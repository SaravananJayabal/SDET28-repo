package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetFirstAndSecondColumnDataTest {
	//get first and second cell data
	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("./src/test/resources/Data03.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Sheet1");
		int RowNo = sheet.getLastRowNum();
		for (int i=1;i<=RowNo;i++) {
			Row row = sheet.getRow(i);
			String firstColumnData = row.getCell(0).getStringCellValue();
			String secondColumnData = row.getCell(1).getStringCellValue();
			System.out.println(firstColumnData+"\t"+secondColumnData);
		}
		workbook.close();

		

	}

}
