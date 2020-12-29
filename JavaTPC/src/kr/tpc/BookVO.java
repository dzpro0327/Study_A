package kr.tpc;

public class BookVO {
    public String title;
    public int price;
    public String company;
    public int page;
    // default 생성자가 생략

    public BookVO(String title, int price, String company, int page) {
        this.title = title;
        this.price = price;
        this.company = company;
        this.price = page;
    }

    public BookVO() {
        
    }
}
