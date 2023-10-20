package org.launchcode.techjobs.oo;

public class PositionType extends JobField {

   // public PositionType() {

       // super();
   // }
    public PositionType(String value) {

        super(value);
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.


    // Getters and Setters:

    @Override
   public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof PositionType positionType)) return false;
        return getId() == positionType.getId();
    }

}