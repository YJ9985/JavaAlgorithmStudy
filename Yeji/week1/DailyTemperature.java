class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] ans = new int[temperatures.length];
        for (int day = 0; day < temperatures.length; day++){
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[day] ){
                int prevDay = stack.pop();
                ans[prevDay] = day - prevDay;
            }
            stack.push(day);
        }
        return ans;
    }
}