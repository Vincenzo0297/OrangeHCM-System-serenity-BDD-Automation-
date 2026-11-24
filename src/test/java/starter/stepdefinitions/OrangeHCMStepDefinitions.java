package starter.stepdefinitions;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import starter.UilityFunctions.WaitSeconds;
import starter.fill.OrangeHCMPath;
import starter.navigation.NavigateToActions;
import starter.navigation.OrangeHCMActions;
import java.util.List;

public class OrangeHCMStepDefinitions {

    @Given("{actor} navigates to the home page")
    public void userNavigatesToTheHomePage(Actor actor) {
        actor.wasAbleTo(
                NavigateToActions.theHomePage(),
                WaitSeconds.Now()
        );
    }

    @Then("{actor} enters username {string}")
    public void userEntersUsernameUsername(Actor actor, String userName) {
        actor.attemptsTo(
                OrangeHCMActions.enterUserName(userName),
                WaitSeconds.Now()
        );
    }

    @And("{actor} enters password {string}")
    public void userEntersPasswordPassword(Actor actor, String userPassword) {
        actor.attemptsTo(
                OrangeHCMActions.enterUserPassword(userPassword),
                WaitSeconds.Now()
        );
    }

    @And("{actor} click on login button")
    public void userClickOnLoginButton(Actor actor) {
        actor.attemptsTo(
                Click.on(OrangeHCMPath.CLICK_LOGIN_BUTTON),
                WaitSeconds.Now()
        );
    }

    @And("{actor} navigate to the Admin")
    public void userNavigateToTheAdmin(Actor actor) {
        actor.attemptsTo(
                Click.on(OrangeHCMPath.NAVIGATE_TO_ADMIN),
                WaitSeconds.Now()
        );
    }

    @And("{actor} click on the add button")
    public void userClickOnTheAddButton(Actor actor) {
        actor.attemptsTo(
                Click.on(OrangeHCMPath.CLICK_ADD_BUTTON)
        );
    }

    @And("{actor} add the the user type")
    public void userAddTheTheUserType(Actor actor, List <String> userType) {
        actor.attemptsTo(
                OrangeHCMActions.selectUserRole(userType.get(0)),
                OrangeHCMActions.enterEmployeeName(userType.get(1)),
                OrangeHCMActions.selectStatus(userType.get(2)),
                OrangeHCMActions.enterUserTypeUserName(userType.get(3)),
                OrangeHCMActions.enterUserTypePassword(userType.get(4)),
                OrangeHCMActions.enterenterUserTypeConfirmPassword(userType.get(5)),
                WaitSeconds.Now()
        );
    }
}
