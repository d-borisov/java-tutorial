package dima;

public class PrimitiveDataTypes {

    void types() {
        // Invalid: cannot put underscores
        // adjacent to a decimal point
        float pi1 = 3_.1415F;
        // Invalid: cannot put underscores
        // adjacent to a decimal point
        float pi2 = 3._1415F;
        // Invalid: cannot put underscores
        // prior to an L suffix
        long socialSecurityNumber1 = 999_99_9999_L;

        // This is an identifier, not
        // a numeric literal
        int x1 = _52;
        // OK (decimal literal)
        int x2 = 5_2;
        // Invalid: cannot put underscores
        // At the end of a literal
        int x3 = 52_;
        // OK (decimal literal)
        int x4 = 5_______2;

        // Invalid: cannot put underscores
        // in the 0x radix prefix
        int x5 = 0_x52;
        // Invalid: cannot put underscores
        // at the beginning of a number
        int x6 = 0x_52;
        // OK (hexadecimal literal)
        int x7 = 0x5_2;
        // Invalid: cannot put underscores
        // at the end of a number
        int x8 = 0x52_;
    }
}