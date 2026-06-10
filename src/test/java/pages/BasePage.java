package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.Map;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class BasePage implements Page {
    protected Map<String, By> elements;

    protected void fillField(By locator, String value) {
        String chord = Keys.chord(Keys.COMMAND, "a");
        $(locator).sendKeys(chord);

        Actions actions = new Actions(WebDriverRunner.getWebDriver());
        actions.sendKeys(Keys.BACK_SPACE).perform();

        $(locator).clear();
        $(locator).setValue(value);
    }

    protected void click(By locator) {
        $(locator).shouldBe(enabled).click();
    }

    protected void select(By locator, String value) {
        $(locator).shouldBe(visible).click();
        SelenideElement list = $("[role='listbox']");
        SelenideElement option = list.$x(String.format(".//li[@data-value='%s']", value));
        option.shouldBe(visible).click();
    }

    protected void shouldHaveText(By locator, String text) {
        $(locator).shouldHave(Condition.text(text));
    }

    protected void shouldHaveTextByAttributeValue(By locator, String text) {
        $(locator).shouldHave(attribute("value", text), Duration.ZERO);
    }

    protected void shouldBeEmpty(By locator) {
        $(locator).shouldBe(empty);
    }

    @Override
    public void fillField(String fieldName, String value) {
        By locator = elements.get(fieldName);
        fillField(locator, value);
    }

    @Override
    public void clickButton(String buttonName) {
        By locator = elements.get(buttonName);
        click(locator);
    }

    @Override
    public void checkTextByAttributeValue(String fieldName, String value) {
        By locator = elements.get(fieldName);
        shouldHaveTextByAttributeValue(locator, value);
    }

    @Override
    public void selectDropdown(String fieldName, String value) {
        By locator = elements.get(fieldName);
        select(locator, value);
    }

    @Override
    public void checkLabelText(String labelName, String value) {
        By locator = elements.get(labelName);
        shouldHaveText(locator, value);
    }

    @Override
    public void checkLabelIsEmpty(String labelName) {
        By locator = elements.get(labelName);
        shouldBeEmpty(locator);
    }

    @Override
    public void waitForElementToAppear(String name) {
        By locator = elements.get(name);
        $(locator).shouldBe(exist, Duration.ofSeconds(15));
    }
}
