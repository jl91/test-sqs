package com.example.testsqs.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
public class JsonMessage<T> {

    @JsonProperty("body")
    public T body;
}
