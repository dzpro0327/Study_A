package kr.tpc;

public class MemberVO {
    private String name;
    private int age;
    private String tel;
    private String addr;

    public MemberVO() {

    }

    public MemberVO(String name, int age, String tel, String addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    // toString ----> 출력을 위한 메서드 재정의..!(디버깅을 위해서)
    @Override
    public String toString() {
        return "MemberVO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tel='" + tel + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}