package structural.proxypattern.virtualproxy.test;

import structural.proxypattern.virtualproxy.model.Image;
import structural.proxypattern.virtualproxy.model.ProxyImage;

/**
 * Proxy pattern provides a placeholder for another object to control access to it.
 * 
 * Proxy design pattern allows us to create a wrapper class over real object. 
 * Wrapper class which is proxy, controls access to real object, 
 * so in turn we can add extra functionalities to real object without changing real object's code.
 * 
 * Virtual Proxy – Imagine a situation where there is multiple database call to extract huge size image. 
 * Since this is an expensive operation we can possibly use the proxy pattern which would create multiple proxies and 
 * point to the huge size memory consuming object for further processing. The real object gets created only 
 * when a client first requests/accesses the object and after that we can just refer to the proxy to reuse the object. 
 * This avoids duplication of the object and hence saving memory.
 * 
 * Example: ProxyImage is a a proxy class to reduce memory footprint of RealImage object loading.
 *
 */
public class ProxyPatternDemo {
	public static void main(String[] args) {
		Image img = new ProxyImage("virtualProxyImage.jpg");
		
		img.showImage();
		
		System.out.println("After loading the image proxy of the image created");
		
		img.showImage();
	}
}
