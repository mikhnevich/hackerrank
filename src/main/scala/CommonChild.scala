import scala.annotation.tailrec

/**
 * https://www.hackerrank.com/challenges/common-child
 *
Given two strings a and b of equal length, what's the longest string (S) that can be constructed such that S is a child of both a and b.

A string x is said to be a child of a string y, if x can be formed by deleting 0 or more characters from y

Input format

Two strings a and b with a newline separating them

Constraints

All characters are upper-cased and lie between ASCII values 65-90. The maximum length of the strings is 5000.

Output format

Length of the string S

Sample Input #0

HARRY
SALLY
Sample Output #0

2
The longest possible subset of characters that is possible by deleting zero or more characters from HARRY and SALLY is AY, whose length is 2.

Sample Input #1

AA
BB
Sample Output #1

0
AA and BB has no characters in common and hence the output 0

Sample Input #2

SHINCHAN
NOHARAAA
Sample Output #2

3
The largest set of characters, in order, between SHINCHAN and NOHARAAA is NHA.

Sample Input #3

ABCDEF
FBDAMN
Sample Output #3

2
BD will be optimal substring.

 */
object CommonChild {
  def main(args: Array[String]) {
    val st1 = "HYRRA" //readLine()
    val st2 = "SALLY" //readLine()
    val m1 = times(st1.toList).toMap
    val m2 = times(st2.toList).toMap
    val common = m1.map { case (char, count) =>
      val anotherCount = m2.getOrElse(char, 0)
      (char, Math.min(count, anotherCount))
    }.filter(p => p._2 > 0)
    val st1Common = st1.toList.filter(common.contains)
    val st2Common = st2.toList.filter(common.contains)

    println(st1Common)
    println(st2Common)
  }

  def times(chars: List[Char]): List[(Char, Int)] = chars match {
    case Nil => Nil
    case x :: xs =>
      val (fst, snd) = chars.partition(_ == x)
      List((x, fst.length)) ++ times(snd)
  }

  def commonChild(st1: String, st2: String): String = {
    if (st1 == st2) {
      st1
    } else {
      for (i <- 0 to st1.length) {

      }
    }
    ""
  }
}
