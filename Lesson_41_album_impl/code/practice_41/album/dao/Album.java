package practice_41.album.dao;

import practice_41.album.model.Photo;

import java.time.LocalDate;

public interface Album {

    //метод добавление фото
    boolean addPhoto(Photo photo);

    //метод удаление фото
    boolean removePhoto(int photoId, int albumId);
    boolean updatePhoto(int photoId, int albumId, String url);
    Photo getPhotoFromAlbum(int photoId, int albumId);
    Photo[] getAllPhotoFromAlbum(int albumId);
    Photo[] getBetweenDate(LocalDate dateFrom, LocalDate dateTo);
    int size();



}
