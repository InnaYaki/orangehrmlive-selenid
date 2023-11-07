import com.codeborne.selenide.*;
import com.codeborne.selenide.conditions.Text;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertTrue;
import static org.openqa.selenium.By.cssSelector;

public class SideBar {

    private ElementsCollection sideBarElements = $$ (byClassName("oxd-main-menu-item-wrapper"));

    private SelenideElement adminLink =  $(cssSelector("[class='oxd-main-menu-item-wrapper']:nth-child(1)"));

    private SelenideElement pimLink =  $(cssSelector("[class='oxd-main-menu-item-wrapper']:nth-child(2)"));

    private SelenideElement leaveLink =  $(cssSelector("[class='oxd-main-menu-item-wrapper']:nth-child(3)"));

    private SelenideElement timeLink =  $(cssSelector("[class='oxd-main-menu-item-wrapper']:nth-child(4)"));

    private SelenideElement recruitmentLink =  $(cssSelector("[class='oxd-main-menu-item-wrapper']:nth-child(5)"));

    private SelenideElement myInfoLink =  $(cssSelector("[class='oxd-main-menu-item-wrapper']:nth-child(6)"));

    private SelenideElement performanceLink =  $(cssSelector("[class='oxd-main-menu-item-wrapper']:nth-child(7)"));

    private SelenideElement dashbordLink =  $(cssSelector("[class='oxd-main-menu-item-wrapper']:nth-child(8)"));

    private SelenideElement directoryLink =  $(cssSelector("[class='oxd-main-menu-item-wrapper']:nth-child(9)"));

    private SelenideElement maintenanceLink =  $(cssSelector("[class='oxd-main-menu-item-wrapper']:nth-child(10)"));

    private SelenideElement buzzLink =  $(cssSelector("[class='oxd-main-menu-item-wrapper']:nth-child(11)"));

    //private SelenideElement sideBarPage =  $(cssSelector("[class='oxd-main-menu-item-wrapper']:nth-child(11)"));

    private SelenideElement rollButton =  $x("//button [@class='oxd-icon-button oxd-main-menu-button']");

    private SelenideElement sideBarpanel =  $ (byClassName("oxd-sidepanel"));

    private SelenideElement searchInputField =  $x("//input[@placeholder='Search']");



    public void adminLinkIsDisplayed (){
        adminLink.shouldBe(visible);
    }
    public void pimLinkIsDisplayed (){
        pimLink.shouldBe(visible);
    }

    public void leaveLinkIsDisplayed (){
        leaveLink.shouldBe(visible);
    }

    public void timeLinkIsDisplayed (){
        timeLink.shouldBe(visible);
    }

    public void recruitmentLinkIsDisplayed (){
        recruitmentLink.shouldBe(visible);
    }
    public void myInfoLinkIsDisplayed (){
        myInfoLink.shouldBe(visible);
    }
    public void performanceLinkIsDisplayed (){
        performanceLink.shouldBe(visible);
    }

    public void dashbordLinkIsDisplayed (){
        dashbordLink.shouldBe(visible);
    }

    public void directoryLinkIsDisplayed (){
        directoryLink.shouldBe(visible);
    }

    public void maintenanceLinkIsDisplayed (){
        maintenanceLink.shouldBe(visible);
    }

    public void buzzLinkLinkIsDisplayed (){
        buzzLink.shouldBe(visible);
    }

    public void clickOnRollButton (){
        rollButton.shouldBe(enabled);
        rollButton.click();
    }
    public void checkSideBarRolledOut (){
      sideBarpanel.shouldHave(attributeMatching("class",
                ".*toggled.*"));
    }
    public void enterValueAdmin (String expexText){
        searchInputField.shouldBe(enabled);
        searchInputField.setValue(expexText);
    }
    public void oneElementInSideBar (){
        sideBarElements.filterBy(visible).shouldHave(size(1));
    }

    public void correctElementInSideBar (String expectedElementText){
        sideBarElements.get(0).shouldHave(partialText(expectedElementText));
    }

    public void enterValueDirectory (String expectedText){
        searchInputField.shouldBe(enabled);
        searchInputField.setValue(expectedText);
    }
    public void correctElementDirectoryInSideBar (String expectedETextDirectory){
        sideBarElements.get(0).shouldHave(partialText(expectedETextDirectory));
    }


    public void enterInvalidValue (String expectedIncorrectText){
        searchInputField.shouldBe(enabled);
        searchInputField.setValue(expectedIncorrectText);
    }

    public void searchByLetterT (String expectedAllWordsWithT){
        searchInputField.shouldBe(enabled);
        searchInputField.setValue(expectedAllWordsWithT);
    }
















}





