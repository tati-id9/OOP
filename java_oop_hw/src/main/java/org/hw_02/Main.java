package org.hw_02;

public class Main {

    public static void main(String[] args) {
        ImmutableCat cat1 = new ImmutableCat("Муся", "бенгал", "мраморный");
        ImmutableCat cat2 = cat1.setName("Леон");
    }
    
}
