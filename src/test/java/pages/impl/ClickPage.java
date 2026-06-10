package pages.impl;

import org.openqa.selenium.By;
import pages.BasePage;

import java.util.Map;

public class ClickPage extends BasePage {
    public ClickPage() {
        elements = Map.of(
                "Button", By.xpath("//button[@id=\"badButton\"]")
        );
    }
}
