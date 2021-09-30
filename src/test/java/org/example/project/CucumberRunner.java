package org.example.project;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "json:target/destination/cucumber.json"},
    features = "src/test/resources/features/")
public class CucumberRunner {
}
