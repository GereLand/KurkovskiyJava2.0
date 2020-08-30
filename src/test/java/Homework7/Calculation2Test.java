package Homework7;

import junit.framework.TestCase;
import org.junit.*;

public class Calculation2Test extends TestCase {

    Calculation2 calculation2 = new Calculation2();

    @BeforeClass
    public static void beforeClass() {
        System.out.println("");
        System.out.println("Before CalculatorTest.class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("");
        System.out.println("After CalculatorTest.class");
    }

    @Before
    public void initTest() {
        System.out.println("");
        System.out.println("initTest()");
        calculation2 = new Calculation2();
    }

    @After
    public void afterTest() {
        System.out.println("afterTest()");
        calculation2 = null;
    }

    @Test
    public void testAddition() throws Exception {
        System.out.println("testAddition()");
        assertEquals(15.0, calculation2.addition(7.0, 8.0));
    }

    public void testSubtraction() throws Exception {
        System.out.println("testSubtraction()");
        assertEquals(6.0, calculation2.subtraction(15.0, 9.0));
    }

    @Test
    public void testMultiplication() throws Exception {
        System.out.println("testMultiplication()");
    }

    @Test
    public void testDivision() throws Exception {
        System.out.println("testDivision()");
        assertEquals(20.0, calculation2.division(100.0, 5.0));
    }

    @Test(expected = ArithmeticException.class)
    public void divisionWithException() {
        System.out.println("divisionWithException()");
        calculation2.multiplication(15.0, 0.0);
    }

    @Ignore("Message for ignored test")
    @Test
    public void ignoredTest() {
        System.out.println("will not print it");
    }

    @Test(timeout = 500)
    public void timeStampTest() {
        System.out.println("timeStampTest()");
        while (true) ;
    }
}