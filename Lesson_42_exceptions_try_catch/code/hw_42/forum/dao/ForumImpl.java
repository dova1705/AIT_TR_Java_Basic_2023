package hw_42.forum.dao;

import hw_42.forum.model.Post;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;

public class ForumImpl implements Forum {

    private static Comparator<Post> postComparator = (p1, p2) -> {//компаратор параметризует <Post> параметр компаратора (p1-объект типа Post, p2-объект типа Post) лямбда выражения
        int res = p1.getAuthor().compareTo(p2.getAuthor());//в целочисленную переменную присваиваем результат сортировки двух объектов по автору, по алфавиту
        res = res != 0 ? res : p1.getDate().compareTo(p2.getDate());//(тернарный оператор) если res не равно 0 ? печатаем res, если равно 0 : сортировка по дате в порядке времени
        return res != 0 ? res : Integer.compare(p1.getPostId(), p2.getPostId());//возвращаем (тернарный оператор) если res не равно 0 ? печатаем res, если равно 0 : сортировка по id поста
    };
    private Post[] posts;
    private int size;

    public ForumImpl() {
        posts = new Post[0];
    }

    @Override
    public boolean addPost(Post post) {
        //TODO throw RuntimeException if post == null
        if(post == null){
            throw new RuntimeException();
        }
        if (getPostById(post.getPostId()) != null) {
            return false;
        }
//        String title = post.getTitle();
//        String author = post.getAuthor();
//        String content = post.getContent();
//        if (title == null || author == null || content == null || size == posts.length) {
//            return false;
//        }
//        int postId = post.getPostId();
//        for (int i = 0; i < size; i++) {
//            if (posts[i].getPostId() == postId) {
//                return false;
//            }
//        }
        posts = Arrays.copyOf(posts, posts.length + 1); // метод Arrays.copyOf позволяет копировать сам массив с увеличением его размера
        int index = Arrays.binarySearch(posts, 0, size, post, postComparator);//результат метода binarySearch присвоили к переменной (Arrays.binarySearch() - возвращает индекс) массив должен быть отсортированным
        //Ищем индекс, куда вставить пост в массив. На вход методу binarySearch (из массива posts, начиная с нулевого индекса, до size, ищем newPost, postComparator)
        if (index < 0) {
            index = -index - 1;//обработка индекса
        }
        //расчистка места для поста
        System.arraycopy(posts, index, posts, index + 1, size - index);// копируем элементы массива от index на 1 место в право, на вход (берем массив posts, начиная с index, в тот же массив posts, все элементы двигаем в право index + 1, сколько элементов мы должны взять size - index)
        //public static void arraycopy(Object sourceArray, int sourceStartIndex, Object destinationArray, int destinationStartIndex, int length)
        //System.arraycopy() - это метод в Java, который используется для копирования элементов одного массива в другой массив.
        //sourceArray - массив, из которого будут копироваться элементы.
        //sourceStartIndex - индекс элемента в sourceArray, с которого начнется копирование.
        //destinationArray - массив, в который будут скопированы элементы.
        //destinationStartIndex - индекс элемента в destinationArray, с которого начнется вставка скопированных элементов.
        //length - количество элементов для копирования.
        posts[index] = post; //на освобождённое место  posts[index] присвоили post
        size++; //увеличили размер
        return true;
    }

    @Override
    public boolean removePost(int postId) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getPostId() == postId) ;
            System.arraycopy(posts, i + 1, posts, i, size - i - 1);
            //public static void arraycopy(Object sourceArray, int sourceStartIndex, Object destinationArray, int destinationStartIndex, int length)
            //System.arraycopy() - это метод в Java, который используется для копирования элементов одного массива в другой массив.
            //sourceArray - массив, из которого будут копироваться элементы.
            //sourceStartIndex - индекс элемента в sourceArray, с которого начнется копирование.
            //destinationArray - массив, в который будут скопированы элементы.
            //destinationStartIndex - индекс элемента в destinationArray, с которого начнется вставка скопированных элементов.
            //length - количество элементов для копирования.
            posts = Arrays.copyOf(posts, posts.length - 1);//перезаписываем массив сам в себя с длиной -1
            size--;
            //posts[--size] = null; //последний пост удаляем
            return true;
        }
        return false;
    }

    @Override
    public boolean updatePost(int postId, String content) {
        int index = findById(postId);
        if (index < 0){
            return false;
        }
        posts[index].setContent(content);// обновление контента
        return true;
    }

    @Override
    public Post getPostById(int postId) {
        int index = findById(postId);//findById вынесен в отдельный метод
        if (index < 0){
            return null;
        }
        return posts[index];
    }
//    public Post getPostById(int postId) {
//        for (int i = 0; i < posts.length; i++) {
//            if (posts[i].getPostId() == postId){
//                return posts[i];
//            }
//        }
//        return null;
//    }

    @Override //скопировал у преподавателя
    public Post[] getPostsByAuthor(String author) {
        Post pattern = new Post(Integer.MIN_VALUE, null, author, null);
        pattern.setDate(LocalDateTime.MIN);
        int from = -Arrays.binarySearch(posts,pattern,postComparator) - 1;//находим индекс, (минус перед Arrays.binarySearch) если индекс отрицательный меняем знак, (в конце минус 1) если искомого элемента не находит метод, возвращает отрицательный индекс минус 1 точный индекс
        pattern = new Post(Integer.MAX_VALUE, null, author, null);
        pattern.setDate(LocalDateTime.MAX);
        int to = -Arrays.binarySearch(posts, pattern, postComparator);
        return Arrays.copyOfRange(posts, from, to);
    }

    @Override //скопировал у преподавателя
    public Post[] getPostsByAuthor(String author, LocalDate dateFrom, LocalDate dateTo) {
        Post pattern = new Post(Integer.MIN_VALUE, null, author, null);
        pattern.setDate(dateFrom.atStartOfDay());
        int from = -Arrays.binarySearch(posts, pattern, postComparator) - 1;
        pattern = new Post(Integer.MAX_VALUE, null, author,  null);
        pattern.setDate(LocalDateTime.of(dateTo, LocalTime.MAX));
        int to = -Arrays.binarySearch(posts, pattern, postComparator) - 1;
        return Arrays.copyOfRange(posts, from, to); // возвращаем массив
    }

    @Override
    public int size() {
        return size;
    }

    private int findById(int postId) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getPostId() == postId) {
                return i;
            }
        }
        return -1;
    }
}
