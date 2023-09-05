package practice_38.month;

public enum Month_1 {

    //имена константы в джава всегда задаются заглавными буквами
    JAN(31), FEB(28), MAR(31), APR(30), MAY(31), JUN(30), JUL(31), AUG(31), SEP(30), OCT(31), NOV(30), DEC(31);

    //поле класса
    private int days;

    //конструктор ничего не возвращает, имя совпадает с именем класса enum
    Month_1(int days) {
        this.days = days;
    }

    //геттер
    public int getDays() {//позволяет вернуть (узнать) количество дней в месяце
        return days;
    }
    //сеттер
    public void setDays(int days) {
        this.days = days;
    }

    //метод увеличивает количество месяцев
    public Month_1 plusMonth(int quantity){//quantity - это количество. То что подали в параметр массива
        int index = ordinal();//ordinal() возвращает порядковый номер константы. Отсчет начинается с нуля
        index = index + quantity;//индекс увеличили
        Month_1[] values = values();//Определили массив values. values(): возвращает массив из всех хранящихся в Enum значений
        return values[index % values.length];//index разделили с остатком на 12 которая равна values.length
    }

    //метод возвращает имя месяца по его номеру
    public static String getName(int num){//static - позволяет вызвать по имени класса. На вход методу можем писать любое число, все равно возвращает имя нужного месяца
        Month_1[] values = values();//Определили массив values типа Month_1. values(): возвращает массив из всех хранящихся в Enum значений
        return values[(num - 1) % values.length].name();//Возвращаем имя правильного месяца. (num - 1) - это Январь 1-й месяц минус 1. В массиве январь под индексом 0
    }
}
