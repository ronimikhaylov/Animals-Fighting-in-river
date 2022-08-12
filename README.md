# Animals-Fighting-in-river
Java Program to stimulate an ecosystem containing two types of creatures, bears and fish. The ecosystem consists of a river which is modeled as a relatively large array. Each cell of the array should contain an animal object, which can be a bear or fish object, or null. In each time step, based on a random process, each animal either attempts to move into an adjacent array cell or stay where it is. If two animals of the same type (but different gender) are about to collide into the same cell, then they stay where they are, but they create  an offspring which will be placed into a random cell and they stay where they are. If a bear and a fish collide, the fish gets eaten. If two male or  two female bears collide into one another, then they fight, and who ever has a higher strength (initialized randomly), wins the fight and strength increases by 4 and is capped at 100. 

Initial River State:

The size of the river is: 10
[0]: Female Fish (Strength 95.5) 
[1]: 
[2]: 
[3]: Female Bear (Strength 71.3) 
[4]: Female Fish (Strength 94.2) 
[5]: Female Fish (Strength 90.9) 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 
Now the Animals are restless
Simulation Pass: 1
Cell 0's Female Fish (Strength 95.5)  goes forward and settles in its new spot at Cell 1

The size of the river is: 10
[0]: 
[1]: Female Fish (Strength 95.5) 
[2]: 
[3]: Female Bear (Strength 71.3) 
[4]: Female Fish (Strength 94.2) 
[5]: Female Fish (Strength 90.9) 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Cell 1's Female Fish (Strength 95.5)  goes backward and settles in its new spot at Cell 0

The size of the river is: 10
[0]: Female Fish (Strength 95.5) 
[1]: 
[2]: 
[3]: Female Bear (Strength 71.3) 
[4]: Female Fish (Strength 94.2) 
[5]: Female Fish (Strength 90.9) 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Cell 2 is empty, no changes occur.
Cell 3's Female Bear (Strength 71.3)  stays put.

The size of the river is: 10
[0]: Female Fish (Strength 95.5) 
[1]: 
[2]: 
[3]: Female Bear (Strength 71.3) 
[4]: Female Fish (Strength 94.2) 
[5]: Female Fish (Strength 90.9) 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Cell 4's Female Fish (Strength 94.2)  is eaten by  Female Bear (Strength 71.3) 

The size of the river is: 10
[0]: Female Fish (Strength 95.5) 
[1]: 
[2]: 
[3]: Female Bear (Strength 71.3) 
[4]: 
[5]: Female Fish (Strength 90.9) 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Cell 5's Female Fish (Strength 90.9)  goes forward and settles in its new spot at Cell 6

The size of the river is: 10
[0]: Female Fish (Strength 95.5) 
[1]: 
[2]: 
[3]: Female Bear (Strength 71.3) 
[4]: 
[5]: 
[6]: Female Fish (Strength 90.9) 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Cell 6's Female Fish (Strength 90.9)  goes backward and settles in its new spot at Cell 5

The size of the river is: 10
[0]: Female Fish (Strength 95.5) 
[1]: 
[2]: 
[3]: Female Bear (Strength 71.3) 
[4]: 
[5]: Female Fish (Strength 90.9) 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Cell 7 is empty, no changes occur.
Cell 8 is empty, no changes occur.
Cell 9's Male Bear (Strength 31.4)  stays put.

The size of the river is: 10
[0]: Female Fish (Strength 95.5) 
[1]: 
[2]: 
[3]: Female Bear (Strength 71.3) 
[4]: 
[5]: Female Fish (Strength 90.9) 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Simulation Pass: 2
Cell 0's Female Fish (Strength 95.5)  stays put.

The size of the river is: 10
[0]: Female Fish (Strength 95.5) 
[1]: 
[2]: 
[3]: Female Bear (Strength 71.3) 
[4]: 
[5]: Female Fish (Strength 90.9) 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Cell 1 is empty, no changes occur.
Cell 2 is empty, no changes occur.
Cell 3's Female Bear (Strength 71.3)  goes backward and settles in its new spot at Cell 2

The size of the river is: 10
[0]: Female Fish (Strength 95.5) 
[1]: 
[2]: Female Bear (Strength 71.3) 
[3]: 
[4]: 
[5]: Female Fish (Strength 90.9) 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Cell 4 is empty, no changes occur.
Cell 5's Female Fish (Strength 90.9)  stays put.

The size of the river is: 10
[0]: Female Fish (Strength 95.5) 
[1]: 
[2]: Female Bear (Strength 71.3) 
[3]: 
[4]: 
[5]: Female Fish (Strength 90.9) 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Cell 6 is empty, no changes occur.
Cell 7 is empty, no changes occur.
Cell 8 is empty, no changes occur.
Cell 9's Male Bear (Strength 31.4)  stays put.

