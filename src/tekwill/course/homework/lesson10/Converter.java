package tekwill.course.homework.lesson10;

public class Converter {
    private String string;
    int number;
    byte aByte;
    short aShort;
    boolean aBoolean;
    long aLong;
    double aDouble;
    float aFloat;

    public void setString(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setNumber(String s) {
        this.number =  Integer.parseInt(s);
    }

    public int getNumber() {
        return number;
    }

    public byte getaByte() {
        return aByte;
    }

    public short getaShort() {
        return aShort;
    }

    public boolean isaBoolean() {
        return aBoolean;
    }

    public long getaLong() {
        return aLong;
    }

    public double getaDouble() {
        return aDouble;
    }

    public float getaFloat() {
        return aFloat;
    }

    public void setaByte(String s) {
        this.aByte = Byte.parseByte(s);
    }

    public void setaShort(String s) {
        this.aShort = Short.parseShort(s);
    }

    public void setaBoolean(String s) {
        this.aBoolean = Boolean.parseBoolean(s);
    }

    public void setaLong(String s) {
        this.aLong = Long.parseLong(s);
    }

    public void setaDouble(String s) {
        this.aDouble = Double.parseDouble(s);
    }

    public void setaFloat(String s) {
        this.aFloat = Float.parseFloat(s);
    }
}
