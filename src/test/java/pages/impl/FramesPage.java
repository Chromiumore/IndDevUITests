package pages.impl;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import pages.BasePage;

import java.util.Map;

public class FramesPage extends BasePage {
    public FramesPage() {
        fields = Map.of();

        buttons = Map.of(
                "Edit", By.xpath("(//button[@data-action=\"edit\"])[1]"),
                "Submit", By.xpath("(//button[text()=\"Submit\"])[1]"),
                "ClickMe", By.xpath("(//button[@name=\"my-button\"])[1]"),
                "Primary", By.xpath("(//button[@class=\"btn-class\"])[1]")
        );

        labels = Map.of(
                "Result", By.xpath("(//div[@id=\"result\"])[1]")
        );
    }

    public void switchFrame(String frameId) {
        Selenide.switchTo().frame(frameId);
    }

    public void switchFrame() {
        Selenide.switchTo().defaultContent();
    }
}