The size of the river is: 10
[0]: Female Fish (Strength 95.5) 
[1]: 
[2]: Female Bear (Strength 71.3) 
[3]: 
[4]: 
[5]: Female Fish (Strength 90.9) 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Simulation Pass: 3
Cell 0's Female Fish (Strength 95.5)  stays put.

The size of the river is: 10
[0]: Female Fish (Strength 95.5) 
[1]: 
[2]: Female Bear (Strength 71.3) 
[3]: 
[4]: 
[5]: Female Fish (Strength 90.9) 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Cell 1 is empty, no changes occur.
Cell 2's Female Bear (Strength 71.3)  goes forward and settles in its new spot at Cell 3

The size of the river is: 10
[0]: Female Fish (Strength 95.5) 
[1]: 
[2]: 
[3]: Female Bear (Strength 71.3) 
[4]: 
[5]: Female Fish (Strength 90.9) 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Cell 3's Female Bear (Strength 71.3)  goes forward and settles in its new spot at Cell 4

The size of the river is: 10
[0]: Female Fish (Strength 95.5) 
[1]: 
[2]: 
[3]: 
[4]: Female Bear (Strength 71.3) 
[5]: Female Fish (Strength 90.9) 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Cell 4's Female Bear (Strength 71.3)  stays put.

The size of the river is: 10
[0]: Female Fish (Strength 95.5) 
[1]: 
[2]: 
[3]: 
[4]: Female Bear (Strength 71.3) 
[5]: Female Fish (Strength 90.9) 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Cell 5's Female Fish (Strength 90.9)  is eaten by  Female Bear (Strength 71.3) 

The size of the river is: 10
[0]: Female Fish (Strength 95.5) 
[1]: 
[2]: 
[3]: 
[4]: Female Bear (Strength 71.3) 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Cell 6 is empty, no changes occur.
Cell 7 is empty, no changes occur.
Cell 8 is empty, no changes occur.
Cell 9's Male Bear (Strength 31.4)  stays put.

The size of the river is: 10
[0]: Female Fish (Strength 95.5) 
[1]: 
[2]: 
[3]: 
[4]: Female Bear (Strength 71.3) 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Simulation Pass: 4
Cell 0's Female Fish (Strength 95.5)  stays put.

The size of the river is: 10
[0]: Female Fish (Strength 95.5) 
[1]: 
[2]: 
[3]: 
[4]: Female Bear (Strength 71.3) 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Cell 1 is empty, no changes occur.
Cell 2 is empty, no changes occur.
Cell 3 is empty, no changes occur.
Cell 4's Female Bear (Strength 71.3)  goes backward and settles in its new spot at Cell 3

The size of the river is: 10
[0]: Female Fish (Strength 95.5) 
[1]: 
[2]: 
[3]: Female Bear (Strength 71.3) 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Cell 5 is empty, no changes occur.
Cell 6 is empty, no changes occur.
Cell 7 is empty, no changes occur.
Cell 8 is empty, no changes occur.
Cell 9's Male Bear (Strength 31.4)  stays put.

The size of the river is: 10
[0]: Female Fish (Strength 95.5) 
[1]: 
[2]: 
[3]: Female Bear (Strength 71.3) 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Simulation Pass: 5
Cell 0's Female Fish (Strength 95.5)  goes forward and settles in its new spot at Cell 1

The size of the river is: 10
[0]: 
[1]: Female Fish (Strength 95.5) 
[2]: 
[3]: Female Bear (Strength 71.3) 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Cell 1's Female Fish (Strength 95.5)  goes forward and settles in its new spot at Cell 2

The size of the river is: 10
[0]: 
[1]: 
[2]: Female Fish (Strength 95.5) 
[3]: Female Bear (Strength 71.3) 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Cell 2's Female Fish (Strength 95.5)  stays put.

The size of the river is: 10
[0]: 
[1]: 
[2]: Female Fish (Strength 95.5) 
[3]: Female Bear (Strength 71.3) 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Cell 3's Female Bear (Strength 71.3)  goes forward and settles in its new spot at Cell 4

The size of the river is: 10
[0]: 
[1]: 
[2]: Female Fish (Strength 95.5) 
[3]: 
[4]: Female Bear (Strength 71.3) 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Cell 4's Female Bear (Strength 71.3)  goes backward and settles in its new spot at Cell 3

The size of the river is: 10
[0]: 
[1]: 
[2]: Female Fish (Strength 95.5) 
[3]: Female Bear (Strength 71.3) 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Cell 5 is empty, no changes occur.
Cell 6 is empty, no changes occur.
Cell 7 is empty, no changes occur.
Cell 8 is empty, no changes occur.
Cell 9's Male Bear (Strength 31.4)  stays put.

The size of the river is: 10
[0]: 
[1]: 
[2]: Female Fish (Strength 95.5) 
[3]: Female Bear (Strength 71.3) 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Simulation Pass: 6
Cell 0 is empty, no changes occur.
Cell 1 is empty, no changes occur.
Cell 2's Female Fish (Strength 95.5)  goes backward and settles in its new spot at Cell 1

