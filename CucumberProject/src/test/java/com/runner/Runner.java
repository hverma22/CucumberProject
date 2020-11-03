package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Hitendra\\git\\CucumberProject\\CucumberProject\\src\\test\\resources\\Features\\TagsDemo.feature",glue={"com.stepDefinition"},
monochrome=true,
plugin= {"html:Reports\\HTMLReports", "json:Reports\\JsonReports\\Cucumber.json",
		"junit:Reports\\JUnitReport\\Cucumber.xml"},

dryRun=false,  // mapping between feature file and step file
strict=true,  //it will check if any step is not defined in step def file
tags= {"@FunctionalTest and @SmokeTest"}

)
public class Runner {

}
