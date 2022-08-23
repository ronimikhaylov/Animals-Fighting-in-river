# Animals-Fighting-in-river
Java Program to stimulate an ecosystem containing two types of creatures, bears and fish. The ecosystem consists of a river which is modeled as a relatively large array. Each cell of the array should contain an animal object, which can be a bear or fish object, or null. In each time step, based on a random process, each animal either attempts to move into an adjacent array cell or stay where it is. If two animals of the same type (but different gender) are about to collide into the same cell, then they stay where they are, but they create  an offspring which will be placed into a random cell and they stay where they are. If a bear and a fish collide, the fish gets eaten. If two male or  two female bears collide into one another, then they fight, and who ever has a higher strength (initialized randomly), wins the fight and strength increases by 4 and is capped at 100. </br>
BELOW IS SAMPLE OUTPUT IF 10 WERE TO BE INPUTTED BY THE USER. </br>
This particular output runs 10 simulations and ends up with one lonely female bear left at the end. </br>
This can also end where the array is full of bears and the program outputs "Sorry, there is no more room to place the baby", becuase it was at a point where male and female bear would collide. 
<p>Initial River State:</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 91.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]: Female Fish (Strength 21.7)&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]: Female Fish (Strength 19.0)&nbsp;</p>
<p>Now the Animals are restless</p>
<p>Simulation Pass: 1</p>
<p>Cell 0&apos;s Male Fish (Strength 80.0)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 91.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]: Female Fish (Strength 21.7)&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]: Female Fish (Strength 19.0)&nbsp;</p>
<p><br></p>
<p>Cell 1&apos;s Female Fish (Strength 91.6)&nbsp;&nbsp;goes backward ,encounters a Male Fish (Strength 80.0) and together they spawn a new Female Fish (Strength 88.5) into cell 2 . Elated, they both remain where they are.</p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 91.6)&nbsp;</p>
<p>[2]: Female Fish (Strength 88.5)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]: Female Fish (Strength 21.7)&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]: Female Fish (Strength 19.0)&nbsp;</p>
<p><br></p>
<p>Female Fish (Strength 88.5)&nbsp;&nbsp;in cell 2 moves backward, fights and defeated by Female Fish (Strength 95.6) , whose strength has been increased by 4 due to its victory.</p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]: Female Fish (Strength 21.7)&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]: Female Fish (Strength 19.0)&nbsp;</p>
<p><br></p>
<p>Cell 3 is empty, no changes occur.</p>
<p>Cell 4&apos;s Female Fish (Strength 21.7)&nbsp;&nbsp;goes backward and settles in its new spot at Cell 3</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]: Female Fish (Strength 21.7)&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]: Female Fish (Strength 19.0)&nbsp;</p>
<p><br></p>
<p>Cell 5&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;goes backward and settles in its new spot at Cell 4</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]: Female Fish (Strength 21.7)&nbsp;</p>
<p>[4]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]: Female Fish (Strength 19.0)&nbsp;</p>
<p><br></p>
<p>Cell 6 is empty, no changes occur.</p>
<p>Cell 7 is empty, no changes occur.</p>
<p>Cell 8 is empty, no changes occur.</p>
<p>Cell 9&apos;s Female Fish (Strength 19.0)&nbsp;&nbsp;goes backward and settles in its new spot at Cell 8</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]: Female Fish (Strength 21.7)&nbsp;</p>
<p>[4]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Simulation Pass: 2</p>
<p>Cell 0&apos;s Male Fish (Strength 80.0)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]: Female Fish (Strength 21.7)&nbsp;</p>
<p>[4]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 1&apos;s Female Fish (Strength 95.6)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]: Female Fish (Strength 21.7)&nbsp;</p>
<p>[4]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 2 is empty, no changes occur.</p>
<p>Cell 3&apos;s Female Fish (Strength 21.7)&nbsp;&nbsp;is eaten by&nbsp;&nbsp;Female Bear (Strength 33.4)&nbsp;</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 4&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 5</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 5&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 6 is empty, no changes occur.</p>
<p>Cell 7 is empty, no changes occur.</p>
<p>Cell 8&apos;s Female Fish (Strength 19.0)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 9</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]: Female Fish (Strength 19.0)&nbsp;</p>
<p><br></p>
<p>Cell 9&apos;s Female Fish (Strength 19.0)&nbsp;&nbsp;goes backward and settles in its new spot at Cell 8</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Simulation Pass: 3</p>
<p>Cell 0&apos;s Male Fish (Strength 80.0)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 1&apos;s Female Fish (Strength 95.6)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 2</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 2&apos;s Female Fish (Strength 95.6)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 3 is empty, no changes occur.</p>
<p>Cell 4 is empty, no changes occur.</p>
<p>Cell 5&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 6</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 6&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 7</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 7&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;goes backward and settles in its new spot at Cell 6</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 8&apos;s Female Fish (Strength 19.0)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 9 is empty, no changes occur.</p>
<p>Simulation Pass: 4</p>
<p>Cell 0&apos;s Male Fish (Strength 80.0)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 1</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]:&nbsp;</p>
<p>[1]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[2]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 1&apos;s Male Fish (Strength 80.0)&nbsp;&nbsp;goes backward and settles in its new spot at Cell 0</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 2&apos;s Female Fish (Strength 95.6)&nbsp;&nbsp;goes backward and settles in its new spot at Cell 1</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 3 is empty, no changes occur.</p>
<p>Cell 4 is empty, no changes occur.</p>
<p>Cell 5 is empty, no changes occur.</p>
<p>Cell 6&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;goes backward and settles in its new spot at Cell 5</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 7 is empty, no changes occur.</p>
<p>Cell 8&apos;s Female Fish (Strength 19.0)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 9</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]: Female Fish (Strength 19.0)&nbsp;</p>
<p><br></p>
<p>Cell 9&apos;s Female Fish (Strength 19.0)&nbsp;&nbsp;goes backward and settles in its new spot at Cell 8</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Simulation Pass: 5</p>
<p>Cell 0&apos;s Male Fish (Strength 80.0)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 1&apos;s Female Fish (Strength 95.6)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 2 is empty, no changes occur.</p>
<p>Cell 3 is empty, no changes occur.</p>
<p>Cell 4 is empty, no changes occur.</p>
<p>Cell 5&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 6</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 6&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 7</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 7&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;goes backward and settles in its new spot at Cell 6</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 8&apos;s Female Fish (Strength 19.0)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 9 is empty, no changes occur.</p>
<p>Simulation Pass: 6</p>
<p>Cell 0&apos;s Male Fish (Strength 80.0)&nbsp;&nbsp;goes forward ,encounters a Female Fish (Strength 95.6) and together they spawn a new Male Fish (Strength 17.1) into cell 2 . Elated, they both remain where they are.</p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]: Male Fish (Strength 17.1)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 1&apos;s Female Fish (Strength 95.6)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]: Male Fish (Strength 17.1)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 2&apos;s Male Fish (Strength 17.1)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 3</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]: Male Fish (Strength 17.1)&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 3&apos;s Male Fish (Strength 17.1)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 4</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]: Male Fish (Strength 17.1)&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 4&apos;s Male Fish (Strength 17.1)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]: Male Fish (Strength 17.1)&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 5 is empty, no changes occur.</p>
<p>Cell 6&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 7</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]: Male Fish (Strength 17.1)&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 7&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;goes backward and settles in its new spot at Cell 6</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]: Male Fish (Strength 17.1)&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 8&apos;s Female Fish (Strength 19.0)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 9</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]: Male Fish (Strength 17.1)&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]: Female Fish (Strength 19.0)&nbsp;</p>
<p><br></p>
<p>Cell 9&apos;s Female Fish (Strength 19.0)&nbsp;&nbsp;goes backward and settles in its new spot at Cell 8</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]: Male Fish (Strength 17.1)&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Simulation Pass: 7</p>
<p>Cell 0&apos;s Male Fish (Strength 80.0)&nbsp;&nbsp;goes forward ,encounters a Female Fish (Strength 95.6) and together they spawn a new Female Fish (Strength 49.2) into cell 2 . Elated, they both remain where they are.</p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]: Female Fish (Strength 49.2)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]: Male Fish (Strength 17.1)&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 1&apos;s Female Fish (Strength 95.6)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]: Female Fish (Strength 49.2)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]: Male Fish (Strength 17.1)&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 2&apos;s Female Fish (Strength 49.2)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]: Female Fish (Strength 49.2)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]: Male Fish (Strength 17.1)&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 3 is empty, no changes occur.</p>
<p>Cell 4&apos;s Male Fish (Strength 17.1)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 5</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]: Female Fish (Strength 49.2)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]: Male Fish (Strength 17.1)&nbsp;</p>
<p>[6]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 5&apos;s Male Fish (Strength 17.1)&nbsp;&nbsp;is eaten by&nbsp;&nbsp;Female Bear (Strength 33.4)&nbsp;</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]: Female Fish (Strength 49.2)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 6&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;goes backward and settles in its new spot at Cell 5</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]: Female Fish (Strength 49.2)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 7 is empty, no changes occur.</p>
<p>Cell 8&apos;s Female Fish (Strength 19.0)&nbsp;&nbsp;goes backward and settles in its new spot at Cell 7</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]: Female Fish (Strength 49.2)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 9 is empty, no changes occur.</p>
<p>Simulation Pass: 8</p>
<p>Cell 0&apos;s Male Fish (Strength 80.0)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]: Female Fish (Strength 49.2)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 1&apos;s Female Fish (Strength 95.6)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]: Female Fish (Strength 49.2)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 2&apos;s Female Fish (Strength 49.2)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 3</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]: Female Fish (Strength 49.2)&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 3&apos;s Female Fish (Strength 49.2)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 4</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]: Female Fish (Strength 49.2)&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 4&apos;s Female Fish (Strength 49.2)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]: Female Fish (Strength 49.2)&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 5&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 6</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]: Female Fish (Strength 49.2)&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 6&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;goes backward and settles in its new spot at Cell 5</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]: Female Fish (Strength 49.2)&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 7&apos;s Female Fish (Strength 19.0)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 8</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]: Female Fish (Strength 49.2)&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 8&apos;s Female Fish (Strength 19.0)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]: Female Fish (Strength 49.2)&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 9 is empty, no changes occur.</p>
<p>Simulation Pass: 9</p>
<p>Cell 0&apos;s Male Fish (Strength 80.0)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]: Female Fish (Strength 49.2)&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 1&apos;s Female Fish (Strength 95.6)&nbsp;&nbsp;goes backward ,encounters a Male Fish (Strength 80.0) and together they spawn a new Male Fish (Strength 33.6) into cell 2 . Elated, they both remain where they are.</p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]: Male Fish (Strength 33.6)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]: Female Fish (Strength 49.2)&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 2&apos;s Male Fish (Strength 33.6)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 3</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]: Male Fish (Strength 33.6)&nbsp;</p>
<p>[4]: Female Fish (Strength 49.2)&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 3&apos;s Male Fish (Strength 33.6)&nbsp;&nbsp;goes forward ,encounters a Female Fish (Strength 49.2) and together they spawn a new Female Fish (Strength 90.3) into cell 2 . Elated, they both remain where they are.</p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]: Female Fish (Strength 90.3)&nbsp;</p>
<p>[3]: Male Fish (Strength 33.6)&nbsp;</p>
<p>[4]: Female Fish (Strength 49.2)&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 4&apos;s Female Fish (Strength 49.2)&nbsp;&nbsp;is eaten by&nbsp;&nbsp;Female Bear (Strength 33.4)&nbsp;</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]: Female Fish (Strength 90.3)&nbsp;</p>
<p>[3]: Male Fish (Strength 33.6)&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 5&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;goes backward and settles in its new spot at Cell 4</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]: Female Fish (Strength 90.3)&nbsp;</p>
<p>[3]: Male Fish (Strength 33.6)&nbsp;</p>
<p>[4]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 6 is empty, no changes occur.</p>
<p>Cell 7 is empty, no changes occur.</p>
<p>Cell 8&apos;s Female Fish (Strength 19.0)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 9</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]: Female Fish (Strength 90.3)&nbsp;</p>
<p>[3]: Male Fish (Strength 33.6)&nbsp;</p>
<p>[4]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]: Female Fish (Strength 19.0)&nbsp;</p>
<p><br></p>
<p>Cell 9&apos;s Female Fish (Strength 19.0)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]: Female Fish (Strength 90.3)&nbsp;</p>
<p>[3]: Male Fish (Strength 33.6)&nbsp;</p>
<p>[4]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]: Female Fish (Strength 19.0)&nbsp;</p>
<p><br></p>
<p>Simulation Pass: 10</p>
<p>Cell 0&apos;s Male Fish (Strength 80.0)&nbsp;&nbsp;goes forward ,encounters a Female Fish (Strength 95.6) and together they spawn a new Female Fish (Strength 94.5) into cell 5 . Elated, they both remain where they are.</p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 95.6)&nbsp;</p>
<p>[2]: Female Fish (Strength 90.3)&nbsp;</p>
<p>[3]: Male Fish (Strength 33.6)&nbsp;</p>
<p>[4]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[5]: Female Fish (Strength 94.5)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]: Female Fish (Strength 19.0)&nbsp;</p>
<p><br></p>
<p>Female Fish (Strength 99.6)&nbsp;&nbsp;in cell 1 moves forward, fights and defeats Female Fish (Strength 90.3) . And the strength&nbsp;&nbsp;has been increased by 4.</p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Female Fish (Strength 99.6)&nbsp;</p>
<p>[3]: Male Fish (Strength 33.6)&nbsp;</p>
<p>[4]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[5]: Female Fish (Strength 94.5)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]: Female Fish (Strength 19.0)&nbsp;</p>
<p><br></p>
<p>Cell 2&apos;s Female Fish (Strength 99.6)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Female Fish (Strength 99.6)&nbsp;</p>
<p>[3]: Male Fish (Strength 33.6)&nbsp;</p>
<p>[4]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[5]: Female Fish (Strength 94.5)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]: Female Fish (Strength 19.0)&nbsp;</p>
<p><br></p>
<p>Cell 3&apos;s Male Fish (Strength 33.6)&nbsp;&nbsp;goes backward ,encounters a Female Fish (Strength 99.6) and together they spawn a new Male Fish (Strength 62.8) into cell 1 . Elated, they both remain where they are.</p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Male Fish (Strength 62.8)&nbsp;</p>
<p>[2]: Female Fish (Strength 99.6)&nbsp;</p>
<p>[3]: Male Fish (Strength 33.6)&nbsp;</p>
<p>[4]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[5]: Female Fish (Strength 94.5)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]: Female Fish (Strength 19.0)&nbsp;</p>
<p><br></p>
<p>Cell 4&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Male Fish (Strength 62.8)&nbsp;</p>
<p>[2]: Female Fish (Strength 99.6)&nbsp;</p>
<p>[3]: Male Fish (Strength 33.6)&nbsp;</p>
<p>[4]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[5]: Female Fish (Strength 94.5)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]: Female Fish (Strength 19.0)&nbsp;</p>
<p><br></p>
<p>Cell 5&apos;s Female Fish (Strength 94.5)&nbsp;&nbsp;is eaten by&nbsp;&nbsp;Female Bear (Strength 33.4)&nbsp;</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Male Fish (Strength 62.8)&nbsp;</p>
<p>[2]: Female Fish (Strength 99.6)&nbsp;</p>
<p>[3]: Male Fish (Strength 33.6)&nbsp;</p>
<p>[4]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]: Female Fish (Strength 19.0)&nbsp;</p>
<p><br></p>
<p>Cell 6 is empty, no changes occur.</p>
<p>Cell 7 is empty, no changes occur.</p>
<p>Cell 8 is empty, no changes occur.</p>
<p>Cell 9&apos;s Female Fish (Strength 19.0)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Male Fish (Strength 62.8)&nbsp;</p>
<p>[2]: Female Fish (Strength 99.6)&nbsp;</p>
<p>[3]: Male Fish (Strength 33.6)&nbsp;</p>
<p>[4]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]: Female Fish (Strength 19.0)&nbsp;</p>
<p><br></p>
<p>Simulation Pass: 11</p>
<p>Cell 0&apos;s Male Fish (Strength 80.0)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 80.0)&nbsp;</p>
<p>[1]: Male Fish (Strength 62.8)&nbsp;</p>
<p>[2]: Female Fish (Strength 99.6)&nbsp;</p>
<p>[3]: Male Fish (Strength 33.6)&nbsp;</p>
<p>[4]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]: Female Fish (Strength 19.0)&nbsp;</p>
<p><br></p>
<p>Male Fish (Strength 62.8)&nbsp;&nbsp;in cell 1 moves backward, fights and defeated by Male Fish (Strength 84.0) , whose strength has been increased by 4 due to its victory.</p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Female Fish (Strength 99.6)&nbsp;</p>
<p>[3]: Male Fish (Strength 33.6)&nbsp;</p>
<p>[4]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]: Female Fish (Strength 19.0)&nbsp;</p>
<p><br></p>
<p>Cell 2&apos;s Female Fish (Strength 99.6)&nbsp;&nbsp;goes forward ,encounters a Male Fish (Strength 33.6) and together they spawn a new Female Fish (Strength 67.8) into cell 1 . Elated, they both remain where they are.</p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 67.8)&nbsp;</p>
<p>[2]: Female Fish (Strength 99.6)&nbsp;</p>
<p>[3]: Male Fish (Strength 33.6)&nbsp;</p>
<p>[4]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]: Female Fish (Strength 19.0)&nbsp;</p>
<p><br></p>
<p>Cell 3&apos;s Male Fish (Strength 33.6)&nbsp;&nbsp;is eaten by&nbsp;&nbsp;Female Bear (Strength 33.4)&nbsp;</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 67.8)&nbsp;</p>
<p>[2]: Female Fish (Strength 99.6)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]: Female Fish (Strength 19.0)&nbsp;</p>
<p><br></p>
<p>Cell 4&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;goes backward and settles in its new spot at Cell 3</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 67.8)&nbsp;</p>
<p>[2]: Female Fish (Strength 99.6)&nbsp;</p>
<p>[3]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]: Female Fish (Strength 19.0)&nbsp;</p>
<p><br></p>
<p>Cell 5 is empty, no changes occur.</p>
<p>Cell 6 is empty, no changes occur.</p>
<p>Cell 7 is empty, no changes occur.</p>
<p>Cell 8 is empty, no changes occur.</p>
<p>Cell 9&apos;s Female Fish (Strength 19.0)&nbsp;&nbsp;goes backward and settles in its new spot at Cell 8</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 67.8)&nbsp;</p>
<p>[2]: Female Fish (Strength 99.6)&nbsp;</p>
<p>[3]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Simulation Pass: 12</p>
<p>Cell 0&apos;s Male Fish (Strength 84.0)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 67.8)&nbsp;</p>
<p>[2]: Female Fish (Strength 99.6)&nbsp;</p>
<p>[3]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 1&apos;s Female Fish (Strength 67.8)&nbsp;&nbsp;goes backward ,encounters a Male Fish (Strength 84.0) and together they spawn a new Female Fish (Strength 71.0) into cell 4 . Elated, they both remain where they are.</p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 67.8)&nbsp;</p>
<p>[2]: Female Fish (Strength 99.6)&nbsp;</p>
<p>[3]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[4]: Female Fish (Strength 71.0)&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 2&apos;s Female Fish (Strength 99.6)&nbsp;&nbsp;is eaten by&nbsp;&nbsp;Female Bear (Strength 33.4)&nbsp;</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 67.8)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[4]: Female Fish (Strength 71.0)&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 3&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;goes backward and settles in its new spot at Cell 2</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 67.8)&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]: Female Fish (Strength 71.0)&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 4&apos;s Female Fish (Strength 71.0)&nbsp;&nbsp;goes backward and settles in its new spot at Cell 3</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 67.8)&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]: Female Fish (Strength 71.0)&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 5 is empty, no changes occur.</p>
<p>Cell 6 is empty, no changes occur.</p>
<p>Cell 7 is empty, no changes occur.</p>
<p>Cell 8&apos;s Female Fish (Strength 19.0)&nbsp;&nbsp;goes backward and settles in its new spot at Cell 7</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 67.8)&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]: Female Fish (Strength 71.0)&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 9 is empty, no changes occur.</p>
<p>Simulation Pass: 13</p>
<p>Cell 0&apos;s Male Fish (Strength 84.0)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]: Female Fish (Strength 67.8)&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]: Female Fish (Strength 71.0)&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 1&apos;s Female Fish (Strength 67.8)&nbsp;&nbsp;is eaten by&nbsp;&nbsp;Female Bear (Strength 33.4)&nbsp;</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]: Female Fish (Strength 71.0)&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 2&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]: Female Fish (Strength 71.0)&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 3&apos;s Female Fish (Strength 71.0)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]: Female Fish (Strength 71.0)&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 4 is empty, no changes occur.</p>
<p>Cell 5 is empty, no changes occur.</p>
<p>Cell 6 is empty, no changes occur.</p>
<p>Cell 7&apos;s Female Fish (Strength 19.0)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 8</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]: Female Fish (Strength 71.0)&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 8&apos;s Female Fish (Strength 19.0)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 9</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]: Female Fish (Strength 71.0)&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]: Female Fish (Strength 19.0)&nbsp;</p>
<p><br></p>
<p>Cell 9&apos;s Female Fish (Strength 19.0)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]: Female Fish (Strength 71.0)&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]: Female Fish (Strength 19.0)&nbsp;</p>
<p><br></p>
<p>Simulation Pass: 14</p>
<p>Cell 0&apos;s Male Fish (Strength 84.0)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 1</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]:&nbsp;</p>
<p>[1]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]: Female Fish (Strength 71.0)&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]: Female Fish (Strength 19.0)&nbsp;</p>
<p><br></p>
<p>Cell 1&apos;s Male Fish (Strength 84.0)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]:&nbsp;</p>
<p>[1]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]: Female Fish (Strength 71.0)&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]: Female Fish (Strength 19.0)&nbsp;</p>
<p><br></p>
<p>Cell 2&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]:&nbsp;</p>
<p>[1]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]: Female Fish (Strength 71.0)&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]: Female Fish (Strength 19.0)&nbsp;</p>
<p><br></p>
<p>Cell 3&apos;s Female Fish (Strength 71.0)&nbsp;&nbsp;is eaten by&nbsp;&nbsp;Female Bear (Strength 33.4)&nbsp;</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]:&nbsp;</p>
<p>[1]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]: Female Fish (Strength 19.0)&nbsp;</p>
<p><br></p>
<p>Cell 4 is empty, no changes occur.</p>
<p>Cell 5 is empty, no changes occur.</p>
<p>Cell 6 is empty, no changes occur.</p>
<p>Cell 7 is empty, no changes occur.</p>
<p>Cell 8 is empty, no changes occur.</p>
<p>Cell 9&apos;s Female Fish (Strength 19.0)&nbsp;&nbsp;goes backward and settles in its new spot at Cell 8</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]:&nbsp;</p>
<p>[1]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Simulation Pass: 15</p>
<p>Cell 0 is empty, no changes occur.</p>
<p>Cell 1&apos;s Male Fish (Strength 84.0)&nbsp;&nbsp;goes backward and settles in its new spot at Cell 0</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 2&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 3 is empty, no changes occur.</p>
<p>Cell 4 is empty, no changes occur.</p>
<p>Cell 5 is empty, no changes occur.</p>
<p>Cell 6 is empty, no changes occur.</p>
<p>Cell 7 is empty, no changes occur.</p>
<p>Cell 8&apos;s Female Fish (Strength 19.0)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 9 is empty, no changes occur.</p>
<p>Simulation Pass: 16</p>
<p>Cell 0&apos;s Male Fish (Strength 84.0)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 1 is empty, no changes occur.</p>
<p>Cell 2&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 3</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 3&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;goes backward and settles in its new spot at Cell 2</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 4 is empty, no changes occur.</p>
<p>Cell 5 is empty, no changes occur.</p>
<p>Cell 6 is empty, no changes occur.</p>
<p>Cell 7 is empty, no changes occur.</p>
<p>Cell 8&apos;s Female Fish (Strength 19.0)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 9 is empty, no changes occur.</p>
<p>Simulation Pass: 17</p>
<p>Cell 0&apos;s Male Fish (Strength 84.0)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 1 is empty, no changes occur.</p>
<p>Cell 2&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 3</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 3&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 4 is empty, no changes occur.</p>
<p>Cell 5 is empty, no changes occur.</p>
<p>Cell 6 is empty, no changes occur.</p>
<p>Cell 7 is empty, no changes occur.</p>
<p>Cell 8&apos;s Female Fish (Strength 19.0)&nbsp;&nbsp;goes backward and settles in its new spot at Cell 7</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 9 is empty, no changes occur.</p>
<p>Simulation Pass: 18</p>
<p>Cell 0&apos;s Male Fish (Strength 84.0)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 1 is empty, no changes occur.</p>
<p>Cell 2 is empty, no changes occur.</p>
<p>Cell 3&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 4</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 4&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;goes backward and settles in its new spot at Cell 3</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 5 is empty, no changes occur.</p>
<p>Cell 6 is empty, no changes occur.</p>
<p>Cell 7&apos;s Female Fish (Strength 19.0)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 8 is empty, no changes occur.</p>
<p>Cell 9 is empty, no changes occur.</p>
<p>Simulation Pass: 19</p>
<p>Cell 0&apos;s Male Fish (Strength 84.0)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 1 is empty, no changes occur.</p>
<p>Cell 2 is empty, no changes occur.</p>
<p>Cell 3&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 4 is empty, no changes occur.</p>
<p>Cell 5 is empty, no changes occur.</p>
<p>Cell 6 is empty, no changes occur.</p>
<p>Cell 7&apos;s Female Fish (Strength 19.0)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 8 is empty, no changes occur.</p>
<p>Cell 9 is empty, no changes occur.</p>
<p>Simulation Pass: 20</p>
<p>Cell 0&apos;s Male Fish (Strength 84.0)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 1 is empty, no changes occur.</p>
<p>Cell 2 is empty, no changes occur.</p>
<p>Cell 3&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;goes backward and settles in its new spot at Cell 2</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 4 is empty, no changes occur.</p>
<p>Cell 5 is empty, no changes occur.</p>
<p>Cell 6 is empty, no changes occur.</p>
<p>Cell 7&apos;s Female Fish (Strength 19.0)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 8</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 8&apos;s Female Fish (Strength 19.0)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 9 is empty, no changes occur.</p>
<p>Simulation Pass: 21</p>
<p>Cell 0&apos;s Male Fish (Strength 84.0)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 1</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]:&nbsp;</p>
<p>[1]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 1&apos;s Male Fish (Strength 84.0)&nbsp;&nbsp;goes backward and settles in its new spot at Cell 0</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 2&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 3</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 3&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;goes backward and settles in its new spot at Cell 2</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 4 is empty, no changes occur.</p>
<p>Cell 5 is empty, no changes occur.</p>
<p>Cell 6 is empty, no changes occur.</p>
<p>Cell 7 is empty, no changes occur.</p>
<p>Cell 8&apos;s Female Fish (Strength 19.0)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 9</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]: Female Fish (Strength 19.0)&nbsp;</p>
<p><br></p>
<p>Cell 9&apos;s Female Fish (Strength 19.0)&nbsp;&nbsp;goes backward and settles in its new spot at Cell 8</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Simulation Pass: 22</p>
<p>Cell 0&apos;s Male Fish (Strength 84.0)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 1</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]:&nbsp;</p>
<p>[1]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 1&apos;s Male Fish (Strength 84.0)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]:&nbsp;</p>
<p>[1]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 2&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]:&nbsp;</p>
<p>[1]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 3 is empty, no changes occur.</p>
<p>Cell 4 is empty, no changes occur.</p>
<p>Cell 5 is empty, no changes occur.</p>
<p>Cell 6 is empty, no changes occur.</p>
<p>Cell 7 is empty, no changes occur.</p>
<p>Cell 8&apos;s Female Fish (Strength 19.0)&nbsp;&nbsp;goes backward and settles in its new spot at Cell 7</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]:&nbsp;</p>
<p>[1]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 9 is empty, no changes occur.</p>
<p>Simulation Pass: 23</p>
<p>Cell 0 is empty, no changes occur.</p>
<p>Cell 1&apos;s Male Fish (Strength 84.0)&nbsp;&nbsp;goes backward and settles in its new spot at Cell 0</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 2&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;goes backward and settles in its new spot at Cell 1</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 3 is empty, no changes occur.</p>
<p>Cell 4 is empty, no changes occur.</p>
<p>Cell 5 is empty, no changes occur.</p>
<p>Cell 6 is empty, no changes occur.</p>
<p>Cell 7&apos;s Female Fish (Strength 19.0)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 8 is empty, no changes occur.</p>
<p>Cell 9 is empty, no changes occur.</p>
<p>Simulation Pass: 24</p>
<p>Cell 0&apos;s Male Fish (Strength 84.0)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 1&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 2</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 2&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 3 is empty, no changes occur.</p>
<p>Cell 4 is empty, no changes occur.</p>
<p>Cell 5 is empty, no changes occur.</p>
<p>Cell 6 is empty, no changes occur.</p>
<p>Cell 7&apos;s Female Fish (Strength 19.0)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 8 is empty, no changes occur.</p>
<p>Cell 9 is empty, no changes occur.</p>
<p>Simulation Pass: 25</p>
<p>Cell 0&apos;s Male Fish (Strength 84.0)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 1</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]:&nbsp;</p>
<p>[1]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 1&apos;s Male Fish (Strength 84.0)&nbsp;&nbsp;goes backward and settles in its new spot at Cell 0</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 2&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 3</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 3&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 4</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 4&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 5 is empty, no changes occur.</p>
<p>Cell 6 is empty, no changes occur.</p>
<p>Cell 7&apos;s Female Fish (Strength 19.0)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 8 is empty, no changes occur.</p>
<p>Cell 9 is empty, no changes occur.</p>
<p>Simulation Pass: 26</p>
<p>Cell 0&apos;s Male Fish (Strength 84.0)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 1 is empty, no changes occur.</p>
<p>Cell 2 is empty, no changes occur.</p>
<p>Cell 3 is empty, no changes occur.</p>
<p>Cell 4&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 5</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 5&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 6</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[7]: Female Fish (Strength 19.0)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 6&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;eats Female Fish (Strength 19.0) and settles in its new spot at Cell 7</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 7&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 8 is empty, no changes occur.</p>
<p>Cell 9 is empty, no changes occur.</p>
<p>Simulation Pass: 27</p>
<p>Cell 0&apos;s Male Fish (Strength 84.0)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 1</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]:&nbsp;</p>
<p>[1]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 1&apos;s Male Fish (Strength 84.0)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 2</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]:&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 2&apos;s Male Fish (Strength 84.0)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]:&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 3 is empty, no changes occur.</p>
<p>Cell 4 is empty, no changes occur.</p>
<p>Cell 5 is empty, no changes occur.</p>
<p>Cell 6 is empty, no changes occur.</p>
<p>Cell 7&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;goes backward and settles in its new spot at Cell 6</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]:&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 8 is empty, no changes occur.</p>
<p>Cell 9 is empty, no changes occur.</p>
<p>Simulation Pass: 28</p>
<p>Cell 0 is empty, no changes occur.</p>
<p>Cell 1 is empty, no changes occur.</p>
<p>Cell 2&apos;s Male Fish (Strength 84.0)&nbsp;&nbsp;stays put.</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]:&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 3 is empty, no changes occur.</p>
<p>Cell 4 is empty, no changes occur.</p>
<p>Cell 5 is empty, no changes occur.</p>
<p>Cell 6&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;goes backward and settles in its new spot at Cell 5</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]:&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 7 is empty, no changes occur.</p>
<p>Cell 8 is empty, no changes occur.</p>
<p>Cell 9 is empty, no changes occur.</p>
<p>Simulation Pass: 29</p>
<p>Cell 0 is empty, no changes occur.</p>
<p>Cell 1 is empty, no changes occur.</p>
<p>Cell 2&apos;s Male Fish (Strength 84.0)&nbsp;&nbsp;goes backward and settles in its new spot at Cell 1</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]:&nbsp;</p>
<p>[1]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 3 is empty, no changes occur.</p>
<p>Cell 4 is empty, no changes occur.</p>
<p>Cell 5&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 6</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]:&nbsp;</p>
<p>[1]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 6&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;goes backward and settles in its new spot at Cell 5</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]:&nbsp;</p>
<p>[1]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 7 is empty, no changes occur.</p>
<p>Cell 8 is empty, no changes occur.</p>
<p>Cell 9 is empty, no changes occur.</p>
<p>Simulation Pass: 30</p>
<p>Cell 0 is empty, no changes occur.</p>
<p>Cell 1&apos;s Male Fish (Strength 84.0)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 2</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]:&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 2&apos;s Male Fish (Strength 84.0)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 3</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]:&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 3&apos;s Male Fish (Strength 84.0)&nbsp;&nbsp;goes forward and settles in its new spot at Cell 4</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]:&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]: Male Fish (Strength 84.0)&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 4&apos;s Male Fish (Strength 84.0)&nbsp;&nbsp;is eaten by&nbsp;&nbsp;Female Bear (Strength 33.4)&nbsp;</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]:&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]:&nbsp;</p>
<p>[5]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 5&apos;s Female Bear (Strength 33.4)&nbsp;&nbsp;goes backward and settles in its new spot at Cell 4</p>
<p><br></p>
<p>The size of the river is: 10</p>
<p>[0]:&nbsp;</p>
<p>[1]:&nbsp;</p>
<p>[2]:&nbsp;</p>
<p>[3]:&nbsp;</p>
<p>[4]: Female Bear (Strength 33.4)&nbsp;</p>
<p>[5]:&nbsp;</p>
<p>[6]:&nbsp;</p>
<p>[7]:&nbsp;</p>
<p>[8]:&nbsp;</p>
<p>[9]:&nbsp;</p>
<p><br></p>
<p>Cell 6 is empty, no changes occur.</p>
<p>Cell 7 is empty, no changes occur.</p>
<p>Cell 8 is empty, no changes occur.</p>
<p>Cell 9 is empty, no changes occur.</p>
