import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {

		// #1
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(1, "Mango");
		hmap.put(2, "Apple");
		hmap.put(3, "Banana");
		hmap.forEach((k, v) -> System.out.println(k + " : " + v));

		// #2
		Set<Integer> set = new TreeSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		System.out.println(set);

		// #3
		String st = "aaaaaaabbbcc";
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			Integer val = map.get(ch);

			if (val == null) {
				map.put(ch, 1);
			} else {
				map.put(ch, val + 1);
			}
		}
		System.out.println(map);

		// #4
		String str = "aaaaaaabbbcc";
		char c[] = str.toCharArray();
		Set<Character> set1 = new TreeSet<>();
		for (int i = 0; i < c.length; i++) {
			set1.add(c[i]);
		}
		System.out.println(set1);

		// #5
		String str1 = "zyxraqpfsdbfnsdhfwyertrkunxcmvbxk";
		char c1[] = str1.toCharArray();
		Arrays.sort(c1);
		System.out.println(c1);

	}

}