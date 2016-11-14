# NorbironTableParse
This project is a fork of the official NorbironTable application from SamuEntropy Project.
We rewrote the app to handle a backend service called Parse.

Parse is a Facebook project for faster application development. Parse-server is an open-source version of Parse.

Authors: Lajos Kovács(realdiwin), Márió Bersenszki(colliona)


## Pre-requesites

### Need to...
1) NodeJs installed on your computer
2) Android Studio or Android standalone SDK installed
3) Java JDK and Java JRE

### Installation commands

#### Install parse-server
``` npm install -g parse-server ```
#### Install parse-dashboard
``` npm install -g parse-dashboard ```
#### Install mongodb-runner
``` npm install -g mongodb-runner ```

These command will install parse-server and a dashboard for the server. Mongodb-runner is a specific version of mongodb. It will forget all datas after shutdown. If you want to keep your database after shutdown you have to use a normal mongodb on your computer.

### Start commands

#### Start mongodb
``` mongodb-runner start ```
#### Start parse-server
``` parse-server --appId "NorbironTable" --masterKey "asdasd" --clientKey "Norbiron" ```
#### Start parse-dashboard
``` parse-dashboard --appId "NorbironTable" --masterKey "asdasd" --serverURL "http://localhost:1337/parse" ```


### About the application
The application will use your local parse server "10.0.2.2" as "localhost".
If you want to use a remote version of parse-server(eg.: Heroku, AWS, Google cloud platform), then you have to deploy your parse-server first and then rewrite the appId, masterKey, ServerUrl and clientId.