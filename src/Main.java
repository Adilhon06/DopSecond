import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int age = getRandomAge();

        getBack(getRandomAge(), 20);
        getBack(getRandomAge(), 10);
        getBack(getRandomAge(), -20);
        getBack(getRandomAge(), 16);
        getBack(getRandomAge(), 36);
    }
    public static int getRandomAge(){
        Random random = new Random();
        int randomAge = random.nextInt(80) + 1;
        return randomAge;
    }
    public static String getBack(int age, int temperature){

        if (age >= 20 && age <=40 && temperature >= -20 && temperature <= 30){
            System.out.println("Можно идти гулять");
        } else if (age <= 20 && temperature >= 0 && temperature <= 28){
            System.out.println("Можно идти гулять");
        } else if (age >= 45 && temperature >= -10 && temperature <= 25) {
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Оставайся дома");
            return "Оставайся дома";
        }
        return "Можно идти гулять";
    }
}