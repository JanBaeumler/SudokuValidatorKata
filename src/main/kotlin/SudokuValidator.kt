fun validate(board: Array<Array<Int>>): Boolean {
    return when {
        board.all { it.distinct().size != 9 } -> false
        else -> true
    }
}




