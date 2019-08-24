package cucumber;

import org.junit.runner.RunWith;
import org.junit.*;
@RunWith(Cucumber.class)
@CucumberOptions(features="Feature", glue={"Scripting"})
public class cucumber {

}
