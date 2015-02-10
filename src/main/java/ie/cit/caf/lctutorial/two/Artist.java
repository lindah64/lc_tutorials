package ie.cit.caf.lctutorial;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Artist {

	private int birthYear;
	
	@JsonProperty("fc")
	private String fullName;
	
	private int totalWorks;	
	private String gender;
	private String date;
	private int id;
	private String mda;
	private String startLetter;
	private String url;
	
	public int getBirthYear() {
		return birthYear;
	}
	
	public String toString() {
		String artistAsString = "Name: " + fullName + "\nBorn: " + birthYear + 
				"\nTotal Works: " + totalWorks + "\nGender: " + gender
				+ "\nDate: " + date + "\nId: " + id + "\nMda: " + mda
				+ "\nStart Letter: " + startLetter + "\nUrl: " + url;
		return artistAsString;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public int getTotalWorks() {
		return totalWorks;
	}

	public void setTotalWorks(int totalWorks) {
		this.totalWorks = totalWorks;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	
	public String getMda() {
		return mda;
	}

	public void setMda(String mda) {
		this.mda = mda;
	}

	public String getStartLetter() {
		return startLetter;
	}

	public void setStartLetter(String startLetter) {
		this.startLetter = startLetter;
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
