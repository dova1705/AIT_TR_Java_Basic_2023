package hw_35.product.dao;

import hw_35.product.model.Product;

public class SuperMarketImpl implements SuperMarket {

    // это поля класса
    // заводим массив под продукта
    private Product[] products;

    // кол-во продукта
    private int size; // это поле отвечает за количество продукта

    // Это конструктор. Конструктор класса, по имени он совпадает с наименованием класса, НО ничего не возвращает и не void
    // метод, который получив на вход capacity определяет размер массива products
    SuperMarketImpl(int capacity) {
        products = new Product[capacity];
    }

    // метод, который добавляет нового продукта в массив
    @Override
    public boolean add(Product product) {
        // если продукт не null ИЛИ size еще не равен длине массива ИЛИ такой продукт уже есть, ТО
        if (product == null || size == products.length || search(product.getId()) != null) {
            return false; // Возвращаем false, т.к. продукта нельзя добавить!
        }
        products[size] = product; //добавление в конец массива
        size++; //после добавления продукта увеличиваем размер
        //products[size++] = product;  // добавляем продукта в массив и увеличиваем size на 1
        return true;
    }

    // метод, который удаляет продукта из массива
    @Override
    public Product remove(int id) { // получили на вход id
        for (int i = 0; i < size; i++) {// перебираем весь массив
            if (products[i].getId() == id) { // находим жертву по его id
                Product victim = products[i];// в объектную переменную victim кладем найденного
                products[i] = products[size - 1]; // берем последнего в списке и ставим его на место найденного
                products[size - 1] = null; // последнего в списке делаем null
                size--; //уменьшаем размер на 1

//                products[i] = products[--size]; // берем последнего в списке и ставим его на место найденного (-- префиксная запись сначала размер минус)
//                products[size] = null;
                return victim;
            }
        }
        return null; //если не нашлось объект с заданным id возвращаем null
    }

    // метод, который находит продукта из массива
    @Override
    public Product search(int id) {// получили на вход id
        for (int i = 0; i < size; i++) {// перебираем весь массив
            if (products[i].getId() == id) {// находим жертву по его id
                return products[i];//возвращаем найденного
            }
        }
        return null;//если не нашлось объект с заданным id возвращаем null
    }

    // метод, который считает продукта из массива
    @Override
    public double totalSumOfPrice(Product[] arr) {// получили на вход массив типа Product
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {// перебираем весь массив
            sum = sum + arr[i].getPrice();//в переменную sum добавляем getPrice из массива типа Product
        }
        return sum;
    }

    @Override
    public double averagePrice(Product[] arr) {// получили на вход массив типа Product
        double average = 0;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {// перебираем весь массив
            sum = sum + arr[i].getPrice();//в переменную sum добавляем getPrice из массива типа Product
        }
        average = sum / arr.length;//Среднее значение сумму массива делим на длину
        return average;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printProductArr(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("=======================================================================================");
    }


    @Override
    public void printProduct() {
        for (int i = 0; i < size; i++) {
            System.out.println(products[i]);
        }
        System.out.println("=====================================================");
    }
}
