package week_test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import jxl.read.biff.BiffException;

public class Test_Main {

	public static final String  FolderPath="C:/Users/Chen/Desktop/ExcelDatas";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_Main t=new Test_Main();
		try {
			t.getProjcetsWork();
		} catch (BiffException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	//获得所有项目名字
	public Set getAllProjects() throws BiffException, IOException{
		String strOfProject = null;
		Set set=new HashSet();
		GetXlsFromFolder getXlsFromFolder=new GetXlsFromFolder();
		Get_xls_File get_xls_File=new Get_xls_File();
		File[] files=getXlsFromFolder.GetAllXlsFile(FolderPath);
		//遍历所有文件，得到单个文件的数据后依次相加String字符串
		for(int i=0;i<files.length;i++){
			File itemFile;
			itemFile=files[i];
			strOfProject=strOfProject+get_xls_File.ReadXls(itemFile);
		}
		//项目名不为空时根据标记":"将字符串导入数组最后加进set
		if(strOfProject!=null){
			String[] projects=strOfProject.split(":");
			for(String item:projects){
				set.add(item);
			}
		}
		return set;
	}
	
	/**
	 * 各项目工作量之和
	 * @throws BiffException
	 * @throws IOException
	 */
	public void getProjcetsWork() throws BiffException, IOException{
		Test_Main t=new Test_Main();
		Set set=new HashSet<>();
		Map map=new HashMap<>();
		List<XlsBean> mList=new ArrayList<>();
		GetXlsFromFolder getXlsFromFolder=new GetXlsFromFolder();
		Get_xls_File get_xls_File=new Get_xls_File();
		File[] files=getXlsFromFolder.GetAllXlsFile(FolderPath);
		//遍历所有文件，得到所有文件的数据，最终输入List列表
		for(int i=0;i<files.length;i++){
			File itemFile;
			itemFile=files[i];
			mList.addAll(get_xls_File.GetXlsProjectWork(itemFile));
		}
		//将项目名字输入Set得到不重复的项目名列表
		set=t.getAllProjects();
		Object[] object=set.toArray();
		//根据项目名从List列表中获得工作时间并相加
		for(int i=0;i<object.length;i++){
			double value=0;
			for(int j=0;j<mList.size();j++){
				if(mList.get(j).getProject().equals(object[i])){
					value=value+mList.get(j).getWorkTime();
				}
			}
			map.put(object[i],value);
		}
		//输出项目名和工作时间
		for(int i=0;i<map.size();i++){
			System.out.println(object[i]+","+map.get(object[i]));
		}
		
	}
}
