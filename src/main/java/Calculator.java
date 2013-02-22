
public class Calculator {

    private boolean turnOn=false;

    public Calculator()
    {
    }

    public int add(int a, int b)
    {
        return a + b;
    }

    public int divide(int a, int b) throws ArithmeticException
    {
        return a / b;
    }

    public boolean compare(int a, int b)
    {
        if (a == b)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isTurnOn() {
        return turnOn;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }
}
