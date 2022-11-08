package org.example;

import java.util.List;

public class User {
    private Integer id;
    private String username;
    private String email;
    private String password;
    private List<Post> posts;

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

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public User(){
        this.id=null;
        this.username=null;
        this.email=null;
        this.password=null;
        this.posts=null;
    }
    public Post addPost(Post post){
        if(posts!=null){
            posts.add(post);
            return post;
        }
        return null;
    }
    public boolean deletePost(Post post){
        if(posts!=null){
            return posts.remove((Object)post);
        }
        return false;
    }
}
