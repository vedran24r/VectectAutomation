package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.vectect.Base.BasePage;

import java.util.List;

public class YouTubePage extends BasePage {

    public YouTubePage(WebDriver driver) {
        super(driver);
        driver.navigate().to("https://www.youtube.com/");
    }

    @FindBy(xpath = "//input[@id='search']")
    private WebElement searchBar;

    @FindBy(xpath = "//*[@id='search-icon-legacy']")
    private WebElement searchButton;

    @FindBy(xpath = "//body/ytd-app[1]/div[1]/ytd-page-manager[1]/ytd-search[1]/div[1]/ytd-two-column-search-results-renderer[1]/div[2]/div[1]/ytd-section-list-renderer[1]/div[2]/ytd-item-section-renderer[1]/div[3]/ytd-video-renderer[1]")
    private WebElement firstSearchResult; //temporary, create an element list

    @FindBy(className = "ytd-video-renderer")
    private List<WebElement> videoResults;

    @FindBy(xpath = "//*[@id=\"container\"]/h1/yt-formatted-string")
    private WebElement videoTitle;

    public String getVideoTitle() { return videoTitle.getText(); };

    public void fillSearchBar(String searchText) {
        searchBar.sendKeys(searchText);
    }

    public void clickOnSearchButton() {
        searchButton.click();
    }

    public void clickOnFirstSearchResult() {firstSearchResult.click();} //temporary, create an element list

    public void clickOnSearchResultByIndex(int index) {
        videoResults.get(index).click();
    }

}
