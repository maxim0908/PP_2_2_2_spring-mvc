package web.model;

public class Car {
    private String field1;
    private String field2;
    private int field3;

    public Car() {
    }

    public Car(String field1, String field2, int field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }


    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public int getField3() {
        return field3;
    }

    public void setField3(int field3) {
        this.field3 = field3;
    }
}
