package com.bridgelabz;

public class UserRegistration {
    public static void main(String[] args) {
        ValidationOfUserRegistration validationOf = new ValidationOfUserRegistration();
//      validationOf.validateFirstName("Kiran");
//      validationOf.validateLastName("Kumar");
//      validationOf.validateEmailId("makamkiran95@gmail.com");
//      validationOf.validateMobileNumber("91 9666069291");
//      validationOf.validatePasswordRuleOne("kiran56@)+");
        System.out.println(validationOf.validatePasswordRuleThree("kirAnhhjj1hg"));
    }
}
