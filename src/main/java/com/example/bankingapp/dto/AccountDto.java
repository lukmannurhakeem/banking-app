package com.example.bankingapp.dto;//package com.example.bankingapp.dto;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//
//@Data
//@AllArgsConstructor
//public class AccountDto {
//
//    private Long id;
//    private String accountHolderName;
//    private double balance;
//}

public record AccountDto(Long id, String accountHolderName, double balance){

}