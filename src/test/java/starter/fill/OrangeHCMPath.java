package starter.fill;
import net.serenitybdd.screenplay.targets.Target;

public class OrangeHCMPath {

    public static Target ENTER_USER_NAME = Target.the("user enter username")
            .locatedBy("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");
    public static Target ENTER_USER_PASSWORD = Target.the("user enter password")
            .locatedBy("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");
    public static Target CLICK_LOGIN_BUTTON = Target.the("click login button")
            .locatedBy("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
    public static Target NAVIGATE_TO_ADMIN = Target.the("navigate to admin")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a");
    public static Target CLICK_ADD_BUTTON = Target.the("click on the add button")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");
    public static Target CLICK_USER_ROLE_OPTION = Target.the("click the option button")
            .locatedBy("//label[text()='User Role']/following::div[@class='oxd-select-text-input'][1]");
    public static Target SELECT_USER_ROLE = Target.the("User Role option {0}")
            .locatedBy("//div[contains(@class,'oxd-select-option')]/span[normalize-space()='{0}']");
    public static Target ENTER_EMPLOYEE_NAME = Target.the("enter employee name")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input");
    public static Target CLICK_STATUS_OPTION = Target.the("click status option button")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i");
    public static Target SELECT_STATUS = Target.the("select status")
            .locatedBy("//div[contains(@class,'oxd-select-option')]/span[normalize-space()='{0}']");
    public static Target ENTER_USER_TYPE_USER_NAME = Target.the("enter user type username")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input");
    public static Target ENTER_USER_TYPE_PASSWORD = Target.the("enter user type password")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input");
    public static Target ENTER_USER_TYPE_CONFIRM_PASSWORD = Target.the("enter user type confirm password")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input");
    public static Target CLICK_SAVE_BUTTON = Target.the("click on the save button")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]");
    public static Target ENTER_SYSTEM_USER_NAME = Target.the("enter system user name")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input");
    public static Target CLICK_SYSTEM_USER_ROLE_OPTION = Target.the("click on the system user role option")
            .locatedBy("//label[text()='User Role']/following::div[@class='oxd-select-text-input'][1]");
    public static Target SELECT_SYSTEM_USER_ROLE = Target.the("select the system user role")
            .locatedBy("//div[contains(@class,'oxd-select-option')]/span[normalize-space()='{0}']");
    public static Target ENTER_SYSTEM_USER_EMPLOYEE_NAME = Target.the("enter system user employee name")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/input");
    public static Target CLICK_SYSTEM_USER_STATUS_OPTION = Target.the("click on the systme user status option")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[2]/i");
    public static Target SELECT_SYSTEM_USER_STATUS = Target.the("select the system user status")
            .locatedBy("//div[contains(@class,'oxd-select-option')]/span[normalize-space()='{0}']");
    public static Target CLICK_SEARCH_BUTTON = Target.the("click search button")
            .locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]");
}
