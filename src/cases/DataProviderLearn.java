package cases;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderLearn {
  @Test(dataProvider = "user")
  public void verifyUser(String userName, String password){
      System.out.println("Username: "+ userName + " Password: "+ password);
  }

  @DataProvider(name="user")
  public Object[][] Users() {
    return new Object[][] {      
		  {"root", "password" },
		  {"cnblogs.com", "tankxiao"},
		  {"tank","xiao"}
    };
  }  
}
