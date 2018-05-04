package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features="src/main/java/feature/Leads.feature",glue = {"pages","hooks"}, tags= {"@Sanity"},monochrome=true)
//@CucumberOptions(features="src/main/java/feature/Leads.feature",glue = {"pages","hooks"}, tags= {"@Smoke,@Sanity"},monochrome=true)
//@CucumberOptions(features="src/main/java/feature/Leads.feature",glue = {"pages","hooks"}, tags= {"@Smoke","@Sanity"},monochrome=true)
//@CucumberOptions(features="src/main/java/feature/Leads.feature",glue = {"pages","hooks"}, tags= {"~@Smoke,@Sanity"},monochrome=true)

//@CucumberOptions(features="src/main/java/feature/Myntra.feature",glue = {"pages","hooks"}, tags= {"@smoke"},monochrome=true)

@CucumberOptions(features="src/main/java/feature/MyntraExercise.feature",glue = {"pages_myntra","hooks"}, tags= {"@smoke"},monochrome=true)

public class RunnerFile {
	
}
