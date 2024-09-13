/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pruebafernandolugo.orangehrmautomation.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 *
 * @author FERAN
 */

@RunWith(CucumberWithSerenity.class)
    @CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.pruebafernandolugo.orangehrmautomation.stepdefinitions",
        plugin = {"pretty"}
    )

public class TestRunner {
    
    
}
