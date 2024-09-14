import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    MuralPainter darkOrchid = new MuralPainter();

    darkOrchid.paintBackground("darkOrchid", 32);

    CheesePainter mouse = new CheesePainter();
    
    mouse.paintTopBase();
    mouse.paintSideBase();

    CheesePainter holes = new CheesePainter();

    holes.cheeseHoles();
    
    CheesePainter mickey = new CheesePainter();
    
    mickey.rightSideLines();
    
    CheesePainter m = new CheesePainter();
    
    m.leftSideLines();

    CheesePainter m2 = new CheesePainter();
    
    m2.middleLine();
  
    
    
  }
}