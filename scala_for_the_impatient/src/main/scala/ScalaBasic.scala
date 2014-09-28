import scala.math._


object ScalaBasic {
  /*
  Вычислить квадратный корень из 3, а затем
  возвести результат в квадрат
   */
  def task2 = pow(sqrt(3), 2)

  /*
   * Умножить строку 'crazy' на 3
   */
  def task4 = "crazy" * 3

  /*
   * Используя число типа BigInt
   * вычислите 2 в степени 1024
   */
  def task6 = BigInt(2).pow(1024)

  def getFirstLetter(s: String) = s.headOption.getOrElse("")

  def getLastLetter(s: String) = s.lastOption.getOrElse("")
}