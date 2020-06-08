# QA-Automation
Example automation projects

Project basic structure and framework information:

Protractor - Selenium - Chai - Cucumber framework

Setup & running web application :

In order to get started, you will need to make sure that you have some development tools installe

Node, v6.0.0 or higher npm, to update npm to the latest, run this command: $ npm install -g npm@latest

Bower, to install bower globally, run this command: $ npm install -g bower

PowerSword, to install powersword globally, follow one of these options: Option 1

$ npm install -g git://github.build/ Option 2

$ git clone repository

$ cd powersword

$ npm link

With all of the necessary pieces installed, you can go ahead and install e2e repo on you machine. From a place where you like to run projects on your machine, run the following command:

$ power setup git@github.build.ge.com:(org space)/(repo)-config.git --dir (root directory) $ npm install $ power dependencies $ npm start Run Tests Navigate to the root directory: $ cd .. $ npm run e2e-update (Should only have to run this step the very first time you run the test) Run: $ username= pw= url=dev tags="@" npm run e2e 

Watch the tests run!


