package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
    public int id;
    private static int nextId = 1;

    private String value ="";
    public JobField() {
        id = nextId;
        nextId++;
    }


    public JobField(String value) {
        this();
        setValue(value);
        //this.value =value;
    }



    @Override
    public String toString() {

        return value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
        //return Objects.hash(id,value);
    }

    public int getId() {

        return id;
    }

    public String getValue() {

        return value;
    }

    public void setValue(String value) {

        this.value = value;
    }
    public int getJobId() {

        return id;
    }

}
