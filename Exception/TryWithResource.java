package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResource {
    //사용한 뒤에 닫아줘야 하는데 깜빡할때를 대비해서 사용
    public static void main(String[] args) {
        var wrongPath = "./src/sec09/chap04/rabbit.txt"; //존재하지 않는 파일
        openFile1(wrongPath);

    }

    public static void openFile1 ( String path ){  //file로부터 뭔가를 받아옴
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File(path));  //scanner 선언 & 초기화
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e ) {
                    e.printStackTrace();
            System.out.printf("%s파일없음\n",path);
        } finally {
            System.out.println("열었으면 닫아야겠지? ㅎㅎ ");
            if(scanner != null){
                scanner.close(); //이게 없으면 scanner가 메모리에 자리를 차지하게 된다. 언젠가 에러 발생
            }
        }
        }

        public static void openFile2(String path){
        //scanner는 자동적으로 try문 안에서만 사용
            //scanner는 closeable AutoCloseable에서 implement한다
            try (Scanner scanner = new Scanner(new File(path))) {
                while (scanner.hasNextLine()) {
                    System.out.println(scanner.nextLine());
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.out.printf("⚠️ %s 파일 없음%n", path);
            }
        }
    }

