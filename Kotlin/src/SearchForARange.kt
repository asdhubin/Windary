/**
 * Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.
 *
 * Your algorithm's runtime complexity must be in the order of O(log n).
 *
 * If the target is not found in the array, return [-1, -1].
 *
 * For example,
 * Given [5, 7, 7, 8, 8, 10] and target value 8,
 * return [3, 4].
 *
 * Accepted.
 */
class SearchForARange {

    fun searchRange(nums: IntArray, target: Int): IntArray {
        val result = intArrayOf(-1, -1)
        if (nums.isEmpty()) {
            return result
        }

        for (i in nums.indices) {
            if (nums[i] == target) {
                result[0] = i
                break
            }
        }

        for (j in nums.indices.reversed()) {
            if (nums[j] == target) {
                result[1] = j
                break
            }
        }

        return result
    }

}
