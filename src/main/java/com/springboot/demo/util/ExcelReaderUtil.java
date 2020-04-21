package com.springboot.demo.util;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * POI解析Excel
 */
public class ExcelReaderUtil {

    /**
     * 根据fileType不同读取excel文件
     *
     * @param path
     * @param path
     * @throws IOException
     */
    @SuppressWarnings("resource")
	public static List<List<String>> readExcel(String path) {
        String fileType = path.substring(path.lastIndexOf(".") + 1);
        // return a list contains many list
        List<List<String>> lists = new ArrayList<List<String>>();
        //读取excel文件
        InputStream is = null;
        try {
            is = new FileInputStream(path);
            //获取工作薄
            Workbook wb = null;
            if (fileType.equals("xls")) {
                wb = new HSSFWorkbook(is);
            } else if (fileType.equals("xlsx")) {
                wb = new XSSFWorkbook(is);
            } else {
                return null;
            }

            //读取第一个工作页sheet
            Sheet sheet = wb.getSheetAt(0);
            Integer index = sheet.getPhysicalNumberOfRows();
            Row rr = null;
            
            //第一行为标题
            for(int i = 1;i<index;i++) {
            	ArrayList<String> list = new ArrayList<String>();
            	rr = sheet.getRow(i);
            	for(Cell cell : rr) {
            		cell.setCellType(Cell.CELL_TYPE_STRING);
                    list.add(cell.getStringCellValue());
            	}
            	lists.add(list);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null) is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return lists;
    }


    public static void main(String[] args) {
        String path = "E:/test/company.xlsx";
        List<List<String>> lists = readExcel(path);
        for (List<String> list : lists) {
        	System.out.println(list);
            for (String strs : list) {
                System.out.println(strs);
            }
        }
    }


}