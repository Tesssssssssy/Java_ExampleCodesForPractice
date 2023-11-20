package SelfStudy.List;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new LinkedList<String>();
        List<String> list3 = new Vector<String>();
        List<String> list4 = new Stack<String>();


        // List에서 값 추가할 때 add 사용
        list1.add("홍길동");
        list1.add("박길동");
        list1.add("김길동");
        list1.add(new String("최길동"));

        for (String list : list1) {
            System.out.println(list);
        }

        /*
            홍길동
            박길동
            김길동
            최길동
        */

        System.out.println();

        list1.add(1, "1번째 index 값");

        for (String list : list1) {
            System.out.println(list);
        }

        /*
            홍길동
            1번째 index 값
            박길동
            김길동
            최길동

            1번 쨰 index에 "1번째 index 값"을 add하니까
            원래 1번 index였던 "박길동"이 2번 index로 이동
            (데이터 교체가 아니라 한 칸씩 밀림)
        */

        System.out.println();

        // List에서 값 가져올 때 get 사용

        // index를 통한 조회
        String elem1 = list1.get(0);
        String elem2 = list1.get(1);
        String elem3 = list1.get(2);
        String elem4 = list1.get(3);

        System.out.println("index를 통한 List 조회");
        System.out.println("elem1 = " + elem1);
        System.out.println("elem2 = " + elem2);
        System.out.println("elem3 = " + elem3);
        System.out.println("elem4 = " + elem4);
        System.out.println();

        // iterator를 통한 조회
        Iterator<String> iterator = list1.iterator();

        System.out.println("Iterator를 통한 List 조회");
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        System.out.println();

        // for-loop를 통한 조회
        System.out.println("for-loop를 통환 List 조회");
        for (Object object : list1) {
            String element = (String) object;
            System.out.println(element);
        }

        System.out.println();
        System.out.println(list1.contains("조길동"));      // false

        System.out.println();

        // 원하는 데이터의 앞에 값을 추가하고 싶을 때
        int index = list1.indexOf("박길동");
        list1.add(index, "박길동 앞");
        System.out.println(list1);                        // [홍길동, 1번째 index 값, 박길동 앞, 박길동, 김길동, 최길동]

    }
}

