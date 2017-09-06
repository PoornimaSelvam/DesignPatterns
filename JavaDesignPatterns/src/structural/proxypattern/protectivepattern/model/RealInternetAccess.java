package structural.proxypattern.protectivepattern.model;

public class RealInternetAccess implements InternetAccess {
	private String employeeName;
	
	public RealInternetAccess(String empName) {
		this.employeeName = empName;
	}

	@Override
	public void grantInternetAccess() {
		System.out.println("Internet Access granted for employee: " + employeeName);
	}

}
