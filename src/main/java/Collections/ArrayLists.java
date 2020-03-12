package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if (list1 == null || list1.size() == 0) {
        	return list2;
        }
        if (list2 == null || list2.size() == 0) {
        	return list1;
        }
        for (Integer i : list2) {
        	list1.add(i);
        }
        return list1;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int res = 0;
        for (int i : list1) {
        	res += i;
        }
        for (int i : list2) {
        	res += i;
        }
        return res;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
        if (original == null || original.size() == 0) {
        	return original;
        }
        int slow = 0;
        for (int fast = 0; fast < original.size(); fast++) {
        	if (!original.get(fast).equals(toRemove)){
        		original.set(slow++,original.get(fast));
        	}
        }
        for (int i = original.size(); i < slow; i--) {
        	original.remove(original.size() - 1);
        }
        return original;
    }

    public boolean happyList(ArrayList<String> original) {
//    	if (original == null || original.size() < 1) {
//    		return false;
//    	}
    	for (int i = 0; i < original.size() - 1; i++) {
    		if (!checkHappy(original.get(i), original.get(i + 1))) {
    			return false;
    		}
    	}
    	return true;
    }
    
    private boolean checkHappy(String a, String b) {
    	Set<Character> set = new HashSet<Character>();
    	for (int i = 0; i < a.length(); i++) {
    		set.add(a.charAt(i));
    	}
    	for (int i = 0; i < b.length(); i++) {
    		if (set.contains(b.charAt(i))) {
    			return true;
    		}
    	}
    	return false;
    }
}
