package models;

public class F_productitem {
    int image,id;
    String title,rank,price,addcart,buy;

    public F_productitem(int image, int id, String title, String rank, String price,String addcart, String buy) {
        this.addcart = addcart;
        this.image = image;
        this.id = id;
        this.title = title;
        this.rank = rank;
        this.price = price;
        this.buy = buy;
    }

    public void setBuy(String buy) {
        this.buy = buy;
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

    public String getAddcart() {
        return addcart;
    }

    public String getBuy() {
        return buy;
    }

    public int getId() {
        return id;
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
