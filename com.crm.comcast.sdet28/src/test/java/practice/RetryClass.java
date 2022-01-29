package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.comcast.GenericUtility.RetryImplementationClass;

public class RetryClass extends RetryImplementationClass {
	@Test(retryAnalyzer = com.crm.comcast.GenericUtility.RetryImplementationClass.class)
	public void retry() {
		Assert.assertEquals(false, true);
	}
}