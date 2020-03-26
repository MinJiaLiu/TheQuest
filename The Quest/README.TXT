Min Jia Liu
U54689134

Running the files:
1.Compile and run TheQuest class to start the game. Please keep terminal wide and big to keep the formatting of the 
output correct.

Instructions on the game:

About the board:
Player will be represented with an 'O' close to the center of a 8x8 board.
There will be 20% board will be fill with market (M) and 20% unmovable terrain (X). Rest is empty tile.
Player has 50% to fight a monster on a empty tile.

In game mechanic:
Basic
Player will enter their name and chooose number of heros they want on their team(1-3).
Each heros have their own money and inventory.
WASD-to move
I-inventory to equip,unequip and use potions
R- to relocate to a diffent map. Can be use when player wants to explore new map, or is spawn in a bad location.
T-to look at stats of current heros
Q-Quit the game

Market:
Can buy and sell stuff. 
Potions are into two category, tempory and nontempory.
Temporary potions are use to increase stat for one battle. Once a battle end, the effect wears off.
Nontemporary potions increase stats permantly.
(ADVICE: since the monsters are quite hard to defeat, it is important that the player SHOULD BUY weapons and armors to be able to deal 
damage to them)


Battle:
Player can choose to attack with spell, regular attack, and use potion.
Player gets to choose which monster to attack.
(Note: Player are not allow to change equipment during battle and unlike in the inventory page, player can only use one potion during battle each round.)
Heros will gain 5% mana and hp back at the end of each round.

Player can also check stats of their team and enemey.
(Note: These actions will not count as a turn. So player can check stats and still can attack monster);
Damage:
When hero and monster has dodge change. else they take damage -30%(defense/armor)

When player win:
they gain 150 gold and 2 exp.
When a hero level up,they gain back ALL the hp, and mana and updates their stats.
(Note: Max level for a hero is at lvl 10 )

when hero dies:
hero gains 50% of hp back at the end of the battle.

Monster:
Are at the same level of the highest hero and attacks heros RANDOMLY.




Instructions about class:

Item- Has name, cost,level requirement as attribute. 

	Subclasses of Item that holds attribute that related to each of them 
		Weapon- had the attribute damage
		Armor- has the damage_reduction attribute
		Potion- has attribute of str,agi,dex,mana,hp, number of potion, and temp increase. The temp increase decides if the stats are for temporary increase of a hero or not.
		Spell-damage,mana_cost,spell_type(this will affect the attribute listed afte it), damage_reduction, dodge_reduction, defense_reduction 

Character_Monster: attribute that is relevant to both monster and hero such as hp,mana, max hp,max mana, and level and name.
	Subclass of Character_Monster:
		Monster: has the attribute related to Monster(dodge_chance,defense,damage etc)
		Character: Each character has attribute related to the character stats.Characters have their own collections of weapon, armor, and potion and spell.
			Charcter can only equip ONE wepeaon, and armor and spell at a time. They can as many potions they want when not in battle. 
			
			Subclass of Character: Warrior, Sorcerer, Paladin. They have their own ratio of stats which will affect how the stats are increased during leveling up.


MainMarket: Initialize all the items that can be sold in the market place. 
Monsterlist: Intitialize all the monsters that exists, and also create list of the monster that heros can fight. 
Hero_list: Intitilaize all the heros that a player can choose. Also have functions that act upon list of heros, such as resetting hero stats after a battle, what to do when a list of hero 
	complete a battle.
Player: has a name, piece representing the Player (which is O in this setting).Has a list of character that the player has picked in the beginning.
Board: Intialize the playing board. Can be nxn dimensions and checks and set the player piece on the board.
Tile: Makes up the board. Has row, col, and representation character. M is for market, X for unpassable terrain, no letter for empty tile.
Play: Intialize the game with introductions, and deal with user inputs along with type checking to makes sure input is correct. Base on input, it will call functions to do corresponding action.
 















