import org.code.neighborhood.*;

public class MuralPainter extends PainterPlus {

  /*
  * Paints each row of the Neighborhood with the color
  * where size is the size of the grid
  */
  public void paintBackground(String color, int size) {
    while (canMove("south")) {
      paintLine(color, size);
      turnToWest();

      if (canMove("south")) {
        paintLine(color, size);
        turnToEast();
      }
    }
  
    paintLine(color, size);
    turnAround();
    moveToCorner();
  }

  /*
  * Paints a line with the color where the length
  * of the line is specified by spaces
  */
  public void paintLine(String color, int spaces) {
    for (int i=0; i<spaces; i++) {
      paint(color);
      if (canMove()) {
        move();
      }
    }
  }

  /*
  * Turns the MuralPainter to the next row to
  * face west if it is currently facing east
  */
  public void turnToWest() {
    if (isFacingEast()) {
      turnRight();
      move();
      turnRight();
    }
  }

  /*
  * Turns the MuralPainter to the next row to
  * face east if it is currently facing west
  */
  public void turnToEast() {
    if (isFacingWest()) {
      turnLeft();
      move();
      turnLeft();
    }
  }

  /*
  * Turns the MuralPainter around to face the opposite direction
  */
  public void turnAround() {
    turnLeft();
    turnLeft();
  }

  /*
  * Resets the MuralPainter object to the starting location
  */
  public void resetPosition() {
    if (isFacingEast()) {
      turnLeft();

      while (canMove()) {
        move();
      }

      turnLeft();

      while (canMove()) {
        move();
      }

      turnAround();
    }
  }

  /*
  * Moves the MuralPainter to the bottom right corner
  */
  public void moveToCorner() {
    while (canMove()) {
      move();
    }
    
    turnRight();

    while (canMove()) {
      move();
    }
  }

  /*
  * Moves Muralpainter to start of new line depending on
  * direction needed to turn
  */
  public void startNewLine(String rightOrLeft) {
    if (rightOrLeft=="right") {
      turnRight();
      move();
      turnRight();
    } else {
      turnLeft();
      move();
      turnLeft();
    }
  }
}