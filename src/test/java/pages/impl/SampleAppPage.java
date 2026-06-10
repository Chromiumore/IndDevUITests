package pages.impl;

import org.openqa.selenium.By;
import pages.BasePage;

import java.util.Map;

public class SampleAppPage extends BasePage {

    public SampleAppPage() {
        fields = Map.of(
                "Name", By.xpath("//input[@name=\"UserName\"]"),
                "Password", By.xpath("//input[@name=\"Password\"]")
        );

        buttons = Map.of(
                "Login", By.xpath("//button[@id=\"login\"]")
        );

        labels = Map.of(
                "LoginStatus", By.xpath("//label[@id=\"loginstatus\"]")
        );
    }
}
