package practice_40.album.dao;

import practice_40.album.model.Photo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class AlbumImpl implements Album{

    static Comparator<Photo> comparator = (p1, p2) -> {
      int res = p1.getDate().compareTo(p2.getDate()); //сортировка по дате
      return res != 0 ? res : Integer.compare(p1.getPhotoId(), p2.getPhotoId()); //сортировка по photoId
    };

    //поля
    private Photo[] photos; //это массив объектов типа Photo
    private int size; //это переменная отвечает за общее количество элементов массива

    //это конструктор
    // метод, который получив на вход capacity определяет размер массива
    public AlbumImpl(int capacity){
        photos = new Photo[capacity];//photos = new Photo[capacity] размер то что подали в параметр int capacity. capacity это правый ограничитель, size не может быть больше capacity
    }
    @Override
    public boolean addPhoto(Photo photo) {
        //нельзя добавить null || нельзя добавить photo.length == capacity || нельзя добавить то же самое photo (проверка на два id)
        //нужно иметь отсортированный массив
        //нужно применить binarySearch (получим индекс в массиве), чтобы найти место, куда вставить фото
        //тогда можно делать addPhoto
        if (photo == null || photos.length == size || getPhotoFromAlbum(photo.getPhotoId(), photo.getAlbumId()) != null){
            return false;
        }
        int index = Arrays.binarySearch(photos, 0, size, photo, comparator);//нашли место куда вставить в массив photo
        index = index >= 0 ? index : - index - 1;
        System.arraycopy(photos, index, photos, index + 1, size - index); //копируем элементы массива от index на 1 место вправо
        photos[index] = photo;
        size++;
        return true;
    }

    @Override
    public boolean removePhoto(int photoId, int albumId) {
        for (int i = 0; i < size; i++) {
            if(photos[i].getPhotoId() == photoId && photos[i].getAlbumId() == albumId){
                System.arraycopy(photos, i + 1, photos, i, size - 1 - i);//???
                photos[--size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updatePhoto(int photoId, int albumId, String url) {
        return false;
    }

    @Override
    public Photo getPhotoFromAlbum(int photoId, int albumId) {
        return null;
    }

    @Override
    public Photo[] getAllPhotoFromAlbum(int albumId) {
        return new Photo[0];
    }

    @Override
    public Photo[] getBetweenDate(LocalDate dateFrom, LocalDate dateTo) {
        return new Photo[0];
    }

    @Override
    public int size() {
        return size;
    }


}
