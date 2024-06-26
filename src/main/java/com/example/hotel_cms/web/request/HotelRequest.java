package com.example.hotel_cms.web.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class HotelRequest {

    @NotBlank(message = "Name must not be empty")
    private String name;
    @NotBlank(message = "Headline must not be empty")
    private String headline;
    @NotBlank(message = "City must not be empty")
    private String city;
    @NotBlank(message = "Address must not be empty")
    private String address;
    @NotNull(message = "Center distance must not be null")
    @Positive(message = "Center distance must be positive")
    private Double centerDistance;
}