package startClass;

import smokeTests.LoginPage;

public class StartClass {
	public static String environment;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Start POM Framework");
		
		environment = "HMS_LOGIN_PAGE";
		
		LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request().selectors(
				
				LoginPage.class
				
				)
		
	}

}
