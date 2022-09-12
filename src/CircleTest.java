import static org.junit.Assert.*;
import org.junit.Test;

public class CircleTest {

  @org.junit.Test
  public void testGetArea() {
    Circle circle = new Circle(2.1, "Red");
    assertEquals((Math.PI*2.1*2.1), circle.getArea(),0.001);
  }

  @org.junit.Test
  public void testGetPerimeter() {
    Circle circle = new Circle (2.1, "Red");
    assertEquals((Math.PI*2*2.1), circle.getPerimeter(), 0.001);
  }
}