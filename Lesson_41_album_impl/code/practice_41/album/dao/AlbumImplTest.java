package practice_41.album.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice_41.album.model.Photo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AlbumImplTest {

    AlbumImpl albums;
    Photo[] photos = new Photo[6];
    LocalDateTime now = LocalDateTime.now();

    @BeforeEach
    void setUp() {
        albums = new AlbumImpl(7);
        photos[0] = new Photo(1, 1, "title-1", "url1", now.minusDays(10));
        photos[1] = new Photo(1, 2, "title-2", "url2", now.minusDays(10));
        photos[2] = new Photo(1, 3, "title-3", "url3", now.minusDays(5));
        photos[3] = new Photo(2, 1, "title-1", "url1", now.minusDays(10));
        photos[4] = new Photo(2, 4, "title-4", "url4", LocalDateTime.of(now.minusDays(2).toLocalDate(), LocalTime.MAX));
        photos[5] = new Photo(1, 4, "title-4", "url1", LocalDateTime.of(now.minusDays(2).toLocalDate(), LocalTime.MAX));

        for (int i = 0; i < photos.length; i++) {
            albums.addPhoto(photos[i]);
        }
    }

    @Test
    void addPhotoTest() {
        assertFalse(albums.addPhoto(null));//добавление пустого фото
        assertFalse(albums.addPhoto(photos[1]));//добавление имеющегося
        Photo photo = new Photo(1, 5, "title-5", "url5", now.minusDays(3));
        assertTrue(albums.addPhoto(photo));//проверяем добавился ли фото
        assertEquals(7, albums.size());//проверка размера size
        photo = new Photo(1, 6, "title-6", "url6", now.minusDays(3));
        assertFalse(albums.addPhoto(photo));//добавление сверх capacity
    }

    @Test
    void removePhotoTest() {
        assertFalse(albums.removePhoto(5,1));//не можем удалить несуществующего фото
        assertTrue(albums.removePhoto(1,1));
        assertEquals(5, albums.size());//проверка размера size
        assertNull(albums.getPhotoFromAlbum(1,1));
    }

    @Test
    void updatePhotoTest() {
        assertTrue(albums.updatePhoto(1,1,"newUrl"));
        assertEquals("newUrl",albums.getPhotoFromAlbum(1,1).getUrl());
    }

    @Test
    void getPhotoFromAlbumTest() {
        assertEquals(photos[0], albums.getPhotoFromAlbum(1,1));
        assertNull(albums.getPhotoFromAlbum(3,3));
    }

    @Test
    void getAllPhotoFromAlbumTest() {
        Photo[] actual = albums.getAllPhotoFromAlbum(1);
        Arrays.sort(actual);//сортировали
        Photo[] expected = {photos[0], photos[1], photos[2], photos[5]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void getBetweenDateTest() {
        LocalDate ld = now.toLocalDate();//сколько прошло времени от сейчас до LocalDate
        System.out.println(ld);
        Photo[] actual = albums.getBetweenDate(ld.minusDays(5), ld.minusDays(2));
        Arrays.sort(actual);

        Photo[] expected = { photos[2], photos[5], photos[4]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void sizeTest() {
        assertEquals(6, albums.size());
    }
}