package models;

import lombok.AllArgsConstructor; 
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.List;

@Entity
//@Data
@NoArgsConstructor
@AllArgsConstructor
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User owner;

    private String title;
    private String address;

    @ElementCollection
    private List<String> photos;
    private String description;

    @ElementCollection
    private List<String> perks;

    private String extraInfo;
    private Integer checkIn;
    private Integer checkOut;
    private Integer maxGuests;
    private Double price;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<String> getPhotos() {
		return photos;
	}
	public void setPhotos(List<String> photos) {
		this.photos = photos;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<String> getPerks() {
		return perks;
	}
	public void setPerks(List<String> perks) {
		this.perks = perks;
	}
	public String getExtraInfo() {
		return extraInfo;
	}
	public void setExtraInfo(String extraInfo) {
		this.extraInfo = extraInfo;
	}
	public Integer getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(Integer checkIn) {
		this.checkIn = checkIn;
	}
	public Integer getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(Integer checkOut) {
		this.checkOut = checkOut;
	}
	public Integer getMaxGuests() {
		return maxGuests;
	}
	public void setMaxGuests(Integer maxGuests) {
		this.maxGuests = maxGuests;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Place [id=" + id + ", owner=" + owner + ", title=" + title + ", address=" + address + ", photos="
				+ photos + ", description=" + description + ", perks=" + perks + ", extraInfo=" + extraInfo
				+ ", checkIn=" + checkIn + ", checkOut=" + checkOut + ", maxGuests=" + maxGuests + ", price=" + price
				+ "]";
	}
    
    
    
}

