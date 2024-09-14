import org.code.neighborhood.*;

public class CheesePainter extends MuralPainter {

  /*  
  * Resets painter's position and moves painter to
  * paint the top base color of the cheese yellow
  */ 
  public void paintTopBase() {
    // resets the painter's position to the top left corner of the grid
    resetPosition();

    // moves painter to the space that starts the first row of paint for
    // the top base of the cheese
    for (int i=0; i<13; i++) {
      move();
    }
    turnRight();
    move();
    move();
    turnLeft();

    // moves painter to paint the top base of the cheese line by line
    // using for loops to move the painter long distances and methods like 
    // paintLine(String color); and startNewLine(String color); to help 
    // the painter paint more efficiently
    paintLine("yellow", 2);
    move();
    startNewLine("right");
    paintLine("yellow", 6);
    startNewLine("left");
    paintLine("yellow", 8);
    startNewLine("right");
    paintLine("yellow", 11);
    startNewLine("left");
    paintLine("yellow", 13);
    startNewLine("right");
    paintLine("yellow", 15);
    move();
    startNewLine("left");
    paintLine("yellow", 18);
    startNewLine("right");
    paintLine("yellow", 21);
    startNewLine("left");
    for (int i=0; i<4; i++) {
      move();
    }
    paintLine("yellow", 19);
    startNewLine("right");
    paintLine("yellow", 15);
    startNewLine("left");
    for (int i=0; i<5; i++) {
      move();
    }
    paintLine("yellow", 12);
    startNewLine("right");
    paintLine("yellow", 10);
    startNewLine("left");
    for (int i=0; i<5; i++) {
      move();
    }
    paintLine("yellow", 7);
    startNewLine("right");
    paintLine("yellow", 5);
    startNewLine("left");
    for (int i=0; i<6; i++) {
      move();
    }
    paintLine("yellow", 1);
  }

  /*
  * Resets painter's position and moves painter to 
  * paint the side base color of the cheese yellow
  */ 
  public void paintSideBase() {
   
    // resets the painter's position to the top left corner of the grid
    resetPosition();
    move();
    turnRight();
    for (int i=0; i<10; i++) {
      move();
    }
    turnLeft();

    // moves painter to the space that starts the first row of paint for
    // the side base of the cheese
    paintLine("yellow", 1);
    move();
    move();
    startNewLine("right");
    paintLine("yellow", 4);
    startNewLine("left");
    move();
    paintLine("yellow", 9);
    for (int i=0; i<3; i++) {
      move();
    }
    startNewLine("right");
    paintLine("yellow", 13);
    startNewLine("left");
    move();
    paintLine("yellow", 16);
    for (int i=0; i<3; i++) {
      move();
    }
    startNewLine("right");
    paintLine("yellow", 20);
    startNewLine("left");
    move();
    paintLine("yellow", 23);
    for (int i=0; i<4; i++) {
      move();
    }
    startNewLine("right");
    paintLine("yellow", 28);
    startNewLine("left");
    move();
    for (int i=0; i<2; i++) {
      paintLine("yellow", 30);
      startNewLine("right");
      move();
      paintLine("yellow", 30);
      startNewLine("left");
      move();
    }
    paintLine("yellow", 30);
    startNewLine("right");
    move();
    paintLine("yellow", 27);
    startNewLine("left");
    for (int i=0; i<5; i++) {
      move();
    }
    paintLine("yellow", 23);
    startNewLine("right");
    move();
    paintLine("yellow", 19);
    startNewLine("left");
    for (int i=0; i<4; i++) {
      move();
    }
    paintLine("yellow", 16);
    startNewLine("right");
    move();
    paintLine("yellow", 12);
    startNewLine("left");
    for (int i=0; i<6; i++) {
      move();
    }
    paintLine("yellow", 7);
    startNewLine("right");
    move();
    paintLine("yellow", 4);

    // calls moverToCorner() method to move the painter to a corner of the grid
    moveToCorner();
  }
  
  /*
  * Resets position of the painter and moves the 
  * painter to paint the right side lines of the cheese brown
  */ 
  public void rightSideLines() {
    // resets the painter's position to the top left corner of the grid
    resetPosition();
    for (int i=0; i<13; i++) {
      move();
    }
    turnRight();
    move();
    turnLeft();

    // moves painter to the space that starts the first row of paint for
    // the side base of the cheese
    paintLine("darkGoldenrod", 3);
    startNewLine("right");
    paintLine("darkGoldenrod", 2);
    startNewLine("left");
    move();
    move();
    paintLine("darkGoldenrod", 2);
    move();
    startNewLine("right");
    for (int i=0; i<6; i++) {
      paintLine("darkGoldenrod", 2);
      startNewLine("left");
      move();
      move();
      paintLine("darkGoldenrod", 2);
      startNewLine("right");
    }
    move();
    paintLine("darkGoldenrod", 1);
    startNewLine("left");
    move();
    paintLine("darkGoldenrod", 1);
    turnRight();
    paintLine("darkGoldenrod", 13);

    // calls moverToCorner() method to move the painter to a corner of the grid
    moveToCorner();
  }

