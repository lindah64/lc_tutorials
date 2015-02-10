package ie.cit.caf.lctutorial;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Artwork {
	
	private int acno;
	
	public String toString() {
		String artworkAsString = "Acno: " + acno;
		
		return artworkAsString;
	}

	public int getAcno() {
		return acno;
	}

	public void setAcno(int acno) {
		this.acno = acno;
	}
	
	
}
