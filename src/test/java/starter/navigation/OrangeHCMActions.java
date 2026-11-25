package starter.navigation;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.fill.OrangeHCMPath;

public class OrangeHCMActions {
    public static Performable enterUserName(String userName) {
        return Task.where("{0} enter user name",
                actor -> {
                    actor.attemptsTo(
                            Enter.theValue(userName).into(OrangeHCMPath.ENTER_USER_NAME)
                    );
                });
    }

    public static Performable enterUserPassword(String userPassword) {
        return Task.where("{0} enter user password",
                actor -> {
                    actor.attemptsTo(
                            Enter.theValue(userPassword).into(OrangeHCMPath.ENTER_USER_PASSWORD)
                    );
                });
    }

    public static Performable selectUserRole(String userRole) {
        return Task.where("{0} selects user role " + userRole,
                actor -> {
                    actor.attemptsTo(
                            Click.on(OrangeHCMPath.CLICK_USER_ROLE_OPTION),
                            Click.on(OrangeHCMPath.SELECT_USER_ROLE.of(userRole))
                    );
                }
        );
    }

    public static Performable enterEmployeeName(String employeeName) {
        return Task.where("{0} enter employee name",
                actor -> {
                    actor.attemptsTo(
                            Enter.theValue(employeeName).into(OrangeHCMPath.ENTER_EMPLOYEE_NAME)
                    );
                });
    }

    public static Performable selectStatus(String Status) {
        return Task.where("{0} select the status" + Status,
                actor -> {
                    actor.attemptsTo(
                            Click.on(OrangeHCMPath.CLICK_STATUS_OPTION),
                            Click.on(OrangeHCMPath.SELECT_STATUS.of(Status))
                    );
                });
    }

    public static Performable enterUserTypeUserName(String userTypeUserName) {
        return Task.where("{0} enter user type user name",
                actor -> {
                    actor.attemptsTo(
                            Enter.theValue(userTypeUserName).into(OrangeHCMPath.ENTER_USER_TYPE_USER_NAME)
                    );
                });
    }

    public static Performable enterUserTypePassword(String userTypePassword) {
        return Task.where("{0} enter user type password",
                actor -> {
                    actor.attemptsTo(
                            Enter.theValue(userTypePassword).into(OrangeHCMPath.ENTER_USER_TYPE_PASSWORD)
                    );
                });
    }

    public static Performable enterenterUserTypeConfirmPassword(String userTypeConfirmPassword) {
        return Task.where("{0} enter user type confirm password",
                actor -> {
                    actor.attemptsTo(
                            Enter.theValue(userTypeConfirmPassword).into(OrangeHCMPath.ENTER_USER_TYPE_CONFIRM_PASSWORD)
                    );
                });
    }
}
