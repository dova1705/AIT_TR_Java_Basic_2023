package practice_39.todo_appl.dao;

import hw_35.product.model.Product;
import practice_39.todo_appl.model.Task;

public class ToDoListImpl implements ToDoList{

    private Task[] tasks;

    int capacity;

    public ToDoListImpl(int capacity) {
        this.tasks = new Task[capacity];
    }

    // метод, который добавляет новое дело в массив
    @Override
    public boolean addTask(Task task) {
        // если дело не null ИЛИ size еще не равен длине массива ИЛИ такой дело уже есть, ТО
        // if not null, add task to tasks, quantity++
        if (task == null || capacity == tasks.length){
            return false; // Возвращаем false, т.к. продукта нельзя добавить!
        }
        tasks[capacity] = task;//добавление в конец массива
        capacity++;//после добавления увеличиваем размер
        return true;
    }

    // метод, который удаляет дело из массива

    @Override
    public Task removeTask(int id) {
        // find by id then remove, quantity--
        for (int i = 0; i < capacity; i++) {
            if (tasks[i].getId() == id){// находим жертву по его id
                Task victim = tasks[i];// в объектную переменную victim кладем найденного
                tasks[i] = tasks[capacity - 1];// берем последнего в списке и ставим его на место найденного
                tasks[capacity - 1] = null;// последнего в списке делаем null
                capacity--; //уменьшаем размер на 1
                return victim;//возвращаем найденный объект
            }
        }
        return null; //если не нашлось объект с заданным id возвращаем null
    }

    @Override
    public Task findTask(int id) {
        // find by id
        for (int i = 0; i < capacity; i++) {
            if (tasks[i].getId() == id){// находим жертву по его id
                return tasks[i];//возвращаем найденного
            }
        }
        return null;//если не нашлось объект с заданным id возвращаем null
    }

    @Override
    public void printTasks() {
        // for loop, print tasks
        for (int i = 0; i < capacity; i++) {
            System.out.println(tasks[i]);
        }
        System.out.println("==========================================================");
    }

    @Override
    public int quantity() {
        // return quantity;
        return capacity;
    }
}