The size of the river is: 10
[0]: 
[1]: Female Fish (Strength 95.5) 
[2]: 
[3]: Female Bear (Strength 71.3) 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Cell 3's Female Bear (Strength 71.3)  stays put.

The size of the river is: 10
[0]: 
[1]: Female Fish (Strength 95.5) 
[2]: 
[3]: Female Bear (Strength 71.3) 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Cell 4 is empty, no changes occur.
Cell 5 is empty, no changes occur.
Cell 6 is empty, no changes occur.
Cell 7 is empty, no changes occur.
Cell 8 is empty, no changes occur.
Cell 9's Male Bear (Strength 31.4)  stays put.

The size of the river is: 10
[0]: 
[1]: Female Fish (Strength 95.5) 
[2]: 
[3]: Female Bear (Strength 71.3) 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Simulation Pass: 7
Cell 0 is empty, no changes occur.
Cell 1's Female Fish (Strength 95.5)  stays put.

The size of the river is: 10
[0]: 
[1]: Female Fish (Strength 95.5) 
[2]: 
[3]: Female Bear (Strength 71.3) 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Cell 2 is empty, no changes occur.
Cell 3's Female Bear (Strength 71.3)  stays put.

The size of the river is: 10
[0]: 
[1]: Female Fish (Strength 95.5) 
[2]: 
[3]: Female Bear (Strength 71.3) 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Cell 4 is empty, no changes occur.
Cell 5 is empty, no changes occur.
Cell 6 is empty, no changes occur.
Cell 7 is empty, no changes occur.
Cell 8 is empty, no changes occur.
Cell 9's Male Bear (Strength 31.4)  stays put.

The size of the river is: 10
[0]: 
[1]: Female Fish (Strength 95.5) 
[2]: 
[3]: Female Bear (Strength 71.3) 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Simulation Pass: 8
Cell 0 is empty, no changes occur.
Cell 1's Female Fish (Strength 95.5)  goes backward and settles in its new spot at Cell 0

The size of the river is: 10
[0]: Female Fish (Strength 95.5) 
[1]: 
[2]: 
[3]: Female Bear (Strength 71.3) 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Cell 2 is empty, no changes occur.
Cell 3's Female Bear (Strength 71.3)  goes backward and settles in its new spot at Cell 2

The size of the river is: 10
[0]: Female Fish (Strength 95.5) 
[1]: 
[2]: Female Bear (Strength 71.3) 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Cell 4 is empty, no changes occur.
Cell 5 is empty, no changes occur.
Cell 6 is empty, no changes occur.
Cell 7 is empty, no changes occur.
Cell 8 is empty, no changes occur.
Cell 9's Male Bear (Strength 31.4)  stays put.

The size of the river is: 10
[0]: Female Fish (Strength 95.5) 
[1]: 
[2]: Female Bear (Strength 71.3) 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Simulation Pass: 9
Cell 0's Female Fish (Strength 95.5)  stays put.

The size of the river is: 10
[0]: Female Fish (Strength 95.5) 
[1]: 
[2]: Female Bear (Strength 71.3) 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Cell 1 is empty, no changes occur.
Cell 2's Female Bear (Strength 71.3)  goes backward and settles in its new spot at Cell 1

The size of the river is: 10
[0]: Female Fish (Strength 95.5) 
[1]: Female Bear (Strength 71.3) 
[2]: 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Cell 3 is empty, no changes occur.
Cell 4 is empty, no changes occur.
Cell 5 is empty, no changes occur.
Cell 6 is empty, no changes occur.
Cell 7 is empty, no changes occur.
Cell 8 is empty, no changes occur.
Cell 9's Male Bear (Strength 31.4)  stays put.

The size of the river is: 10
[0]: Female Fish (Strength 95.5) 
[1]: Female Bear (Strength 71.3) 
[2]: 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Simulation Pass: 10
Cell 0's Female Fish (Strength 95.5)  is eaten by  Female Bear (Strength 71.3) 

The size of the river is: 10
[0]: 
[1]: Female Bear (Strength 71.3) 
[2]: 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Cell 1's Female Bear (Strength 71.3)  goes backward and settles in its new spot at Cell 0

The size of the river is: 10
[0]: Female Bear (Strength 71.3) 
[1]: 
[2]: 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Cell 2 is empty, no changes occur.
Cell 3 is empty, no changes occur.
Cell 4 is empty, no changes occur.
Cell 5 is empty, no changes occur.
Cell 6 is empty, no changes occur.
Cell 7 is empty, no changes occur.
Cell 8 is empty, no changes occur.
Cell 9's Male Bear (Strength 31.4)  stays put.

