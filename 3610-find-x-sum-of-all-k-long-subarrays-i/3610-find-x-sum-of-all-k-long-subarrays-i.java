
class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] result = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            // 1️⃣ Build frequency map for current window
            Map<Integer, Integer> freq = new HashMap<>();
            for (int j = i; j < i + k; j++) {
                freq.put(nums[j], freq.getOrDefault(nums[j], 0) + 1);
            }

            // 2️⃣ Convert map to list of pairs
            List<int[]> list = new ArrayList<>();
            for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
                list.add(new int[]{e.getKey(), e.getValue()}); // {value, freq}
            }

            // 3️⃣ Sort by frequency DESC, then value DESC
            Collections.sort(list, (a, b) -> {
                if (b[1] != a[1]) return b[1] - a[1]; // freq desc
                return b[0] - a[0]; // value desc
            });

            // 4️⃣ Take top x elements (or all if < x)
            int sum = 0;
            for (int idx = 0; idx < Math.min(x, list.size()); idx++) {
                int value = list.get(idx)[0];
                int freqVal = list.get(idx)[1];
                sum += value * freqVal;
            }

            // 5️⃣ Store result
            result[i] = sum;
        }

        return result;
    }
}
