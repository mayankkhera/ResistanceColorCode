# ResistanceColorCode
This console application takes in colors on the resistors as parameter to determine the resistance of the resistor

There are three modes of inputs

1. resistor has gold as the fourth digit:

  java Resistor color1 color2 color3
  
2. resistor has some other material as the fourth digit:

  java Resistor color1 color2 color2 0.1
  
  note: in the above cases color1, color2, color3 should be replaced by the colors your resistor has
        also the 0.1 should be replaced by the percentage error caused by the color
        
3. going from numeric to color code:

  java Resistor 180
  
  note: 180 should be replaced by the resistance given to you, and the program generates the color codes for you 
