package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.library.customelisteners.CustomListeners;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitleElement;

    @FindBy(xpath = "//input[@id='location']")
    WebElement locationElement;
    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;


    public void enterJobTitle(String jobTitle) {
        Reporter.log("enter JobTitle " + jobTitleElement.toString());
        CustomListeners.test.log(Status.PASS, "get confirm password RequiredMessage " + jobTitleElement);
        sendTextToElement(jobTitleElement, jobTitle);
    }

    public void enterLocation(String location) {
        Reporter.log("enter Location " + locationElement.toString());
        CustomListeners.test.log(Status.PASS, "enter Location " + locationElement);
        sendTextToElement(locationElement, location);
    }

    public void selectDistance(String distance) {
        Reporter.log("select Distance " + distanceDropDown.toString());
        CustomListeners.test.log(Status.PASS, "select Distance " + distanceDropDown);
        selectByVisibleTextFromDropDown(distanceDropDown, distance);
    }


    public void clickOnMoreSearchOptionLink() {
        Reporter.log("click On More Searc hOptionLink " + moreSearchOptionsLink.toString());
        CustomListeners.test.log(Status.PASS, "click On More Searc hOptionLink " + moreSearchOptionsLink);
        clickOnElement(moreSearchOptionsLink);
    }

    public void enterMinSalary(String minSalary) {
        Reporter.log("enter MinSalary " + salaryMin.toString());
        CustomListeners.test.log(Status.PASS, "enter MinSalary " + salaryMin);
        sendTextToElement(salaryMin, minSalary);
    }

    public void enterMaxSalary(String maxSalary) {
        Reporter.log("enter MaxSalary " + salaryMax.toString());
        CustomListeners.test.log(Status.PASS, "enter MaxSalary " + salaryMax);
        sendTextToElement(salaryMax, maxSalary);
    }

    public void selectSalaryType(String sType) {
        Reporter.log("select SalaryType " + salaryTypeDropDown.toString());
        CustomListeners.test.log(Status.PASS, "select SalaryType " + salaryTypeDropDown);
        selectByVisibleTextFromDropDown(salaryTypeDropDown, sType);
    }

    public void selectJobType(String jobType) {
        Reporter.log("select JobType " + jobTypeDropDown.toString());
        CustomListeners.test.log(Status.PASS, "select JobType " + jobTypeDropDown);
        selectByVisibleTextFromDropDown(jobTypeDropDown, jobType);
    }

    public void clickOnFindJobsButton() {
        Reporter.log("click On Find JobsButton " + jobTypeDropDown.toString());
        CustomListeners.test.log(Status.PASS, "click On Find JobsButton " + jobTypeDropDown);
        clickOnElement(findJobsBtn);
    }

}

