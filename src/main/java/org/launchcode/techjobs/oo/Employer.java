package org.launchcode.techjobs.oo;

public class Employer extends JobField {

    public Employer(String value) {
        super(value);
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Employer employer)) return false;
        return getId() == employer.getId();
    }




}
