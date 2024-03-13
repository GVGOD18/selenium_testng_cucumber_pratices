package com.Stepdef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\hexaware java mysql training\\JAVA\\JAVA Practice\\FrameworkDWS\\src\\test\\resources\\Features"
,glue = "com.Stepdef",plugin = "html:target/cucumber.html"
)

public class testRunner {

}
