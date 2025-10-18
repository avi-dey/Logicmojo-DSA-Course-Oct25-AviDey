public static List<Integer> two_sum(List<Integer> arr, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.size(); i++) {
        int complement = target - arr.get(i);
        if (map.containsKey(complement)) {
            return Arrays.asList(map.get(complement), i);
        }
        map.put(arr.get(i), i);
    }
    return new ArrayList<>();
}