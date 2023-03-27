package session.session27mar;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FunctionalInterfacesPractice {
    public static void main(String[] args) {
        IntSum added = (int a, int b) -> a + b;
        int sumOfNumbers = added.add(10,20);
        System.out.println(sumOfNumbers);

        IntMultiply result = (int a, int b) -> a * b;
        int multiplyNumbers = result.multiply(19,21);
        System.out.println(multiplyNumbers);

        List<String> myList = Arrays.asList("cherry" , "watermelon" , "apple");
        //Arrays.sort(myList.toArray());

//        Collections.sort(myList, (String a, String b) -> a.compareTo(b));
        Collections.sort(myList);
        System.out.println(myList);

        int[] numbers = {1, 2, 3, 4, 5, 6};
        //old fashion way
        for (int number: numbers){
            if (number % 2 ==0){
                System.out.println(number);
            }
        }
        //with lambda & stream
        List<Integer> evenNumbers = Arrays.stream(numbers)
                .filter(number -> number % 2 == 0)
                .boxed()
                .toList();
        System.out.println("Number from lambda & stream: " + evenNumbers);
        evenNumbers.forEach(number ->{
            if(number > 5){
                System.out.println("There is one value grater than 5: " + number);
            }
            System.out.println("Printed from forEach: " + number);
        });
    }
}
@FunctionalInterface
interface IntSum{
    int add(int a, int b);
}
@FunctionalInterface
interface IntMultiply{
    int multiply(int a, int b);
}
