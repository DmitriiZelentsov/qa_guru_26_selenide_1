import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class EnterpriseTests {
    @BeforeAll
    static void beforeAll(){
        Configuration.baseUrl ="https://github.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void enterprise() {
        open("/");

        $(withTagAndText("button","Solutions")).hover();
        $("[aria-labelledby=solutions-for-heading]").$(byText("Enterprise")).click();

        $("#hero-section-brand-heading").shouldHave(text("The AI-powered\n" + "developer platform."));
        }
}
