import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "This is a java book.",
                "Hello Java!",
                "Expressions not expressed",
                "jajajajava"
        );
        list.stream().filter(s -> s.toLowerCase().contains("java"))
                .forEach(System.out::println);
    }
}