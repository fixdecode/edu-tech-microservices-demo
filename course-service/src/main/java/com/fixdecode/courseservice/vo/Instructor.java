package com.fixdecode.courseservice.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Instructor {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
}
