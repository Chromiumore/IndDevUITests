package steps;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import pages.Page;
import pages.PageRegistry;
import pages.TestContext;

public class SharedSteps {
    @Дано("Загружаем страницу {string}")
    public void openPage(String pageName) {
        Page page = PageRegistry.load(pageName);
        TestContext.setCurrentPage(page);
    }

    @Когда("Введём в поле {string} значение {string}")
    public void enterValueIntoField(String fieldName, String value) {
        TestContext.getCurrentPage().fillField(fieldName, value);
    }

    @Когда("Нажмём на кнопку {string}")
    public void clickButton(String fieldName) {
        TestContext.getCurrentPage().clickButton(fieldName);
    }

    @Тогда("Проверим, что в поле {string} содержится значение {string}")
    public void checkValueInField(String fieldName, String value) {
        TestContext.getCurrentPage().checkTextByAttributeValue(fieldName, value);
    }

    @Тогда("Проверим, что подпись {string} содержит значение {string}")
    public void checkLabelValue(String labelName, String value) {
        TestContext.getCurrentPage().checkLabelText(labelName, value);
    }
}
