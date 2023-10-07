package com.bo.entities;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Getter
@Setter
public class Account implements Serializable {
    private int accountNo;
    private String accountHolderName;
    private int age;
    private String branchName;
    private String emailAddress;
    private String gender;
    private String mobileNo;
}
