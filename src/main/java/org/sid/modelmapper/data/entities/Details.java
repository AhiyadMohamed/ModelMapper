package org.sid.modelmapper.data.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Details {
    private Customer customer;
    private Order order;
}
