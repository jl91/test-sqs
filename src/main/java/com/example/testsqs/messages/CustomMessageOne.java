package com.example.testsqs.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CustomMessageOne {

    @JsonProperty("name")
    private String name;

    @JsonProperty("status")
    private String status;
}
