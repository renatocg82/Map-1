package application;

import java.util.Map;
import java.util.TreeMap;

public class AppMap {

	public static void main(String[] args) {

		Map<String, String> cookies = new TreeMap<>();

		cookies.put("username", "Renato");
		cookies.put("email", "renato@gmail.com");
		cookies.put("phone", "99987766");

		cookies.remove("email");

		System.out.println("Cookies are: ");

		for (String key : cookies.keySet()) {

			System.out.println(key + ": " + cookies.get(key));

		}

		System.out.println("--------------");

		cookies.put("email", "renato@gmail.com");

		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
		// TreeMap - sort by ascending order;
		System.out.println("--------------");

		cookies.put("phone", "987654321");

		System.out.println("Key phone replaced!");

		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		cookies.remove("email");
		System.out.println("Email Key removed !!");
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Cookies Map Size: " + cookies.size());

		System.out.println("--------------");

		/*
		 * Since Map does NOT accept same key values, the second "phone" entry will
		 * override the previous one
		 */

		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}
}
