package org.example;
import java.util.List;

public class User {
    private Integer id;
    private String username;
    private String email;
    private String password;


    private List<Post> publishedPosts;
    private List<Post> savedPosts;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public List<Post> getPublishedPosts() {
        return publishedPosts;
    }

    public void setPublishedPosts(List<Post> publishedPosts) {
        this.publishedPosts = publishedPosts;
    }

    public List<Post> getSavedPosts() {
        return savedPosts;
    }

    public void setSavedPosts(List<Post> savedPosts) {
        this.savedPosts = savedPosts;
    }

    public User(){
        this.id=null;
        this.username=null;
        this.email=null;
        this.password=null;
        this.publishedPosts=null;
        this.savedPosts=null;
    }
    public Post addPublishedPost(Post post){
        if(publishedPosts!=null){
            publishedPosts.add(post);
            return post;
        }
        return null;
    }
    public Post addSavedPost(Post post){
        if(savedPosts!=null){
            savedPosts.add(post);
            return post;
        }
        return null;
    }
    /*public boolean deletePublishedPost(Post post){
        if(posts!=null){
            return posts.remove((Object)post);
        }
        return false;
    }*/
}
