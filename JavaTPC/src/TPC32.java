import kr.tpc.JavaMySQL;
import kr.tpc.JavaOracle;

public class TPC32 {
    public static void main(String[] args) {

        // Oracle, MySQL -- > Driver class..
        JavaOracle javaOracle = new JavaOracle();
        JavaMySQL javaMySQL = new JavaMySQL();

        javaOracle.getConnection("www", "lee", "1234");
        javaMySQL.getConnection("mmm", "dong", "1234");
    }
}
