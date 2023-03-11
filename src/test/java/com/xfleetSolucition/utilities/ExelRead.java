package com.xfleetSolucition.utilities;

import io.cucumber.java.lv.Tad;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class ExelRead {

    @Test
    public void read_from_exel_file() throws IOException {
        String path="UserInformation.xlsx";
        FileInputStream fileInput=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook =new XSSFWorkbook(fileInput);
        XSSFSheet xssfSheet=xssfWorkbook.getSheet("Driver");
        int a=xssfSheet.getPhysicalNumberOfRows();
        System.out.println(a);

        //XSSFCell xssfCell=xssfSheet.getRow(1).getCell(1)

    }

}
