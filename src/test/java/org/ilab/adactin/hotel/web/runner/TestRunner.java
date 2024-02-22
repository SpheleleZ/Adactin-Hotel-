package org.ilab.adactin.hotel.web.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/features"
        ,glue = {"org/ilab/adactin/hotel/web/steps"}
        ,monochrome = true
        ,dryRun = false
        ,tags = "@SmokeTest"
        ,plugin = {
        "pretty"
        ,"junit:src/reports/JUnitReport/JUnitReport.xml"
        ,"json:src/reports/JsonReport/JsonReport.json"
        ,"html:src/reports/HTMLReport/HTMLReport.html"
})
public class TestRunner {
    //the Class should bve empty
}
