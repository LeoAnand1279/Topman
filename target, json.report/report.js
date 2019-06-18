$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/AddJeans.feature");
formatter.feature({
  "name": "To select the jeans",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "The user selects the jeans",
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user enters to the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonSteps.the_user_enters_to_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user clicks the jeans module \u0026 clicks the slim jeans module",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSteps.the_user_clicks_the_jeans_module_clicks_the_slim_jeans_module()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user clicks an item",
  "keyword": "And "
});
formatter.match({
  "location": "SlimJeansPage.the_user_clicks_an_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user selects the size and adds to bag",
  "keyword": "And "
});
formatter.match({
  "location": "SizeSteps.the_user_selects_the_size_and_adds_to_bag()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user validate the add to cart button",
  "keyword": "Then "
});
formatter.match({
  "location": "ShowCartSteps.the_user_validate_the_add_to_cart_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});