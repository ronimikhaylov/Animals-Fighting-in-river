# Animals-Fighting-in-river
Java Program to stimulate an ecosystem containing two types of creatures, bears and fish. The ecosystem consists of a river which is modeled as a relatively large array. Each cell of the array should contain an animal object, which can be a bear or fish object, or null. In each time step, based on a random process, each animal either attempts to move into an adjacent array cell or stay where it is. If two animals of the same type (but different gender) are about to collide into the same cell, then they stay where they are, but they create  an offspring which will be placed into a random cell and they stay where they are. If a bear and a fish collide, the fish gets eaten. If two male or  two female bears collide into one another, then they fight, and who ever has a higher strength (initialized randomly), wins the fight and strength increases by 4 and is capped at 100. 
Sample output:
User input = 10

Initial River State:

The size of the river is: 10
[0]: Female Fish (Strength 77.7) 
[1]: 
[2]: 
[3]: Male Bear (Strength 96.1) 
[4]: 
[5]: 
[6]: Male Fish (Strength 24.0) 
[7]: Male Bear (Strength 16.0) 
[8]: 
[9]: Male Fish (Strength 55.5) 
Now the Animals are restless
Simulation Pass: 1
Cell 0's Female Fish (Strength 77.7)  goes forward and settles in its new spot at Cell 1

The size of the river is: 10
[0]: 
[1]: Female Fish (Strength 77.7) 
[2]: 
[3]: Male Bear (Strength 96.1) 
[4]: 
[5]: 
[6]: Male Fish (Strength 24.0) 
[7]: Male Bear (Strength 16.0) 
[8]: 
[9]: Male Fish (Strength 55.5) 

Cell 1's Female Fish (Strength 77.7)  goes forward and settles in its new spot at Cell 2

The size of the river is: 10
[0]: 
[1]: 
[2]: Female Fish (Strength 77.7) 
[3]: Male Bear (Strength 96.1) 
[4]: 
[5]: 
[6]: Male Fish (Strength 24.0) 
[7]: Male Bear (Strength 16.0) 
[8]: 
[9]: Male Fish (Strength 55.5) 

Cell 2's Female Fish (Strength 77.7)  stays put.

The size of the river is: 10
[0]: 
[1]: 
[2]: Female Fish (Strength 77.7) 
[3]: Male Bear (Strength 96.1) 
[4]: 
[5]: 
[6]: Male Fish (Strength 24.0) 
[7]: Male Bear (Strength 16.0) 
[8]: 
[9]: Male Fish (Strength 55.5) 

Cell 3's Male Bear (Strength 96.1)  goes forward and settles in its new spot at Cell 4

The size of the river is: 10
[0]: 
[1]: 
[2]: Female Fish (Strength 77.7) 
[3]: 
[4]: Male Bear (Strength 96.1) 
[5]: 
[6]: Male Fish (Strength 24.0) 
[7]: Male Bear (Strength 16.0) 
[8]: 
[9]: Male Fish (Strength 55.5) 

Cell 4's Male Bear (Strength 96.1)  stays put.

The size of the river is: 10
[0]: 
[1]: 
[2]: Female Fish (Strength 77.7) 
[3]: 
[4]: Male Bear (Strength 96.1) 
[5]: 
[6]: Male Fish (Strength 24.0) 
[7]: Male Bear (Strength 16.0) 
[8]: 
[9]: Male Fish (Strength 55.5) 

Cell 5 is empty, no changes occur.
Cell 6's Male Fish (Strength 24.0)  is eaten by  Male Bear (Strength 16.0) 

The size of the river is: 10
[0]: 
[1]: 
[2]: Female Fish (Strength 77.7) 
[3]: 
[4]: Male Bear (Strength 96.1) 
[5]: 
[6]: 
[7]: Male Bear (Strength 16.0) 
[8]: 
[9]: Male Fish (Strength 55.5) 

Cell 7's Male Bear (Strength 16.0)  goes backward and settles in its new spot at Cell 6

