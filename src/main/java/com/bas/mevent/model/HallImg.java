package com.bas.mevent.model;

import java.util.List;

public class HallImg {

	private List<String> imgUrls;

	public HallImg() {
		super();
	}

	public HallImg(List<String> imgUrls) {
		this.imgUrls = imgUrls;
	}

	public List<String> getImgUrls() {
		return imgUrls;
	}

	public void setImgUrls(List<String> imgUrls) {
		this.imgUrls = imgUrls;
	}

	@Override
	public String toString() {
		return "HallImg [imgUrls=" + imgUrls + "]";
	}
	
}
