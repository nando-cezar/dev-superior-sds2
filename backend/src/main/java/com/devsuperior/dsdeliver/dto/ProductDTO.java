package com.devsuperior.dsdeliver.dto;

import java.io.Serializable;
import java.util.Objects;

import com.devsuperior.dsdeliver.entities.Product;

public class ProductDTO implements Serializable{
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;
    private Double price;
    private String description;
    private String imageUri;


    public ProductDTO() {
    }

    public ProductDTO(Long id, String name, Double price, String description, String imageUri) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.imageUri = imageUri;
    }

    public ProductDTO(Product entity) {
        id = entity.getId();
        name = entity.getName();
        price = entity.getPrice();
        description = entity.getDescription();
        imageUri = entity.getImageUri();
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUri() {
        return this.imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    public ProductDTO id(Long id) {
        this.id = id;
        return this;
    }

    public ProductDTO name(String name) {
        this.name = name;
        return this;
    }

    public ProductDTO price(Double price) {
        this.price = price;
        return this;
    }

    public ProductDTO description(String description) {
        this.description = description;
        return this;
    }

    public ProductDTO imageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ProductDTO)) {
            return false;
        }
        ProductDTO productDTO = (ProductDTO) o;
        return Objects.equals(id, productDTO.id) && Objects.equals(name, productDTO.name) && Objects.equals(price, productDTO.price) && Objects.equals(description, productDTO.description) && Objects.equals(imageUri, productDTO.imageUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, description, imageUri);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", price='" + getPrice() + "'" +
            ", description='" + getDescription() + "'" +
            ", imageUri='" + getImageUri() + "'" +
            "}";
    }

}
