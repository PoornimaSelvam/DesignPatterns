package structural.proxypattern.protectivepattern.model;

public class ProxyInternetAccess implements InternetAccess {
	private String employeeName;
	private RealInternetAccess realAccess;
	
	public ProxyInternetAccess(String empName) {
		this.employeeName = empName;
	}

	@Override
	public void grantInternetAccess() {
		if(getRole(employeeName) > 5) {
			realAccess = new RealInternetAccess(employeeName);
			realAccess.grantInternetAccess();
		} else {
			System.out.println("No Internet Access granted. Your Job level is below 5");
		}
	}
	
	public int getRole(String empName){
		if(empName.equalsIgnoreCase("Poornima")){
			return 9;
		}
		return 4;
	}

}
