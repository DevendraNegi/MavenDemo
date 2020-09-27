package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestMe {

@Given("I want to write a step with precondition1")
public void i_want_to_write_a_step_with_precondition() {
  System.out.println("I want to write a step with precondition1");
}

@When("I complete action1")
public void i_complete_action() {
	System.out.println("I complete action1"); 
}

@Then("I validate the outcomes1")
public void i_validate_the_outcomes() {
	System.out.println("I validate the outcomes1");
}

}
