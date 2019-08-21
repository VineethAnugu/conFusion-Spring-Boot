package com.vineeth.confusion.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Dish")
public class Dish {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull
	private String name;
	
	@NotNull
	private String description;
	
	private String image;
	
	private String category;
	
	private String label;
	
	@NotNull
	@Size(min = 0)
	private String price;
	
	private Boolean featured;
	
	@OneToMany(targetEntity = Comment.class, mappedBy = "dish", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Comment> comments;
	
	public void addComment(Comment comment) {
		 comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}
	
	public List<Comment> getComments() {
		return comments;
	}


	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}


	Dish(){
		
	}

	
	public Dish(@NotNull String name, @NotNull String description, String image, String category, String label,
			@NotNull @Size(min = 0) String price, Boolean featured) {
		super();
		this.name = name;
		this.description = description;
		this.image = image;
		this.category = category;
		this.label = label;
		this.price = price;
		this.featured = featured;
	}




	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;		
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Boolean getFeatured() {
		return featured;
	}
	public void setFeatured(Boolean featured) {
		this.featured = featured;
	}
	
	
	
}
