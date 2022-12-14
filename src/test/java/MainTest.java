import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class MainTest {
    private final SelenideElement searchField = $("input#search");
    private final SelenideElement searchButton= $("button#search-icon-legacy");
    private final SelenideElement videoName= $(".style-scope.ytd-watch-metadata");
    private final ElementsCollection foundVideos =$$("img.yt-core-image--fill-parent-height.yt-core-image--fill-parent-width.yt-core-image.yt-core-image--content-mode-scale-aspect-fill.yt-core-image--loaded");
//    private SelenideElement = $("");
//    private SelenideElement = $("");

}
