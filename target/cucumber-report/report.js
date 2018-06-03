$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/UINames.feature");
formatter.feature({
  "name": "TESTING UINAMES API",
  "description": "  USERS SHOULD BE ABLE TO SUBMIT GET AND POST REQUESTS TO THE UINAMES WEB SERVICE",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Send GET request for 5 name",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@UINAMES"
    }
  ]
});
formatter.step({
  "name": "the user sends a request for 5 name",
  "keyword": "When "
});
formatter.match({
  "location": "UINamesStepDef.the_user_sends_a_request_for_name(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the server should send back 5 name",
  "keyword": "Then "
});
formatter.match({
  "location": "UINamesStepDef.the_server_should_send_back_name(int)"
});
formatter.result({
  "status": "passed"
});
});