package day17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritindDatas {
	
	
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle style;
	
	
   public static int getRowCount(String xlfile,String xlsheet) throws IOException{
	   fi=new FileInputStream(xlfile);
	   wb=new XSSFWorkbook(fi);
	   ws=wb.getSheet(xlsheet);
	   int rowcount=ws.getLastRowNum();
	   wb.close();
	   fi.close();
	   return rowcount;
	   
  }
   public static int getCellCount(String xlfile,String xlsheet,int rownum) throws IOException{
	   fi=new FileInputStream(xlfile);
	   wb=new XSSFWorkbook(fi);
	   ws=wb.getSheet(xlsheet);
	   int cellcount=ws.getRow(0).getLastCellNum();
	   
	   wb.close();
	   fi.close();
	   return cellcount;
	   
  }
   public static void setCellData(String xlfile,String xlsheet,int rownum,int colnum,String data) throws IOException{
	   fi=new FileInputStream(xlfile);
	   wb=new XSSFWorkbook(fi);
	   ws=wb.getSheet(xlsheet);
	   row=ws.getRow(rownum);
	   cell=row.createCell(colnum);
	   cell.setCellValue(data);
	   fo=new FileOutputStream(xlfile);
	   wb.write(fo);
	   wb.close();
	   fi.close();
	   fo.close();
	   
	   
	   
   }
	   
	   
	  
   
   
   public static String getCellData(String xlfile,String xlsheet,int rownum,int colnum) throws IOException{
	   fi=new FileInputStream(xlfile);
	   wb=new XSSFWorkbook(fi);
	   ws=wb.getSheet(xlsheet);
	   row=ws.getRow(rownum);
	   cell=row.getCell(colnum);
	   
	   String data;
	   try {
		   DataFormatter formatter=new DataFormatter();
		   data=formatter.formatCellValue(cell);
		   return data;
	   }
	   catch(Exception e) {
		   data="";
	   }
	   wb.close();
	   fi.close();
	   return data;
	   
	  
   }
  public static void fillRedColor(String xlfile,String xlsheet,int rownum,int column) throws IOException{
	  
	   fi=new FileInputStream(xlfile);
	   wb=new XSSFWorkbook(fi);
	   ws=wb.getSheet(xlsheet);
	   row=ws.getRow(rownum);
	   cell=row.getCell(column);
	   
	   style=wb.createCellStyle();
	   style.setFillForegroundColor(IndexedColors.RED.getIndex());
	   style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	   
	   cell.setCellStyle(style);
	   fo=new FileOutputStream(xlfile);
	   wb.write(fo);
	   wb.close();
	   fi.close();
	   //return rowcount;
  }
  public static void fillGreenColor(String xlfile,String xlsheet,int rownum,int column) throws IOException{
	  
	   fi=new FileInputStream(xlfile);
	   wb=new XSSFWorkbook(fi);
	   ws=wb.getSheet(xlsheet);
	   row=ws.getRow(rownum);
	   cell=row.getCell(column);
	   
	   style=wb.createCellStyle();
	   style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
	   style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	   
	   cell.setCellStyle(style);
	   fo=new FileOutputStream(xlfile);
	   wb.write(fo);
	   wb.close();
	   fi.close();
	   //return rowcount;
 }
   
	
		// TODO Auto-generated method stub
		
		
	        
	        /*XSSFRow row1=sheet.createRow(0);
	        XSSFRow row2=sheet.createRow(1);
	        XSSFRow row3=sheet.createRow(2);
	        
	        row1.createCell(0).setCellValue("welcome");
	        row1.createCell(1).setCellValue("12345");
	        row1.createCell(2).setCellValue("xyx");
	        
	        
	        
	        row2.createCell(0).setCellValue("wel");
	        row2.createCell(1).setCellValue("xsnx");
	        row2.createCell(2).setCellValue("delhi");
	        
	        
	        row3.createCell(0).setCellValue("dcj");
	        row3.createCell(1).setCellValue("xscb");
	        row3.createCell(2).setCellValue("odisa");
	        
	        
	        workbook.write(file);
	        workbook.close();
	        file.close();
	        
	        System.out.println("Writing is done");*/
		
		   /*for(int r=0;r<3;r++) {
			   
			   XSSFRow row=sheet.createRow(r);
			   for(int c=0;c<3;c++) {
				  
				   
				   System.out.println("Enter a value:");
				   String val=sc.next();
				   row.createCell(c).setCellValue(val);
				   
			   }
		   }
           workbook.write(file);
           workbook.close();
           file.close();*/
         
	

}