The size of the river is: 10
[0]: Female Bear (Strength 71.3) 
[1]: 
[2]: 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Simulation Pass: 11
Cell 0's Female Bear (Strength 71.3)  stays put.

The size of the river is: 10
[0]: Female Bear (Strength 71.3) 
[1]: 
[2]: 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Cell 1 is empty, no changes occur.
Cell 2 is empty, no changes occur.
Cell 3 is empty, no changes occur.
Cell 4 is empty, no changes occur.
Cell 5 is empty, no changes occur.
Cell 6 is empty, no changes occur.
Cell 7 is empty, no changes occur.
Cell 8 is empty, no changes occur.
Cell 9's Male Bear (Strength 31.4)  goes backward and settles in its new spot at Cell 8

The size of the river is: 10
[0]: Female Bear (Strength 71.3) 
[1]: 
[2]: 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: Male Bear (Strength 31.4) 
[9]: 

Simulation Pass: 12
Cell 0's Female Bear (Strength 71.3)  stays put.

The size of the river is: 10
[0]: Female Bear (Strength 71.3) 
[1]: 
[2]: 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: Male Bear (Strength 31.4) 
[9]: 

Cell 1 is empty, no changes occur.
Cell 2 is empty, no changes occur.
Cell 3 is empty, no changes occur.
Cell 4 is empty, no changes occur.
Cell 5 is empty, no changes occur.
Cell 6 is empty, no changes occur.
Cell 7 is empty, no changes occur.
Cell 8's Male Bear (Strength 31.4)  goes backward and settles in its new spot at Cell 7

The size of the river is: 10
[0]: Female Bear (Strength 71.3) 
[1]: 
[2]: 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: Male Bear (Strength 31.4) 
[8]: 
[9]: 

Cell 9 is empty, no changes occur.
Simulation Pass: 13
Cell 0's Female Bear (Strength 71.3)  goes forward and settles in its new spot at Cell 1

The size of the river is: 10
[0]: 
[1]: Female Bear (Strength 71.3) 
[2]: 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: Male Bear (Strength 31.4) 
[8]: 
[9]: 

Cell 1's Female Bear (Strength 71.3)  goes backward and settles in its new spot at Cell 0

The size of the river is: 10
[0]: Female Bear (Strength 71.3) 
[1]: 
[2]: 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: Male Bear (Strength 31.4) 
[8]: 
[9]: 

Cell 2 is empty, no changes occur.
Cell 3 is empty, no changes occur.
Cell 4 is empty, no changes occur.
Cell 5 is empty, no changes occur.
Cell 6 is empty, no changes occur.
Cell 7's Male Bear (Strength 31.4)  stays put.

The size of the river is: 10
[0]: Female Bear (Strength 71.3) 
[1]: 
[2]: 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: Male Bear (Strength 31.4) 
[8]: 
[9]: 

Cell 8 is empty, no changes occur.
Cell 9 is empty, no changes occur.
Simulation Pass: 14
Cell 0's Female Bear (Strength 71.3)  goes forward and settles in its new spot at Cell 1

The size of the river is: 10
[0]: 
[1]: Female Bear (Strength 71.3) 
[2]: 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: Male Bear (Strength 31.4) 
[8]: 
[9]: 

Cell 1's Female Bear (Strength 71.3)  goes forward and settles in its new spot at Cell 2

The size of the river is: 10
[0]: 
[1]: 
[2]: Female Bear (Strength 71.3) 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: Male Bear (Strength 31.4) 
[8]: 
[9]: 

Cell 2's Female Bear (Strength 71.3)  goes backward and settles in its new spot at Cell 1

The size of the river is: 10
[0]: 
[1]: Female Bear (Strength 71.3) 
[2]: 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: Male Bear (Strength 31.4) 
[8]: 
[9]: 

Cell 3 is empty, no changes occur.
Cell 4 is empty, no changes occur.
Cell 5 is empty, no changes occur.
Cell 6 is empty, no changes occur.
Cell 7's Male Bear (Strength 31.4)  goes forward and settles in its new spot at Cell 8

The size of the river is: 10
[0]: 
[1]: Female Bear (Strength 71.3) 
[2]: 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: Male Bear (Strength 31.4) 
[9]: 

Cell 8's Male Bear (Strength 31.4)  goes backward and settles in its new spot at Cell 7

The size of the river is: 10
[0]: 
[1]: Female Bear (Strength 71.3) 
[2]: 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: Male Bear (Strength 31.4) 
[8]: 
[9]: 

Cell 9 is empty, no changes occur.
Simulation Pass: 15
Cell 0 is empty, no changes occur.
Cell 1's Female Bear (Strength 71.3)  stays put.

The size of the river is: 10
[0]: 
[1]: Female Bear (Strength 71.3) 
[2]: 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: Male Bear (Strength 31.4) 
[8]: 
[9]: 

