package session9;

public class HDTV {

	// initializing variable using encapsulation

	private String brandName;

	private int size;

	/**
	 * @param brandName
	 * @param size
	 * declaring parameterized constructor
	 */
	HDTV(String brandName, int size) {

		// Assigning the values to instance variable

		this.brandName = brandName;

		this.size = size;

	}

	// declaring getters method for the variables

	public String getBrandName() {
		return brandName;
		// returning brandName values
	}

	public int getSize() {
		return size;
		// returning size values
	}

}
