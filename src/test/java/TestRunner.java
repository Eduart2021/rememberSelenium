import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Feature"},
        glue = {"StepDefinition","webDriver"},
        tags = "@unit",
        monochrome = true,
        plugin = {"pretty","html:target/cucumber"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class TestRunner {
}
