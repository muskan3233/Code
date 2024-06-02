import java.util.Random;

public class RndmVlu {
    public static void main(String[] args){
        Random rndm = new Random();
        // int n = rndm.nextInt(10); -> random integer value till 10 (0-10)
        // double n = rndm.nextDouble(); -> random value of double from 0 to 1
        boolean n = rndm.nextBoolean(); // random boolean value (true or false)
                System.out.println(n);

    }
}
