package pages.impl;

import org.openqa.selenium.By;
import pages.BasePage;

import java.util.Map;

public class SampleAppPage extends BasePage {

    public SampleAppPage() {
        elements = Map.of(
                "Name", By.xpath("//input[@name=\"UserName\"]"),
                "Password", By.xpath("//input[@name=\"Password\"]"),
                "Login", By.xpath("//button[@id=\"login\"]"),
                "LoginStatus", By.xpath("//label[@id=\"loginstatus\"]")
        );
    }
}
