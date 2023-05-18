package org.sid.modelmapper.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class CustomerDTO {
    private Long id;
    private String firstName;
    private String LastName;
    //private String email;
}
