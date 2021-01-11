package kr.tpc;

public class JavaOracle implements Dbconnect {

    @Override
    public void getConnection(String url, String user, String password) {
        System.out.println("오라클DB 연결합니다.");
        System.out.println("url: " + url + ", " +"user: " + user + ", " +"password: " + password);

    }
}
