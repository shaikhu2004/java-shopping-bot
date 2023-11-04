package com.shopping_bot;

import com.microsoft.playwright.*;

public class Main {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            BrowserType browserType = playwright.chromium();
            Browser browser = browserType.launch(
                new BrowserType.LaunchOptions().setHeadless(false));

            Page page = browser.newPage();
            page.navigate("https://amazon.ae");
            page.getByPlaceholder("Search amazon.ae").type("speakers");
            page.locator("//input[@vlaue='Go']").click();
            
    }
    }
}
