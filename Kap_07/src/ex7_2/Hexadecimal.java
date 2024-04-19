package ex7_2;

public class Hexadecimal implements Number {

    private String Value;

    //constructor
    public Hexadecimal(String Value) {
        this.Value = Value;
    }
    //getter
    public String getValue() {
        return Value;
    }

    @Override
    public int toIntValue() {
        //convert hexadecimal to decimal
        return Integer.parseInt(Value, 16);
    }

    @Override
    public void fromIntValue(int value) {
        //convert decimal to hexadecimal
        Value = Integer.toHexString(value);
    }
}
