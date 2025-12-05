package stepdefinitions;


import io.cucumber.java.en.*;
import org.testng.Assert;


public class SampleSteps {


    int number1;
    int result;
    String text1;
    boolean condition;


    @Given("a number {int}")
    public void a_number(int num) {
        number1 = num;
    }


    @When("added with {int}")
    public void added_with(int num2) {
        result = number1 + num2;
    }


    @When("subtracted by {int}")
    public void subtracted_by(int num2) {
        result = number1 - num2;
    }


    @Then("result should be {int}")
    public void result_should_be(int expected) {
        Assert.assertEquals(result, expected);
    }


    @Given("text {string}")
    public void text(String txt) {
        text1 = txt;
    }


    @When("compared with {string}")
    public void compared_with(String txt2) {
        Assert.assertEquals(text1, txt2);
    }


    @Then("result should be equal")
    public void result_should_be_equal() {
        Assert.assertNotNull(text1);
    }


    @Then("it should not be empty")
    public void it_should_not_be_empty() {
        Assert.assertFalse(text1.isEmpty());
    }


    @Given("condition true")
    public void condition_true() {
        condition = true;
    }


    @Then("framework should work")
    public void framework_should_work() {
        Assert.assertTrue(condition);
    }
}