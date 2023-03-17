import scala.collection.mutable.ArrayBuffer
import scala.util.Sorting

object ch3 extends App {
  import scala.math


  /*1. Write a code snipped that sets a to an array of n random integers between 0 (inclusive) and n(exclusive)*/
  var n = 5
  var r = scala.util.Random
  var nums = Array.ofDim[Int](n)
  for i <- 0 until nums.length do
    nums(i) = r.nextInt(n-1)


  /*2. Write a loop that swaps adjacent elements of an array of integers. For example, Array(1, 2, 3, 4, 5) becomes
  *     Array(2, 1, 4, 3, 5)*/
  var arr = Array(1,2,3,4,5)
    for (i <- 1.until(arr.length).by(2))
      var temp = arr(i)
      arr(i) = arr(i-1)
      arr(i-1) = temp


/*3. Repeat the preceding assignment, but produce a new array with the swapped values. Use for/yield */
  for i <- 1.until(arr.length).by(2) yield
    var temp = arr(i)
    arr(i) = arr(i-1)
    arr(i-1) = temp

  /*4. Given an array of integers, produce a new array that contains all positive values of the original array,
  *   in their original order, */
  def positive(a: Array[Int]): Array[Int] = for i <- a if i > 0 yield i


  /*5. How do you compute the average of an Array[Double]? */
  def average(a: Array[Double]): Double = a.sum / a.length

  /*6.How do you rearrange the elements of an Array[Int] so that they appear in reverse sorted order?
  * How do you do the same with an ArrayBuffer[Int] */
  def reverseSort(a:Array[Int]): Array[Int] = {
    Sorting.quickSort(a)
    a.reverse
  }
  def reverseSortBuff(buff:ArrayBuffer[Int]): ArrayBuffer[Int] = {
    val ar: Array[Int]= reverseSort(buff.toArray)
    val buf: ArrayBuffer[Int] = ArrayBuffer(ar.toSeq:_*)
    buf
  }
  /*7. Write a code snippet that produces all values from an array with duplicates removed*/
}


