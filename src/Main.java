import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args){
        classicMethod();
        streamMethod();
    }

    public static void classicMethod(){
        System.out.println("classicMethod");
        int[] array = {50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100, 110, 120};
        int count = 0;
        for (int x : array) {
            if (x >= 85) continue;
            x += 3;
            count++;
            if (count > 4) break;
            System.out.println(x);
        }
    }

    public static void streamMethod() {
        System.out.println();
        System.out.println("streamMethod");
        IntStream.of(50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100, 110, 120).filter(x -> x < 90).map(x -> x + 3)
                .limit(4).forEach(System.out::println);
    }
}