Cell 2 is empty, no changes occur.
Cell 3 is empty, no changes occur.
Cell 4 is empty, no changes occur.
Cell 5 is empty, no changes occur.
Cell 6 is empty, no changes occur.
Cell 7's Male Bear (Strength 31.4)  goes forward and settles in its new spot at Cell 8

The size of the river is: 10
[0]: 
[1]: Female Bear (Strength 71.3) 
[2]: 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: Male Bear (Strength 31.4) 
[9]: 

Cell 8's Male Bear (Strength 31.4)  goes backward and settles in its new spot at Cell 7

The size of the river is: 10
[0]: 
[1]: Female Bear (Strength 71.3) 
[2]: 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: Male Bear (Strength 31.4) 
[8]: 
[9]: 

Cell 9 is empty, no changes occur.
Simulation Pass: 16
Cell 0 is empty, no changes occur.
Cell 1's Female Bear (Strength 71.3)  stays put.

The size of the river is: 10
[0]: 
[1]: Female Bear (Strength 71.3) 
[2]: 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: Male Bear (Strength 31.4) 
[8]: 
[9]: 

Cell 2 is empty, no changes occur.
Cell 3 is empty, no changes occur.
Cell 4 is empty, no changes occur.
Cell 5 is empty, no changes occur.
Cell 6 is empty, no changes occur.
Cell 7's Male Bear (Strength 31.4)  stays put.

The size of the river is: 10
[0]: 
[1]: Female Bear (Strength 71.3) 
[2]: 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: Male Bear (Strength 31.4) 
[8]: 
[9]: 

Cell 8 is empty, no changes occur.
Cell 9 is empty, no changes occur.
Simulation Pass: 17
Cell 0 is empty, no changes occur.
Cell 1's Female Bear (Strength 71.3)  stays put.

The size of the river is: 10
[0]: 
[1]: Female Bear (Strength 71.3) 
[2]: 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: Male Bear (Strength 31.4) 
[8]: 
[9]: 

Cell 2 is empty, no changes occur.
Cell 3 is empty, no changes occur.
Cell 4 is empty, no changes occur.
Cell 5 is empty, no changes occur.
Cell 6 is empty, no changes occur.
Cell 7's Male Bear (Strength 31.4)  goes forward and settles in its new spot at Cell 8

The size of the river is: 10
[0]: 
[1]: Female Bear (Strength 71.3) 
[2]: 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: Male Bear (Strength 31.4) 
[9]: 

Cell 8's Male Bear (Strength 31.4)  goes forward and settles in its new spot at Cell 9

The size of the river is: 10
[0]: 
[1]: Female Bear (Strength 71.3) 
[2]: 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Cell 9's Male Bear (Strength 31.4)  stays put.

The size of the river is: 10
[0]: 
[1]: Female Bear (Strength 71.3) 
[2]: 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Simulation Pass: 18
Cell 0 is empty, no changes occur.
Cell 1's Female Bear (Strength 71.3)  stays put.

The size of the river is: 10
[0]: 
[1]: Female Bear (Strength 71.3) 
[2]: 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Cell 2 is empty, no changes occur.
Cell 3 is empty, no changes occur.
Cell 4 is empty, no changes occur.
Cell 5 is empty, no changes occur.
Cell 6 is empty, no changes occur.
Cell 7 is empty, no changes occur.
Cell 8 is empty, no changes occur.
Cell 9's Male Bear (Strength 31.4)  stays put.

The size of the river is: 10
[0]: 
[1]: Female Bear (Strength 71.3) 
[2]: 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Simulation Pass: 19
Cell 0 is empty, no changes occur.
Cell 1's Female Bear (Strength 71.3)  goes forward and settles in its new spot at Cell 2

The size of the river is: 10
[0]: 
[1]: 
[2]: Female Bear (Strength 71.3) 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Cell 2's Female Bear (Strength 71.3)  goes forward and settles in its new spot at Cell 3

The size of the river is: 10
[0]: 
[1]: 
[2]: 
[3]: Female Bear (Strength 71.3) 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Cell 3's Female Bear (Strength 71.3)  goes backward and settles in its new spot at Cell 2

The size of the river is: 10
[0]: 
[1]: 
[2]: Female Bear (Strength 71.3) 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Cell 4 is empty, no changes occur.
Cell 5 is empty, no changes occur.
Cell 6 is empty, no changes occur.
Cell 7 is empty, no changes occur.
Cell 8 is empty, no changes occur.
Cell 9's Male Bear (Strength 31.4)  stays put.

The size of the river is: 10
[0]: 
[1]: 
[2]: Female Bear (Strength 71.3) 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Simulation Pass: 20
Cell 0 is empty, no changes occur.
Cell 1 is empty, no changes occur.
Cell 2's Female Bear (Strength 71.3)  stays put.

