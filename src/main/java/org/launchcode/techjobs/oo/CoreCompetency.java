package org.launchcode.techjobs.oo;

public class CoreCompetency extends JobField{

   // public CoreCompetency() {

       // super();
   // }
    public CoreCompetency(String value) {

        super(value);
    }

    // Custom toString, equals, and hashCode methods:



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CoreCompetency that))
            return false;
        return getId() == that.getId();
    }

    // TODO-Done: Use the "Generate" tool to add a getter and setter for the 'value' field but
    //  ONLY a getter for the 'id' field.

}
