package starter.stepdefinitions;
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
                Click.on(OrangeHCMPath.CLICK_ADD_BUTTON),
                WaitSeconds.Now()
        );
    }

    @And("{actor} add the the user type")
    public void userAddTheTheUserType(Actor actor, List<String> userType) {
        actor.attemptsTo(
                OrangeHCMActions.selectUserRole(userType.get(0)),
                WaitSeconds.Now(),
                OrangeHCMActions.selectStatus(userType.get(1)),
                WaitSeconds.Now(),
                OrangeHCMActions.enterEmployeeName(userType.get(2)),
                WaitSeconds.Now(),
                OrangeHCMActions.enterUserTypeUserName(userType.get(3)),
                WaitSeconds.Now(),
                OrangeHCMActions.enterUserTypePassword(userType.get(4)),
                WaitSeconds.Now(),
                OrangeHCMActions.enterUserTypeConfirmPassword(userType.get(5)),
                WaitSeconds.Now()
        );
    }

    @And("{actor} click on the save button")
    public void userClickOnTheSaveButton(Actor actor) {
        actor.attemptsTo(
                Click.on(OrangeHCMPath.CLICK_SAVE_BUTTON),
                WaitSeconds.Now()
        );
    }

    @And("{actor} search for system user")
    public void userSearchForSystemUser(Actor actor, List<String> SystemUser) {
        actor.attemptsTo(
                OrangeHCMActions.enterSystemUserName(SystemUser.get(0)),
                WaitSeconds.Now(),
                OrangeHCMActions.selectSystemUserRole(SystemUser.get(1)),
                WaitSeconds.Now(),
                OrangeHCMActions.selectSystemUserStatus(SystemUser.get(2)),
                WaitSeconds.Now()
        );
    }

    @And("{actor} click on the search button")
    public void userClickOnTheSearchButton(Actor actor) {
        actor.attemptsTo(
                Click.on(OrangeHCMPath.CLICK_SEARCH_BUTTON),
                WaitSeconds.Now()
        );
    }
}
