package domain;

public class Post {
    //    private String id; мой вариант id
    private int id;
    private int ownerId;
    //    private String imageLogo;
    private int fromId;
    private int createdBy;
    //    private String userName; мой вариант createdBy
//    private String dateTimeOfPublic; мой вариант date
    private int date;
    //    private String post; мой вариант text
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly; // тут лучше boolean
    //    private String comment; мой вариант CommentsInfo
    private CommentsInfo commentsInfo;
    private Copyright copyright;
    //    private int like; мой вариант LikesInfo
    private LikesInfo likesInfo;
    //    private int repost;  мой вариант  RepostsInfo
    private RepostsInfo repostsInfo;
    //    private int view;  мой вариант ViewsInfo
    private ViewsInfo viewsInfo;
    private String postType;
    //    private String videoPostUrl;    мой вариант PostSource
    //    private String imagePost; мой вариант PostSource
//    private String videoPost;  мой вариант PostSource
    private PostSource postSource;
    private Geo geo;
    private int signerId;
    private int canPin; // тут лучше boolean
    private int canDelete; // тут лучше boolean
    private int canEdit; // тут лучше boolean
    private int isPinned; // тут лучше boolean
    private int markedAsAds; // тут лучше boolean
    //    private boolean favorite;    мой вариант isFavorite
    private boolean isFavorite;
    private Donut donut;
    private int postponed_id;


    // + get/set на все поля
}
