package br.com.rsinet.hub_tdd.utiuls;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.aspectj.apache.bcel.classfile.Constant;

public class ExcelUtiuls {

	private static XSSFSheet ExcelWSheet;

	private static XSSFWorkbook ExcelWBook;

	private static XSSFCell Cell;

	private static XSSFRow Row;

	public static void setExcelFile(String Path, String Planilha) throws Exception {

		try {

			// Open the Excel file

			FileInputStream ExcelFile = new FileInputStream(Planilha);

			// Access the required test data sheet

			ExcelWBook = new XSSFWorkbook(ExcelFile);

			ExcelWSheet = ExcelWBook.getSheet(Planilha);

		} catch (Exception e) {

			throw (e);

		}

	}

	public static String getCellData(int RowNum, int ColNum) throws Exception {

		try {

			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

			String CellData = Cell.getStringCellValue();

			return CellData;

		} catch (Exception e) {

			return "00000";

		}

	}

	 public static void setCellData(String Result, int RowNum, int ColNum) throws
	 Exception {

	 try {

	 Row = ExcelWSheet.getRow(RowNum);

	 Cell = Row.getCell(ColNum, Row.RETURN_BLANK_AS_NULL);

	 if (Cell == null) {

	 Cell = Row.createCell(ColNum);

	 Cell.setCellValue(Result);

	 } else {

	 Cell.setCellValue(Result);

	 }

	 FileOutputStream fileOut = new FileOutputStream(Constant.File_TestData);

	 ExcelWBook.write(fileOut);

	 fileOut.flush();

	 fileOut.close();

	 } catch (Exception e) {


	 }

	 }

}
