package org.hw_01;

public class Human {
    private String name;
    private boolean genderMan;
    private boolean liveStatus;

    public Human(String name, boolean genderMan, boolean liveStatus) {
        this.name = name;
        this.genderMan = genderMan;
        this.liveStatus = liveStatus;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenderMan(boolean genderMan) {
        this.genderMan = genderMan;
    }

    public void setLiveStatus(boolean liveStatus) {
        this.liveStatus = liveStatus;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", genderMan=" + genderMan +
                ", liveStatus=" + liveStatus +
                '}';
    }
}
