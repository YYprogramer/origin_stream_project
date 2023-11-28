import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> fruits = List.of("orange", "apple", "banana", "grape");
        //"p"が含まれているフルーツのみを抽出する
        List<String> collectResult = fruits.stream()
                .filter(fruit -> fruit.contains("p"))
                .collect(Collectors.toList());

        //"p"が２個含まれているフルーツのみを抽出する
        List<String> collectDoubleResult = fruits.stream()
                .filter(fruit -> fruit.matches(".*p{2}.*"))
                .collect(Collectors.toList());

        //Listの中身を全て大文字に変換する
        List<String> upperResult = fruits.stream()
                        .map(fruit -> fruit.toUpperCase())
                                .collect(Collectors.toList());

        System.out.println(collectResult);
        System.out.println(collectDoubleResult);
        System.out.println(upperResult);
    }
}