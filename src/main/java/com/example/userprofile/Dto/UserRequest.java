package com.example.userprofile.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserRequest {
    private String id;
    private String userName;
    private boolean backend;
    private int age;
    private String bio;
}
