object ch2 extends App {
  //5. the signum of a number is 1 if the number is positive, -1 if it is negative and 0 if it is zero.
  //  Write a function that computes this value

  def signum(x:Int): Int = {
    if (x < 0 ) -1
    else if (x > 1) 1
    else 0
  }

  /*
  6. Write a function countdown(n:Int) that prints the numbers from n to 0 without returning a value.
  */
  def countdown(n:Int): Unit = {
    for i <- n.to(0, -1) do
      println(i)
  }
  countdown(15)

  /*
  7. Write a for loop for computing the product of the Unicode codes of all letters in a string.
    For example, the product of the characters  in "Hello" is 9415087488l
  */

}
