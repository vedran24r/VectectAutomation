package UITest;

import Page.YouTubePage;
import org.testng.annotations.Test;
import org.vectect.Base.BaseUITest;

public class YouTubeUITest extends BaseUITest {
    private static String songTitle = "Jana - Barabar - (Audio 2001)";
    private YouTubePage youTube;

    @Test
    public void verifySongSearch() throws InterruptedException {
        youTube = new YouTubePage(getDriver());
        pause();
        youTube.fillSearchBar(songTitle);
        pause();
        youTube.clickOnSearchButton();
        pause();
        youTube.clickOnSearchResultByIndex(0);
        // pause(20000, "Wait for ads to finish");
        // Assert.assertEquals(youTube.getVideoTitle(), songTitle);
    }
}
