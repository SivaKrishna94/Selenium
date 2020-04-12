$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Feature/Testcase.feature");
formatter.feature({
  "line": 2,
  "name": "OrangeHRM Website",
  "description": "",
  "id": "orangehrm-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@OrangeHRM"
    }
  ]
});
formatter.scenario({
  "line": 42,
  "name": "",
  "description": "The user will add a new skill",
  "id": "orangehrm-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 41,
      "name": "@TC06_OrangeHRM"
    }
  ]
});
formatter.step({
  "line": 44,
  "name": "user launch the given browser",
  "keyword": "Given "
});
formatter.step({
  "line": 45,
  "name": "the user login to the home page",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "the user will add a new skill",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "the user will delete the skill",
  "keyword": "Then "
});
formatter.match({
  "location": "SkillSet.user_launch_the_given_browser()"
});
formatter.result({
  "duration": 10849980951,
  "status": "passed"
});
formatter.match({
  "location": "SkillSet.the_user_login_to_the_home_page()"
});
formatter.result({
  "duration": 4523889362,
  "status": "passed"
});
formatter.match({
  "location": "SkillSet.the_user_will_add_a_new_skill()"
});
formatter.result({
  "duration": 8401517699,
  "status": "passed"
});
formatter.match({
  "location": "SkillSet.the_user_will_delete_the_skill()"
});
formatter.result({
  "duration": 2016692397,
  "status": "passed"
});
});