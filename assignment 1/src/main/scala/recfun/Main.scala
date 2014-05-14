package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) {
      1
    } else {
      pascal(c - 1, r - 1) + pascal(c, r - 1)
    }

  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def check(chars: List[Char], count: Int): Boolean = {

      if (count < 0) {
        false
      } else {
        chars match {
          case '('::tail =>
            check(tail, count + 1)
          case ')'::tail =>
            check(tail, count - 1)
          case _::tail =>
            check(tail, count)
          case Nil =>
            count == 0
        }
      }
    }
    check(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {

    def count(availableCoins: List[Int], totalSum: Int): Int = {
      if (totalSum > money) {
        0
      } else if (totalSum == money) {
        1
      } else {

        availableCoins match {
          case head :: tail =>
            count(tail, totalSum) + count(availableCoins, totalSum + head)
          case Nil =>
            0
        }
      }

    }

    if (money == 0) {
      0
    } else if (coins.isEmpty) {
      0
    } else {
      count(coins, 0)
    }
  }
}