The size of the river is: 10
[0]: 
[1]: 
[2]: Female Fish (Strength 77.7) 
[3]: 
[4]: Male Bear (Strength 96.1) 
[5]: 
[6]: Male Bear (Strength 16.0) 
[7]: 
[8]: 
[9]: Male Fish (Strength 55.5) 

Cell 8 is empty, no changes occur.
Cell 9's Male Fish (Strength 55.5)  stays put.

The size of the river is: 10
[0]: 
[1]: 
[2]: Female Fish (Strength 77.7) 
[3]: 
[4]: Male Bear (Strength 96.1) 
[5]: 
[6]: Male Bear (Strength 16.0) 
[7]: 
[8]: 
[9]: Male Fish (Strength 55.5) 

Simulation Pass: 2
Cell 0 is empty, no changes occur.
Cell 1 is empty, no changes occur.
Cell 2's Female Fish (Strength 77.7)  stays put.

The size of the river is: 10
[0]: 
[1]: 
[2]: Female Fish (Strength 77.7) 
[3]: 
[4]: Male Bear (Strength 96.1) 
[5]: 
[6]: Male Bear (Strength 16.0) 
[7]: 
[8]: 
[9]: Male Fish (Strength 55.5) 

Cell 3 is empty, no changes occur.
Cell 4's Male Bear (Strength 96.1)  goes forward and settles in its new spot at Cell 5

The size of the river is: 10
[0]: 
[1]: 
[2]: Female Fish (Strength 77.7) 
[3]: 
[4]: 
[5]: Male Bear (Strength 96.1) 
[6]: Male Bear (Strength 16.0) 
[7]: 
[8]: 
[9]: Male Fish (Strength 55.5) 

Cell 5's Male Bear (Strength 96.1)  stays put.

The size of the river is: 10
[0]: 
[1]: 
[2]: Female Fish (Strength 77.7) 
[3]: 
[4]: 
[5]: Male Bear (Strength 96.1) 
[6]: Male Bear (Strength 16.0) 
[7]: 
[8]: 
[9]: Male Fish (Strength 55.5) 

Cell 6's Male Bear (Strength 16.0)  stays put.

The size of the river is: 10
[0]: 
[1]: 
[2]: Female Fish (Strength 77.7) 
[3]: 
[4]: 
[5]: Male Bear (Strength 96.1) 
[6]: Male Bear (Strength 16.0) 
[7]: 
[8]: 
[9]: Male Fish (Strength 55.5) 

Cell 7 is empty, no changes occur.
Cell 8 is empty, no changes occur.
Cell 9's Male Fish (Strength 55.5)  goes backward and settles in its new spot at Cell 8

The size of the river is: 10
[0]: 
[1]: 
[2]: Female Fish (Strength 77.7) 
[3]: 
[4]: 
[5]: Male Bear (Strength 96.1) 
[6]: Male Bear (Strength 16.0) 
[7]: 
[8]: Male Fish (Strength 55.5) 
[9]: 

Simulation Pass: 3
Cell 0 is empty, no changes occur.
Cell 1 is empty, no changes occur.
Cell 2's Female Fish (Strength 77.7)  stays put.

The size of the river is: 10
[0]: 
[1]: 
[2]: Female Fish (Strength 77.7) 
[3]: 
[4]: 
[5]: Male Bear (Strength 96.1) 
[6]: Male Bear (Strength 16.0) 
[7]: 
[8]: Male Fish (Strength 55.5) 
[9]: 

Cell 3 is empty, no changes occur.
Cell 4 is empty, no changes occur.
Male Bear (Strength 100.0)  in cell 5 moves forward, fights and defeats Male Bear (Strength 16.0) . And the strength  has been increased by 4.
The size of the river is: 10
[0]: 
[1]: 
[2]: Female Fish (Strength 77.7) 
[3]: 
[4]: 
[5]: 
[6]: Male Bear (Strength 100.0) 
[7]: 
[8]: Male Fish (Strength 55.5) 
[9]: 

