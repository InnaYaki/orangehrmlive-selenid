import org.junit.Test;
import org.junit.experimental.categories.Category;

import static java.lang.Thread.sleep;

public class SideBarTest extends BaseTest {
     @Category(Smoke.class)
    @Test
    public void linksAreDisplayed() {
        loginPage.successLogin("Admin", "admin123");
        dashboardPage.dashboardPageIsOpen();
        sideBar.adminLinkIsDisplayed();
        sideBar.pimLinkIsDisplayed();
        sideBar.leaveLinkIsDisplayed();
        sideBar.timeLinkIsDisplayed();
        sideBar.recruitmentLinkIsDisplayed();
        sideBar.myInfoLinkIsDisplayed();
        sideBar.performanceLinkIsDisplayed();
        sideBar.dashbordLinkIsDisplayed();
        sideBar.directoryLinkIsDisplayed();
        sideBar.maintenanceLinkIsDisplayed();
        sideBar.buzzLinkLinkIsDisplayed();

    }

    @Test
    public void sideBarRolled() {
        loginPage.successLogin("Admin", "admin123");
        dashboardPage.dashboardPageIsOpen();
        sideBar.clickOnRollButton();
        sideBar.checkSideBarRolledOut();
    }

    @Test
    public void search1item() throws InterruptedException {
        String searchValue = "Admin";
        loginPage.successLogin("Admin", "admin123");
        dashboardPage.dashboardPageIsOpen();
        sideBar.enterValueAdmin(searchValue);
        sideBar.oneElementInSideBar();
        sideBar.correctElementInSideBar(searchValue);
        sleep(5000);
    }


    @Test
    public void search9item() throws InterruptedException {
        String searchValue9 = "Directory";
        loginPage.successLogin("Admin", "admin123");
        dashboardPage.dashboardPageIsOpen();
        sideBar.enterValueDirectory(searchValue9);
        sideBar.correctElementDirectoryInSideBar(searchValue9);
    }


    @Test
    public void invalidValue ()   {
        String searchIncorrectValue = "jjjk";
        loginPage.successLogin("Admin", "admin123");
        dashboardPage.dashboardPageIsOpen();
        sideBar.enterInvalidValue(searchIncorrectValue);
    }


    @Test
    public void searchByLetter() throws InterruptedException {
        String letter = "t";
        loginPage.successLogin("Admin", "admin123");
        dashboardPage.dashboardPageIsOpen();
        sideBar.searchByLetterT(letter);

    }









}