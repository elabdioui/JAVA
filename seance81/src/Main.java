public class Main {
    public static void main(String[] args) {

        Trie trie = new Trie();

        trie.insert("Alaa");
        trie.insert("haitham");
        trie.insert("haha");
        trie.insert("elabdioui");
        trie.insert("samir");


        trie.Affiche();
        System.out.println("-----------------------------------------");
        trie.trierParAlpha();
        trie.Affiche();








    }
}