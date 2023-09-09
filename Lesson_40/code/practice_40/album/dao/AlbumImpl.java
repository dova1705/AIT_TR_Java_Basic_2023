package practice_40.album.dao;

import practice_40.album.model.Photo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class AlbumImpl implements Album {

    static Comparator<Photo> photoComparator = (p1, p2) -> { //компаратор параметризует <Photo> параметр компаратора (p1-объект типа Photo, p2-объект типа Photo) лямбда выражения
        int res = p1.getDate().compareTo(p2.getDate());//в целочисленную переменную присваиваем результат сортировки двух объектов по дате
        return res != 0 ? res : Integer.compare(p1.getPhotoId(), p2.getPhotoId());//возвращаем (тернарный оператор) если res не равно 0 ? печатаем res, если равно 0 : сортировка по getPhotoId()
    };

    //поля
    private Photo[] photos;//это массив объектов типа Photo
    private int size; //это переменная отвечает за общее количество элементов массива

    //это конструктор
    // метод, который получив на вход capacity определяет размер массива
    public AlbumImpl(int capacity) {
        photos = new Photo[capacity];
    }

    @Override
    public boolean addPhoto(Photo photo) {
        //нельзя добавить null, нельзя добавить photos.length == size, нельзя добавить то же самое photo (проверка на два id)
        //надо иметь отсортированный массив
        //нужно применить binarySearch (получим индекс в массиве), чтобы найти место куда вставить фото
        //тогда можно сделать addPhoto
        if (photo == null || size == photos.length || getPhotoFromAlbum(photo.getPhotoId(), photo.getAlbumId()) != null) {
            return false;
        }
        //находим место, куда вставить в массив photo
        int index = Arrays.binarySearch(photos, 0, size, photo, photoComparator);//результат метода binarySearch класса Arrays присвоили к переменной (Arrays.binarySearch() - возвращает индекс)
        //на вход методу binarySearch (из массива photos, начиная с нулевого индекса, до size, ищем photo который пришло на вход addPhoto, компаратор)
        index = index >= 0 ? index : -index - 1; //если индекс равен 0 или больше 0 ? возвращаем индекс : если он отрицательный мы должны поменять ему знак - index - 1
        System.arraycopy(photos, index, photos, index + 1, size - index);// копируем элементы массива от index на 1 место в право, на вход (берем массив photos, начиная с index, в тот же массив photos, все элементы двигаем в право index + 1, сколько элементов мы должны взять size - index)
        photos[index] = photo; //на освобождённое место  photos[index] присвоили photo
        size++;
        return true;
    }

    @Override
    public boolean removePhoto(int photoId, int albumId) {
        for (int i = 0; i < size; i++) {
            if (photos[i].getPhotoId() == photoId && photos[i].getAlbumId() == albumId) {
                System.arraycopy(photos, i + 1, photos, i, size - 1 - i);//из массива photos, взяли правый i+1, поставили на место photos i, size -1 - i ????

                //public static void arraycopy(Object sourceArray, int sourceStartIndex, Object destinationArray, int destinationStartIndex, int length)
                //System.arraycopy() - это метод в Java, который используется для копирования элементов одного массива в другой массив.
                //sourceArray - массив, из которого будут копироваться элементы.
                //sourceStartIndex - индекс элемента в sourceArray, с которого начнется копирование.
                //destinationArray - массив, в который будут скопированы элементы.
                //destinationStartIndex - индекс элемента в destinationArray, с которого начнется вставка скопированных элементов.
                //length - количество элементов для копирования.

                photos[--size] = null;//последнее фото удаляем
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updatePhoto(int photoId, int albumId, String url) {
        Photo photo = getPhotoFromAlbum(photoId, albumId); //нашли фото по двум id
        if (photo == null) {//проверяем если найденное photo равен null
            return false;//возвращаем false
        }
        photo.setUrl(url);//меняем url через сеттер, параметр сеттера(url) это url которое пришло на вход методу updatePhoto
        return true;
    }

    @Override
    public Photo getPhotoFromAlbum(int photoId, int albumId) {
        Photo pattern = new Photo(albumId, photoId, null, null, null);//Создаем объект, с которым сравниваем photo из массива. По этому паттерну будем искать в массиве
        for (int i = 0; i < size; i++) {
            if (pattern.equals(photos[i])) {//сравниваем объектную переменную pattern с элементами массива photos
                return photos[i];//если равен возвращаем
            }
        }
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

    private Photo[] findByPredicate(Predicate<Photo> predicate) {
        Photo[] res = new Photo[size];
        int j = 0; // счетчик найденных по условию
        for (int i = 0; i < size; i++) {
            if (predicate.test(photos[i])) {
                res[j++] = photos[i];
            }
        }
        return Arrays.copyOf(res, j);//копируем только ту часть, где нет null
    }

}
