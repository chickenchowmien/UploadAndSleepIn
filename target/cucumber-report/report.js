$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/SleepInAndStillUpdateResume.feature");
formatter.feature({
  "name": "Sleep in and resume still updates",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "As a human being, I should be able to sleep in, and receive the same opportunities as those \"morning people\"",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@dice"
    }
  ]
});
formatter.step({
  "name": "the user is on Dice.com",
  "keyword": "Given "
});
formatter.match({
  "location": "SleepInStepDef.the_user_is_on_Dice_com()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "they log in",
  "keyword": "And "
});
formatter.match({
  "location": "SleepInStepDef.they_log_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "go to the profile page",
  "keyword": "And "
});
formatter.match({
  "location": "SleepInStepDef.go_to_the_profile_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the resume should be updated while I\u0027m sound asleep",
  "keyword": "Then "
});
formatter.match({
  "location": "SleepInStepDef.the_resume_should_be_updated_while_I_m_sound_asleep()"
});
formatter.result({
  "status": "passed"
});
});