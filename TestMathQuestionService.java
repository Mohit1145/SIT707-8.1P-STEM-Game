package web.service;

import org.junit.Assert;
import org.junit.Test;

public class TestMathQuestionService {

    @Test
    public void testQ1AdditionCorrect() {
        Assert.assertEquals(7.0, MathQuestionService.q1Addition("3", "4"), 0.001);
    }

    @Test
    public void testQ1AdditionWithNegativeNumber() {
        Assert.assertEquals(2.0, MathQuestionService.q1Addition("-3", "5"), 0.001);
    }

    @Test
    public void testQ2SubtractionCorrect() {
        Assert.assertEquals(6.0, MathQuestionService.q2Subtraction("10", "4"), 0.001);
    }

    @Test
    public void testQ2SubtractionNegativeResult() {
        Assert.assertEquals(-3.0, MathQuestionService.q2Subtraction("2", "5"), 0.001);
    }

    @Test
    public void testQ3MultiplicationCorrect() {
        Assert.assertEquals(20.0, MathQuestionService.q3Multiplication("4", "5"), 0.001);
    }

    @Test
    public void testQ3MultiplicationByZero() {
        Assert.assertEquals(0.0, MathQuestionService.q3Multiplication("8", "0"), 0.001);
    }

    @Test(expected = NumberFormatException.class)
    public void testInvalidInput() {
        MathQuestionService.q1Addition("abc", "2");
    }
}