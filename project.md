<!-- Filled example (the gientech demo repo). Copy to the repo root as project.md and adjust. -->
---
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
---

# gientech-training-test-automation-bdd — checkout suite

## What this suite covers
Serenity BDD + Cucumber UI tests for a checkout/payment form (credit & debit card flows).

## Locator conventions
- Locators live in the page-object classes under `starter/fill` — never inline in step defs.
- Prefer `id` / `name`; use CSS next; XPath only when structure forces it.

## Failure-fix conventions
- Use Serenity's `waitFor`/expected-conditions, not `Thread.sleep`.
- Submit sits below the fold and can be overlapped — `scrollIntoView` before clicking.
- Keep a fix inside the page object or step that owns the failing element.

## Known-flaky / gotchas
- The submit button is frequently reported "element click intercepted" (overlay / below fold).
  The proxy already auto-recovers this (scroll+retry, then JS click) when self-heal is on.

## Do NOT edit
- `src/test/resources/serenity.conf` (driver/browser config is environment-managed).
