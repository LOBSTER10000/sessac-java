public class Casting {
    public static void main(String[] args){
        // 목시적 형변환 (wider Conversation)
        // -작은 타입에서 큰 타입으로 자동 형변환
        // 반대의 경우에는 명시적으로만 형변환이 가능

        int smallNumber = 10;
        double bigNumber = smallNumber; //작은 형에서 큰 타입일 경우 생략 가능
        System.out.println(bigNumber);
        // 명시적 형변환 (Narrow Conversation)
    
        // 큰 타입에서 작은 타입으로 형변환을 하다보니 데이터 손실이 일어날 수 있음을 명시
        double Number = 10.5;
        int bigNum = (int) Number; // 명시적으로 형태가 변환했음을 알려 줌
        System.out.println(bigNum);


    }
}
