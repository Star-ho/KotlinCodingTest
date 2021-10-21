fun main(){
 twoSum(intArrayOf(2,7,11,15),9).forEach { i->print(i) }
}

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