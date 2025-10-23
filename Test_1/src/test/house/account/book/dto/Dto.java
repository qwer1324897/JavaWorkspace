package test.house.account.book.dto;

public class Dto {
    private String date;
    private String kind;
    private String category;
    private int price;
    private String memo;

    public Dto(String date, String kind, String category, int price, String memo) {
        this.date = date;
        this.kind = kind;
        this.category = category;
        this.price = price;
        this.memo = memo;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public String getDate() {
        return date;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
    public String getKind() {
        return kind;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    public String getCategory() {
        return category;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
    public String getMemo() {
        return memo;
    }
}
