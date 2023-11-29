package _06_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEX {
    public static void main(String[] args){
        Set<String> set1 = new HashSet<>();

        set1.add("banana");
        set1.add("apple");
        set1.add("kiwi");
        set1.add("orange");
        set1.add("banana");
        System.out.println(set1);

        // 지정된 개수 출력
        System.out.println(set1.size() +" 종류의 과일이 있습니다");

        /////////////////////////
        Set<Course> set2 = new HashSet<>();

        Course java = new Course(101,"java");
        Course js1 = new Course(102,"JavaScript");
        Course js2 = new Course(102, "JavaScript");

        System.out.println(java.hashCode());
        System.out.println(js1.hashCode());
        System.out.println(js2.hashCode());
        
        set2.add(java);
        set2.add(js1);
        set2.add(js2);

        System.out.println(set2.size() + " 종류의 과목이 있습니다");

        // case2. iterator() 메소드로 반복자를 얻어서 객체 하나씩 가져오기
        Iterator<Course> iterator = set2.iterator();
        while(iterator.hasNext()){
            Course o = iterator.next();
            System.out.println(o);
        }
    }
}

