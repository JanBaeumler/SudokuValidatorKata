fun validate(board: Array<Array<Int>>): Boolean {
    return when {
        notUniqueValuesInRow(board) -> false
        rowIsOneToNine(board) -> false
        boardContainsZero(board) -> false
        invalidColumnBecauseOfDuplicate(board) -> false
        invalidBoxes(board) -> false
        else -> true
    }
}

fun notUniqueValuesInRow(board: Array<Array<Int>>): Boolean {
    return board.all { it.distinct().size != 9 }
}

fun rowIsOneToNine(board: Array<Array<Int>>): Boolean {
    return board.all { it.contentEquals(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)) }
}

fun boardContainsZero(board: Array<Array<Int>>): Boolean {
    if(board.all {row -> row.all { number -> ("[1-9]".toRegex().matches(number.toString())) }
    }) {
        return false
    }
    return true
}

fun invalidColumnBecauseOfDuplicate(board: Array<Array<Int>>): Boolean {
    for (i in board.indices) {
        if (listOf(
                board[0][i],
                board[1][i],
                board[2][i],
                board[3][i],
                board[4][i],
                board[5][i],
                board[6][i],
                board[7][i],
                board[8][i]
            ).toSet().size != 9
        ) {
            return true
        }
    }
    return false
}

fun invalidBoxes(board: Array<Array<Int>>): Boolean {
    for (i in board.indices step 3) {
        if (listOf(
                board[i][i],
                board[i][i + 1],
                board[i][i + 2],
                board[i + 1][i],
                board[i + 1][i + 1],
                board[i + 1][i + 2],
                board[i + 2][i],
                board[i + 2][i + 1],
                board[i + 2][i + 2]
            ).toSet().size != 9
        ) {
            return true
        }
    }
    return false
}
