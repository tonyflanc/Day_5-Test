package csv;

public class Bean {
	private String first_name;
	private String last_name;
	private String company_name;
	private String address;
	private String city;
	private String county;
	private String postal;
	private String phone1;
	private String phone2;
	private String email;
	private String web;

	public Bean(){

	}
	//快速将数组转换成bean
	public boolean inputByCount(String[] strs){
		this.first_name=strs[0];
		this.last_name=strs[1];
		this.company_name=strs[2];
		this.address=strs[3];
		this.city=strs[4];
		this.county=strs[5];
		this.postal=strs[6];
		this.phone1=strs[7];
		this.phone2=strs[8];
		this.email=strs[9];
		this.web=strs[10];
		return true;	
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.first_name+this.last_name+this.company_name+this.address+this.city
				+this.county+this.postal+this.phone1+this.email+this.web;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public void setCity(String city) {
		this.city = city;
	}


	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
}
