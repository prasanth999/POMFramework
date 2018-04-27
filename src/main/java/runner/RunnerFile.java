package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/feature/Leads.feature",glue = {"pages","hooks"}, tags= {"@Sanity"},monochrome=true)
//@CucumberOptions(features="src/main/java/feature/Leads.feature",glue = {"pages","hooks"}, tags= {"@Smoke,@Sanity"},monochrome=true)
//@CucumberOptions(features="src/main/java/feature/Leads.feature",glue = {"pages","hooks"}, tags= {"@Smoke","@Sanity"},monochrome=true)
//@CucumberOptions(features="src/main/java/feature/Leads.feature",glue = {"pages","hooks"}, tags= {"~@Smoke,@Sanity"},monochrome=true)
public class RunnerFile {
	
}
