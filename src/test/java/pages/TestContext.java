package pages;

public class TestContext {
    private static Page currentPage;

    public static Page getCurrentPage() {
        return currentPage;
    }

    public static void setCurrentPage(Page currentPage) {
        TestContext.currentPage = currentPage;
    }
}
