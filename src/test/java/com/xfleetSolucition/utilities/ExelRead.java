package com.xfleetSolucition.utilities;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExelRead {
    public void read_from_exel_file() throws IOException {
        String path="UserInformation.xlsx";
        FileInputStream fileInput=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook =new XSSFWorkbook(fileInput);
        XSSFSheet xssfSheet=xssfWorkbook.getSheet("Driver");


    }

}
