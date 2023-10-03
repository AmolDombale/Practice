package Steps;

import java.util.List;

import org.testng.annotations.Test;

public class mylist {
	ListTest objListTest=new ListTest();
	@Test
	public void m1() {
		List<String> l  = objListTest.listobjects();
		
		for(String s:l) {
			
			
		}
	}

}
