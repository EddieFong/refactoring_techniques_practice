package com.tws.refactoring.extract_variable;

public class BannerRender {
    public void renderBanner(String platform, String browser) {
        if (foundKeyword(platform, "MAC") && (foundKeyword(browser, "IE"))) {
            System.out.print("123");
        }
    }

    private boolean foundKeyword(String source, String keyword) {
        return source.toUpperCase().indexOf(keyword) > -1;
    }
}
