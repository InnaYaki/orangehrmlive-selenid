import com.codeborne.selenide.SelenideElement;


import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {

    private  SelenideElement sideBarPanel= $ (byClassName("oxd-sidepanel-body"));

    public void dashboardPageIsOpen(){
        sideBarPanel.shouldBe(visible, Duration.ofSeconds(10));
    }

}
