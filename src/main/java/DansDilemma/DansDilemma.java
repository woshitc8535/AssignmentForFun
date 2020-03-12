package DansDilemma;

import java.util.HashSet;
import java.util.Set;

public class DansDilemma {

    public Integer dilemmaOfTwo(Double input1, Double input2) {
        return helper(input1, input2).size();

    }

    public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {
        return dilemmaOfN(input1, input2, input3);
    }

    public Integer dilemmaOfN(Double... args){
        Set<Double> res = new HashSet<Double>();
        for (int i = 0; i < args.length - 1; i++) {
        	for (int j = i + 1; j < args.length; j++) {
        		Set<Double> temp = helper(args[i], args[j]);
        		addNew(res, temp);
        	}
        }
        return res.size();
    }
    private Set<Double> helper(Double input1, Double input2) {
        Set<Double> set = new HashSet<Double>();
        set.add(input1 + input2);
        set.add(input1 * input2);
        set.add(input1 - input2);
        set.add(input2 - input1);
        if (input2 != 0) {
            set.add(input1 / input2);
        }
        if (input1 != 0) {
            set.add(input2 / input1);
        }
        return set;
    }
    private Set<Double> addNew(Set<Double> set1, Set<Double> set2) {
        for (Double num : set2) {
            set1.add(num);
        }
        return set1;
    }
}
