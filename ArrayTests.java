import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
  @Test 
	public void testReverseInPlace1() {
    int[] input1 = { 3 ,5,7,8};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 8,7,5,3 }, input1);
	}
  @Test
  public void testReversed2() {
    int[] input1 = {1,2,3};
    assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest(){
    double[] nums= {2.0,3.0};
    assertEquals(3.0,ArrayExamples.averageWithoutLowest(nums),0.0);
  }
  @Test
  public void testAverageWithoutLowest2(){
    double[] nums= {3.0};
    assertEquals(0,ArrayExamples.averageWithoutLowest(nums),0.0);
  }
  @Test
  public void testAverageWithoutLowest3(){
    double[] nums= {3.0,3.0,3.0};
    assertEquals((3.0+3.0)/2,ArrayExamples.averageWithoutLowest(nums),0.0);
  }
}
