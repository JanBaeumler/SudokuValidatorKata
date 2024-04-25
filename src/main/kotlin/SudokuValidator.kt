fun validate(board: Array<Array<Int>>): Boolean {
    return when {
        board.all { it.distinct().size != 9 } -> false
        board.all { it.contentEquals(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)) } -> false
        board.all { it.toSet().size == 1 } -> false
        board.all {it.contains(0)} -> false
        else -> true
    }
}




