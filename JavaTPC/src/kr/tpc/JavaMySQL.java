package kr.tpc;

public class JavaMySQL implements Dbconnect{

    @Override
    public void getConnection(String url, String user, String password) {
        System.out.println("MySQL을 연결합니다.");
        System.out.println("url: " + url + ", " +"user: " + user + ", " +"password: " + password);

    }
}
