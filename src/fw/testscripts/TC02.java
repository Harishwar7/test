package fw.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import fw.lib.General;

public class TC02 {
  //public static void main (String args[]) {
	@Test
	public void tc02() {
		DOMConfigurator.configure("log4j.xml");
	  General obj = new General ();
	  obj.openApplication();
	  obj.login();
	  obj.addEmp();
	  obj.delEmp();
	  obj.logout();
	  obj.closeApplication();
  }
}
