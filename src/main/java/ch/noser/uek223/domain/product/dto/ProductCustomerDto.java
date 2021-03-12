package ch.noser.uek223.domain.product.dto;

import ch.noser.uek223.domain.user.dto.CustomerDto;
import ch.noser.uek223.domain.user.dto.CustomerDto;

import java.util.UUID;

public class ProductCustomerDto {

    private UUID id;
    private float sellingPrice;
    private CustomerDto customer;

    public ProductCustomerDto() {
    }

    public ProductCustomerDto(UUID id, float sellingPrice, CustomerDto customer) {
        this.id = id;
        this.sellingPrice = sellingPrice;
        this.customer = customer;
    }

    public UUID getId() {
        return id;
    }
    public ProductCustomerDto setId(UUID id) {
        this.id = id;
        return this;
    }
    public float getSellingPrice() {
        return sellingPrice;
    }
    public ProductCustomerDto setSellingPrice(float sellingPrice) {
        this.sellingPrice = sellingPrice;
        return this;
    }

    public CustomerDto getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDto customer) {
        this.customer = customer;
    }
}
