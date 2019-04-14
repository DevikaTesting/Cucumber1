$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/AddCustomer.feature");
formatter.feature({
  "name": "To test add customer",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "The user will see the customer ID generated",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "The user is in add customer Page",
  "keyword": "Given "
});
formatter.match({
  "location": "AddCustomerStepDefinition.the_user_is_in_add_customer_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user fill in the customer details",
  "rows": [
    {
      "cells": [
        "devi",
        "devika",
        "mailme@gmail.com",
        "chennai",
        "78785"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerStepDefinition.the_user_fill_in_the_customer_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user clicks the submit button",
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerStepDefinition.the_user_clicks_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should see the customer Id",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomerStepDefinition.the_user_should_see_the_customer_Id()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "the user will see the alert message",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "The user is in the add customer page",
  "keyword": "Given "
});
formatter.match({
  "location": "EmptyForm.the_user_is_in_the_add_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the submit button",
  "keyword": "When "
});
formatter.match({
  "location": "EmptyForm.the_user_clicks_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the alert message",
  "keyword": "Then "
});
formatter.match({
  "location": "EmptyForm.the_user_should_see_the_alert_message()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "the user should see the error message",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag3"
    }
  ]
});
formatter.step({
  "name": "the user is in the add customer page",
  "keyword": "Given "
});
formatter.match({
  "location": "InvalidForm.the_user_is_in_the_add_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fill in the customer details",
  "rows": [
    {
      "cells": [
        "1234",
        "5678",
        "testme.com",
        "chennai",
        "abcds"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "InvalidForm.the_user_fill_in_the_customer_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the submit Button",
  "keyword": "When "
});
formatter.match({
  "location": "InvalidForm.the_user_clicks_the_submit_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should see the error message",
  "keyword": "Then "
});
formatter.match({
  "location": "InvalidForm.the_user_should_see_the_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/feature/AddTariffPlan.feature");
formatter.feature({
  "name": "To test add tariff plan",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "To validate the success message",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "The user is in the add tariff plan page",
  "keyword": "Given "
});
formatter.match({
  "location": "AddTariffPlanStepDefinition.the_user_is_in_the_add_tariff_plan_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user fill in the tariff details",
  "rows": [
    {
      "cells": [
        "100",
        "200",
        "300",
        "400",
        "500",
        "600",
        "700"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddTariffPlanStepDefinition.the_user_fill_in_the_tariff_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user clicks the submit Button",
  "keyword": "When "
});
formatter.match({
  "location": "AddTariffPlanStepDefinition.the_user_clicks_the_submit_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should see the success meassage",
  "keyword": "Then "
});
formatter.match({
  "location": "AddTariffPlanStepDefinition.the_user_should_see_the_success_meassage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "the user will see the alert message",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "The user is in the add tariff plan",
  "keyword": "Given "
});
formatter.match({
  "location": "EmptyForm1.the_user_is_in_the_add_tariff_plan()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the Submit Button",
  "keyword": "When "
});
formatter.match({
  "location": "EmptyForm1.the_user_clicks_the_Submit_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the Alert message",
  "keyword": "Then "
});
formatter.match({
  "location": "EmptyForm1.the_user_should_see_the_Alert_message()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "the user will see the error message",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag3"
    }
  ]
});
formatter.step({
  "name": "the user is in the add tariff plan",
  "keyword": "Given "
});
formatter.match({
  "location": "InvalidData.the_user_is_in_the_add_tariff_plan()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fill in the details",
  "rows": [
    {
      "cells": [
        "abc",
        "abcd",
        "mkl",
        "yui",
        "abc",
        "abc",
        "yut"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "InvalidData.the_user_fill_in_the_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the Submitt Button",
  "keyword": "When "
});
formatter.match({
  "location": "InvalidData.the_user_clicks_the_Submitt_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should see the Error message",
  "keyword": "Then "
});
formatter.match({
  "location": "InvalidData.the_user_should_see_the_Error_message()"
});
formatter.result({
  "status": "passed"
});
});