package com.example.json;

public class Image {

    private String title;
    private String imageURL;

    public Image(){}


    public Image(String title,String coverImage,String imageURL){

        this.title = title;

        this.imageURL = imageURL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }




    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}

