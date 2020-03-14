public class Calculator {

    String mainNumber="_";
    String previousNumber;

    public Calculator() {
        this("_");
    }

    public Calculator(String mainNumber) {
        this.mainNumber = mainNumber;
    }

    public String appendToMainNumber(String toAppend)
    {
        if(mainNumber.equals("_"))
        {
            mainNumber = toAppend;
        }
        else
        {
            mainNumber += toAppend;
        }

        return mainNumber;
    }

    public void resetMainNumber() {
        mainNumber = "_";
    }

    public String getMainNumber() {
        return mainNumber;
    }

    public String add(String toAdd)
    {
        var mainNumberInteger = Integer.parseInt(previousNumber);
        var newNumberInteger = Integer.parseInt(toAdd);
        var result = mainNumberInteger + newNumberInteger;
        mainNumber = Integer.toString(result);
        return mainNumber;
    }

    public String subtract(String toSubtract)
    {
        var mainNumberInteger = Integer.parseInt(previousNumber);
        var newNumberInteger = Integer.parseInt(toSubtract);
        var result = mainNumberInteger - newNumberInteger;
        mainNumber = Integer.toString(result);
        return mainNumber;
    }

    public String multiply(String toMultiply)
    {
        var mainNumberInteger = Integer.parseInt(previousNumber);
        var newNumberInteger = Integer.parseInt(toMultiply);
        var result = mainNumberInteger * newNumberInteger;
        mainNumber = Integer.toString(result);
        return mainNumber;
    }

    public String divide(String toDivide)
    {
        var mainNumberInteger = Integer.parseInt(previousNumber);
        var newNumberInteger = Integer.parseInt(toDivide);
        var result = mainNumberInteger / newNumberInteger;
        mainNumber = Integer.toString(result);
        return mainNumber;
    }

    public void storeAndResetMainNumber() {
        previousNumber = mainNumber;
        resetMainNumber();
    }
}
