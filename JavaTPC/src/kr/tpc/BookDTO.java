package kr.tpc;

public class BookDTO {
    public String title;
    public int page;
    public int price;
    public String company;

    public BookDTO() {
        // 객체를 생성하는 작업을 한다..
    }

    public BookDTO(String title, int page, int price, String company) {
        this.title = title;
        this.page = page;
        this.price = price;
        this.company = company;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "title='" + title + '\'' +
                ", page=" + page +
                ", price=" + price +
                ", company='" + company + '\'' +
                '}';
    }
}
