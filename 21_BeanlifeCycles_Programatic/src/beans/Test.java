package beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Test implements InitializingBean,DisposableBean
{
	private String driver,url,username,password;
	
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init...connection");
		
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy... connection");		
	}
	
	

}
