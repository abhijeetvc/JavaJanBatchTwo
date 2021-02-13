import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreams {

    public static void main(String[] args) {

        List<String> list= Arrays.asList("b","a","c","d","e");

        List<String> newList=list.stream()
                .map(str->str.toUpperCase())
                .sorted().collect(Collectors.toList());
        System.out.println(newList);
    }
}
// streams: two types of operations
// a) intermediate operations (e.g filter(),map())
// b) terminal operations (e.g forEach())