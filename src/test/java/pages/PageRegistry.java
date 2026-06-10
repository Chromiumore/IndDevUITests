package pages;

import com.codeborne.selenide.Selenide;
import pages.impl.FramesPage;
import pages.impl.SampleAppPage;

import java.util.Map;
import java.util.function.Supplier;

public class PageRegistry {
    private static final Map<String, String> routes = Map.of(
        "SampleAppPage", "http://www.uitestingplayground.com/sampleapp",
            "FramesPage", "http://www.uitestingplayground.com/frames"
    );

    private static final Map<String, Supplier<Page>> pages = Map.of(
        "SampleAppPage", SampleAppPage::new,
            "FramesPage", FramesPage::new
    );

    public static Page load(String pageName) {
        System.out.println("Открывается страница: " + routes.get(pageName));
        Selenide.open(routes.get(pageName));

        return pages.get(pageName).get();
    }
}
