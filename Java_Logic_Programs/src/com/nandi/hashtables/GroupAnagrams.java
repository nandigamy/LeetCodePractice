package com.nandi.hashtables;	import java.util.*;


public class GroupAnagrams {

	static List<List<String>> groupAnagrams(String[] strings) {

		HashMap<String, List<String>> charMap = new HashMap<>();
		List<List<String>> result = new ArrayList<>();

		for (String str : strings) {
			if (charMap.containsKey(sorted(str))) {
				charMap.get(sorted(str)).add(str);
				
			} else {
				charMap.put(sorted(str), new ArrayList<>());
				charMap.get(sorted(str)).add(str);
			}

		}

		result.addAll(charMap.values());
		System.out.println(result.toString());

		return result;
	}

	 static String sorted(String str) {

		char[] ch = str.toCharArray();
		Arrays.sort(ch);

		String sorted = new String(ch);
		return sorted;
	}

		public static void main(String[] args) {
	        System.out.println("1st set:");
	        System.out.println(groupAnagrams(new String[]{"eat", "tea", "ate" }));
	        
	        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

	        System.out.println("\n2nd set:");
	        System.out.println(groupAnagrams(new String[]{"abc", "cba", "bac", "foo", "bar"}));

	        System.out.println("\n3rd set:");
	        System.out.println(groupAnagrams(new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"}));

	        /*
	            EXPECTED OUTPUT:
	            ----------------
	            1st set:
	            [[eat, tea, ate], [tan, nat], [bat]]

	            2nd set:
	            [[abc, cba, bac], [foo], [bar]]

	            3rd set:
	            [[listen, silent], [triangle, integral], [garden, ranged]]

	        */
	        
	    }

		
	    
	}

	

