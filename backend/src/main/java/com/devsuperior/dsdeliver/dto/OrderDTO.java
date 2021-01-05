package com.devsuperior.dsdeliver.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.devsuperior.dsdeliver.entities.Order;
import com.devsuperior.dsdeliver.entities.OrderStatus;

public class OrderDTO implements Serializable{
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Long id;
    private String address;
    private Double latitude;
    private Double longitude;
    private Instant moment;
    private OrderStatus status;

    private List<ProductDTO> products = new ArrayList<>();


    public OrderDTO() {
    }


    public OrderDTO(Long id, String address, Double latitude, Double longitude, Instant moment, OrderStatus status) {
        this.id = id;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.moment = moment;
        this.status = status;
    }

    public OrderDTO(Order entity) {
        this.id = entity.getId();
        this.address = entity.getAddress();
        this.latitude = entity.getLatitude();
        this.longitude = entity.getLongitude();
        this.moment = entity.getMoment();
        this.status = entity.getStatus();
        this.products = entity.getProducts().stream().map
        (
            x -> new ProductDTO(x)
        ).collect(Collectors.toList());
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Instant getMoment() {
        return this.moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return this.status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<ProductDTO> getProducts() {
        return this.products;
    }

    public OrderDTO id(Long id) {
        this.id = id;
        return this;
    }

    public OrderDTO address(String address) {
        this.address = address;
        return this;
    }

    public OrderDTO latitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    public OrderDTO longitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    public OrderDTO moment(Instant moment) {
        this.moment = moment;
        return this;
    }

    public OrderDTO status(OrderStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof OrderDTO)) {
            return false;
        }
        OrderDTO orderDTO = (OrderDTO) o;
        return Objects.equals(id, orderDTO.id) && Objects.equals(address, orderDTO.address) && Objects.equals(latitude, orderDTO.latitude) && Objects.equals(longitude, orderDTO.longitude) && Objects.equals(moment, orderDTO.moment) && Objects.equals(status, orderDTO.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, address, latitude, longitude, moment, status);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", address='" + getAddress() + "'" +
            ", latitude='" + getLatitude() + "'" +
            ", longitude='" + getLongitude() + "'" +
            ", moment='" + getMoment() + "'" +
            ", status='" + getStatus() + "'" +
            "}";
    }
    
}
