import org.junit.*;
import static org.junit.Assert.*;

public class RectangleTest {
  // first test, for constructor
  @Test
  public void newRectangle_instantiatesCorrectly() {
    Rectangle testRectangle = new Rectangle(2,4);
    assertEquals(true, testRectangle instanceof Rectangle);
  }

  @Test
  public void newRectangle_getLength_3(){
      Rectangle test = new Rectangle (3,5);
      assertEquals(3, test.getLength());
  }

  @Test
  public void newRectangle_getWidth_5(){
      Rectangle test = new Rectangle (3,5);
      assertEquals(5, test.getWidth());
  }




  // second test

}
// FIRST FAIL, CREATED AN INSTANCE , TOLD testRectangle it belongs to Rectangle.java , but parameters broke it. that's the fail
