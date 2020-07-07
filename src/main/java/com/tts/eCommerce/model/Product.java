package com.tts.eCommerce.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Product {
	private Long id;
	private String name;
	private Double wholesalePrice;
	private Double retailPrice;
	private String brand;
	private String description;
	private Integer inventory;
	private String image; //image attribute is a string representing the path where the image file is stored
	private Date createdAt;
	private Date updatedAt;
}