Cell 6's Male Bear (Strength 100.0)  goes forward and settles in its new spot at Cell 7

The size of the river is: 10
[0]: 
[1]: 
[2]: Female Fish (Strength 77.7) 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: Male Bear (Strength 100.0) 
[8]: Male Fish (Strength 55.5) 
[9]: 

Cell 7's Male Bear (Strength 100.0)  stays put.

The size of the river is: 10
[0]: 
[1]: 
[2]: Female Fish (Strength 77.7) 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: Male Bear (Strength 100.0) 
[8]: Male Fish (Strength 55.5) 
[9]: 

Cell 8's Male Fish (Strength 55.5)  stays put.

The size of the river is: 10
[0]: 
[1]: 
[2]: Female Fish (Strength 77.7) 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: Male Bear (Strength 100.0) 
[8]: Male Fish (Strength 55.5) 
[9]: 

Cell 9 is empty, no changes occur.
Simulation Pass: 4
Cell 0 is empty, no changes occur.
Cell 1 is empty, no changes occur.
Cell 2's Female Fish (Strength 77.7)  goes forward and settles in its new spot at Cell 3

The size of the river is: 10
[0]: 
[1]: 
[2]: 
[3]: Female Fish (Strength 77.7) 
[4]: 
[5]: 
[6]: 
[7]: Male Bear (Strength 100.0) 
[8]: Male Fish (Strength 55.5) 
[9]: 

Cell 3's Female Fish (Strength 77.7)  goes forward and settles in its new spot at Cell 4

The size of the river is: 10
[0]: 
[1]: 
[2]: 
[3]: 
[4]: Female Fish (Strength 77.7) 
[5]: 
[6]: 
[7]: Male Bear (Strength 100.0) 
[8]: Male Fish (Strength 55.5) 
[9]: 

Cell 4's Female Fish (Strength 77.7)  stays put.

The size of the river is: 10
[0]: 
[1]: 
[2]: 
[3]: 
[4]: Female Fish (Strength 77.7) 
[5]: 
[6]: 
[7]: Male Bear (Strength 100.0) 
[8]: Male Fish (Strength 55.5) 
[9]: 

Cell 5 is empty, no changes occur.
Cell 6 is empty, no changes occur.
Cell 7's Male Bear (Strength 100.0)  eats Male Fish (Strength 55.5) and settles in its new spot at Cell 8

The size of the river is: 10
[0]: 
[1]: 
[2]: 
[3]: 
[4]: Female Fish (Strength 77.7) 
[5]: 
[6]: 
[7]: 
[8]: Male Bear (Strength 100.0) 
[9]: 

Cell 8's Male Bear (Strength 100.0)  goes forward and settles in its new spot at Cell 9

The size of the river is: 10
[0]: 
[1]: 
[2]: 
[3]: 
[4]: Female Fish (Strength 77.7) 
[5]: 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 100.0) 

Cell 9's Male Bear (Strength 100.0)  goes backward and settles in its new spot at Cell 8

The size of the river is: 10
[0]: 
[1]: 
[2]: 
[3]: 
[4]: Female Fish (Strength 77.7) 
[5]: 
[6]: 
[7]: 
[8]: Male Bear (Strength 100.0) 
[9]: 

Simulation Pass: 5
Cell 0 is empty, no changes occur.
Cell 1 is empty, no changes occur.
Cell 2 is empty, no changes occur.
Cell 3 is empty, no changes occur.
Cell 4's Female Fish (Strength 77.7)  stays put.

The size of the river is: 10
[0]: 
[1]: 
[2]: 
[3]: 
[4]: Female Fish (Strength 77.7) 
[5]: 
[6]: 
[7]: 
[8]: Male Bear (Strength 100.0) 
[9]: 

Cell 5 is empty, no changes occur.
Cell 6 is empty, no changes occur.
Cell 7 is empty, no changes occur.
Cell 8's Male Bear (Strength 100.0)  stays put.

