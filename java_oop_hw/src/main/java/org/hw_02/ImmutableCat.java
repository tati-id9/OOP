package org.hw_02;
public final class ImmutableCat {
    private String name;
    private String breed;
    private String coatColor;

    public ImmutableCat(String name, String breed, String coatColor) {
        this.name = name;
        this.breed = breed;
        this.coatColor = coatColor;
        System.out.println("Имя кота/кошки: "+this.name+", его/ее порода: "+ this.breed +", цвет шерсти: "+this.coatColor);
    }

    public ImmutableCat setName(String name) {
        ImmutableCat c = new ImmutableCat(name, this.breed, this.coatColor);
        return c;
    }

    public ImmutableCat setBreed(String breed) {
        ImmutableCat c = new ImmutableCat(this.name, breed, this.coatColor);
        return c;
    }

    public ImmutableCat setCoatColor(String coatColor) {
        ImmutableCat c = new ImmutableCat(this.name, this.breed, coatColor);
        return c;
    }
}
