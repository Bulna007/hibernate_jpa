package com.msf.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class LoanEnquire implements Serializable {
    private int loanEnquireNo;
    private String applicantName;
    private String mobileNo;
    private String emailAddress;
    private String loanType;
    private double principalAmount;
    private int tenure;
}
