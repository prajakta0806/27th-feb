package uitility;

	import java.io.FileInputStream;
	import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.WorkbookFactory;


	public class Parametrization {

		public static String snap(int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fileInputstream =new FileInputStream("D:\\Automation\\IBZeroda\\src\\main\\resources\\paramaterization.xlsx");
		 String V =WorkbookFactory.create(fileInputstream).getSheet("info").getRow(row).getCell(cell).getStringCellValue();
			return V;
		}
		}
		
		




