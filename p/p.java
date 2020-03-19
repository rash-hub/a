package p;

import org.testng.Assert;
import org.testng.annotations.Test;

import aa.repository;

public class p {
public static void main(String[] args) {
	int a=12;
	int b=10
	System.out.println(a+b);
	@Test(dataProvider="data",dataProviderClass=repository.class)
	public void test1(String email,String password)  {
	repository r=new repository();
	click(r.getSignin());
	sendkeys(r.getEmail(),email);
	sendkeys(r.getPassword(),password);
	click(r.getLogin());
	Assert.assertTrue(r.getRasheed().isDisplayed());
	System.out.println("end");
}
}
