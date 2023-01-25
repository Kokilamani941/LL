package Runner;


import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@Test
@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","html:target/dsAlgoReport.html"},
                monochrome=true,
                dryRun=false,
                tags="@TS_ll_08",
                features = {"src/test/resources/features" },
                glue = { "Step_definition", "Hooksapp" })


public class Runner  {
	
}
