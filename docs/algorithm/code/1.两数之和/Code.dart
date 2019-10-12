main() {
  print(twoSum([1, 2, 3, 4, 5, 7], 9));
}

List<int> twoSum(List<int> nums, int target) {
  if (nums == null || nums.length < 2) return [];
  for (int i = 0; i < nums.length; i++) {
    for (var j = i + 1; i < nums.length; i++) {
      if(target == nums[i] + nums[j]){
        return [i,j];
      }
    }
  }
  return [];
}

List<int> twoSum2(List<int> nums, int target) {
  if (nums == null || nums.length < 2) return [];
  Map<int, int> map = {};
  for (int i = 0; i < nums.length; i++) {
    int complement = target - nums[i];
    if (map.containsKey(complement)) {
      return [map[complement], i];
    }
    map[nums[i]] = i;
  }
  return [];
}
