package com.itfb.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {

}
