package utilities;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.core.tools.picocli.CommandLine.Help.TextTable.Cell;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

public class Excelreader {
	
	public static int totalRow;

	public List<Map<String, String>> getData(String excelFilePath, String sheetName) throws InvalidFormatException, IOException  {

		Workbook workbook = WorkbookFactory.create(new File(excelFilePath));
		
		Sheet sheet = (Sheet) workbook.getSheet(sheetName);
		workbook.close();
		return readSheet(sheet);
	}	

	private List<Map<String, String>> readSheet(Sheet sheet) {

		Row row;
		org.apache.poi.ss.usermodel.Cell cell;

		totalRow = ((org.apache.poi.ss.usermodel.Sheet) sheet).getLastRowNum();

		List<Map<String, String>> excelRows = new ArrayList<Map<String, String>>();

		for (int currentRow = 1; currentRow <= totalRow; currentRow++) {

			row = ((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(currentRow);

			int totalColumn = row.getLastCellNum();

			LinkedHashMap<String, String> columnMapdata = new LinkedHashMap<String, String>();

			for (int currentColumn = 0; currentColumn < totalColumn; currentColumn++) {

				cell = row.getCell(currentColumn);

				String columnHeaderName = ((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(((org.apache.poi.ss.usermodel.Sheet) sheet).getFirstRowNum()).getCell(currentColumn)
						.getStringCellValue();

				columnMapdata.put(columnHeaderName, cell.getStringCellValue());
			}

			excelRows.add(columnMapdata);
		}

		return excelRows;
	}

	public int countRow() {

		return totalRow;
	}

}