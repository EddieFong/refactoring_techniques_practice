package com.tws.refactoring.extract_variable;

public class BannerRender {
    void renderBanner(String platform, String browser) {
        if (foundKeyword(platform, "MAC") && (foundKeyword(browser, "IE"))) {
            // do something
        }
    }

    private boolean foundKeyword(String source, String keyword) {
        return source.toUpperCase().indexOf(keyword) > -1;
    }
}
