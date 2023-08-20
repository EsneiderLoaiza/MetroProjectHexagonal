package com.example.metro.domain.user.model;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {

    private Long id;

    private String name;

    private int age;

    public boolean majorOrEqualTo15(int age) {
        if(age >= 15) {
            return true;
        }
         return false;
        //return age >= 15;
    }


}
