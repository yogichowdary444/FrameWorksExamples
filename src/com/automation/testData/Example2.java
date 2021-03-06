package com.automation.testData;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/* This example shows how to read data from XLSX */
class Example2 {

	@Test
	public void readTestData() {
		int numberOfRows;
		int numberOfColumns;
		XSSFWorkbook workBook = null;
		XSSFSheet sheet = null;
		XSSFRow row = null;
		try {
			workBook = new XSSFWorkbook(new FileInputStream(ApplicationConstants.TestData_XLSX));
			sheet = workBook.getSheet("PanOnline");
			numberOfRows = sheet.getPhysicalNumberOfRows();
			System.out.println("NumberOfRows:" + numberOfRows);
			for (int rowIndex = 0; rowIndex < numberOfRows; rowIndex++) {
				row = sheet.getRow(rowIndex);
				numberOfColumns = row.getPhysicalNumberOfCells();
				System.out.println("NumberOfColumns:" + numberOfColumns);
				for (int column = 0; column < numberOfColumns; column++) {
					System.out.print(row.getCell(column).toString() + "\t");
				}
				System.out.println();
			}
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		} finally {
			try {
				workBook.close();
			} catch (Exception exception) {
				System.out.println(exception.getMessage());
			}

		}

	}
}
