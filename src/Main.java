import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int age = getRandomAge();

        System.out.println(getBack(age, 20));
        System.out.println(getBack(age, 10));
        System.out.println(getBack(age, -20));
        System.out.println(getBack(age, 16));
        System.out.println(getBack(age, 36));
    }
    public static int getRandomAge(){
        Random random = new Random();
        return random.nextInt(100) + 1;
    }
    public static String getBack(int age, int temperature){

        if (age >= 20 && age <=45 && temperature >= -20 && temperature <= 30){
            return  "Можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature <= 28){
            return  "Можно идти гулять";
        } else if (age >= 45 && temperature >= -10 && temperature <= 25) {
            return  "Можно идти гулять";
        } else {
            return "Оставайся дома";
        }
    }
}