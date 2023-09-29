package Steps;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Login {

	
	  @Given("Select the following values for Custom Grid") 
	  public void select_the_following_values_for_custom_grid(DataTable datatable) {
		 Map<String, String> data1= datatable.asMap();			
			 System.out.println("Second:"+data1.get("Name"));
		
	  
		for(Map<String, String> data:datatable.asMaps(String.class,String.class))
		{
		System.out.println(data.get("Asset State"));
		//System.out.println(data.get("Assert1"));
		}
	  }
	 
	@When("Enter {string} and {string}")
	public void enter_and(String Usernmae, String Password) {

		System.out.println(Usernmae);
		System.out.println(Password);
	}
	
	 @When("Verify assetType label")
	  public void verify_assetType_label(DataTable label) {
	    List<String> assettype = label.asList();
	   System.out.println(assettype.get(0));
	   System.out.println(assettype.get(1));
	   System.out.println(assettype.get(2));
	   System.out.println(assettype.get(3));
	   System.out.println(assettype.get(4));
	   
	  }
	 
	 public void m1() {
		 System.out.println("New Changes");
	 }

}
