class TwoSum {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    for ((x, i) <- nums.view.zipWithIndex)
      for ((y, j) <- nums.view.zipWithIndex)
        if (x + y == target && i!=j)
          return Array(i, j)

    return nums
  }
}

