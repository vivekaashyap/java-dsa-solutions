class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = 0;
        for(int i: candies){
            max = Math.max(max, i);
        }
        for(int i: candies){
            list.add(extraCandies+i >= max);
        }
        return list;
    }
}