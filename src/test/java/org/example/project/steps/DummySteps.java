package org.example.project.steps;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.project.data.DummyData;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.*;

public class DummySteps {

  private DummyData dummyData;

  @When("^User input number as '(\\d+)'$")
  public void user_input_number_as(int arg1) throws Exception {
    dummyData = new DummyData();
    dummyData.setNumber(arg1);
  }

  @Then("^The number inputted is '(\\d+)'$")
  public void the_number_inputted_is(int arg1) throws Exception {
    assertThat("Input berbeda", arg1, Matchers.equalTo(dummyData.getNumber()));
  }
}
