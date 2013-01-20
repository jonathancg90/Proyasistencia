package Appi;
import java.io.DataOutputStream;
import java.io.File; 
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

import java.util.Date; 
import javax.swing.JTable;
import jxl.*; 
import jxl.read.biff.BiffException;
import jxl.write.*; 
import jxl.write.Number;

public class JExcel {
 
    private WritableWorkbook workbook;
    private WritableSheet sheet;
    private WritableFont Arialfont, Timesfont;
    private WritableCellFormat Arialcellfont, Timescellfont,
            IntegerFormat,FloatFormat,fivedpsFormat,dateFormat;
    private String _error = "Appi_JExcel_";
    private String data[][];
    
     public static void main(String[] args) throws IOException, WriteException, BiffException {
         JExcel xls = new JExcel();
         xls.ExcelUp();
         //xls.CreateXls("empleado.xls");
         //xls.ExcelTest();
    }
    public JExcel() throws WriteException{
       //Tipo de letra
            //Arial
            Arialfont = new WritableFont(WritableFont.ARIAL, 10);
            Arialfont.setColour(jxl.format.Colour.BLUE);
            
            Arialcellfont = new WritableCellFormat(Arialfont); 
            //Times Roman(16,Bold)
            Timesfont = new WritableFont(WritableFont.TIMES, 16, WritableFont.BOLD, true); 
            Timescellfont = new WritableCellFormat(Timesfont); 
        //Formato de celda
            //Formato para enteros
            IntegerFormat = new WritableCellFormat (NumberFormats.INTEGER);
            //Formato para float(dos decimales)
            FloatFormat = new WritableCellFormat (NumberFormats.FLOAT); 
            //Formato de numero personalizado
            NumberFormat fivedps = new NumberFormat("#.#####"); 
            fivedpsFormat = new WritableCellFormat(fivedps); 
            //Formato fecha
            DateFormat customDateFormat = new DateFormat ("dd MMM yyyy hh:mm:ss"); 
            dateFormat = new WritableCellFormat (customDateFormat); 
        
    }
    public void CreateXls(String file) throws IOException, WriteException {
        //Creacion del libro
        workbook = Workbook.createWorkbook(new File(file)); 
        sheet = workbook.createSheet("test", 0);  
    }
    public void ExcelTest() throws WriteException, IOException{
        //Columna,Fila(Comienza de 0)
        Label label = new Label(0, 1, "Informacion del empleado",Arialcellfont); 
        sheet.addCell(label); 

        Number number = new Number(3, 4, 3.1459,Timescellfont); 
        sheet.addCell(number);
        
        Number number2 = new Number(0, 4, 3.141519, IntegerFormat); 
        sheet.addCell(number2); 

        Number number3 = new Number(1, 4, 3.141519, FloatFormat); 
        sheet.addCell(number3);
        
        Number number4 = new Number(2, 4, 2.141519, fivedpsFormat); 
        sheet.addCell(number4);
        
        Date now = Calendar.getInstance().getTime(); 
        DateTime dateCell = new DateTime(0, 6, now, dateFormat); 
        sheet.addCell(dateCell); 
        
        workbook.write(); 
        workbook.close();
    }
    public void XlsEmpleado_Informacion(String id) throws IOException, WriteException{
        try {
            String file =  id + ".xls";
            CreateXls(file);
            Label label;
            label = new Label(0, 1, "Informacion del empleado",Arialcellfont); 
            sheet.addCell(label); 
            label = new Label(0, 3, "Nombre",Arialcellfont); 
            sheet.addCell(label); 
            label = new Label(0, 4, "Apellido",Arialcellfont); 
            sheet.addCell(label); 
            label = new Label(0, 5, "DNI",Arialcellfont); 
            sheet.addCell(label); 
            label = new Label(0, 6, "Telefonos",Arialcellfont); 
            sheet.addCell(label); 
            label = new Label(0, 7, "Area",Arialcellfont); 
            sheet.addCell(label);
            label = new Label(0, 8, "Cargo",Arialcellfont); 
            sheet.addCell(label); 
            label = new Label(0, 9, "Tipo",Arialcellfont); 
            sheet.addCell(label); 
            label = new Label(0, 10, "Estado",Arialcellfont);
            sheet.addCell(label); 
            label = new Label(0, 11, "Empresa",Arialcellfont); 
            sheet.addCell(label); 
            label = new Label(0, 12, "Sucursal",Arialcellfont);
            sheet.addCell(label); 
            
            
            WritableSheet hora = workbook.createSheet("Horaios", 1); 
            workbook.write(); 
            workbook.close();
        } catch(Exception e){
            System.out.println("XlsEmpleado_Informacion" + e);
        }

    }
    
    public boolean ExportJtable(JTable table,File file,String nombreTab){
    try{
        DataOutputStream out=new DataOutputStream(new FileOutputStream(file));

        WritableWorkbook w = Workbook.createWorkbook(out);
        WritableSheet s = w.createSheet(nombreTab, 0);  
        
        for(int i=0;i< table.getColumnCount();i++){
            s.addCell(new Label(i, 0, String.valueOf(table.getColumnName(i)))); 
            for(int j=0;j<table.getRowCount();j++){
                Object objeto=table.getValueAt(j,i);
                if(objeto==null){
                    objeto=" ";
                }
                s.addCell(new Label(i, j+1, String.valueOf(objeto)));
            }
        }

        w.write();
        w.close();
        out.close();
        return true;
    }
    catch(IOException ex){ex.printStackTrace();}
    catch(WriteException ex){ex.printStackTrace();}

    return false;
    }
    public void ExcelUp() throws IOException, BiffException {
        //String dir = System.getProperty( "user.home" ); Directorio raiz de la pc
        try {
            File miDir = new File (".");
            Workbook workbook = Workbook.getWorkbook(new File(miDir + "/data"+File.separatorChar+"area.xls"));
            Sheet sheet = workbook.getSheet(0);
            data = new String[sheet.getColumns()][sheet.getRows()];
            for(int c=0;c<sheet.getColumns();c++){
                for(int r=0;r<sheet.getRows();r++){
                    Cell temp = sheet.getCell(c,r); 
                    data[c][r] = temp.getContents(); 
                }
            }
            workbook.close();
        } catch(Exception e){
            System.out.println(_error + "ExcelUp: "+ e);
        }
    }
    
}
