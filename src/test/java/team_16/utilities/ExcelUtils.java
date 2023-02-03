package team_16.utilities;

import org.apache.poi.ss.usermodel.*;
import org.testng.Assert;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class ExcelUtils {
    private Workbook workBook;
    private Sheet workSheet;
    private String path;
    //EXCEL PATH'I VE SAYFAYA ULASMAK ICIN KULLANILIR
    public ExcelUtils(String path, String sheetName) { //BU BIR CONTRUCTORDUR
        this.path = path;
        try {
            // DOSYAYI ACMAK ICIN
            FileInputStream fileInputStream = new FileInputStream(path);
            // SONRA ISTEDIGIM EXCEL DOSYASINA
            workBook = WorkbookFactory.create(fileInputStream);
            //SONRA ISTEDIGIM SAYFAYA
            workSheet = workBook.getSheet(sheetName);
            //BENIM GONDERDIGIM PATH GECERLI DEGILSE VE SHEET ISMIDE GECERLI DEGILSE ALTTA YAZILAN MESAJI VERICEK
            Assert.assertNotNull(workSheet, "Worksheet: \"" + sheetName + "\" was not found\n");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
//--------------------------------------------------------------------------------------------------------------------------
    //This will get the list of the data in the excel file
    //This is a list of map of string. This takes the data as string and will return the data as a Map of String

    //BU BIR METHOD
    //BU METHOD EXCELDEKI VERILERI lIST OLARAK ALMAMIZI SAGLAR KEY VE VALUE SEKLINDE VERECEK
    //EXCELDEKI VERILERI TEST SINIFINDA KULLANMAK ICIN BU METHODU KULLANACAGIZ
    public List<Map<String, String>> getDataList() {
        // getting all columns
        List<String> columns = getColumnsNames();
        // method will return this
        List<Map<String, String>> data = new ArrayList<>();
        for (int i = 1; i < rowCount(); i++) {
            // get each row
            Row row = workSheet.getRow(i);
            // creating map of the row using the column and value
            // key=column, value=cell
            Map<String, String> rowMap = new HashMap<String, String>();
            for (Cell cell :row) {
                int columnIndex = cell.getColumnIndex();
                rowMap.put(columns.get(columnIndex), cell.toString());
            }
            data.add(rowMap);
        }
        return data;
    }
    //--------------------------------------------------------------------------------------------------------------------------
    //===============EXCELDEKI TOPLAM SUTUN SAYISINI RETURN EDER (KULLANILAN SUTUNLARI)=================
    public int columnCount() { //
        //getting how many numbers in row 1
        return workSheet.getRow(0).getLastCellNum();
    }
    //--------------------------------------------------------------------------------------------------------------------------
    //===============EXCELDEKI SATIR SAYISINI RETURN EDER(KULLANILMIS SATIR SAYISINI)====================
    public int rowCount() {
        return workSheet.getLastRowNum() + 1; }//adding 1 to get the actual count
    //--------------------------------------------------------------------------------------------------------------------------
    //============EXCELDEKI HUCRELERDE OLAN DATALARI ALMAK ICIN KULLANIRIZ(5,2)INDEX KULLANARAK============
    public String getCellData(int rowNum, int colNum) {
        Cell cell;
        try {
            cell = workSheet.getRow(rowNum).getCell(colNum);
            String cellData = cell.toString();
            return cellData;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    //--------------------------------------------------------------------------------------------------------------------------
    //=======EXCELDEKI DATALARI ALIP ARRAY'E KOYUYORUZ IKI BOYUTLU OLARAK========
    public String[][] getDataArray() {
        String[][] data = new String[rowCount()][columnCount()];
        for (int i = 0; i < rowCount(); i++) {
            for (int j = 0; j < columnCount(); j++) {
                String value = getCellData(i, j);
                data[i][j] = value;
            }
        }
        return data;
    }
    //--------------------------------------------------------------------------------------------------------------------------
    //==============EXCELDEKI SUTUN ISIMLERINI VERIR(YANI SADECE BASLIKLARI ALIR YANI EXCELIN ILK SATIRINI ALIR)==================//
    public List<String> getColumnsNames() {
        List<String> columns = new ArrayList<>();
        for (Cell cell : workSheet.getRow(0)) {
            columns.add(cell.toString());
        }
        return columns;
    }
    //--------------------------------------------------------------------------------------------------------------------------
    //=========UC PARAMETRE KULLANARAK EXCELE YAZI YAZARIZ PARAMETRELER (YAZDIRILACAK YAZI,SATIR,SUTUN)SIRASIYLA===============//
    public void setCellData(String value, int rowNum, int colNum) {
        Cell cell;
        Row row;
        try {
            row = workSheet.getRow(rowNum);
            cell = row.getCell(colNum);
            if (cell == null) {//if there is no value, create a cell.
                cell = row.createCell(colNum);
                cell.setCellValue(value);
            } else {
                cell.setCellValue(value);
            }
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            workBook.write(fileOutputStream);
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //--------------------------------------------------------------------------------------------------------------------------
    //BU METHOD USTEKI METHODUN YARDIMCISI (USTTEKI METHODLA BIRLIKTE CALISIR )
    // PARAMETRELER=GIRILECEK DEGER ,COLUMADI(ONR=USERNAME COLUMUNA),VE CELL NOSU
    public void setCellData(String value, String columnName, int row) {
        int column = getColumnsNames().indexOf(columnName);
        setCellData(value, row, column);
    }
    //--------------------------------------------------------------------------------------------------------------------------
    //BU METHOD TUM EXCELDEKI DATALARI IKI BOYUTLU SEKILDE ALIR DIGER METHODTAN FARKLI OLARAK BASLIK KISMINI ALMAZ
    //this method will return data table as 2d array
    //so we need this format because of data provider.
    public String[][] getDataArrayWithoutFirstRow() {
        String[][] data = new String[rowCount()-1][columnCount()];
        for (int i = 1; i < rowCount(); i++) {
            for (int j = 0; j < columnCount(); j++) {
                String value = getCellData(i, j);
                data[i-1][j] = value;
            }
        }
        return data;
    }
}