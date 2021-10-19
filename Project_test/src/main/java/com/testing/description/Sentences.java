package com.testing.description;

import java.util.Objects;

public class Sentences {
    private String title;
    private String describtion;

    public void sentences(String title, String describtion){
        this.title=title;
        this.describtion=describtion;
    }

    public String getTitle(){
        return title;
    }
    public String getDescribtion(){
        return describtion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentences sentences = (Sentences) o;
        return Objects.equals(title, sentences.title) && Objects.equals(describtion, sentences.describtion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, describtion);
    }
}
