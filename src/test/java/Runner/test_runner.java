package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/CaseStudy1/CaseStudy1.feature"}, 
glue = {"StepDefinition"},
plugin = {"html:testoutput/sowmyap.html", "junit:testoutput/sowmyap.xml", "json:testoutput/sowmyap.json"}
)
public class test_runner {

}
