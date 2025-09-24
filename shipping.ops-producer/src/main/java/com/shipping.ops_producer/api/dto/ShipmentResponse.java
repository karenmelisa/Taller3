package com.shipping.ops_producer.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ShipmentResponse {
    private String eventId;
    private String message;
}