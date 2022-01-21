package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private String date;
    private String textOfPost;
    private String image;
    private String urlInfo;
    private String countViews;
    private CommentsInfo commentsInfo;
    private Likes likes;
    private Reposts reposts;
    private int postIsPinned;
    private int deleteOfPost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTextOfPost() {
        return textOfPost;
    }

    public void setTextOfPost(String textOfPost) {
        this.textOfPost = textOfPost;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUrlInfo() {
        return urlInfo;
    }

    public void setUrlInfo(String urlInfo) {
        this.urlInfo = urlInfo;
    }

    public String getCountViews() {
        return countViews;
    }

    public void setCountViews(String countViews) {
        this.countViews = countViews;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public Likes getLikes() {
        return likes;
    }

    public void setLikes(Likes likes) {
        this.likes = likes;
    }

    public Reposts getReposts() {
        return reposts;
    }

    public void setReposts(Reposts reposts) {
        this.reposts = reposts;
    }

    public int getPostIsPinned() {
        return postIsPinned;
    }

    public void setPostIsPinned(int postIsPinned) {
        this.postIsPinned = postIsPinned;
    }

    public int getDeleteOfPost() {
        return deleteOfPost;
    }

    public void setDeleteOfPost(int deleteOfPost) {
        this.deleteOfPost = deleteOfPost;
    }
}
