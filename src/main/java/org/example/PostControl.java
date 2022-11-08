package org.example;

import java.net.URL;

public class PostControl {
    public PostControl(){

    }
    public Post createPost(String title, String body, URL link, URL image, URL video, User author, String publicationPlace){
        return new Post(title,body,link,image,video,author,publicationPlace);
    }

}
