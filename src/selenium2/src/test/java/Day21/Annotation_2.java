package Day21;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;


public class Annotation_2 {
	WebDriver driver;
	WebDriver wait;
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is Before Suite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is Before Test");
	}
	@BeforeGroups("group1")
	public void beforeGroups() {
		System.out.println("This is Before groups :group1");
			
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println(" This is Before class");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is Before Method"); 
	} @Test(groups = {"group1"})
    public void test1() {
        System.out.println("Executing Test 1 - group1");
    }

    @Test(groups = {"group2"})
    public void test2() {
        System.out.println("Executing Test 2 - group2");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

    @AfterGroups("group1")
    public void afterGroups() {
        System.out.println("After Groups: group1");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }
	

}
