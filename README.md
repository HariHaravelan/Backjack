# Backjack
### Rules for the application:
- There's a single dealer and a player
- Initially both get two cards
- Number 2 to 9 cards have their numerical value that is counted as their score, Face cards have value of 10, Ace's value changes based on the current score
- Then Player asks dealer to hit, as long as Player's score is less than 17
- When Player reaches 17 or more then they no longer go for hit
- Dealer starts their turn, they go for hit as long as Dealer's score is less than 17
- After both are done with their turns, Outcome would be decided
-Every action has system out, output will be similar to this
>Task :GamePlay.main() <br/>
>Dealer got 4♣ score: 4 status: HIT <br/>
>Dealer got K♦︎ score: 14 status: HIT <br/>
>Player got A♦︎ score: 11 status: HIT <br/>
>Player got J♥ score: 21 status: BLACKJACK <br/>
>Dealer got 10♠ score: 24 status: BUST <br/>
>Dealer Bust, Player Wins
