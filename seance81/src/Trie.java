import java.util.*;
import java.util.function.Consumer;

public class Trie {

    private List<String> list = new ArrayList();
    public Trie() {
        this.list = new LinkedList<>();
    }
    public void insert(String word) {
        list.add(word);
    }

    public void trierParAlpha() {

        Collections.sort(list, (o1, o2) -> CharSequence.compare(o2,o1));

    }

    public void Affiche() {
        list.forEach(s->System.out.println(s));




    }
}




