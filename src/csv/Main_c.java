package csv;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main_c {
    //读取csv文件并输出名字重复数量
	public static String filePath="C:/Users/Chen/Desktop/uk-unknown.csv";
	public static void main(String[] args) {
		
		Map map=new HashMap<>();
		
		// TODO Auto-generated method stub
			try {
				map=GetFile.getFileToStr(filePath);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(Object key:map.keySet()){
				System.out.println(key+" "+map.get(key));
			}
			
	}

}