  /*
  * Resets position of the painter and moves the 
  * painter to paint the left side lines of the cheese brown
  */ 
  public void leftSideLines() {

    // resets the painter's position to the top left corner of the grid
    resetPosition();
    for (int i=0; i<12; i++) {
      move();
    }
    turnRight();
    move();

    // moves painter to the space that starts the first row of paint for
    // the left side of the cheese borders
    paintLine("darkGoldenrod",1);
    turnRight();
    for (int i=0; i<2; i++) {
      paintLine("darkGoldenrod", 2);
      move();
      startNewLine("left");
      paintLine("darkGoldenrod", 2);
      startNewLine("right");
      move();
      move();
    }
    paintLine("darkGoldenrod", 2);
    startNewLine("left");
    paintLine("darkGoldenrod", 2);
    startNewLine("right");
    move();
    move();
    move();
    paintLine("darkGoldenrod", 2);
    move();
    startNewLine("left");
    paintLine("darkGoldenrod", 2);
    startNewLine("right");
    move();
    move();
    turnLeft();
    paintLine("darkGoldenrod", 13);
    turnLeft();
    paintLine("darkGoldenrod", 4);
    move();
    move();
    move();
    startNewLine("right");
    paintLine("darkGoldenrod", 5);
    startNewLine("left");
    for (int i=0; i<6; i++){
      move();
    }
    paintLine("darkGoldenrod", 4);
    move();
    move();
    startNewLine("right");
    paintLine("darkGoldenrod", 4);
    startNewLine("left");
    for (int i=0; i<5; i++) {
      move();
    }
    paintLine("darkGoldenrod", 4);
    for (int i=0; i<5; i++) {
      move();
    }
    startNewLine("right");
    paintLine("darkGoldenrod", 6);
    startNewLine("left");
    for (int i=0; i<7; i++) {
      move();
    }
    paintLine("darkGoldenrod", 5);

    // calls moverToCorner() method to move the painter to a corner of the grid
    moveToCorner();
  }

  /*
  * Resets position of the painter and moves the 
  * painter to paint the middle line of the cheese brown
  */ 
  public void middleLine() {
    
    // resets the painter's position to the top left corner of the grid
    resetPosition();
    turnRight();
    for (int i=0; i<10; i++) {
      move();
    }
    turnLeft();
    move();
    move();

    // moves painter to the space that starts the first row of paint for
    // the middle border of the cheese
    paintLine("DarkGoldenrod", 3);
    startNewLine("right");
    turnAround();
    paintLine("DarkGoldenrod", 5);
    startNewLine("right");
    turnAround();
    paintLine("DarkGoldenrod", 4);
    startNewLine("right");
    turnAround();
    paintLine("DarkGoldenrod", 3);
    startNewLine("right");
    turnAround();
    paintLine("DarkGoldenrod", 4);
    startNewLine("right");
    turnAround();
    paintLine("DarkGoldenrod", 3);
    startNewLine("right");
    turnAround();
    paintLine("DarkGoldenrod", 5);
    startNewLine("right");
    turnAround();
    paint("DarkGoldenrod");
    
    // calls moverToCorner() method to move the painter to a corner of the grid
    moveToCorner();
  }

  /*
  * paints all holes of the cheese by using the different 
  * cheese hole methods smallHole(), mediumHole(), and bigHole()
  */ 
  public void cheeseHoles() {
    
    // resets the painter's position to the top left corner of the grid
    resetPosition();
    for (int i=0; i<7; i++) {
      move();
    }
    turnRight();
    for (int i=0; i<10; i++) {
      move();
    }
    turnLeft();

    // calls bigHole() method to move the painter to paint a big hole
    bigHole();
    for (int i=0; i<4; i++) {
      move();
    }
    turnAround();
    
    // calls smallHole() method to move the painter to paint a small hole
    smallHole();
    for (int i=0; i<10; i++) {
      move();
    }
    
    // calls bigHole() method to move the painter to paint a big hole
    bigHole();
    turnAround();
    for (int i=0; i<10; i++) {
      move();
    }

    // calls mediumHole() method to move the painter to paint a medium hole
    mediumHole();

    // calls moverToCorner() method to move the painter to a corner of the grid
    moveToCorner();
  }

  /* 
  * Moves painter to paint a big hole gold by using paintLine()
  * and startNewLine() methods
  */ 
  public void mediumHole() {
    move();
    paintLine("Gold", 3);
    startNewLine("right");
    paintLine("Gold", 5);
    startNewLine("left");
    move();
    paintLine("Gold", 5);
    startNewLine("right");
    move();
    paintLine("Gold", 5);
    startNewLine("left");
    move();
    move();
    paintLine("Gold", 3); 
  }

  /*
  * Moves painter to paint a small hole gold by using paintLine()
  * and startNewLine() methods
  */ 
  public void smallHole() {
    paintLine("Gold", 3);
    startNewLine("right");
    move();
    paintLine("Gold", 3);
    startNewLine("left");
    move();
    paintLine("Gold", 3);
  }
  
  /* 
  * Moves painter to paint a big hole gold by using paintLine()
  * and startNewLine() methods
  */ 
  public void bigHole() {
    paintLine("Gold", 4);
    startNewLine("right");
    for (int i=0; i<2; i++) {
      paintLine("Gold", 6);
      startNewLine("left");
      move();
      paintLine("Gold", 6);
      startNewLine("right");
      move();
    }
    move();
    paintLine("Gold", 4);
  }
  
}