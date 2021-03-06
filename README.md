# UAHBattleCode
Welcome to the GitHub Repository for UAH BattleCode 2018

Project Language: *Java*

## Table of Contents
 - [Useful Resources](#resources)
 - [Strategy Guide](#strategy)
 - [Design Considerations](#design)
 - [Challenges](#challenges)
 - [Things That Went Well](#good)
 - [Sample Games](#samples)
 - [Project Members](#members)
 - [Other Successful Team's Bots](#otherbots)


## <a name="resources"/>Useful Resources
 - [BattleCode Website](https://battlecode.org/)
 - [BattleCode Specs](https://s3.amazonaws.com/battlecode-2018/specs/battlecode-specs-2018.html)
 - [BattleCode JavaAPI/Documentation](https://s3.amazonaws.com/battlecode-2018/api/java/index.html)
 - [BattleCode Scaffold GitHub Repo](https://github.com/battlecode/bc18-scaffold)
 - [BattleCode Windows Viewing Client](https://s3.amazonaws.com/battlecode-2018/viewer/WindowsRelease.zip)
 - [Local Host Address](http://192.168.99.100:6147/run.html)
 - [Docker Win10 Home Download](https://docs.docker.com/toolbox/toolbox_install_windows/)
 - [Docker Win10 Not Home Download](https://www.docker.com/docker-windows)


## <a name="strategy"/>Strategy Guide
To start, we had 1-3 wrokers. With each of these workers, we would attempt to build a factory to create units. After this the workers would spend most of their time attempting to mine Karbonite. Our new factories would begin to try to produce as many combat units as possible. These combat units moved more or less randomly until they happened to see an enemy or they reached a point where they would decide to as a group swarm the enemy start location. Eventually, we had to leave for mars to avoid getting wiped out during the flood on earth. To do this, we eventually task our workers with building one rocket for every 5 combat units. Around turn 700, all of the combat units are told to get on the rockets and fly to mars. Once on Mars, combat units will move randomly until they see an enemy, in which case they will move to attack that enemy.

## <a name="design"/>Design Considerations
We decided to build this using a very object oriented design. Each different type of troop was treated as an object. This allowed us flexibility in a number of ways. While we still had to loop through and update each object every turn, we could store all of the units in our own arraylist instead of having to grab it every time we wanted to use it. It also would allow us (though this was never implemented due to time constraints) to group units into squads or similar organizational structures. Another example of a benefit this had for us was storing the location of Karbonite within our bot instead of trying to get it later. This allowed us to keep track of additional information, such as where it was, how much was there, and when we were last able to check how much Karbonite was on that square (See [here](https://github.com/UAH-CS-Club/UAHBattleCode2018/blob/master/UAHBotV2.0.0/KarboniteLocation.java) for more). While we never able to get the full benefit of this design choice, we feel it would have set us up really well in the long run.

## <a name="challenges"/>Challenges
We faced numerous challenges while working on this project that we were able to learn from.
 - Planning: We could have done much better in this regard. While we did put some thought into what we wanted our bot to do, we didn't draft out how we wanted to implement this. This resulted in numerous problems down the road when there were several different design concepts throughout the player. This led to us cleaning everything up to the above [design considerations](#design). We may have been able to write a much more complete player if we had done a better job of this in the beginning.
 - [Pathing](https://github.com/UAH-CS-Club/UAHBattleCode2018/blob/master/UAHBotV2.0.0/Path.java): We never really were able to implement a complete and solid pathing method. We did have couple basic pathing methods that were usable, but nothing that was optimal and would calculate the most efficient or a highly efficient path. We were very prone to getting trapped behind corners.
 - Version Control: Most of us were unfamiliar with github when we started. This caused us a number of issues with managing the development process as we often were inefficient in the ways we handled the development process.
 - Technology issues: We had a number of issues getting all of the software provided by the developers to work. While they are making significant changes next year due to the numerous problems many teams had, This was a challenge we had to work past.
 
## <a name="good"/>Things That Went Well
  - Error Handling: We never saw an official match where our player timed out or crashed.
  - Despite not doing to well in tournaments, we were able to win about 60% of our automated scrimmages.
  - Start Location Rush strategy (when actually used) proved to be extremely effective
  - In general, the longer our bot was able to stay alive, the better we did. We didn't handle early game well but if we could survive long enough to start building an army, we typically could win.

## <a name="samples"/>Sample Games
To try a couple sample games, you will need to download the viewer. You can download this by visiting the [Official Scaffold](https://github.com/battlecode/bc18-scaffold). Download and run `install_viewer.py`. Once installed, you should be able to play the sample games as long as they are downloaded on your computer! I am not sure how long this will be supported so if there are any problems, please raise an issue on this repository.Note: These are selected games and do not represent an even distribution of our matches. What you see here are one of each of the different ways our games tended to go.<br>
<br>
*Sample 1*: In this game, we are the blue team. We get off to a good start on earth but quickly end up dying due to a combination of pathing and target finding issues. We do manage to get to space in this instance and manage to land an empty rocket on Mars. While the enemy managed to do the same thing here, we won the tie breaker because for some reason, their rocket died (either it threw an error they hadn't handled or they made it self-destruct).<br>
<br>
*Sample 2*: In this game, we are the red team. This is probably the best example of our bot doing everything it was supposed to do. While we wipe out the forces on earth really early on (mostly due to luck in moving random directions) but our bot continues to use it's swarming techniques and floods their starting point. If they had still been alive on earth, that would have probably completely wiped them out. We continue doing this until it is time to build rockets and escape to Mars. When we get to Mars, it is just a matter of time until we are able to find and wipe out the enemy forces.<br>
<br>
*Sample 3*: In this game, we are the red team. We get off to a good start but the other team made the choice to take advantage of the worker's replication powers. This allows them to get a pretty solid jump start on production since this is a resource rich map. Since it takes us some time to build our strength, they are able to rush us with a bunch of knights pretty early in the game and wipe us out.<br>
<br>
*Sample 4*: In this game, we are the red team. This map always gave us a lot of trouble due to pathing. You can see on earth, our team has a lot of trouble handling the werid setup of the map. The other team seems to have made the decision that if they can manage to make it to mars, they might win if the other team never leaves. This eventually fails for them because we do eventually leave for Mars and win by a significant margain in the tie breaker.<br>
<br>
*Sample 5*: In this game, we are the blue team. This map ends up giving both teams some trouble with our pathing. Looking at each teams army, it looks like it will be an interesting match. All of the sudden at round 491, we win. This could mean several things, but probably means they either caused an error to occur, or they used too much of their given processing time.<br>

## <a name="members"/>Project Members
 - Nathan Solomon
 - Sam Lukins
 - Robert Womack
 - Kyle Daigle
 
## <a name="otherbots"/>Other Successful Team's Bots
This portion was created after the completetion of the project. It contains links to the github repositories of some of the other bots that were very successful.
 - [Dumbledore's Army](https://github.com/hansonyu123/Battlecode-2018)
 - [NP-ez](https://github.com/ChiCubed/bc18-bot)
 - [Oak's Disciples](https://github.com/Diana0604/battlecode18/tree/development)
 - [howrusogood??](https://github.com/WhaleVomit/Programming-Competitions/tree/master/Battlecode2018)
 - [Orbitary Graph](https://github.com/HalfVoxel/battlecode2018)
 - [Producing Perfection](https://github.com/VoidMercy/battlecode-2018)
 - [Tricycle](https://github.com/kmbrgandhi/tricycle_bot)