The size of the river is: 10
[0]: 
[1]: 
[2]: 
[3]: 
[4]: Female Fish (Strength 77.7) 
[5]: 
[6]: 
[7]: 
[8]: Male Bear (Strength 100.0) 
[9]: 

Cell 9 is empty, no changes occur.
Simulation Pass: 6
Cell 0 is empty, no changes occur.
Cell 1 is empty, no changes occur.
Cell 2 is empty, no changes occur.
Cell 3 is empty, no changes occur.
Cell 4's Female Fish (Strength 77.7)  goes forward and settles in its new spot at Cell 5

The size of the river is: 10
[0]: 
[1]: 
[2]: 
[3]: 
[4]: 
[5]: Female Fish (Strength 77.7) 
[6]: 
[7]: 
[8]: Male Bear (Strength 100.0) 
[9]: 

Cell 5's Female Fish (Strength 77.7)  stays put.

The size of the river is: 10
[0]: 
[1]: 
[2]: 
[3]: 
[4]: 
[5]: Female Fish (Strength 77.7) 
[6]: 
[7]: 
[8]: Male Bear (Strength 100.0) 
[9]: 

Cell 6 is empty, no changes occur.
Cell 7 is empty, no changes occur.
Cell 8's Male Bear (Strength 100.0)  stays put.

The size of the river is: 10
[0]: 
[1]: 
[2]: 
[3]: 
[4]: 
[5]: Female Fish (Strength 77.7) 
[6]: 
[7]: 
[8]: Male Bear (Strength 100.0) 
[9]: 

Cell 9 is empty, no changes occur.
Simulation Pass: 7
Cell 0 is empty, no changes occur.
Cell 1 is empty, no changes occur.
Cell 2 is empty, no changes occur.
Cell 3 is empty, no changes occur.
Cell 4 is empty, no changes occur.
Cell 5's Female Fish (Strength 77.7)  stays put.

The size of the river is: 10
[0]: 
[1]: 
[2]: 
[3]: 
[4]: 
[5]: Female Fish (Strength 77.7) 
[6]: 
[7]: 
[8]: Male Bear (Strength 100.0) 
[9]: 

Cell 6 is empty, no changes occur.
Cell 7 is empty, no changes occur.
Cell 8's Male Bear (Strength 100.0)  goes backward and settles in its new spot at Cell 7

The size of the river is: 10
[0]: 
[1]: 
[2]: 
[3]: 
[4]: 
[5]: Female Fish (Strength 77.7) 
[6]: 
[7]: Male Bear (Strength 100.0) 
[8]: 
[9]: 

Cell 9 is empty, no changes occur.
Simulation Pass: 8
Cell 0 is empty, no changes occur.
Cell 1 is empty, no changes occur.
Cell 2 is empty, no changes occur.
Cell 3 is empty, no changes occur.
Cell 4 is empty, no changes occur.
Cell 5's Female Fish (Strength 77.7)  goes backward and settles in its new spot at Cell 4

The size of the river is: 10
[0]: 
[1]: 
[2]: 
[3]: 
[4]: Female Fish (Strength 77.7) 
[5]: 
[6]: 
[7]: Male Bear (Strength 100.0) 
[8]: 
[9]: 

Cell 6 is empty, no changes occur.
Cell 7's Male Bear (Strength 100.0)  goes forward and settles in its new spot at Cell 8

The size of the river is: 10
[0]: 
[1]: 
[2]: 
[3]: 
[4]: Female Fish (Strength 77.7) 
[5]: 
[6]: 
[7]: 
[8]: Male Bear (Strength 100.0) 
[9]: 

Cell 8's Male Bear (Strength 100.0)  stays put.

The size of the river is: 10
[0]: 
[1]: 
[2]: 
[3]: 
[4]: Female Fish (Strength 77.7) 
[5]: 
[6]: 
[7]: 
[8]: Male Bear (Strength 100.0) 
[9]: 

