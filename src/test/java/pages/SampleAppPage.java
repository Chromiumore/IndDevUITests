package pages;

import org.openqa.selenium.By;

import java.util.Map;

public class SampleAppPage extends BasePage implements Page{

    private final Map<String, By> fields = Map.of(
            "Name", By.xpath("//input[@name=\"UserName\"]"),
            "Password", By.xpath("//input[@name=\"Password\"]")
    );

    private final Map<String, By> buttons = Map.of(
            "Login", By.xpath("//button[@id=\"login\"]")
    );

    private final Map<String, By> labels = Map.of(
            "LoginStatus", By.xpath("//label[@id=\"loginstatus\"]")
    );

    @Override
    public void fillField(String fieldName, String value) {
        By locator = fields.get(fieldName);
        fillField(locator, value);
    }

    @Override
    public void clickButton(String buttonName) {
        By locator = buttons.get(buttonName);
        click(locator);
    }

    @Override
    public void checkText(String fieldName, String value) {
        By locator = fields.get(fieldName);
        shouldHaveTextByAttributeValue(locator, value);
    }

    @Override
    public void checkTextByAttributeValue(String fieldName, String value) {
        By locator = fields.get(fieldName);
        shouldHaveTextByAttributeValue(locator, value);
    }

    @Override
    public void selectDropdown(String fieldName, String value) {
        By locator = fields.get(fieldName);
        select(locator, value);
    }

    @Override
    public void checkLabelText(String labelName, String value) {
        By locator = labels.get(labelName);
        shouldHaveText(locator, value);
    }
}