The size of the river is: 10
[0]: 
[1]: 
[2]: Female Bear (Strength 71.3) 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Cell 3 is empty, no changes occur.
Cell 4 is empty, no changes occur.
Cell 5 is empty, no changes occur.
Cell 6 is empty, no changes occur.
Cell 7 is empty, no changes occur.
Cell 8 is empty, no changes occur.
Cell 9's Male Bear (Strength 31.4)  stays put.

The size of the river is: 10
[0]: 
[1]: 
[2]: Female Bear (Strength 71.3) 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Simulation Pass: 21
Cell 0 is empty, no changes occur.
Cell 1 is empty, no changes occur.
Cell 2's Female Bear (Strength 71.3)  stays put.

The size of the river is: 10
[0]: 
[1]: 
[2]: Female Bear (Strength 71.3) 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 31.4) 

Cell 3 is empty, no changes occur.
Cell 4 is empty, no changes occur.
Cell 5 is empty, no changes occur.
Cell 6 is empty, no changes occur.
Cell 7 is empty, no changes occur.
Cell 8 is empty, no changes occur.
Cell 9's Male Bear (Strength 31.4)  goes backward and settles in its new spot at Cell 8

The size of the river is: 10
[0]: 
[1]: 
[2]: Female Bear (Strength 71.3) 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: Male Bear (Strength 31.4) 
[9]: 

Simulation Pass: 22
Cell 0 is empty, no changes occur.
Cell 1 is empty, no changes occur.
Cell 2's Female Bear (Strength 71.3)  stays put.

The size of the river is: 10
[0]: 
[1]: 
[2]: Female Bear (Strength 71.3) 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: 
[8]: Male Bear (Strength 31.4) 
[9]: 

Cell 3 is empty, no changes occur.
Cell 4 is empty, no changes occur.
Cell 5 is empty, no changes occur.
Cell 6 is empty, no changes occur.
Cell 7 is empty, no changes occur.
Cell 8's Male Bear (Strength 31.4)  goes backward and settles in its new spot at Cell 7

The size of the river is: 10
[0]: 
[1]: 
[2]: Female Bear (Strength 71.3) 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: Male Bear (Strength 31.4) 
[8]: 
[9]: 

Cell 9 is empty, no changes occur.
Simulation Pass: 23
Cell 0 is empty, no changes occur.
Cell 1 is empty, no changes occur.
Cell 2's Female Bear (Strength 71.3)  goes backward and settles in its new spot at Cell 1

The size of the river is: 10
[0]: 
[1]: Female Bear (Strength 71.3) 
[2]: 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: Male Bear (Strength 31.4) 
[8]: 
[9]: 

Cell 3 is empty, no changes occur.
Cell 4 is empty, no changes occur.
Cell 5 is empty, no changes occur.
Cell 6 is empty, no changes occur.
Cell 7's Male Bear (Strength 31.4)  goes backward and settles in its new spot at Cell 6

The size of the river is: 10
[0]: 
[1]: Female Bear (Strength 71.3) 
[2]: 
[3]: 
[4]: 
[5]: 
[6]: Male Bear (Strength 31.4) 
[7]: 
[8]: 
[9]: 

Cell 8 is empty, no changes occur.
Cell 9 is empty, no changes occur.
Simulation Pass: 24
Cell 0 is empty, no changes occur.
Cell 1's Female Bear (Strength 71.3)  stays put.

The size of the river is: 10
[0]: 
[1]: Female Bear (Strength 71.3) 
[2]: 
[3]: 
[4]: 
[5]: 
[6]: Male Bear (Strength 31.4) 
[7]: 
[8]: 
[9]: 

Cell 2 is empty, no changes occur.
Cell 3 is empty, no changes occur.
Cell 4 is empty, no changes occur.
Cell 5 is empty, no changes occur.
Cell 6's Male Bear (Strength 31.4)  goes backward and settles in its new spot at Cell 5

The size of the river is: 10
[0]: 
[1]: Female Bear (Strength 71.3) 
[2]: 
[3]: 
[4]: 
[5]: Male Bear (Strength 31.4) 
[6]: 
[7]: 
[8]: 
[9]: 

Cell 7 is empty, no changes occur.
Cell 8 is empty, no changes occur.
Cell 9 is empty, no changes occur.
Simulation Pass: 25
Cell 0 is empty, no changes occur.
Cell 1's Female Bear (Strength 71.3)  goes forward and settles in its new spot at Cell 2

The size of the river is: 10
[0]: 
[1]: 
[2]: Female Bear (Strength 71.3) 
[3]: 
[4]: 
[5]: Male Bear (Strength 31.4) 
[6]: 
[7]: 
[8]: 
[9]: 

Cell 2's Female Bear (Strength 71.3)  goes forward and settles in its new spot at Cell 3

The size of the river is: 10
[0]: 
[1]: 
[2]: 
[3]: Female Bear (Strength 71.3) 
[4]: 
[5]: Male Bear (Strength 31.4) 
[6]: 
[7]: 
[8]: 
[9]: 