Cell 9 is empty, no changes occur.
Simulation Pass: 9
Cell 0 is empty, no changes occur.
Cell 1 is empty, no changes occur.
Cell 2 is empty, no changes occur.
Cell 3 is empty, no changes occur.
Cell 4's Female Fish (Strength 77.7)  stays put.

The size of the river is: 10
[0]: 
[1]: 
[2]: 
[3]: 
[4]: Female Fish (Strength 77.7) 
[5]: 
[6]: 
[7]: 
[8]: Male Bear (Strength 100.0) 
[9]: 

Cell 5 is empty, no changes occur.
Cell 6 is empty, no changes occur.
Cell 7 is empty, no changes occur.
Cell 8's Male Bear (Strength 100.0)  stays put.

The size of the river is: 10
[0]: 
[1]: 
[2]: 
[3]: 
[4]: Female Fish (Strength 77.7) 
[5]: 
[6]: 
[7]: 
[8]: Male Bear (Strength 100.0) 
[9]: 

Cell 9 is empty, no changes occur.
Simulation Pass: 10
Cell 0 is empty, no changes occur.
Cell 1 is empty, no changes occur.
Cell 2 is empty, no changes occur.
Cell 3 is empty, no changes occur.
Cell 4's Female Fish (Strength 77.7)  stays put.

The size of the river is: 10
[0]: 
[1]: 
[2]: 
[3]: 
[4]: Female Fish (Strength 77.7) 
[5]: 
[6]: 
[7]: 
[8]: Male Bear (Strength 100.0) 
[9]: 

Cell 5 is empty, no changes occur.
Cell 6 is empty, no changes occur.
Cell 7 is empty, no changes occur.
Cell 8's Male Bear (Strength 100.0)  stays put.

The size of the river is: 10
[0]: 
[1]: 
[2]: 
[3]: 
[4]: Female Fish (Strength 77.7) 
[5]: 
[6]: 
[7]: 
[8]: Male Bear (Strength 100.0) 
[9]: 

Cell 9 is empty, no changes occur.
Simulation Pass: 11
Cell 0 is empty, no changes occur.
Cell 1 is empty, no changes occur.
Cell 2 is empty, no changes occur.
Cell 3 is empty, no changes occur.
Cell 4's Female Fish (Strength 77.7)  goes forward and settles in its new spot at Cell 5

The size of the river is: 10
[0]: 
[1]: 
[2]: 
[3]: 
[4]: 
[5]: Female Fish (Strength 77.7) 
[6]: 
[7]: 
[8]: Male Bear (Strength 100.0) 
[9]: 

Cell 5's Female Fish (Strength 77.7)  stays put.

The size of the river is: 10
[0]: 
[1]: 
[2]: 
[3]: 
[4]: 
[5]: Female Fish (Strength 77.7) 
[6]: 
[7]: 
[8]: Male Bear (Strength 100.0) 
[9]: 

Cell 6 is empty, no changes occur.
Cell 7 is empty, no changes occur.
Cell 8's Male Bear (Strength 100.0)  goes forward and settles in its new spot at Cell 9

The size of the river is: 10
[0]: 
[1]: 
[2]: 
[3]: 
[4]: 
[5]: Female Fish (Strength 77.7) 
[6]: 
[7]: 
[8]: 
[9]: Male Bear (Strength 100.0) 

Cell 9's Male Bear (Strength 100.0)  goes backward and settles in its new spot at Cell 8

The size of the river is: 10
[0]: 
[1]: 
[2]: 
[3]: 
[4]: 
[5]: Female Fish (Strength 77.7) 
[6]: 
[7]: 
[8]: Male Bear (Strength 100.0) 
[9]: 

Simulation Pass: 12
Cell 0 is empty, no changes occur.
Cell 1 is empty, no changes occur.
Cell 2 is empty, no changes occur.
Cell 3 is empty, no changes occur.
Cell 4 is empty, no changes occur.
Cell 5's Female Fish (Strength 77.7)  stays put.

