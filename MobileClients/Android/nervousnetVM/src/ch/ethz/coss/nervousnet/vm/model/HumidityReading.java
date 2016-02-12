package ch.ethz.coss.nervousnet.vm.model;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table "HUMIDITY_READING".
 */
public class HumidityReading extends SensorReading  {

    /** Not-null value. */
    private java.util.Date TimeStamp;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public HumidityReading() {
    }

    public HumidityReading(java.util.Date TimeStamp) {
        this.TimeStamp = TimeStamp;
    }

    /** Not-null value. */
    public java.util.Date getTimeStamp() {
        return TimeStamp;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setTimeStamp(java.util.Date TimeStamp) {
        this.TimeStamp = TimeStamp;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
