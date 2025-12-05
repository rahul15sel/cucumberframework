package hooks;


import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.qameta.allure.Attachment;


public class hooks {


    @Before
    public void beforeScenario() {
        System.out.println("Starting Scenario...");
    }


    @After
    public void afterScenario(Scenario scenario) {
        attachText("Scenario Completed: " + scenario.getName());
    }


    @Attachment(value = "Log", type = "text/plain")
    public String attachText(String message) {
        return message;
    }
}