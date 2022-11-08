package org.example;
import java.net.URL;

public class PostControl {
    public PostControl(){

    }
    private Post createPost(String title, String body, URL link, URL image, URL video, User author, String publicationPlace){
        return new Post(title,body,link,image,video,author,publicationPlace);
    }
    public Post publishPost(String title, String body, URL link, URL image, URL video, User author, String publicationPlace){
        Post post=createPost(title,body,link,image,video,author,publicationPlace);
        RedditPosts.publish(post);
        author.addPublishedPost(post);
        return post;
    }
    public Post savePost(String title, String body, URL link, URL image, URL video, User author, String publicationPlace){
        Post post=createPost(title,body,link,image,video,author,publicationPlace);
        RedditPosts.save(post);
        author.addSavedPost(post);
        return post;
    }


}
