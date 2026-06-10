package pages;

public interface Page {
    void fillField(String fieldName, String value);

    void clickButton(String buttonName);

    void checkTextByAttributeValue(String fieldName, String value);

    void selectDropdown(String fieldName, String value);

    void checkLabelText(String labelName, String value);

    void checkLabelIsEmpty(String labelName);

    void waitForElementToAppear(String name, int seconds);
}
