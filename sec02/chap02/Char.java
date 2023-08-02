package sec02.chap02;

public class Char {
    public static void main(String[] args){
    boolean bool1 = !((5/2)==2.5);
    //IJ에서 true라는 것 보여준다

    int num1 = 3;
    char num1OE = num1%2 == 1 ? '홀' : '짝';
    //조건문으로 홀짝 구분하는 방법
    // ? a : b ?
    //     : c    이런경우 a가 false일때 ?뒤에 있는 전부를 가르킨다

    String h1 = "hello"; String h2="hello";
    boolean bool2= h1 == h2; //false나온다
    //같다는 것을 확인하려면 equal이라는 것을 사용
    //equalsIgnoreCase -> 대소문자 구분없이 비교
    boolean bool3 = h1.equals(h2);
    String h3 = h2 ; //h3에 h2가 가지고 있는것을 넣는것이 아니라
    //h3에 h2에 있는 값의 위치를 넣는것
    //String들의 +는 이어 붙인것이다

    String st1 = String.valueOf(123); //123의 문자열 값을 st1에 반환해라
    String st2= 123.45 + "";  //123.45의 문자열값 st2에 저장

    String st3="ABCDEFG";
    char ch1=st3.charAt(0); //charAt은 몇번째 문자열을 반환하라는 뜻

    //isEmpty ->문자열 길이가 0인지
    //isBlank ->공백을 제외한 문자열 길이가 0인지
    String st4=" \t\n";
    boolean bool4 = st4.isBlank();  //true
    //trim -> 공백제거

    //indexOf("a") -> a있는 숫자 반환
    String str2 = "얄리 얄리 얄라성 얄라리 얄라";
    int init1=str2.indexOf("얄",4); //6
    //lastIndexOf -> 마지막에 등장하는 위치
    //없으면 -1 반환

    //startsWith("", 4) -> 해당 위치에서 해당 문자열로 시작하는지
    //endsWith("") -> 해당 문장열로 끝나는지
    boolean boo1 = str2.startsWith("얄리",3); //true
    boolean boo2 = str2.endsWith("얄라"); //true

    //compareTo -> 문자열 얼마나 다른지 반환, 같으면 0반환
    //시작이 같으면 글자길이 차이 반환, 시작이 다르면 첫 글자의 정수값 차이 반환
    String str3 = "얄리";
    String str4 = "리얄";
    int intcomp1 = str2.compareTo(str3); //14
         System.out.println(str2.compareTo(str4)); //3032
    //숫자가 클수록 사전 순으로 나중에 온다

    //concat -> 문자열을 이어붙임
    String str_a1 = "슉-";
    String str_a2 = "슈슉-";
    String str_a3 = "슈슈슉-";
    String str_a4 = str_a1
                    .concat(str_a2)
                    .concat(str_a3)
                    .concat(str_a2);
    //슉-슈슉-슈슈슉-슈슉-
    //+와 concat의 차이점 -> concat은 문자열만 이어붙일 수 있다
    //concat은 새로 이어붙일때마다 새로운 메모리를 생성해서 비효율적

    //substring( 4, 10 ) -> 4번 10번 사이 문자열 잘라서 반환
    String piece1 = "얄리";
    String piece2 = "얄라";
    String piece3=str2.substring(str2.indexOf(piece1), str2.indexOf(piece2)+piece2.length()); //얄리 얄리 얄라

    //replace("a","b"); -> a를 b로 바꾼다
    //split("") -> 주어진 기준으로 분할해 문자열로 반환
    }
}
