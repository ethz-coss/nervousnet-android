package ch.ethz.coss.nervousnet.vm.model;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table "LOCATION_DATA".
 */
public class LocationData implements SensorDataImpl {

    private Long id;
    private Long TimeStamp;
    private Double Latitude;
    private Double Longitude;
    private Double Altitude;
    private long Volatility;
    private Boolean ShareFlag;

    // KEEP FIELDS - put your custom fields here
    private int type;
    // KEEP FIELDS END

    public LocationData() {
    }

    public LocationData(Long id) {
        this.id = id;
    }

    public LocationData(Long id, Long TimeStamp, Double Latitude, Double Longitude, Double Altitude, long Volatility, Boolean ShareFlag) {
        this.id = id;
        this.TimeStamp = TimeStamp;
        this.Latitude = Latitude;
        this.Longitude = Longitude;
        this.Altitude = Altitude;
        this.Volatility = Volatility;
        this.ShareFlag = ShareFlag;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTimeStamp() {
        return TimeStamp;
    }

    public void setTimeStamp(Long TimeStamp) {
        this.TimeStamp = TimeStamp;
    }

    public Double getLatitude() {
        return Latitude;
    }

    public void setLatitude(Double Latitude) {
        this.Latitude = Latitude;
    }

    public Double getLongitude() {
        return Longitude;
    }

    public void setLongitude(Double Longitude) {
        this.Longitude = Longitude;
    }

    public Double getAltitude() {
        return Altitude;
    }

    public void setAltitude(Double Altitude) {
        this.Altitude = Altitude;
    }

    public long getVolatility() {
        return Volatility;
    }

    public void setVolatility(long Volatility) {
        this.Volatility = Volatility;
    }

    public Boolean getShareFlag() {
        return ShareFlag;
    }

    public void setShareFlag(Boolean ShareFlag) {
        this.ShareFlag = ShareFlag;
    }

    // KEEP METHODS - put your custom methods here
	@Override
	public Integer getType() {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	public void setType(Integer type) {
		// TODO Auto-generated method stub
		this.type = type;
	}
    // KEEP METHODS END

}
