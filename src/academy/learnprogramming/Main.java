package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(100, 20, 30));
    }

    public static boolean hasSameLastDigit(int x, int y, int z){
        boolean same = false;
        if(!isValid(x) || !isValid(y) || !isValid(z)){
            same = false;
        } else {
            x %= 10;
            y %= 10;
            z %= 10;
            if((x == y) || (x == z) || (y == z)){
                same = true;
            }
        }
        return same;
    }
    public static boolean isValid(int x){
        if((x < 10) || (x > 999)){
            return false;
        }
        return true;
    }


}
