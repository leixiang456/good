package YingXiong;

public class Hero {
    private Integer Power;
    private String Name;
    private String Sex;
    private String Loc;
    private Integer Birth;
    private Integer Death;


    public Hero() {
    }

    public Hero(Integer power, String name, String sex, String loc, Integer birth, Integer death) {
        Power = power;
        Name = name;
        Sex = sex;
        Loc = loc;
        Birth = birth;
        Death = death;
    }

    public Integer getPower() {
        return Power;
    }

    public void setPower(Integer power) {
        Power = power;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getLoc() {
        return Loc;
    }

    public void setLoc(String loc) {
        Loc = loc;
    }

    public Integer getBirth() {
        return Birth;
    }

    public void setBirth(Integer birth) {
        Birth = birth;
    }

    public Integer getDeath() {
        return Death;
    }

    public void setDeath(Integer death) {
        Death = death;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "Power=" + Power +
                ", Name='" + Name + '\'' +
                ", Sex='" + Sex + '\'' +
                ", Loc='" + Loc + '\'' +
                ", Birth=" + Birth +
                ", Death=" + Death +
                '}';
    }
}
