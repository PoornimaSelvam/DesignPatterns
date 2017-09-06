package structural.proxypattern.protectivepattern.test;

import structural.proxypattern.protectivepattern.model.InternetAccess;
import structural.proxypattern.protectivepattern.model.ProxyInternetAccess;

/**
 * Protective Proxy – The protective proxy acts as an authorisation layer to verify if the actual user 
 * has access to appropriate content.
 * 
 * Proxy Object checks that the caller has the access permissions required prior to forwarding the request.
 * 
 * example: java.rmi.*;
 *
 */
public class ProxyPatternClient {
	public static void main(String[] args) {
		InternetAccess realAccess = new ProxyInternetAccess("Poornima");
		realAccess.grantInternetAccess();
	}
}
