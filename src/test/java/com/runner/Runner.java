package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(strict = true, features = { "src/main/resources/Feature/" },
glue = {"com/stepdefinition" },
monochrome = true, plugin = { "html:reports","pretty" })

@RunWith(Cucumber.class)
public class Runner {

}