package streams


trait Level extends GameDef with Solver with StringParserTerrain {
    val level =
      """ooo-------
      |oSoooo----
      |ooooooooo-
      |-ooooooooo
      |-----ooToo
      |------ooo-""".stripMargin
     }

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(354); 

  val lvl = new Level {
  	println(neighborsWithHistory(Block(Pos(1, 1), Pos(1, 1)), List(Left, Up)))
  };System.out.println("""lvl  : streams.Level = """ + $show(lvl ))}

  

}Set(
				  (Block(Pos(1, 2), Pos(1, 3)), List(Right, Left, Up)),
				  (Block(Pos(2, 1), Pos(3, 1)), List(Down, Left, Up))))
