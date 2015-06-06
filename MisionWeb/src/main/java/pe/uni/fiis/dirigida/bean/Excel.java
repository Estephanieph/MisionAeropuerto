package pe.uni.fiis.dirigida.bean;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Esther on 31/05/2015.
 */
public class Excel {
    public static void main(String[] args){
        Workbook wb = new HSSFWorkbook();
        Sheet hoja1 = wb.createSheet();
        FileOutputStream out = null;

        Vuelo a = new Vuelo();

        Row row1 = hoja1.createRow(1);

        Cell cell1_0 = row1.createCell(0);
        Cell cell1_1 = row1.createCell(1);
        Cell cell1_2 = row1.createCell(2);
        Cell cell1_3 = row1.createCell(3);
        Cell cell1_4 = row1.createCell(4);
        Cell cell1_5 = row1.createCell(5);
        Cell cell1_6 = row1.createCell(6);
        Cell cell1_7 = row1.createCell(7);

        cell1_0.setCellValue("CARACTERISTICA");
        cell1_1.setCellValue("TIPO");
        cell1_2.setCellValue("HORA");
        cell1_3.setCellValue("DESTINO");
        cell1_4.setCellValue("CIA");
        cell1_5.setCellValue("EMBARQUE");
        cell1_6.setCellValue("PUERTA");
        cell1_7.setCellValue("OBSERVACIONES");


        Row row2 = hoja1.createRow(2);

        Cell cel21_0 = row2.createCell(0);
        Cell cel21_1 = row2.createCell(1);
        Cell cel21_2 = row2.createCell(2);
        Cell cel21_3 = row2.createCell(3);
        Cell cel21_4 = row2.createCell(4);
        Cell cel21_5 = row2.createCell(5);
        Cell cel21_6 = row2.createCell(6);
        Cell cel21_7 = row2.createCell(7);

        cel21_0.setCellValue(a.getCaracteristica("Entrada"));
        cel21_1.setCellValue(a.getTipo("Nacional"));
        cel21_2.setCellValue(a.getHora("3:20"));
        cel21_3.setCellValue(a.getDestino("Cusco"));
        cel21_4.setCellValue(a.getIdVuelo("L3A"));
        cel21_5.setCellValue(a.getEmbarque("3:20"));
        cel21_6.setCellValue(a.getPuerta(3));
        cel21_7.setCellValue(a.getObservaciones("Embarcando"));


        Sheet sheet = wb.getSheetAt(0);
        sheet.autoSizeColumn(0);
        sheet.autoSizeColumn(1);
        sheet.autoSizeColumn(2);
        sheet.autoSizeColumn(3);
        sheet.autoSizeColumn(4);
        sheet.autoSizeColumn(5);
        sheet.autoSizeColumn(6);
        sheet.autoSizeColumn(7);


        try{
            out = new FileOutputStream("Aeropuerto.xls");
            wb.write(out);
        }catch(IOException e){
            System.out.println(e.toString());
        }finally{
            try {
                out.close();
            }catch(IOException e){
                System.out.println(e.toString());
            }
        }
    }
}