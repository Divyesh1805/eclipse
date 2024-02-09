package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
					features= {".//Features/login.feature",
							".//Features/news.feature",
							".//Features/appsAndTools.feature"},
					glue={"stepsDefinitions"}
					
			
				)
public class TestRun {
	

}
