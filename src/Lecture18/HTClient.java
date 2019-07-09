package Lecture18;

public class HTClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Hashtable<String, Integer> map = new Hashtable<>(4);
		map.put("India", 300);
		map.display();

		map.put("Russia", 250);
		map.put("UK", 225);
		map.display();
		map.put("China", 325);
		map.put("USA", 175);
		map.display();
//		map.put("India", 320);
//		map.display();

//		System.out.println(map.get("USA"));
//		System.out.println(map.get("RSA"));

//		map.remove("USA");
//		map.remove("Russia");
//		map.display();

	}

}
