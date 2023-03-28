public class Trie {

	static class Node {
		Node[]children;
		boolean eow; //end of word

		Node() {
			children = new Node[26];
			for (int i = 0; i < 26; i ++)children[i] = null;
		}
	}
	static Node root = new Node();
	//add elem

	static void add(String str) { //O(n)
		int level = 0;
		int len = str.length();
		int idx = 0;

		Node curr = root;

		for (; level < len; level ++) {
			idx = str.charAt(level) - 'a';
			if (curr.children[idx] == null) {
				curr.children[idx] = new Node();

			}
			curr = curr.children[idx];
		}
		curr.eow = true;
	}

	//searching elem

	static boolean search(String str) {
        int level = 0;
		int len = str.length();
		int idx = 0;

		Node curr = root;

		for (; level < len; level ++) {
			idx = str.charAt(level) - 'a';
			if(curr.children[idx] == null)return false;
			curr = curr.children[idx];
		}
		return curr.eow == true;
	}
	//main class
	public static void main(String[] args) {
        String [] str = {"string","str","hello","yello","hate","raja"};
        
        for(String st : str){
            add(st);
           
            }
            System.out.println(search("yellow"));
	}
}
