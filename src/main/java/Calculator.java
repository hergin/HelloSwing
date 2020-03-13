public class Calculator {

    String mainNumber="0";
    String previousNumber;

    public Calculator() {
        this("0");
    }

    public Calculator(String mainNumber) {
        this.mainNumber = mainNumber;
    }

    public String appendToMainNumber(String toAppend) {
        mainNumber += toAppend;
        return mainNumber;
    }

    public void resetMainNumber() {
        mainNumber = "0";
    }

    public String getMainNumber() {
        return mainNumber;
    }

    public String add(String toAdd) {
        var mainNumberInteger = Integer.parseInt(previousNumber,2);
        var newNumberInteger = Integer.parseInt(toAdd,2);
        var result = mainNumberInteger + newNumberInteger;
        mainNumber = Integer.toBinaryString(result);
        return mainNumber;
    }

    public void storeAndResetMainNumber() {
        previousNumber = mainNumber;
        resetMainNumber();
    }
}
