package com.acme.orders.dto;

import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class OrderRequest {

    @NotBlank(message = "Customer is required")
    @Size(max = 80, message = "Customer must be 80 characters or less")
    private String customer;

    @NotBlank(message = "Email is required")
    @Email(regexp = ".+@.+[.].+", message = "Email must be a valid address")
    private String email;

    /** STANDARD, SILVER or GOLD; blank means STANDARD. */
    private String tier;

    @Valid
    @NotEmpty(message = "Add at least one item")
    private List<LineItemRequest> items = new ArrayList<LineItemRequest>();

    @Size(max = 200, message = "Note must be 200 characters or less")
    private String note;

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public List<LineItemRequest> getItems() {
        return items;
    }

    public void setItems(List<LineItemRequest> items) {
        this.items = items;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
