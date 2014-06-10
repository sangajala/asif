package asif;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(
format = {"html:target/cucumber"},
tags = "@ramana")
public class RunTest{

}
