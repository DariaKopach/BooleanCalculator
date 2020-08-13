package task;

/**
 * Classname: BooleanOperation
 *
 * @author Kopach Daria
 * <p>
 * TASK: BooleanCalculator
 * @version 09.08.2020
 */

public class BooleanOperation {
    private Boolean firstOne;
    private Boolean secondOne;

    public BooleanOperation(Boolean firstOne, Boolean secondOne) {
        this.firstOne = firstOne;
        this.secondOne = secondOne;
    }

    // Method for conjunction

    public Boolean Conjunction() {
        if (firstOne == null || secondOne == null) {
            return null;
        }
        if (this.firstOne == true && this.secondOne == true) {
            return true;
        }
        if (this.firstOne == false || this.secondOne == false) {
            return false;
        } else return null;
    }

    // Method for disjunction

    public Boolean Disjunction() {

        if (firstOne == null || secondOne == null) {
            return null;
        }
        if (this.firstOne == true || this.secondOne == true) {
            return true;
        }
        if (this.firstOne == false && this.secondOne == false) {
            return false;
        } else return null;
    }

    //empty constructors

    public BooleanOperation() {
    }

    // getters and setters

    public boolean isFirstOne() {
        return firstOne;
    }

    public void setFirstOne(boolean firstOne) {
        this.firstOne = firstOne;
    }

    public boolean isSecondOne() {
        return secondOne;
    }

    public void setSecondOne(boolean secondOne) {
        this.secondOne = secondOne;
    }
}
