package cn.bt.bean;

import java.util.Date;

public class User {
    private String naem;
    private String sex;
    private Date birthday;



    public User(String naem, String sex, Date birthday) {
        this.naem = naem;
        this.sex = sex;
        this.birthday = birthday;
    }

    public String getNaem() {
        return naem;
    }

    public void setNaem(String naem) {
        this.naem = naem;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "naem='" + naem + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
