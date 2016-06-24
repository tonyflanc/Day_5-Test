package week_test;

public class XlsBean {
	private String date;
	private String project;
	private double workTime;
	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}
	
	
	
	public XlsBean(String date,String project,double workTime){
		this.date=date;
		this.project=project;
		this.workTime=workTime;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getWorkTime() {
		return workTime;
	}
	public void setWorkTime(double workTime) {
		this.workTime = workTime;
	}


}
