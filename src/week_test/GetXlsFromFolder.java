package week_test;

import java.io.File;

public class GetXlsFromFolder {
	/**
	 * ��ȡFolderPath�ļ���������.xls�ļ�
	 * @param FolderPath
	 * @return
	 */
	public File[] GetAllXlsFile(String FolderPath){
		File file=new File(FolderPath);	
		File[] filesList = file.listFiles();
		System.out.println("�����ļ�:"+"\n");
		for(int i=0;i<filesList.length;i++){			
			//System.out.println(filesList[i]);
		}
	
	return filesList;		
	}
}
