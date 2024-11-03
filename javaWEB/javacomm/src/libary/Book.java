package libary;

import java.io.Serializable;

public class Book implements Serializable {
    private String title;
    private String  author;
    private int  price;

    public Book(String author,String title,int price) {
        this.author = author;
        this.price = price;
        this.title = title;
    }
    @Override
    public String toString(){
        return "《"+title+"》"+author+"("+price+"￥）";
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
