# gientech-training-test-automation-bdd — checkout suite

<!-- Filled example (the gientech demo repo). Copy to the repo root as project.md and adjust. -->

```yaml
framework:      maven
language:       java
test_type:      cucumber
build_tool:     maven

run_all:        "mvn clean verify"
run_one:        "mvn clean verify -Dcucumber.filter.name='^{TEST}$'"
headless_flag:  "-Dheadless.mode=true"

remote_url_prop: "webdriver.remote.url"
driver_prop:     "webdriver.driver=remote"

paths:
  features:         src/test/resources/features/checkout
  step_definitions: src/test/java/starter/stepdefinitions
  page_objects:     src/test/java/starter/fill
  actions:          src/test/java/starter/fill
  test_data:        src/test/resources
  config:           src/test/resources/serenity.conf
  reports:          target/site/serenity

env:
  java:     "25"
  browser:  chrome
  base_url: "https://the-internet.herokuapp.com"   # replace with the real SUT
  test_env: "training"
```

## What this suite covers
Serenity BDD + Cucumber UI tests for a checkout/payment form (credit & debit card flows).

## Locator conventions
- Locators live in the page-object classes under `starter/fill` — never inline in step defs.
- Prefer `id` / `name`; use CSS next; XPath only when structure forces it.

## Failure-fix conventions
- Use Serenity's `waitFor`/expected-conditions, not `Thread.sleep`.
- Keep a fix inside the page object or step that owns the failing element.
- **element click intercepted** → prefer a **JavaScript click** (scrolling alone often doesn't clear
  the overlay). In Serenity Screenplay, resolve the `Target` to a `WebElement` first, then eval via
  the actor's browser ability. Do NOT pass a `Target` into a JS-eval helper (it wants a `WebElement`):

  ```java
  import net.serenitybdd.screenplay.Performable;
  import net.serenitybdd.screenplay.Task;
  import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
  import org.openqa.selenium.JavascriptExecutor;
  import org.openqa.selenium.WebElement;

  public static Performable clickSubmitButton() {
      return Task.where("{0} clicks the Submit button",
          actor -> {
              WebElement el = CheckoutPageObjects.SUBMIT_BUTTON.resolveFor(actor);
              ((JavascriptExecutor) BrowseTheWeb.as(actor).getDriver())
                  .executeScript("arguments[0].click();", el);
          });
  }
  ```

## Known-flaky / gotchas
- The submit button is frequently reported "element click intercepted" (overlay / below fold).
  Easiest path: **run with self-heal ON** — the proxy auto-recovers (scroll+retry, then JS click),
  no code change needed. For a code fix, use the JavaScript-click pattern above.

## Do NOT edit
- `src/test/resources/serenity.conf` (driver/browser config is environment-managed).
