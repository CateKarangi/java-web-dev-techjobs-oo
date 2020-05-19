package org.launchcode.techjobs_oo;

import java.util.Objects;

public class JobField {
    protected int id;
    protected static int nextId = 1;
    protected String value;

    public JobField(){
        id = nextId;
        nextId++;
    }

    public JobField(String value){
        this();
        this.value = value;
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

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getValue());
    }

    @Override
    public String toString() {
        return "JobField{" +
                "id=" + id +
                ", value='" + value + '\'' +
                '}';
    }
}
