package task;

/**
 * Classname: BooleanOperationTest
 *
 * @version 09.08.2020
 * @author Kopach Daria
 * <p>
 * TASK: BooleanCalculator
 */

import org.junit.Assert;
import task.BooleanOperation;

import java.util.logging.Logger;

public class BooleanOperationTest {

    private static final Logger LOGGER = Logger
            .getLogger(BooleanOperation.class.getName());

    BooleanOperation trueTrue = new BooleanOperation(true, true);
    BooleanOperation trueFalse = new BooleanOperation(true, false);
    BooleanOperation trueNull = new BooleanOperation(true, null);

    BooleanOperation falseTrue = new BooleanOperation(false, true);
    BooleanOperation falseFalse = new BooleanOperation(false, false);
    BooleanOperation falseNull = new BooleanOperation(false, null);

    BooleanOperation nullTrue = new BooleanOperation(null, true);
    BooleanOperation nullFalse = new BooleanOperation(null, false);
    BooleanOperation nullNull = new BooleanOperation(null, null);

    // Tests and logs for conjunction

    @org.junit.Test
    public void whenFirstOneTrueSecondOneTrueThenConjunctionTrue() {
        LOGGER.info("CONJUNCTION_TRUE");
        Assert.assertEquals(true, trueTrue.Conjunction());
    }

    @org.junit.Test
    public void whenFirstOneTrueSecondOneFalseThenConjunctionFalse() {
        LOGGER.info("CONJUNCTION_FALSE");
        Assert.assertEquals(false, trueFalse.Conjunction());
    }

    @org.junit.Test
    public void whenFirstOneTrueSecondOneNullThenConjunctionNull() {
        LOGGER.info("CONJUNCTION_NULL");
        Assert.assertEquals(null, trueNull.Conjunction());
    }

    @org.junit.Test
    public void whenFirstOneFalseSecondOneTrueThenConjunctionFalse() {
        LOGGER.info("CONJUNCTION_FALSE");
        Assert.assertEquals(false, falseTrue.Conjunction());
    }

    @org.junit.Test
    public void whenFirstOneFalseSecondOneFalseThenConjunctionFalse() {
        LOGGER.info("CONJUNCTION_FALSE");
        Assert.assertEquals(false, falseFalse.Conjunction());
    }

    @org.junit.Test
    public void whenFirstOneFalseSecondOneNullThenConjunctionNull() {
        LOGGER.info("CONJUNCTION_NULL");
        Assert.assertEquals(null, falseNull.Conjunction());
    }

    @org.junit.Test
    public void whenFirstOneNullSecondOneTrueThenConjunctionNull() {
        LOGGER.info("CONJUNCTION_NULL");
        Assert.assertEquals(null, nullTrue.Conjunction());
    }

    @org.junit.Test
    public void whenFirstOneNullSecondOneFalseThenConjunctionNull() {
        LOGGER.info("CONJUNCTION_NULL");
        Assert.assertEquals(null, nullFalse.Conjunction());
    }

    @org.junit.Test
    public void whenFirstOneNullSecondOneNullThenConjunctionNull() {
        LOGGER.info("CONJUNCTION_NULL");
        Assert.assertEquals(null, nullNull.Conjunction());
    }

    // Tests and logs for disjuction

    @org.junit.Test
    public void whenFirstOneTrueSecondOneTrueThenDisjunctionTrue() {
        LOGGER.info("DISJUNCTION_TRUE");
        Assert.assertEquals(true, trueTrue.Disjunction());
    }

    @org.junit.Test
    public void whenFirstOneTrueSecondOneFalseThenDisjunctionTrue() {
        LOGGER.info("DISJUNCTION_TRUE");
        Assert.assertEquals(true, trueFalse.Disjunction());
    }

    @org.junit.Test
    public void whenFirstOneTrueSecondOneNullThenDisjunctionNull() {
        LOGGER.info("DISJUNCTION_NULL");
        Assert.assertEquals(null, trueNull.Disjunction());
    }

    @org.junit.Test
    public void whenFirstOneFalseSecondOneTrueThenDisjunctionTrue() {
        LOGGER.info("DISJUNCTION_TRUE");
        Assert.assertEquals(true, falseTrue.Disjunction());
    }

    @org.junit.Test
    public void whenFirstOneFalseSecondOneFalseThenDisjunctionFalse() {
        LOGGER.info("DISJUNCTION_FALSE");
        Assert.assertEquals(false, falseFalse.Disjunction());
    }

    @org.junit.Test
    public void whenFirstOneFalseSecondOneNullThenDisjunctionNull() {
        LOGGER.info("DISJUNCTION_NULL");
        Assert.assertEquals(null, falseNull.Disjunction());
    }

    @org.junit.Test
    public void whenFirstOneNullSecondOneTrueThenDisjunctionNull() {
        LOGGER.info("DISJUNCTION_NULL");
        Assert.assertEquals(null, nullTrue.Disjunction());
    }

    @org.junit.Test
    public void whenFirstOneNullSecondOneFalseThenDisjunctionNull() {
        LOGGER.info("DISJUNCTION_NULL");
        Assert.assertEquals(null, nullFalse.Disjunction());
    }

    @org.junit.Test
    public void whenFirstOneNullSecondOneNullThenDisjunctionNull() {
        LOGGER.info("DISJUNCTION_NULL");
        Assert.assertEquals(null, nullNull.Disjunction());
    }
}
