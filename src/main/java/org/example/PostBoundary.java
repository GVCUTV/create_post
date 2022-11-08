package org.example;

import java.net.URL;

public class PostBoundary {
    private String title;
    private String body;
    private URL link;
    private URL image;
    private URL video;
    private User author;
    private String publicationPlace;
    public PostBoundary(String title, String body, URL link, URL image, URL video, User author, String publicationPlace) {

        this.title = title;
        this.body = body;
        this.link = link;
        this.image = image;
        this.video = video;
        this.author = author;
        this.publicationPlace = publicationPlace;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public URL getLink() {
        return link;
    }

    public void setLink(URL link) {
        this.link = link;
    }

    public URL getImage() {
        return image;
    }

    public void setImage(URL image) {
        this.image = image;
    }

    public URL getVideo() {
        return video;
    }

    public void setVideo(URL video) {
        this.video = video;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getPublicationPlace() {
        return publicationPlace;
    }

    public void setPublicationPlace(String publicationPlace) {
        this.publicationPlace = publicationPlace;
    }
    public Post createPost() {
        return new PostControl().createPost(title, body, link, image, video, author, publicationPlace);

    }

}
