$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Login Test",
  "description": "As user I want to login into nop commerce website",
  "id": "login-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "duration": 10038600200,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User should navigate to login page suceessfully",
  "description": "",
  "id": "login-test;user-should-navigate-to-login-page-suceessfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on login link",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should see Message \"Welcome, Please Sign In!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 197067600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginLink()"
});
formatter.result({
  "duration": 676525400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome, Please Sign In!",
      "offset": 22
    }
  ],
  "location": "LoginSteps.iShouldSeeMessage(String)"
});
formatter.result({
  "duration": 78906300,
  "status": "passed"
});
formatter.after({
  "duration": 888517100,
  "status": "passed"
});
formatter.before({
  "duration": 5625716200,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Verrify the error message with invalid credentials",
  "description": "",
  "id": "login-test;verrify-the-error-message-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I click on login link",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I enter email \"1234\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter password \"222\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I should see error message",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 27500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginLink()"
});
formatter.result({
  "duration": 598027900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234",
      "offset": 15
    }
  ],
  "location": "LoginSteps.iEnterEmail(String)"
});
formatter.result({
  "duration": 74382400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "222",
      "offset": 18
    }
  ],
  "location": "LoginSteps.iEnterPassword(String)"
});
formatter.result({
  "duration": 86358700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 75464500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iShouldSeeErrorMessage()"
});
formatter.result({
  "duration": 33124000,
  "status": "passed"
});
formatter.after({
  "duration": 973470700,
  "status": "passed"
});
formatter.before({
  "duration": 3921562400,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Verrify that user Should LogIn SuccessFully With Valid Credentials.",
  "description": "",
  "id": "login-test;verrify-that-user-should-login-successfully-with-valid-credentials.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I click on login link",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I enter email \"prime4555@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I enter password \"Prime456\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I should see LogOut",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 20500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginLink()"
});
formatter.result({
  "duration": 548527000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "prime4555@gmail.com",
      "offset": 15
    }
  ],
  "location": "LoginSteps.iEnterEmail(String)"
});
formatter.result({
  "duration": 120124000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Prime456",
      "offset": 18
    }
  ],
  "location": "LoginSteps.iEnterPassword(String)"
});
formatter.result({
  "duration": 97736100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 758702800,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iShouldSeeLogOut()"
});
formatter.result({
  "duration": 717053900,
  "status": "passed"
});
formatter.after({
  "duration": 879252100,
  "status": "passed"
});
formatter.before({
  "duration": 7018458600,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Verrify that user should LogOut SucessFull",
  "description": "",
  "id": "login-test;verrify-that-user-should-logout-sucessfull",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "I click on login link",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "I enter email \"prime4555@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I enter password \"Prime456\"",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I click on logOut link",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I should see login",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 18600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginLink()"
});
formatter.result({
  "duration": 596202200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "prime4555@gmail.com",
      "offset": 15
    }
  ],
  "location": "LoginSteps.iEnterEmail(String)"
});
formatter.result({
  "duration": 98892000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Prime456",
      "offset": 18
    }
  ],
  "location": "LoginSteps.iEnterPassword(String)"
});
formatter.result({
  "duration": 90008800,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 715304500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLogOutLink()"
});
formatter.result({
  "duration": 743233600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iShouldSeeLogin()"
});
formatter.result({
  "duration": 34981000,
  "status": "passed"
});
formatter.after({
  "duration": 845086600,
  "status": "passed"
});
});