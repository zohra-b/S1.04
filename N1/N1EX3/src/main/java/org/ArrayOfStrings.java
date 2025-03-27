package org;

public class ArrayOfStrings {
    String[] ArrayOfStrings;

    public ArrayOfStrings(){
        this.ArrayOfStrings = new String[3];
    }

    public String[] getArrayOfStrings() {
        return ArrayOfStrings;
    }

    public void setArrayOfStrings(String[] arrayOfStrings) {
        ArrayOfStrings = arrayOfStrings;
    }

    public String getString(int i) {
            return ArrayOfStrings[i];

    }
    public void setString(int i, String string){
        ArrayOfStrings[i] = string;
    }

}
