package UITest;

import Page.YouTubePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.vectect.Base.BaseUITest;

public class UITest extends BaseUITest {
    String songTitle = "Jana - Barabar - (Audio 2001)";

    @Test
    public void verifySongSearch() throws InterruptedException {
        YouTubePage youTube = new YouTubePage(getDriver());
        Thread.sleep(1000);
        youTube.fillSearchBar(songTitle);
        Thread.sleep(1000);
        youTube.clickOnSearchButton();
        Thread.sleep(1000);
        youTube.clickOnFirstSearchResult();
        Thread.sleep(20000); // pause for ads
        Assert.assertEquals(youTube.getVideoTitle(), songTitle);
    }
}
