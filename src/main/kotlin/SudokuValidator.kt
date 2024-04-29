fun validate(board: Array<Array<Int>>): Boolean {
    return when {
        board.notUniqueValuesInRow() -> false
        board.rowIsOneToNine() -> false
        board.allRowsValid() -> false
        board.invalidColumnBecauseOfDuplicate() -> false
        board.invalidBoxes() -> false
        else -> true
    }
}

fun Array<Array<Int>>.notUniqueValuesInRow() = this.all { it.distinct().size != 9 }

fun Array<Array<Int>>.rowIsOneToNine() = this.all { it.contentEquals(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)) }

fun Array<Array<Int>>.allRowsValid() = !this.all { row -> row.rowIsValid() }

fun Array<Int>.rowIsValid() = this.all { number -> ("[1-9]".toRegex().matches(number.toString())) }

fun Array<Array<Int>>.invalidColumnBecauseOfDuplicate(): Boolean {
    for (i in this.indices) {
        if (listOf(
                this[0][i],
                this[1][i],
                this[2][i],
                this[3][i],
                this[4][i],
                this[5][i],
                this[6][i],
                this[7][i],
                this[8][i]
            ).toSet().size != 9
        ) {
            return true
        }
    }
    return false
}

fun Array<Array<Int>>.invalidBoxes(): Boolean {
    for (j in 0..6 step 3) for (i in this.indices step 3) {
        if (listOf(
                this[j][i],
                this[j][i + 1],
                this[j][i + 2],
                this[j + 1][i],
                this[j + 1][i + 1],
                this[j + 1][i + 2],
                this[j + 2][i],
                this[j + 2][i + 1],
                this[j + 2][i + 2]
            ).toSet().size != 9
        ) {
            return true
        }
    }
    return false
}
