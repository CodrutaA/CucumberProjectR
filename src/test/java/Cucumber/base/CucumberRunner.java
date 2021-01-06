package Cucumber.base;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(
        features = {"src/test/resources/features/CucumberP"},
        glue = {"Cucumber.stepdefinitions"}
)
public class CucumberRunner {

    private static final TestNGCucumberRunner testNGCucumberRunner = new TestNGCucumberRunner(CucumberRunner.class);

    @Test(dataProvider = "getScenarios")
    public static void runScenario(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) throws Throwable {
        testNGCucumberRunner.runScenario(pickleWrapper.getPickle());
    }

    @DataProvider
    public static Object[][] getScenarios() {
        return testNGCucumberRunner.provideScenarios();
    }
}