Cell 3's Female Bear (Strength 71.3)  goes backward and settles in its new spot at Cell 2

The size of the river is: 10
[0]: 
[1]: 
[2]: Female Bear (Strength 71.3) 
[3]: 
[4]: 
[5]: Male Bear (Strength 31.4) 
[6]: 
[7]: 
[8]: 
[9]: 

Cell 4 is empty, no changes occur.
Cell 5's Male Bear (Strength 31.4)  stays put.

The size of the river is: 10
[0]: 
[1]: 
[2]: Female Bear (Strength 71.3) 
[3]: 
[4]: 
[5]: Male Bear (Strength 31.4) 
[6]: 
[7]: 
[8]: 
[9]: 

Cell 6 is empty, no changes occur.
Cell 7 is empty, no changes occur.
Cell 8 is empty, no changes occur.
Cell 9 is empty, no changes occur.
Simulation Pass: 26
Cell 0 is empty, no changes occur.
Cell 1 is empty, no changes occur.
Cell 2's Female Bear (Strength 71.3)  goes forward and settles in its new spot at Cell 3

The size of the river is: 10
[0]: 
[1]: 
[2]: 
[3]: Female Bear (Strength 71.3) 
[4]: 
[5]: Male Bear (Strength 31.4) 
[6]: 
[7]: 
[8]: 
[9]: 

Cell 3's Female Bear (Strength 71.3)  goes forward and settles in its new spot at Cell 4

The size of the river is: 10
[0]: 
[1]: 
[2]: 
[3]: 
[4]: Female Bear (Strength 71.3) 
[5]: Male Bear (Strength 31.4) 
[6]: 
[7]: 
[8]: 
[9]: 

Cell 4's Female Bear (Strength 71.3)  stays put.

The size of the river is: 10
[0]: 
[1]: 
[2]: 
[3]: 
[4]: Female Bear (Strength 71.3) 
[5]: Male Bear (Strength 31.4) 
[6]: 
[7]: 
[8]: 
[9]: 

Cell 5's Male Bear (Strength 31.4)  goes backward ,encounters a Female Bear (Strength 71.3) and together they spawn a new Male Bear (Strength 89.9) into cell 0 . Elated, they both remain where they are.
The size of the river is: 10
[0]: Male Bear (Strength 89.9) 
[1]: 
[2]: 
[3]: 
[4]: Female Bear (Strength 71.3) 
[5]: Male Bear (Strength 31.4) 
[6]: 
[7]: 
[8]: 
[9]: 

Cell 6 is empty, no changes occur.
Cell 7 is empty, no changes occur.
Cell 8 is empty, no changes occur.
Cell 9 is empty, no changes occur.
Simulation Pass: 27
Cell 0's Male Bear (Strength 89.9)  stays put.

The size of the river is: 10
[0]: Male Bear (Strength 89.9) 
[1]: 
[2]: 
[3]: 
[4]: Female Bear (Strength 71.3) 
[5]: Male Bear (Strength 31.4) 
[6]: 
[7]: 
[8]: 
[9]: 

Cell 1 is empty, no changes occur.
Cell 2 is empty, no changes occur.
Cell 3 is empty, no changes occur.
Cell 4's Female Bear (Strength 71.3)  goes backward and settles in its new spot at Cell 3

The size of the river is: 10
[0]: Male Bear (Strength 89.9) 
[1]: 
[2]: 
[3]: Female Bear (Strength 71.3) 
[4]: 
[5]: Male Bear (Strength 31.4) 
[6]: 
[7]: 
[8]: 
[9]: 

Cell 5's Male Bear (Strength 31.4)  goes backward and settles in its new spot at Cell 4

The size of the river is: 10
[0]: Male Bear (Strength 89.9) 
[1]: 
[2]: 
[3]: Female Bear (Strength 71.3) 
[4]: Male Bear (Strength 31.4) 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: 

Cell 6 is empty, no changes occur.
Cell 7 is empty, no changes occur.
Cell 8 is empty, no changes occur.
Cell 9 is empty, no changes occur.
Simulation Pass: 28
Cell 0's Male Bear (Strength 89.9)  goes forward and settles in its new spot at Cell 1

The size of the river is: 10
[0]: 
[1]: Male Bear (Strength 89.9) 
[2]: 
[3]: Female Bear (Strength 71.3) 
[4]: Male Bear (Strength 31.4) 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: 

Cell 1's Male Bear (Strength 89.9)  goes backward and settles in its new spot at Cell 0

The size of the river is: 10
[0]: Male Bear (Strength 89.9) 
[1]: 
[2]: 
[3]: Female Bear (Strength 71.3) 
[4]: Male Bear (Strength 31.4) 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: 

