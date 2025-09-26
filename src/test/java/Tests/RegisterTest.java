package Tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.RegistrationPage;
import Utils.BaseTest;

public class RegisterTest extends BaseTest {

    @DataProvider(name = "registrationData")
    public Object[][] getRegistrationData() {
        return new Object[][] {
            {"Ramam", "Seshad", "123 Test Street", "Bangalore", "Karnataka", "560001", "9876543210", "123456789", "RamamaniQA4", "Vaish@456", "Vaish@456"},
            {"Lakshi", "Naraan", "456 Main Road", "Chennai", "Tamil Nadu", "600001", "9123456789", "987654321", "LakshmiQA5", "Lakshmi@789", "Lakshmi@789"},
            {"Anta", "Ravngfo", "789 Lake View", "Hyderabad", "Telangana", "500001", "9988776655", "111222333", "AnitaQA6", "Anita@765", "Anita@765"}
        };
    }

    @Test(dataProvider = "registrationData")
    public void testUserRegistration(String fName, String lName, String addr, String cityName, String stateName,
                                     String zip, String phoneNum, String ssnNum, String uname, String pwd, String rpwd) {
        RegistrationPage regPage = new RegistrationPage(driver);
        regPage.register(fName, lName, addr, cityName, stateName, zip, phoneNum, ssnNum, uname, pwd, rpwd);

        Assert.assertTrue(driver.getPageSource().contains("Your account was created successfully."));
    }
}
