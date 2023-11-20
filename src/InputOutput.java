
import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args){
        Scanner scan = new Scanner((System.in));

        System.out.println("이름, 나이, 키, 결혼 여부를 입력하세요");
        String name = scan.next();
        int age = scan.nextInt();
        double height = scan.nextDouble();
        boolean single = scan.nextBoolean();

        System.out.println("name : " + name + " 나이 : " + age  + " 키 : " + height + " 결혼여부 " + single);
        scan.close();
    }
}
