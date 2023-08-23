package practice_38.month;

public enum Month {


    //Имена константы в Java всегда задаются заглавными буквами
    //работа конструктора
    JAN(31), FEB(28), MAR(31), APR(30), MAY(31), JUN(30), JUL(31), AUG (31),SEP(30), OKT(31), NOV(30), DEC(31);

    //поле класса
    private int days;

    //конструктор
    Month(int days) { //название класса enum и конструктора - совпадают
        this.days = days;
    }

    //геттеры и сеттеры
    public int getDays() {//позволяет вернуть (узнать) кол-во дней в месяце
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    //метод увеличивает кол-во месяцев
    public Month plusMonth(int quantity){ //quantity - это количество. То что подали в параметр массива
        int index = ordinal(); //ordinal() возвращает порядковый номер константы. Отсчет начинается с нуля
        index = index + quantity;//индекс увеличили
        Month[] values = values();//Определили массив values. values(): возвращает массив из всех хранящихся в Enum значений
        return values[index % values().length];//index разделили с остатком на 12 = values().length
    }

    //метод возвращает имя месяца по его номеру
    public static String getName(int num){//static - позволяет вызвать по имени класса. На вход методу можем писать любое число, все равно возвращает имя нужного месяца
        Month[] values = values(); //Определили массив values. values(): возвращает массив из всех хранящихся в Enum значений
        return values[(num - 1) % values.length].name(); //Возвращаем имя правильного месяца. (num - 1) - это Январь 1-й месяц минус 1, в массиве январь под индексом 0
    }
}
