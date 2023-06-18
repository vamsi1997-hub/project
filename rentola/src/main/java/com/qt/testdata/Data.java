package com.qt.testdata;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

public class Data {
    private static final Map<Integer,String> keys = new HashMap<>();
    private static final Map<Integer,String> values = new HashMap<>();
    private static final Map<String, String> dataComb = new HashMap<>();

    public static void readTestData(String testCaseID){
        try {
            FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "//TestData//test.xlsx");
            Workbook wb = WorkbookFactory.create(fileInputStream);
            for (Sheet sh : wb) {
                Sheet sheet = wb.getSheet(sh.getSheetName());
                for (Row row : sheet) {
                    Cell firstCell = row.getCell(0);
                    if (firstCell == null) {
                        continue;
                    }
                    String label = firstCell.getStringCellValue();
                    if (label.equalsIgnoreCase("testCaseID")) {
                        for (Cell cell : row) {
                            keys.put(cell.getColumnIndex(), cell.getStringCellValue());
                        }
                    } else if (label.equalsIgnoreCase(testCaseID)) {
                        for (Cell cell : row) {
                            values.put(cell.getColumnIndex(), cell.getStringCellValue());
                        }
                    }
                }
            }
                    for (int j : values.keySet()) {
                        dataComb.put(keys.get(j), values.get(j));
                    }

            System.out.println(dataComb);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    public static String getData(String key) {
       return dataComb.get(key);
    }
}
