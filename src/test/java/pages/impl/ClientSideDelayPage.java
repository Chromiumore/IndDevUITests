package pages.impl;

import org.openqa.selenium.By;
import pages.BasePage;

import java.util.Map;

public class ClientSideDelayPage extends BasePage {
    public ClientSideDelayPage() {
        elements = Map.of(
                "Button", By.xpath("//button[@id=\"ajaxButton\"]"),
                "Message", By.xpath("//div[@id=\"content\"]/p")
        );
    }
}
