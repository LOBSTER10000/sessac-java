package _03_array;
import java.lang.reflect.Array;
import java.util.Arrays;
// 표준 배열
// 배열
// - 배열에 저장할 자료형 선언 => 배열이름, 크기 선언
// - 배열 원소는 모두 같은 패턴
// - 처음 선언한 배열 크기 변경 불가능
public class ArrayEx {
    public static void main(String[] args) {
        //	   배열 변수 선언
        //		1. 타입[] 변수;
        //		2. 타입 변수[];

        int[] arr1;
        int arr2[];


        //		- 배열 변수 "참조"type. null 초기화 가능
        //		ex. 타입[] 변수 = null;
        //		=> 배열 변수가 null 값을 가진 상태에서 인덱싱한다면 null pointer exception!!
        String[] temp = null;
        System.out.println(temp); //null
        //		System.out.println(temp[2]); //error



        //		- "값 목록"으로 배열 변수 선언/ 생성
        int[] intArray = {16, 22, 43, 41, 59};
        System.out.println("intArray[0]" + intArray[0]);

        System.out.println(intArray); //참조값


        intArray[1] = 77; //인덱스 1번 원소 값을 변경.
        System.out.println("intArray[1]"+ intArray[1]);


        //		* 배열 변수 선언과 대입 시점 다르다면
        char[] charArray;
        //		charArray = {"A", "B", "C"} // error
        charArray = new char[] {'A', 'B', 'C'};


        //		- new 연산자로 배열 선언 /생성
        //		: 배열 원소 값은 기본 값을 초기화 됨.
        double[] doubleArray = new double[3];
        System.out.println("new 연산자로 초기화된 값:" + doubleArray[0]);
        doubleArray[0] = 0.1;
        doubleArray[1] = 1.2;
        doubleArray[2] = 4.2;
        System.out.println("doubleArray[0]" + doubleArray[0]);
        System.out.println("doubleArray[1]" + doubleArray[1]);
        System.out.println("doubleArray[2]" + doubleArray[2]);
        System.out.println();



        ///////////////////////////////////
        //		배열 길이
        //		- 배열 변수.length;
        System.out.println("doubleArray 배열 길이:" + doubleArray.length);
        //		doubleArray.length = 5; // error : length 필드는 읽기 전용이라 수정 불가능함.



        //		ex. 총합, 평균
        int sum = 0;
        for(int i =0; i<intArray.length; i ++) {
            sum += intArray[i];
        }
        System.out.println("총합" + sum);

        double avg =(double) sum / intArray.length;
        System.out.println("평균" + avg);

        //		- 배열 길이를 벗어난경우의 에러 코드
        //       System.out.println(doubleArray[doubleArray.length]); //ArrayIndexOutOfBoundsException

        ////////////////////////////////////////
        //		배열 출력
        //		- toString(); : 배열 내용을 문자열로 변환해서 출력
        //		- 배열 주소(참조) 값이 아니라 배열 내부의 값을 보고 싶을 때 사용!

        System.out.println("intArray" + Arrays.toString(intArray));
        System.out.println("charArray" + Arrays.toString(charArray));
        System.out.println("doubleArray" + Arrays.toString(doubleArray));
        System.out.println();



        /////////////////////////////////////
        // 다차원 배열
        // - 배열 안에 또 다른 배열이 존재하는 배열

        // 2*3 배열 생성/초기화
        int[][] matrix = {{1,2,3},{4,5,6}};
        System.out.println("matrix : ");
        for(int i =0; i < matrix.length; i++){
            for(int j= 0; j < matrix[i].length; j++){
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // 3*2 배열 생성 / 초기화
        int[][] matrix2 = new int[3][2];
        matrix2[0][0] = 1;
        matrix2[0][1] = 2;
        matrix2[1][0] = 3;
        matrix2[1][1] = 4;
        matrix2[2][0] = 5;
        matrix2[2][1] = 6;

        System.out.println("matrix2 : ");
        for(int i =0; i < matrix2.length; i++){
            for(int j= 0; j < matrix2[i].length; j++){
                System.out.println(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        // 3차원 배열 생성 / 초기화
        int[][][] threeArray = {{{1,2},{3,4}},{{5,6},{7,8}}};
        System.out.println("threeArray : ");
        for(int i =0; i < threeArray.length; i++){
            for(int j= 0; j < threeArray[i].length; j++){
               for(int k =0; k< threeArray[i][j].length; k++){
                   System.out.println(threeArray[i][j][k] + " ");
               }
                System.out.println();
            }
            System.out.println();
        }

        //////////////////////////
        // 객체를 참조하는 배열
        // - 기본 타입 배열 각 원소에 "값"이 저장
        // - 참조 타입 배열 각 원소에 "참조(주소)가 저장
        String[] lengs = new String[3];
        lengs[0] = "java";
        lengs[1] = "java";
        lengs[2] = new String("java");

        // 0, 1 : 문자열 리터럴 저장, 문자열 리터럴 : Java 컴파일러가 문자열 풀(string pool) 공유된 영역에 저장
        // 2 : new 연산자로 문자열 객체를 생성(참조값도 새로 받음);
        System.out.println(lengs[0] == lengs[1]); // true : 같은 객체 참조
        System.out.println(lengs[1] == lengs[2]); // false : 다른 객체 참조
        System.out.println(lengs[0].equals(lengs[2]));


        /////////////////////////
        // 배열 관련 메서드
        // 배열 복사
        // -표준 배열은 크기가 고정 -> 더 많은 저장 공간이 필요하다면, 더 큰 길이의 배열을 새로 만들어 기존 배열 복사

        // ver 1. 반복문 요소를 하나씩 복사
        int[] originArray = {1,2,3};
        int[] newArray = new int[5];
        System.out.println("originArray : " + Arrays.toString(originArray));

        for(int i = 0; i < originArray.length; i++){
            newArray[i] = originArray[i];
        }
        System.out.println("newArray : " + Arrays.toString(newArray));
        
        // ver2. arraycopy() 메서드
        // arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
        // - Object src : 원본 배열
        // - int srcPos : 원본 배열 복사 시작 인덱스
        // - Object dest : 새로운 배열
        // - int destPost : 새로운 배열 붙여넣기 시작 인덱스
        // - int length : 복사할 원소 개수

        String[] originFruits = {"apple", "banana", "kiwi"};
        String[] newFruits = new String[5];

        System.arraycopy(originFruits, 0, newFruits, 0, originFruits.length);
        System.out.println("originFruits : " + Arrays.toString(originFruits));
        System.out.println("newFruits : " + Arrays.toString(newFruits));


        //
        // Arrays 메서드
        // copyOf(arr, copyArrayLength)
        int[] originArr = {1,2,3,4,5};
        int[] copiedArray = Arrays.copyOf(originArr, 3);
        System.out.println("copiedArray : " + Arrays.toString(copiedArray));


        // copyOfRange(arr, sIdx, eIdx) 배열 복사를 범위로 넣기
        int[] rangeArr = Arrays.copyOfRange(originArr, 1, 4);
        System.out.println("rangeArr : " + Arrays.toString(rangeArr));

        // fill(arr, n)
        int[] filledArr = new int[5];
        Arrays.fill(filledArr, 7); // 초기값을 전부다 똑같이 넣기
        System.out.println("filledArr : " + Arrays.toString(filledArr));

        // sort()
        int[] unsortedArr = {8,2,6,9,1};
        Arrays.sort(unsortedArr);
        System.out.println(Arrays.toString(unsortedArr)); // 오름차순으로 정렬


        // equals(arr1, arr2_
        int[] arr11 = {1,2,3};
        int[] arr22 = {1,2,3};
        int[] arr33 = {4,2,3};

        System.out.println(Arrays.equals(arr11, arr22)); // true
        System.out.println(Arrays.equals(arr11, arr33)); // false

        System.out.println("array11 == array22 : " + (arr11 == arr22));
        System.out.println("array11 == array33 : " + (arr11 == arr33));

        // binarySearch(arr, val) 단 정렬이 되어있는 상태
        int[] sortedArray = {10,20,30,60,90};
        int idx = Arrays.binarySearch(sortedArray, 60);
        System.out.println(idx); // 3
    }
}