package steps;

import io.cucumber.java.ru.Дано;
import pages.Page;
import pages.context.TestContext;
import pages.impl.FramesPage;

public class FramesSteps {
    @Дано("Переключимся на внешний фрейм")
    public void switchToOuterFrame() {
        FramesPage page = (FramesPage) TestContext.getCurrentPage();
        page.switchFrame("frame-outer");
    }

    @Дано("Переключимся на внутренний фрейм")
    public void switchToInnerFrame() {
        FramesPage page = (FramesPage) TestContext.getCurrentPage();
        page.switchFrame("frame-inner");
    }

    @Дано("Вернёмся к основному документу")
    public void switchToDocument() {
        FramesPage page = (FramesPage) TestContext.getCurrentPage();
        page.switchFrame();
    }
}
