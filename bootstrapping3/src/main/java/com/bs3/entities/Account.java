package com.bs3.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Account implements Serializable {
    private int accountNo;
    private String accountHolderName;
    private int age;
    private String branchName;
    private String gender;
    private String mobileNo;
    private String emailAddress;
}
