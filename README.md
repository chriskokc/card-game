# Snap Card Game
## Project idea
 - This project is built in Java using the concept of OOP.

## Flowchart
### Snap Game for Single User
![singleUserGamePlay](https://user-images.githubusercontent.com/87203804/185802431-7be9630c-de32-433c-b541-514c2f6e4f56.png)


## How to play the Game
- The Snap game starts by asking user to press `y` to start.
- By pressing `ENTER`, the user takes their turn to draw a card from a deck of 52 cards.
- The game continues until two cards have the same symbol.
- At this condition, user wins the games.

### Game Start
<img width="504" alt="singleUserGamePlay_gameStart" src="https://user-images.githubusercontent.com/87203804/185802428-2b6bfbd6-b691-4dac-8dd7-dc091c130c1c.png">

### Winning condition
<img width="469" alt="singleUserGamePlay_winningState" src="https://user-images.githubusercontent.com/87203804/185802439-3924ea65-e49a-419d-a3c6-3d171ca2c705.png">


### Upgrade to two players Snap
To allow two players to play Snap, the program has been improved by creating an abstract class `Player`. `HumanPlayer` and `ComputerPlayer` inherit from `Player` and they can have different implementation for the `getResponse()` method. `HumanPlayer` is allowed to press `ENTER` to draw a card in their turn, while `ComputerPlayer` was set to draw card automatically. The winning state is determined when snap occurs in their turn.

<img width="500" alt="twoUsersGamePlay_winningState" src="https://user-images.githubusercontent.com/87203804/185806813-86eaea39-24aa-43af-b816-90c22c83911c.png">


### Timer for Snap opportunity
To make the entire card game more exciting, a timer has been created. When there is a snap opportunity for `HumanPlayer`, they have 2 seconds to submit the word "snap" in order to win. If they do not type it in time, they will miss the chance to win. 

<img width="386" alt="twoUsersGamePlay_timerWinningSnap" src="https://user-images.githubusercontent.com/87203804/185984213-f5ec870e-bc4a-4e4f-ba2a-2cdd6844f6fe.png">

<img width="404" alt="twoUsersGamePlay_timerMissSnap" src="https://user-images.githubusercontent.com/87203804/185984227-daa89b76-44bf-4414-9748-6f274de91ae1.png">


