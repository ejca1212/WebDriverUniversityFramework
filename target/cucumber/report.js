$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("contactUs.feature");
formatter.feature({
  "line": 1,
  "name": "Submit data to webdriveruniversity.com using contact us form",
  "description": "",
  "id": "submit-data-to-webdriveruniversity.com-using-contact-us-form",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2385359900,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Submit data via contact us form",
  "description": "",
  "id": "submit-data-to-webdriveruniversity.com-using-contact-us-form;submit-data-via-contact-us-form",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I access webdriveruniversity contact us form",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter a valid firstname",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I enter a valid lastname",
  "rows": [
    {
      "cells": [
        "woods",
        "jackson",
        "jones"
      ],
      "line": 7
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter a vlid email address",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter comments",
  "rows": [
    {
      "cells": [
        "example comments one",
        "example comment two"
      ],
      "line": 10
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on the submit button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "The information should successfylly be submitted via the contact us form",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactUsSteps.i_access_webdriveruniversity_contact_us_form()"
});
formatter.result({
  "duration": 937027048,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.i_enter_a_valid_firstname()"
});
formatter.result({
  "duration": 91968898,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.i_enter_a_valid_lastname(DataTable)"
});
formatter.result({
  "duration": 49573895,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.i_enter_a_vlid_email_address()"
});
formatter.result({
  "duration": 72091775,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.i_enter_comments(DataTable)"
});
formatter.result({
  "duration": 64794149,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.i_click_on_the_submit_button()"
});
formatter.result({
  "duration": 1271050793,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.the_information_should_successfylly_be_submitted_via_the_contact_us_form()"
});
formatter.result({
  "duration": 3035196848,
  "status": "passed"
});
formatter.after({
  "duration": 96048773,
  "status": "passed"
});
formatter.uri("products.feature");
formatter.feature({
  "line": 1,
  "name": "Products page",
  "description": "",
  "id": "products-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Validate promo code alert is visible when clicking on the special offers link",
  "description": "",
  "id": "products-page;validate-promo-code-alert-is-visible-when-clicking-on-the-special-offers-link",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User navigates to \"\u003curl\u003e\" website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User click on \"\u003cbutton\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User should be presented with a promo alert",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "products-page;validate-promo-code-alert-is-visible-when-clicking-on-the-special-offers-link;",
  "rows": [
    {
      "cells": [
        "url",
        "button"
      ],
      "line": 9,
      "id": "products-page;validate-promo-code-alert-is-visible-when-clicking-on-the-special-offers-link;;1"
    },
    {
      "cells": [
        "http://webdriveruniversity.com/Page-Object-Model/products.html",
        "#special-offers \u003e a:nth-child(1)"
      ],
      "line": 10,
      "id": "products-page;validate-promo-code-alert-is-visible-when-clicking-on-the-special-offers-link;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1416703231,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Validate promo code alert is visible when clicking on the special offers link",
  "description": "",
  "id": "products-page;validate-promo-code-alert-is-visible-when-clicking-on-the-special-offers-link;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User navigates to \"http://webdriveruniversity.com/Page-Object-Model/products.html\" website",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User click on \"#special-offers \u003e a:nth-child(1)\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User should be presented with a promo alert",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://webdriveruniversity.com/Page-Object-Model/products.html",
      "offset": 19
    }
  ],
  "location": "ProductSteps.user_navigates_to_website(String)"
});
formatter.result({
  "duration": 1465726384,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "#special-offers \u003e a:nth-child(1)",
      "offset": 15
    }
  ],
  "location": "ProductSteps.user_click_on(String)"
});
formatter.result({
  "duration": 2082842753,
  "status": "passed"
});
formatter.match({
  "location": "ProductSteps.user_should_be_presented_with_a_promo_alert()"
});
formatter.result({
  "duration": 4048146689,
  "status": "passed"
});
formatter.after({
  "duration": 89086730,
  "status": "passed"
});
});