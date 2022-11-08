package org.example;

import java.util.ArrayList;
import java.util.List;
public class RedditPosts {
    private static List<Post> published=new ArrayList<>();
    private static List<Post> saved=new ArrayList<>();
    public RedditPosts(){

    }
    public static Post save(Post post){
        if(saved.add(post)) return post;
        return null;
    }
    public static Post publish(Post post){
        if(published.add(post)) return post;
        return null;
    }

}
