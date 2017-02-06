package com.bas.mevent.model;

import org.springframework.data.annotation.Id;

public class HallDtl {
	@Id
	private String id;
	private String name;
	private String area;
	private String rating;
	private String image;
	
	public HallDtl() {
		super();
	}

	public HallDtl(String id, String name, String area, String rating, String image) {
		super();
		this.id = id;
		this.name = name;
		this.area = area;
		this.rating = rating;
		this.image = image;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "HallDtl [id=" + id + ", name=" + name + ", area=" + area + ", rating=" + rating + ", image=" + image
				+ "]";
	}

	
}
