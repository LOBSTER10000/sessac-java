package _06_collections;

//Map 컬렉션
// - key, value => entry
// - 키는 중복x , 밸류는 중복 o
// - 기존에 저장딘 키와 동일한 키로 값을 저장하면?
// - 기존 값이 새로운 값으로 대체 됨

import java.util.*;
import java.util.Map.Entry;

public class HashMapEx {
    public static void main(String[] args){
        // key(id), value(name) HashMap

        // Map 컬렉션 생성
        Map<Integer, String> map = new HashMap<>();

        map.put(3,"허허");
        map.put(1,"허난설헌");
        map.put(2,"홍길동");
        map.put(4,"허허");
        map.put(1,"야호");

        System.out.println(map.size());

        System.out.println(map.get(1));

        // 키와 값으로 구성된 모든 Map.Entry 객체들을 Set에 담음
        Set<Entry<Integer, String>> h1 = map.entrySet();
        System.out.println(h1);

        // iterator로 반복
        Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Entry<Integer, String> entry = iterator.next();
            Integer k = entry.getKey();
            String v = entry.getValue();
            System.out.println(k + " , " + v);
        }

        // 키에 대한 Set 컬렉션
        Set<Integer> keySet = map.keySet();
        System.out.println(keySet);

        map.forEach((k,v)->{
            System.out.println(k + v);
        });
    }
}
