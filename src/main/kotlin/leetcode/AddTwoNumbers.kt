fun twoSum(nums: IntArray, target: Int): IntArray {
    var res= ArrayList<Int>();
    nums.forEachIndexed { index, num ->
        if(nums.contains(target-num)){
            if(nums.indexOf(target-num)!=index) {
                res.add(index)
                res.add(nums.indexOf(target - num))
                return res.toIntArray()
            }
        }
    }
    return res.toIntArray()
}