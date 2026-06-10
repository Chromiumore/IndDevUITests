package pages;

import com.codeborne.selenide.Selenide;
import pages.impl.*;

import java.util.Map;
import java.util.function.Supplier;

public class PageRegistry {
    private static final Map<String, String> routes = Map.of(
            "SampleAppPage", "http://www.uitestingplayground.com/sampleapp",
            "FramesPage", "http://www.uitestingplayground.com/frames",
            "TextInputPage", "http://www.uitestingplayground.com/textinput",
            "ClickPage", "http://www.uitestingplayground.com/click",
            "ClientSideDelayPage", "http://www.uitestingplayground.com/clientdelay"
    );

    private static final Map<String, Supplier<Page>> pages = Map.of(
            "SampleAppPage", SampleAppPage::new,
            "FramesPage", FramesPage::new,
            "TextInputPage", TextInputPage::new,
            "ClickPage", ClickPage::new,
            "ClientSideDelayPage", ClientSideDelayPage::new
    );

    public static Page load(String pageName) {
        System.out.println("Открывается страница: " + routes.get(pageName));
        Selenide.open(routes.get(pageName));

        return pages.get(pageName).get();
    }
}
