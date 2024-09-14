import org.code.neighborhood.*;

public class PainterPlus extends Painter {

  /*
  * Turns painter three times to the left to turn right
  */
  public void turnRight() {
    for (int i=0; i<3; i++) {
      turnLeft();
    }
  }
  
  /*
  * Painter picks up all of the paint on a given space
  */
  public void takeAllPaint() {
    while (isOnBucket()) {
      takePaint();
    }
  }

  /*
  * Moves painter forward while the painter can move
  */
  public void moveFast() {
    while (canMove()) {
      move();
    }
  }

  /*
  * Moves painter to paint a line in a given color while the 
  * painter has paint
  */
  public void paintToEmpty(String color) {
    while (hasPaint()) {
      paint(color);
      move();
    }
  }

  /*
  * Makes painter move and paint in the shape of a donut while
  * painter has paint
  */
  public void paintDonut(String color) {
    while (hasPaint()) {
      move();
      paint(color);
      turnRight();
      move();
      paint(color);
    }
  }
  
  
}