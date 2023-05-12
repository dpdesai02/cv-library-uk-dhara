package resources.testdata;


import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "jobsearch")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"Tester", "Harrow", "5 miles", "30000", "500000", "Per annum", "Permanent", "Permanent Tester jobs in Harrow"},
                {"Automation Engineer", "London", "1 mile", "10000", "25000", "Per annum", "Permanent", "Permanent Automation Engineer jobs in London"},
                {"Accountant", "London", "5 miles", "30000", "50000", "Per month", "Contract", "Contract Accountant jobs in London"},
                {"Quality Technician", "Wales", "2 miles", "100", "500", "Per day", "Permanent", "Permanent Quality Technician jobs in Wales"},
                {"Administrator", "Leeds", "10 miles", "800", "1000", "Per week", "Permanent", "Permanent Administrator jobs in Leeds"},
                {"Warehouse Operative", "London", "15 miles", "1500", "2000", "Per month", "Part Time", "Part Time Warehouse Operative jobs in London"},
                {"Bank Manager", "London", "2 miles", "45000", "55000", "Per month", "Permanent", "Permanent Bank Manager jobs in London"}

        };
        return data;
    }
}


