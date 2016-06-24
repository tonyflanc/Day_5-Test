package week_test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Get_xls_File {
	/**
	 * 读取Excel的.xls文件,返回字符串result
	 * @return
	 * @throws BiffException
	 * @throws IOException
	 */
	public String ReadXls(File file) throws BiffException, IOException{
		String result = "";
		Set set=new HashSet();
		Workbook workbook=Workbook.getWorkbook(file);	
		//row(i) 行 columns(j) 列
		for(int n=0;n<workbook.getNumberOfSheets();n++){
			Sheet sheet=workbook.getSheet(n);
			for(int i=3;i<sheet.getRows();i++){
				int j=3;
				Cell cell=sheet.getCell(j,i);
				if(cell.getContents()!=""){
					result=result+cell.getContents()+":";
				}	
			}
		}	
		workbook.close();
		return result;

	}
	
	/**
	 * 获得某文件中的XLSBean类型数据的List列表
	 * @param file
	 * @return
	 * @throws BiffException
	 * @throws IOException
	 */
	public List<XlsBean> GetXlsProjectWork(File file) throws BiffException, IOException{
		List<XlsBean> mList=new ArrayList<>();
		Workbook workbook=Workbook.getWorkbook(file);
		for(int n=0;n<workbook.getNumberOfSheets();n++){
			Sheet sheet=workbook.getSheet(n);
			for(int i=3;i<sheet.getRows();i++){
				int dateTag=0,projectTag=3,workTimeTag=8;
				String date=sheet.getCell(dateTag, i).getContents();
				
				String workTimeSheet=sheet.getCell(workTimeTag, i).getContents();
				double workTime;
				if(workTimeSheet!=""){
					workTime=Double.parseDouble(workTimeSheet.trim());
				}else{
				    workTime=0;
				}		
				String project=sheet.getCell(projectTag, i).getContents();
				XlsBean b=new XlsBean(date,project,workTime);
				mList.add(b);	
			}
		}	
		return mList;
		
	}
	
	
	
}
