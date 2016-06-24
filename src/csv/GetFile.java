package csv;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class GetFile {
	public static Map getFileToStr(String fileStr) throws IOException{
		File file=new File(fileStr);
		String result;
		String [] resultsALine;
		String [] resultsFirstName;
		Map<String, Integer> map=new HashMap<>();
		InputStream ins=null;
		InputStreamReader isr=null;
		BufferedInputStream bis=null;
		BufferedReader bf=null;
		try {
			ins=new FileInputStream(file);
			bis=new BufferedInputStream(ins);
			isr=new InputStreamReader(bis);
			bf=new BufferedReader(isr);
			while((result=bf.readLine())!=null){	
				resultsALine=result.split(",");
				if(map.get(resultsALine[0])==null){
					map.put(resultsALine[0],1);
				}else{
					int i=map.get(resultsALine[0]);
					map.put(resultsALine[0], i+1);
				}
				
				
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			ins.close();
			bis.close();
			isr.close();
			bf.close();
		}
		return map;
		
	}
}
