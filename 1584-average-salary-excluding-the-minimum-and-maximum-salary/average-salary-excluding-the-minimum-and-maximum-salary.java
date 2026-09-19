class Solution {
    public double average(int[] salary) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, s = 0;
        for (int i = 0; i < salary.length; i++) {
            min = Math.min(salary[i], min);
            max = Math.max(salary[i], max);
            s += salary[i];
        }
        return (double) (s - min - max) / (salary.length - 2);
    }
}