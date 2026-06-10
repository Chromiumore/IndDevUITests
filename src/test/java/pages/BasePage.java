package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class BasePage {
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
}
