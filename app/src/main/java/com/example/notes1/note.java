package com.example.notes1;

public class note {
    private String title;
    private String content;

    public note (){


    }

    public String getTitle() {
        return title;
    }

    public void setTitle (String title) {
        this.title = title;
    }

    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }

    public note(String title, String content){
        this.title = title;
        this.content = content;

    }
}
