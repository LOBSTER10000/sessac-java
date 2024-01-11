package algorism;

public class Fibo2 {
    public static int 최대공약수(int i, int y){
        int c =0;
        if(i < y){
            c = y;
            y = i;
            i = c;
        }

        if(i%y == 0){
            return y;
        }
        else {
            return 최대공약수(i, i%y);
        }
   }

   public static int 최소공배수(int i, int y){
        return i*y / 최대공약수(i, y);
   }

   public static int 배수합(){
        int sum = 0;
        for(int i= 0; i < 1000; i++){
            if(i%3 == 0 || i%5 == 0){
                sum += i;
            }
        }
        return sum;
   }

   public static int 피보나치(int i){
        if(i == 0){
            return 0;
        }
        else if (i == 1){
            return 1;
        }
        else {
            return 피보나치(i-1) + 피보나치(i-2);
        }
   }

   public static int 팩토리얼(int i){
        if(i <= 0){
            return 0;
        }
        else {
            return 팩토리얼(i - 1) + i;
        }
   }

   public static int 팩토리얼2(int i){
        if (i <= 1){
            return 1;
        }
        else {
            return 팩토리얼(i-1) * i;
        }
   }
    public static void main(String[] args){
        System.out.println(최대공약수(15,20));
        System.out.println(최소공배수(10,15));
        System.out.println(배수합());
        System.out.println(피보나치(10));
        System.out.println(팩토리얼(6));
        System.out.println(팩토리얼2(10));


        for(int i = 0; i < 5; i++){
            for(int j = 0; j< 5; j++){
                if(i-j == 0){
                    System.out.print("S");
                }
                else {
                    System.out.print("s");
                }
            }
            System.out.println("");
        }
        for(int i = 1; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(i+j == 4){
                    System.out.print("S");
                }
                else {
                    System.out.print("s");
                }
            }
            System.out.println("");
        }

        for(int i = 1; i < 10; i++){
            System.out.println(i + "단");
            for(int j= 1; j < 10; j++){
                System.out.println(i + "x" + j + "=" + i*j);
            }
        }

        for(int i = 3; i<4; i++){
            for(int j = 1; j<9; j++){
                if(!(i*j%4 == 0)){
                    System.out.println(i*j);
                }
            }
        }


    }
}
