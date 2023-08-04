package List;

import java.util.*;  //util관련된거 전부 import

public class Main {
    public static void main(String[] args) {
        //List - array와 비슷하지만 사이즈 조절이 가능
        ArrayList<Integer> int1 = new ArrayList<>();
        ArrayList<String> str1 = new ArrayList<>();

        int1.add(11);
        int1.add(25);
        int1.add(34);

        int int1Num = int1.get(1); //2번째 element
        int1.set(2,23); //수정 -> (위치,수정할내용)
        int1.add(0,7); //추가 ->(위에 내용들 밀어냄)

        for(var str:"바니 바니 바니 바니 당근 당근".split(" ")){
            str1.add(str);
        }

        //  ⭐️ 간략한 생성 및 초기화 방법들
        ArrayList<Integer> ints2A = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5)
        ); // 💡 Arrays 클래스 : 배열 관련 각종 기능 제공

        ArrayList<Integer> ints2B = new ArrayList<>(
                List.of(1, 2, 3, 4, 5)
        ); // 💡 자바9에서부터 가능

        ArrayList<Integer> ints2C = new ArrayList<>();
        Collections.addAll(ints2C, 1, 2, 3, 4, 5);

        //int1에 있는 값 int2에 넣어서 만든다
        ArrayList<Integer> int2 = new ArrayList<>(int1);

        int2.remove(3); //index로 삭제
        int2.remove((Integer) 25); //element로 삭제

        //  💡 toArray - Object 배열 반환
        Object[] intsAry2_Obj = int1.toArray();

        //  ⭐️ 특정 타입의 배열로 반환하려면?
        //  Integer[] ints1Ary1 = (Integer[]) ints1.toArray(); // ⚠️ 이렇게는 불가
        //  💡 인자로 해당 타입 배열의 생성자를 넣어줌
        //  - 다음 섹션에 배울 메소드 참조 사용 (9-3강 수강 후 다시 볼 것)
        Integer[] ints1Ary2 = int1.toArray(Integer[]::new); // Integer의 생성자라는 뜻

        ArrayList<Integer> attackers = new ArrayList<>();
        //  자주 쓰이지는 않음
        attackers.ensureCapacity(5); // 자리수 미리 확보 -> 자리 모자라면 새로운 곳오로 이사가서 생성하기 때문에 필요
        attackers.trimToSize(); // 남는 자리 없애기 (메모리 회수)

        LinkedList<Character> charLList = new LinkedList<>();

        //  💡 push & pop : 스택 간편하게 구현

        charLList.push('A');
        charLList.push('B');
        charLList.push('C');
        charLList.push('D');
        charLList.push('E');

        char pop1 = charLList.pop();
        char pop2 = charLList.pop();
        char pop3 = charLList.pop();
    }
}
