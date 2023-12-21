package org.example.agilite;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "org.axample.agilite", // Package des définitions de pas (step definitions)
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class RunCucumberTest {
    // Cette classe ne nécessite pas de méthodes spécifiques
}

