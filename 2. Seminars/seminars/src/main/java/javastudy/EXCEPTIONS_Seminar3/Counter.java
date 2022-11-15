package javastudy.EXCEPTIONS_Seminar3;

/*
Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение внутренней int переменной на 1.
 Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources. Нужно бросить исключение,
  если работа с объектом типа счетчик была не в ресурсном try и/или ресурс остался открыт.
   Подумайте какой тип исключения подойдет лучше всего.
 */

public class Counter implements AutoCloseable{
    private int count;
    private boolean closed = false;

    public void increment(){
        if (closed){
            throw new IllegalStateException("Counter already closed");
        }
        count++;
    }

    public static void main(String[] args) {
        try (Counter count = new Counter()){
            count.increment();
            count.increment();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
    @Override
    public void close() throws Exception {
        if (closed){
            throw new Exception("Counter already closed");
        }
        closed = true;
    }
}
