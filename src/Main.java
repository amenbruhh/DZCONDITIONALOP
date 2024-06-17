import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // задача 1

        int age = 9;

        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать");
        }




        // задача 2

        int temperature = 5;

        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }




        // задача 3

        int speed = 90;

        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно");
        }




        // задача 4

        int personAge = 23;

        if (personAge <= 6 && personAge >= 2) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в детский сад.");
        } else if (personAge >= 7 && personAge <= 17){
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в школу.");
        } else if (personAge >= 18 && personAge <= 24 ) {
            System.out.println("Если возраст человека равен " + personAge + ", то его место в университете.");
        } else if (personAge > 24) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему пора ходить на работу.");
        }




        // задача 5

        int childAge = 3;

        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " +  childAge + ", то ему нельзя кататься на аттракционе.");
        } else if (childAge >= 5 && childAge <14) {
            System.out.println("Если возраст ребенка равен " +  childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else if (childAge >= 14) {
            System.out.println("Если возраст ребенка равен " +  childAge + ", то ему можно кататься без сопровождения взрослого).");
        }




        // задача 6

        int carriageCapacity = 102;
        int seatPlace = 60;
        int standingPlace = carriageCapacity - seatPlace;
        int passengers = 103;

        if (passengers < seatPlace && passengers < carriageCapacity) {
            System.out.println("В вагоне есть сидячие места.");
        } else if (passengers >= seatPlace && passengers < carriageCapacity) {
            System.out.println("В вагоне есть стоячие места.");
        } else {
            System.out.println("В вагоне мест нет.");
        }




        // задача 7

        int one = 1;
        int two = 2;
        int three = 3;
        int largest;

        if (one >= two && one >= three) {
            largest = one;
        } else if (two >= one && two >= three) {
            largest = two;
        } else {
            largest = three;
        }
        System.out.println("Наибольшее число: " + largest);
    }
}