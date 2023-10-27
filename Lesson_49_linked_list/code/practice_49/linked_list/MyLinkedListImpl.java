package practice_49.linked_list;

import java.util.List;
import java.util.Objects;

public class MyLinkedListImpl implements MyLinkedList {
    private Node head;  // Указатель на первый элемент списка
    private Node tail;  // Указатель на последний элемент списка
    private int size;   // Размер списка

    public MyLinkedListImpl(String data) {
        this.head = new Node(data, null, null);
        this.tail = head;
        this.size = 1;
    }

    @Override
    public boolean add(String data) {
        Node node = new Node(data, tail, null);
        this.tail.next = node; // ссылка хвоста ведет в новый добавленный элемент
        this.tail = node; // хвост говорим что новый пришедший элемент последний в списке
        size++; // увеличили размер на 1
        return true;
    }

    @Override
    public boolean add(int index, String data) throws IndexOutOfBoundsException {
        if (index > size) {
            throw new IndexOutOfBoundsException("индекс " + index + " находится вне связи " + size);
        }
        Node node = new Node(data, null, null);
        Node temp = this.head;
        for (int i = 0; i <= index; i++) {
            if (i == index) {
                node.prev = temp.prev;
                temp.prev = node;
                Node b = node.prev;
                b.next = node;
                node.next = temp;
                size++;
                return true;
            } else {
                temp = temp.next;
            }
        }
        return false;
    }

    @Override
    public boolean set(int index, String data) throws IndexOutOfBoundsException {
        if (index > size) {
            throw new IndexOutOfBoundsException("индекс " + index + " находится вне связи " + size);
        }
        Node newNode = new Node(data, null, null);
        Node temp = this.head;
        for (int i = 0; i <= index; i++) {
            if (i == index) {
                newNode.prev = temp.prev;
                Node b = newNode.prev;
                b.next = newNode;
                newNode.next = temp.next;
                Node d = newNode.next;
                d.prev = newNode;
                return true;
            } else {
                temp = temp.next;
            }
        }
        return false;
    }

    @Override
    public boolean addFirst(String data) {
        Node newNode = new Node(data, null,null);
        head.prev = newNode;
        newNode.next = head;
        this.head = newNode;
        size++;
        return true;
    }

    @Override
    public boolean addLast(String data) {
        return add(data);
    }

    @Override
    public boolean addAll(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            add(list.get(i));
        }
        return true;
    }

    @Override
    public boolean contains(String data) {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.data.equals(data)){
                return true;
            } else {
                temp = temp.next;
            }
        }
        return false;
    }

    @Override
    public String get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("индекс " + index + " находится вне связи " + size);
        }
        Node temp = head;
        for (int i = 0; i <= index; i++) {
            if (i == index){
                return temp.data;
            }else {
                temp = temp.next;
            }
        }
        return null;
    }


    @Override
    public String getFirst() {
        return null;
    }

    @Override
    public String getLast() {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int indexOf(String data) {
        return 0;
    }

    @Override
    public int firstIndexOf(String data) {
        return 0;
    }

    @Override
    public int lastIndexOf(String data) {
        return 0;
    }

    // Вложенный класс для узла списка
    private static class Node {
        String data;  // Данные, хранящиеся в узле
        Node prev;    // Указатель на предыдущий узел
        Node next;    // Указатель на следующий узел

        // Конструктор для создания нового узла
        public Node(String data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }
}
/*



 */
