package org;

import java.util.Objects;

public class Ex1_2_3_IntClass {
    private int myInteger;

    public Ex1_2_3_IntClass(int myInteger){
        this.myInteger = myInteger;
    }

    public int getMyInteger() {
        return myInteger;
    }

    public void setMyInteger(int myInteger) {
        this.myInteger = myInteger;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ex1_2_3_IntClass intClass = (Ex1_2_3_IntClass) o;
        return myInteger == intClass.myInteger;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(myInteger);
    }
}
