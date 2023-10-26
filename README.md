# MoriaMap

## Features
At the current state the program is able to load the transport network described in map_data.csv (LECT_NET) and the schedule described in schedule.csv.
It is also able to take two stops and display a non-optimized path the user needs to take on the network to get from one stop to the other (PLAN_0), display the different transports passages for a given stop (LECT_TIME), show an optimized in time or distance path to take from given starting and destination stop (PLAN_1) and be able to have a starting or target point anywhere on earth and find an optimized path between them sometimes taking the transport network, or sometimes not (PLAN_2).
As a separate feature we implemented a way for the optimized route to make it able to choose walking in the middle of the route if the time it take to wait for the next transport is taking more time than just walking (PLAN_3).
The transport network is based off Paris transport network so the stops are named after real stations like "Lourmel".

## Instructions

### Running
You can directly run the project with `./gradlew run`.  
Or you can build the project into a single JAR file with the 
command `./gradlew build`, the JAR file will be built 
in the directory `build/libs` and can be run with `java -jar build/libs/MoriaMap-<PROJECT_VERSION>.jar`

### Using
After the project is started, you will be asked to enter the
names of the starting stop and the target stop.  
Then you will be shown the path you need to take to get from your starting
stop to the target's, and the program will repeat itself.  
Note: Pressing the Enter key without writing anything allow you to stop the program's execution, or press CTRL+C.

## Setup SonarQube

- Install Java 17 if it is not installed and make sure `java --version` returns 17.
- Download SonarQube Community Edition from https://www.sonarsource.com/products/sonarqube/downloads
and unzip it into a directory which we will call `<SONARQUBE_HOME>`
(do not unzip into a directory starting with a digit).
- Execute the following script to start the server:
  - On Linux: `<SONARQUBE_HOME>/bin/linux-x86-64/sonar.sh start`
  - On macOS: `<SONARQUBE_HOME>/bin/macosx-universal-64/sonar.sh start`
  - On Windows: `<SONARQUBE_HOME>/bin/windows-x86-64/StartSonar.bat`
- Login on http://localhost:9000 with username `admin` and password `admin`, then
change the password to `F9Erj73eUynRrGP`.
- Now you can check out the branch you want to analyze e.g. `git checkout 11-my-feature` and
run `./gradlew test sonar`. You can then visit http://localhost:9000 to view the results
(SonarQube says the branch is `main`, but it actually analyzes the currently checked out branch).
