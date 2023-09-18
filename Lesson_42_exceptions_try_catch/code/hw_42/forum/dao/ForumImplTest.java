package hw_42.forum.dao;

import hw_42.forum.model.Post;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ForumImplTest {
    ForumImpl forum;
    Post[] posts = new Post[5];

    @BeforeEach
    void setUp() {
        forum = new ForumImpl();
        posts[0] = new Post(1, "author1", "title1", "content1");
        posts[1] = new Post(2, "author2", "title2", "content2");
        posts[3] = new Post(3, "author3", "title3", "content3");
        posts[4] = new Post(4, "author4", "title4", "content4");

        for (int i = 0; i < posts.length; i++) {
            forum.addPost(posts[i]);
        }

        System.out.println(Arrays.toString(posts));
    }

    @Test
    void addPost() {
    }

    @Test
    void removePost() {
    }

    @Test
    void updatePost() {
    }

    @Test
    void getPostById() {
    }

    @Test
    void getPostsByAuthor() {
    }

    @Test
    void testGetPostsByAuthor() {
    }

    @Test
    void size() {
    }
}