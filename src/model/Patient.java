package model;

public class Patient extends User{

    private String birthday;
    private Double weight;
    private Double height;
    private String blood;

    public Patient( String name, String email){
        super(name, email);
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getWeight() {
        return this.weight + " Kg.";
    }

    public void setWeight(Double weight) {
        this.weight = weight ;
    }

    public String getHeight() {
        return height + " Mts.";
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Age:" +birthday+ "\n Weight: " +getWeight()+ "\n Height: " +getHeight()+ "\nBlood: " +blood;
    }
}
