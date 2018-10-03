package com.matchzone.model;

/*
 * This class should have certain required fields
 * This class should also contain the getters and setters for the fields 
 * along with the no-arg , parameterized constructor and toString method.
 */

public class LocationIndex {
	 private String profileId;

		private String city;
		private String state;
		private String country;
		private String message;
		public String getProfileId() {
			return profileId;
		}
		public void setProfileId(String profileId) {
			this.profileId = profileId;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public LocationIndex(String profileId, String city, String state, String country, String message) {
			super();
			this.profileId = profileId;
			this.city = city;
			this.state = state;
			this.country = country;
			this.message = message;
		}
		
}