The size of the river is: 10
[0]: 
[1]: 
[2]: 
[3]: 
[4]: 
[5]: Female Fish (Strength 77.7) 
[6]: 
[7]: 
[8]: Male Bear (Strength 100.0) 
[9]: 

Cell 6 is empty, no changes occur.
Cell 7 is empty, no changes occur.
Cell 8's Male Bear (Strength 100.0)  stays put.

The size of the river is: 10
[0]: 
[1]: 
[2]: 
[3]: 
[4]: 
[5]: Female Fish (Strength 77.7) 
[6]: 
[7]: 
[8]: Male Bear (Strength 100.0) 
[9]: 

Cell 9 is empty, no changes occur.
Simulation Pass: 13
Cell 0 is empty, no changes occur.
Cell 1 is empty, no changes occur.
Cell 2 is empty, no changes occur.
Cell 3 is empty, no changes occur.
Cell 4 is empty, no changes occur.
Cell 5's Female Fish (Strength 77.7)  goes forward and settles in its new spot at Cell 6

The size of the river is: 10
[0]: 
[1]: 
[2]: 
[3]: 
[4]: 
[5]: 
[6]: Female Fish (Strength 77.7) 
[7]: 
[8]: Male Bear (Strength 100.0) 
[9]: 

Cell 6's Female Fish (Strength 77.7)  goes forward and settles in its new spot at Cell 7

The size of the river is: 10
[0]: 
[1]: 
[2]: 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: Female Fish (Strength 77.7) 
[8]: Male Bear (Strength 100.0) 
[9]: 

Cell 7's Female Fish (Strength 77.7)  stays put.

The size of the river is: 10
[0]: 
[1]: 
[2]: 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: Female Fish (Strength 77.7) 
[8]: Male Bear (Strength 100.0) 
[9]: 

Cell 8's Male Bear (Strength 100.0)  stays put.

The size of the river is: 10
[0]: 
[1]: 
[2]: 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: Female Fish (Strength 77.7) 
[8]: Male Bear (Strength 100.0) 
[9]: 

Cell 9 is empty, no changes occur.
Simulation Pass: 14
Cell 0 is empty, no changes occur.
Cell 1 is empty, no changes occur.
Cell 2 is empty, no changes occur.
Cell 3 is empty, no changes occur.
Cell 4 is empty, no changes occur.
Cell 5 is empty, no changes occur.
Cell 6 is empty, no changes occur.
Cell 7's Female Fish (Strength 77.7)  goes backward and settles in its new spot at Cell 6

The size of the river is: 10
[0]: 
[1]: 
[2]: 
[3]: 
[4]: 
[5]: 
[6]: Female Fish (Strength 77.7) 
[7]: 
[8]: Male Bear (Strength 100.0) 
[9]: 

Cell 8's Male Bear (Strength 100.0)  goes backward and settles in its new spot at Cell 7

The size of the river is: 10
[0]: 
[1]: 
[2]: 
[3]: 
[4]: 
[5]: 
[6]: Female Fish (Strength 77.7) 
[7]: Male Bear (Strength 100.0) 
[8]: 
[9]: 

Cell 9 is empty, no changes occur.
Simulation Pass: 15
Cell 0 is empty, no changes occur.
Cell 1 is empty, no changes occur.
Cell 2 is empty, no changes occur.
Cell 3 is empty, no changes occur.
Cell 4 is empty, no changes occur.
Cell 5 is empty, no changes occur.
Cell 6's Female Fish (Strength 77.7)  is eaten by  Male Bear (Strength 100.0) 

The size of the river is: 10
[0]: 
[1]: 
[2]: 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: Male Bear (Strength 100.0) 
[8]: 
[9]: 

Cell 7's Male Bear (Strength 100.0)  stays put.

The size of the river is: 10
[0]: 
[1]: 
[2]: 
[3]: 
[4]: 
[5]: 
[6]: 
[7]: Male Bear (Strength 100.0) 
[8]: 
[9]: 

Cell 8 is empty, no changes occur.
Cell 9 is empty, no changes occur.
