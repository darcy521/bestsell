package com.webdesign.bestsell.domain;

public class Picture {
    private Integer id;

    private int productId;

    private String pictureURL;

    public Picture(Integer id, int productId, String pictureURL) {
        this.id = id;
        this.productId = productId;
        this.pictureURL = pictureURL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getPictureURL() {
        return pictureURL;
    }

    public void setPictureURL(String pictureURL) {
        this.pictureURL = pictureURL;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "id=" + id +
                ", productId=" + productId +
                ", pictureURL='" + pictureURL + '\'' +
                '}';
    }
}
