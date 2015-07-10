package com.mycompany.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by pandian on 7/10/15.
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty", "html:target/out"}, snippets= SnippetType.CAMELCASE)
public class MyFeaturesTest {
}
