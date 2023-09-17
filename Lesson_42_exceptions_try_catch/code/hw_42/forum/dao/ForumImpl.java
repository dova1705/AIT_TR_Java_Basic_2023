package hw_42.forum.dao;

import hw_42.forum.model.Post;

import java.time.LocalDate;
import java.util.Arrays;

public class ForumImpl implements Forum{
    private Post[] posts;
    private int size;

    public ForumImpl(){

    }

    @Override
    public boolean addPost(Post post) {
       String title = post.getTitle();
       String author = post.getAuthor();
       String content = post.getContent();
       if (title == null || author == null || content == null || size == posts.length){
           return false;
       }
       int postId = post.getPostId();
        for (int i = 0; i < size; i++) {
            if (posts[i].getPostId() == postId){
                return false;
            }
        }
        Post newPost = new Post(postId,title,author,content);
        int index = Arrays.binarySearch(posts, 0, size, newPost);//результат метода binarySearch присвоили к переменной (Arrays.binarySearch() - возвращает индекс) массив должен быть отсортированным
        //на вход методу binarySearch (из массива posts, начиная с нулевого индекса, до size, ищем newPost)
        if (index < 0){
            index = - index - 1;
        }
        System.arraycopy(posts,index,posts,index + 1,size - index);// копируем элементы массива от index на 1 место в право, на вход (берем массив posts, начиная с index, в тот же массив posts, все элементы двигаем в право index + 1, сколько элементов мы должны взять size - index)
        //public static void arraycopy(Object sourceArray, int sourceStartIndex, Object destinationArray, int destinationStartIndex, int length)
        //System.arraycopy() - это метод в Java, который используется для копирования элементов одного массива в другой массив.
        //sourceArray - массив, из которого будут копироваться элементы.
        //sourceStartIndex - индекс элемента в sourceArray, с которого начнется копирование.
        //destinationArray - массив, в который будут скопированы элементы.
        //destinationStartIndex - индекс элемента в destinationArray, с которого начнется вставка скопированных элементов.
        //length - количество элементов для копирования.
        posts[index] = newPost; //на освобождённое место  posts[index] присвоили post
        size++; //увеличили размер
        return true;
    }

    @Override
    public boolean removePost(int postId) {
        return false;
    }

    @Override
    public boolean updatePost(int postId, String content) {
        return false;
    }

    @Override
    public Post getPostById(int postId) {
        return null;
    }

    @Override
    public Post[] getPostsByAuthor(String author) {
        return new Post[0];
    }

    @Override
    public Post[] getPostsByAuthor(String author, LocalDate dateFrom, LocalDate dateTo) {
        return new Post[0];
    }

    @Override
    public int size() {
        return size;
    }
}
