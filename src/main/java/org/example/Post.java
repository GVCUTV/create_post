package org.example;

import java.net.URL;
import java.util.concurrent.atomic.AtomicInteger;

public class Post {
    private Integer id;
    private String title;
    private String body;
    private URL link;
    private URL image;
    private URL video;
    private User audio;
    private String publicationPlace;

    public Post(String title, String body, URL link, URL image, URL video, User audio, String publicationPlace) {
        this.id = new AtomicInteger().incrementAndGet();
        this.title = title;
        this.body = body;
        this.link = link;
        this.image = image;
        this.video = video;
        this.audio = audio;
        this.publicationPlace = publicationPlace;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    public User getAudio() {
        return audio;
    }

    public void setAudio(User audio) {
        this.audio = audio;
    }

    public String getPublicationPlace() {
        return publicationPlace;
    }

    public void setPublicationPlace(String pubblicationPlace) {
        this.publicationPlace = pubblicationPlace;
    }





}