package test1;

	import java.io.IOException;
	import javax.xml.parsers.ParserConfigurationException;

	import org.xml.sax.SAXException;

import com.common.excelreport.ExcelReportGenerator;

	
	
	public class ReportGenerator {

		public static void main(String[] args) throws ParserConfigurationException,IOException,SAXException {
			
			ExcelReportGenerator.generateExcelReport("ExcelReport.xlsx","/home/lavanyamstecnot/eclipse-workspace");
			// TODO Auto-generated method stub

		}

	}



