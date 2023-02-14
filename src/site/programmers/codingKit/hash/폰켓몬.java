package site.programmers.codingKit.hash;

import java.util.HashSet;

public class 폰켓몬 {
    public int solution(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            hashSet.add(nums[i]);
        }

        if(hashSet.size() >= nums.length / 2){
            return nums.length / 2;
        }

        return hashSet.size();
    }
}
