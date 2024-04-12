package Seminar_01;

/*Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента
 * целочисленный одномерный массив.
 * Метод должен пройтись по каждому элементу и провнрить что он не равен Null.
 * 
 * Реализовать следующую логику:
 * 1. Если в какой-то ячейке встретился null, то необходимо "оповестить" пользователя.
 */


public class Task3 {

    public static void main(String[] args) {
        Integer[] arr = {12, -23, 56, 2, null, 0, null, -1};
        checkArray(arr);
    }

    public static void checkArray(Integer[] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == null)
                System.out.println("Найден элемент null на индексе " + i);
        }
    }
    
}
