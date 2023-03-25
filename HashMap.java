import java.util.*;



public class ClassRoom {
	
	//main class
	public static void main(String[] args) {
		HashMap <String, Integer> map = new HashMap<>();


		map.add("India", 40000);

		map.add("South America", 790);
		map.add("China", 4000);

		map.add("Indonecia", 890);


//System.out.println(map);
		ArrayList<String> keys = map.keySet();
		System.out.print("[");
		for (int i = 0; i < keys.size(); i++) {
			System.out.print("["+keys.get(i) + " = " + map.get(keys.get(i)) + "]");
		}
		System.out.print("]");System.out.println();
		map.remove("India");
		System.out.println(map.get("India"));

	}
	
	//hashmap class
	static class HashMap<K, V> { //generics
		private class Node {
			K key;
			V value;

			Node(K key, V value) {
				this.key = key;
				this.value = value;
			}
		}


		private int n;
		private int N;
		private LinkedList<Node> buckets[];
		//counstruct for HashMap;
		public HashMap() {
			this.N = 4;
			this.buckets = new LinkedList[4];
			for (int i = 0; i < 4; i ++) {
				this.buckets[i] = new LinkedList<>();
			}
		}

//finding bucket index
		private int hashFunc(K key) {
			int bi = Math.abs(key.hashCode()) % N;
			return bi;
		}
//search in ll
		private int search(K keys, int bi) {
			LinkedList<Node>li = buckets[bi];
			for (int i = 0; i < li.size(); i ++) {
				if (li.get(i).key == keys) {
					return i;
				}
			}
			return -1;
		}

		//rehashing
		public void reHash() {

			LinkedList<Node> oldBucket[] = buckets;
			buckets = new LinkedList[N * 2];
			for (int i = 0; i < N * 2; i ++) {
				buckets[i] = new LinkedList<>();
			}

			for (int i = 0; i < oldBucket.length; i++) {
				LinkedList<Node> ll = oldBucket[i];

				for (int j = 0; j < ll.size(); j++) {
					Node node = ll.get(j);
					add(node.key, node.value);
				}
			}

		}
//add
		public void add(K keys, V values) {
			int bi = hashFunc(keys);
			int di = search(keys, bi);

			if (di == -1) {

				buckets[bi].add(new Node(keys, values));

				n++;
			} else {
				Node node = buckets[bi].get(di);
				node.value = values;
			}
//cheaking if our TC is increasing or not
			double lambda = (double)(n / N);

			if (lambda > 2.0) {
				reHash();
			}
		}

		//contains key
		public boolean containsKey(K keys) {
			//cheak If elem is present or not
			int bi = hashFunc(keys);
			int di = search(keys, bi);

			return di != -1;
		}

		//remove elem

		public V remove(K keys) {
			int bi = hashFunc(keys);
			int di = search(keys, bi);

			if (di != -1) {
				//value halal hone ja rahi hai isLiye Bakra
				Node bakra = buckets[bi].remove(di);
				n--;
				return bakra.value;
			}
			return null;
		}

		//get an elem

		public V get(K keyt) {
			int bi = hashFunc(keyt);
			int di = search(keyt, bi);

			if (di != -1) {
				return buckets[bi].get(di).value;
			}

			return null;
		}
		//key set
		ArrayList<K> keySet() {
			ArrayList<K> keys = new ArrayList<>();
			//traverse
			for (int i = 0; i < buckets.length; i ++) {
				LinkedList <Node>l1 = buckets[i];
//traverse in LinkedList
				for (int j = 0; j < l1.size() ; j ++) {
					Node node = l1.get(j);

					keys.add(node.key);
				}
			}
			return keys;
		}
		//is Empty func

		public boolean isEmpty() {
			return n == 0;
		}
	}
}
