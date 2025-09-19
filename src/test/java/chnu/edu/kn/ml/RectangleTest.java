package chnu.edu.kn.ml;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/*
  @author   george
  @project   lab-testing-2
  @class  RectangleTest
  @version  1.0.0 
  @since 19.09.25 - 10.15
*/

public class RectangleTest {

    @Test
    public void getArea() {
        Rectangle rectangle = new Rectangle(3, 4);
        int area = rectangle.getArea();
        Assert.assertEquals(12, area);
    }

    @Test
    public void getDiagonal() {
        Rectangle rectangle = new Rectangle(3, 4);
        double diagonal = rectangle.getDiagonal();
        Assert.assertEquals(5, diagonal, 0.01);
    }



}
