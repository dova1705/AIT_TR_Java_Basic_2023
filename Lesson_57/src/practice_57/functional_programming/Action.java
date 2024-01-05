package practice_57.functional_programming;


/**
 * Интерфейс с методом, принимающим один аргумент и ничего не возвращающим (аналог Consumer):
 */
@FunctionalInterface
interface Action<T> {
    void execute(T t);
}
