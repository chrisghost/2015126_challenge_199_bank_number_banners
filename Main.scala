object Main extends App {
  val n  = (" _     _  _     _  _  _  _  _ " + "| |  | _| _||_||_ |_   ||_||_|" + "|_|  ||_  _|  | _||_|  ||_| _|").grouped(3).toList.grouped(10).toList.transpose
  println("000000000\n111111111\n490067715".split('\n').toList
    .map {
      line => {
        line.map(c => c.toString.toInt).toList.map(x => n(x)).transpose.map(_.mkString).mkString("\n")
      }.mkString
    }.mkString("\n")
  )
}