Cell 2 is empty, no changes occur.
Cell 3's Female Bear (Strength 71.3)  goes forward ,encounters a Male Bear (Strength 31.4) and together they spawn a new Female Bear (Strength 69.7) into cell 1 . Elated, they both remain where they are.
The size of the river is: 10
[0]: Male Bear (Strength 89.9) 
[1]: Female Bear (Strength 69.7) 
[2]: 
[3]: Female Bear (Strength 71.3) 
[4]: Male Bear (Strength 31.4) 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: 

Cell 4's Male Bear (Strength 31.4)  stays put.

The size of the river is: 10
[0]: Male Bear (Strength 89.9) 
[1]: Female Bear (Strength 69.7) 
[2]: 
[3]: Female Bear (Strength 71.3) 
[4]: Male Bear (Strength 31.4) 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: 

Cell 5 is empty, no changes occur.
Cell 6 is empty, no changes occur.
Cell 7 is empty, no changes occur.
Cell 8 is empty, no changes occur.
Cell 9 is empty, no changes occur.
Simulation Pass: 29
Cell 0's Male Bear (Strength 89.9)  goes forward ,encounters a Female Bear (Strength 69.7) and together they spawn a new Male Bear (Strength 50.8) into cell 2 . Elated, they both remain where they are.
The size of the river is: 10
[0]: Male Bear (Strength 89.9) 
[1]: Female Bear (Strength 69.7) 
[2]: Male Bear (Strength 50.8) 
[3]: Female Bear (Strength 71.3) 
[4]: Male Bear (Strength 31.4) 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: 

Cell 1's Female Bear (Strength 69.7)  goes forward ,encounters a Male Bear (Strength 50.8) and together they spawn a new Female Bear (Strength 28.6) into cell 5 . Elated, they both remain where they are.
The size of the river is: 10
[0]: Male Bear (Strength 89.9) 
[1]: Female Bear (Strength 69.7) 
[2]: Male Bear (Strength 50.8) 
[3]: Female Bear (Strength 71.3) 
[4]: Male Bear (Strength 31.4) 
[5]: Female Bear (Strength 28.6) 
[6]: 
[7]: 
[8]: 
[9]: 

Cell 2's Male Bear (Strength 50.8)  goes backward ,encounters a Female Bear (Strength 69.7) and together they spawn a new Male Bear (Strength 53.9) into cell 6 . Elated, they both remain where they are.
The size of the river is: 10
[0]: Male Bear (Strength 89.9) 
[1]: Female Bear (Strength 69.7) 
[2]: Male Bear (Strength 50.8) 
[3]: Female Bear (Strength 71.3) 
[4]: Male Bear (Strength 31.4) 
[5]: Female Bear (Strength 28.6) 
[6]: Male Bear (Strength 53.9) 
[7]: 
[8]: 
[9]: 

Cell 3's Female Bear (Strength 71.3)  goes backward ,encounters a Male Bear (Strength 50.8) and together they spawn a new Female Bear (Strength 74.3) into cell 7 . Elated, they both remain where they are.
The size of the river is: 10
[0]: Male Bear (Strength 89.9) 
[1]: Female Bear (Strength 69.7) 
[2]: Male Bear (Strength 50.8) 
[3]: Female Bear (Strength 71.3) 
[4]: Male Bear (Strength 31.4) 
[5]: Female Bear (Strength 28.6) 
[6]: Male Bear (Strength 53.9) 
[7]: Female Bear (Strength 74.3) 
[8]: 
[9]: 

Cell 4's Male Bear (Strength 31.4)  goes backward ,encounters a Female Bear (Strength 71.3) and together they spawn a new Female Bear (Strength 43.6) into cell 8 . Elated, they both remain where they are.
The size of the river is: 10
[0]: Male Bear (Strength 89.9) 
[1]: Female Bear (Strength 69.7) 
[2]: Male Bear (Strength 50.8) 
[3]: Female Bear (Strength 71.3) 
[4]: Male Bear (Strength 31.4) 
[5]: Female Bear (Strength 28.6) 
[6]: Male Bear (Strength 53.9) 
[7]: Female Bear (Strength 74.3) 
[8]: Female Bear (Strength 43.6) 
[9]: 

Cell 5's Female Bear (Strength 28.6)  goes forward ,encounters a Male Bear (Strength 53.9) and together they spawn a new Female Bear (Strength 12.2) into cell 9 . Elated, they both remain where they are.
The size of the river is: 10
[0]: Male Bear (Strength 89.9) 
[1]: Female Bear (Strength 69.7) 
[2]: Male Bear (Strength 50.8) 
[3]: Female Bear (Strength 71.3) 
[4]: Male Bear (Strength 31.4) 
[5]: Female Bear (Strength 28.6) 
[6]: Male Bear (Strength 53.9) 
[7]: Female Bear (Strength 74.3) 
[8]: Female Bear (Strength 43.6) 
[9]: Female Bear (Strength 12.2) 

No More Empty Cells For Any Baby
