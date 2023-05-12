package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.library.customelisteners.CustomListeners;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {
    @FindBy(xpath = "//h1")
    WebElement resultText;

    public Boolean verifyTheResults(String expected) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("verify TheResults " + resultText.toString());
        CustomListeners.test.log(Status.PASS, "verify TheResults " + resultText);
        return resultText.getText().equals(expected);
    }
}
