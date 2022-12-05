# osrs-highscores-checker
An application that, when given input, can show the stats, rankings, and boss kills of a player.

# Level:
Intermediate

# Learned:
- Using and reading from an API (Old School Runescape API)
- Working with response codes from the API
- Working with the StringBuilder object
- Reading from a file using a BufferedReader / FileReader
- How to create a menu system
- Working with multiple ArrayLists
- Error checking and validation
- Using try-catch blocks while reading from an API as well as reading from a file
- Using a static method
- Learning what a User-Agent is and how it relates to API's (lets the host know why you are using it)
- Proper use of the final keyword

# Example output

```
Please enter the name of the player you want to check
Gim Torin

CURRENT PLAYER: Gim Torin. Please pick an option from below to see their info
1 - See the players' COMBINED information
2 - See the players' SKILLS information
3 - See the players' ACTIVITY information
4 - See the players' CLUE information
5 - See the players' BOSS information
6 - Pick another player to view information about
2
Overall
	Rank: 107,130, Level: 2,113, XP: 193,389,474
Attack
	Rank: 278,578, Level: 98, XP: 12,561,468
Defence
	Rank: 326,714, Level: 93, XP: 7,417,401
Strength
	Rank: 274,367, Level: 99, XP: 13,558,604
Hitpoints
	Rank: 272,281, Level: 99, XP: 17,555,725
Ranged
	Rank: 289,935, Level: 99, XP: 14,153,289
Prayer
	Rank: 231,667, Level: 84, XP: 3,242,036
Magic
	Rank: 386,893, Level: 95, XP: 9,233,577
Cooking
	Rank: 319,446, Level: 95, XP: 8,807,499
Woodcutting
	Rank: 27,100, Level: 99, XP: 14,898,700
Fletching
	Rank: 171,145, Level: 99, XP: 13,034,475
Fishing
	Rank: 171,720, Level: 91, XP: 6,410,725
Firemaking
	Rank: 61,253, Level: 99, XP: 13,603,842
Crafting
	Rank: 179,794, Level: 90, XP: 5,607,579
Smithing
	Rank: 112,790, Level: 90, XP: 5,422,178
Mining
	Rank: 194,496, Level: 85, XP: 3,448,180
Herblore
	Rank: 82,943, Level: 94, XP: 8,715,925
Agility
	Rank: 138,068, Level: 85, XP: 3,486,066
Thieving
	Rank: 208,652, Level: 85, XP: 3,363,669
Slayer
	Rank: 532,360, Level: 81, XP: 2,287,223
Farming
	Rank: 55,561, Level: 99, XP: 15,922,437
Runecrafting
	Rank: 182,437, Level: 80, XP: 2,114,196
Hunter
	Rank: 116,676, Level: 89, XP: 5,231,131
Construction
	Rank: 144,584, Level: 85, XP: 3,313,549


CURRENT PLAYER: Gim Torin. Please pick an option from below to see their info
1 - See the players' COMBINED information
2 - See the players' SKILLS information
3 - See the players' ACTIVITY information
4 - See the players' CLUE information
5 - See the players' BOSS information
6 - Pick another player to view information about
6
Returning to the player picking process

Please enter the name of the player you want to check
Gim Bowie


CURRENT PLAYER: Gim Bowie. Please pick an option from below to see their info
1 - See the players' COMBINED information
2 - See the players' SKILLS information
3 - See the players' ACTIVITY information
4 - See the players' CLUE information
5 - See the players' BOSS information
6 - Pick another player to view information about
That was not a valid option - please pick again.
```
