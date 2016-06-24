package week_test;

import java.io.File;

public class GetXlsFromFolder {
	/**
	 * 获取FolderPath文件夹下所有.xls文件
	 * @param FolderPath
	 * @return
	 */
	public File[] GetAllXlsFile(String FolderPath){
		File file=new File(FolderPath);	
		File[] filesList = file.listFiles();
		System.out.println("所有文件:"+"\n");
		for(int i=0;i<filesList.length;i++){			
			//System.out.println(filesList[i]);
		}
	
	return filesList;		
	}
}
