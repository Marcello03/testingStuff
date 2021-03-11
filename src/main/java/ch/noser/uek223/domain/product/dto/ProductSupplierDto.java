package ch.noser.uek223.domain.product.dto;

import ch.noser.uek223.domain.product.Availability;
import ch.noser.uek223.domain.user.dto.SupplierDto;

import java.util.UUID;

public class ProductSupplierDto {

    private UUID id;
    private String description;
    private float sellingPrice;
    private float purchasingPrice;
    private SupplierDto supplier;
    private Availability availability;

    public ProductSupplierDto() {
    }

    public ProductSupplierDto(UUID id, String description, float buyingPrice, float sellingPrice, Availability availability, SupplierDto supplier) {
        this.id = id;
        this.description = description;
        this.purchasingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.availability = availability;
        this.supplier = supplier;
    }

    public UUID getId() {
        return id;
    }
    public ProductSupplierDto setId(UUID id) {
        this.id = id;
        return this;
    }
    public float getBuyingPrice() {
        return purchasingPrice;
    }
    public ProductSupplierDto setBuyingPrice(float buyingPrice) {
        this.purchasingPrice = buyingPrice;
        return this;
    }
    public float getSellingPrice() {
        return sellingPrice;
    }
    public ProductSupplierDto setSellingPrice(float sellingPrice) {
        this.sellingPrice = sellingPrice;
        return this;
    }

    public SupplierDto getSupplier() {
        return supplier;
    }

    public void setSupplier(SupplierDto supplier) {
        this.supplier = supplier;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPurchasingPrice() {
        return purchasingPrice;
    }

    public void setPurchasingPrice(float purchasingPrice) {
        this.purchasingPrice = purchasingPrice;
    }

    public Availability getAvailability() {
        return availability;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }
}
