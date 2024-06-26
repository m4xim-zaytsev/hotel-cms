package com.example.hotel_cms.web.response;

import jakarta.persistence.ElementCollection;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomResponse {
    private Long id;
    private String name;
    private String description;
    private Integer number;
    private Double cost;
    private Integer guestsLimit;
    private List<Timestamp> unavailableDates;
    private String hotelName;
}
