package models;

public class F_productitem {
    int image,id;
    String title,rank,price,addcart;

    public F_productitem(int image, int id, String title, String rank, String price,String addcart) {
        this.addcart = addcart;
        this.image = image;
        this.id = id;
        this.title = title;
        this.rank = rank;
        this.price = price;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setAddcart(String addcart) {
        this.addcart = addcart;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setPrice(String price) {
        this.price = price;
    }


    public int getImage() {
        return image;
    }

    public int getId() {
        return id;
    }

    public String g3etAddcart() {
        return addcart;
    }

    public String getTitle() {
        return title;
    }

    public String getRank() {
        return rank;
    }

    public String getPrice() {
        return price;
    }
}
