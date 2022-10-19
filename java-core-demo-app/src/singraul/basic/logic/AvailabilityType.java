package singraul.basic.logic;

public enum AvailabilityType {
	DEPLOYED("Deployed"),
    AVAILABLE_FOR_SALE( "Available for Sale"),
    DEACTIVATED_FOR_SALE(   "Deactivated for Sale") ,
    DEPRECATED( "Deprecated"),
    INTERNAL( "Internal");

    private String availabilityValue;

    AvailabilityType( String availabilityValue) {
        this.availabilityValue = availabilityValue;
    }
    public String getAvailabilityValue() {
        return availabilityValue;
    }

    @Override
    public String toString() {
        return this.name();
    }
    
    public static void main(String args[]) {
    	System.out.println("Test");
    	
      	System.out.println(AvailabilityType.values()[0].availabilityValue);
      	System.out.println(AvailabilityType.values()[1].availabilityValue);
    	System.out.println(AvailabilityType.values()[2]);
    	System.out.println(AvailabilityType.values()[3]);
    	System.out.println(AvailabilityType.values()[4]);
    }
}
