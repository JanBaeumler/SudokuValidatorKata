fun validate(board: Array<Array<Int>>): Boolean {
    return when {
        board.all { it.distinct().size != 9 } -> false
        board.all { it.toSet().size == 1 } -> false
        else -> true
    }
}




