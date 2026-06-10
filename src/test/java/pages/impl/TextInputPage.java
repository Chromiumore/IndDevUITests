package pages.impl;

import org.openqa.selenium.By;
import pages.BasePage;

import java.util.Map;

public class TextInputPage extends BasePage {
    public TextInputPage() {
        elements = Map.of(
                "Name", By.xpath("//input[@id=\"newButtonName\"]"),
                "Button", By.xpath("//button[@id=\"updatingButton\"]")
        );
    }
}
