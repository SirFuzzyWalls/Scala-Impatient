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

  var prod: Long  = 1
  for ch <- "Hello" do prod *= ch.toLong

  println(prod)


  /*
   8. Solve the preceding exercise without writing a loop. (Hint: look at the StringOps Scaladoc)
   */
  prod = 1
  "Hello".foreach(prod *= _.toLong)
  println(prod)

  /*
  9. Write a function product(s:String) that computes the product, as described in the preceding exercises.
  */
  def stringMult (s:String): Long = {
    prod = 1
    s.foreach(prod *= _.toLong)
    prod
  }

  /* 10. Make the function of the preceding exercises a recursive function */
  def recStringMult (s:String): Long = {
    if (s.isEmpty)
      1

    else
      s.head.toLong * recStringMult(s.tail)
  }


  println(recStringMult("Hello"))

  /* 11. Write a function that computes x^n, where n is an integer.
        Use the following recursive definition:
          x^n = y * y if n is even and positive, where y = x^(n/2).
          x^n = x * x^(n-1) if n is odd and positive.
          x^0 = 1
          x^n = 1 / x^(-n) if n is negative.
  */
  def pow (x:Int, n:Int): Double = {
    if n == 0 then 1
    else if n < 0 then 1 / pow(x, -n)
    else if (n % 2 != 0) then x * pow(x, n-1)
    else
      val y = pow(x, n/2)
      y * y
  }
  println(pow(5, 2))
}
