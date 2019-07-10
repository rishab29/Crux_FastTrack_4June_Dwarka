package Lecture20;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tries trie = new Tries();
		trie.add("art");
		trie.add("arts");
		trie.add("bug");
		trie.add("boy");
		trie.add("see");
		trie.add("sea");

		trie.add("seen");

		trie.display();

		System.out.println(trie.Search("art"));
		System.out.println(trie.Search("artist"));

		trie.displayAsTree();
		System.out.println("***************");
		trie.remove("art");
		trie.displayAsTree();
		System.out.println("***************");
		trie.remove("arts");
		trie.displayAsTree();

	}

}
