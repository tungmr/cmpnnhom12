/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbh.tools;

import java.io.File;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

/**
 *
 * @author HoangDucTung
 */
public class Excel {
    
    public static void xuatFileExcel(JTable jTable ,String duongDan){
        WritableWorkbook writableWorkbook = null;
        DefaultTableModel tableModel = (DefaultTableModel) jTable.getModel();
        try {
            writableWorkbook = Workbook.createWorkbook(new File(duongDan));
            WritableSheet excelSheet = writableWorkbook.createSheet("Sheet 1", 0);
            // add something into the Excel sheet
            WritableCellFormat cFormat = new WritableCellFormat();
            WritableFont font = new WritableFont(WritableFont.ARIAL, 16, WritableFont.BOLD);
            cFormat.setFont(font);
            
            for (int i=0;i<tableModel.getColumnCount();i++){
                // cột i dòng 0
                Label label = new Label(i, 0, tableModel.getColumnName(i), cFormat);
                excelSheet.addCell(label);
            }
            
            for (int i=0;i<tableModel.getRowCount();i++){
                for (int j=0;j<tableModel.getColumnCount();j++){
                    Label label = new Label(j, i+1, tableModel.getValueAt(i, j).toString());
                    excelSheet.addCell(label);
                }
            }

            writableWorkbook.write();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (WriteException e) {
            e.printStackTrace();
        } finally {

            if (writableWorkbook != null) {
                try {
                    writableWorkbook.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (WriteException e) {
                    e.printStackTrace();
                }
            }


        }
        
    }
    
   
}
