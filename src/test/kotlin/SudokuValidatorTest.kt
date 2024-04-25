import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MissingLetterTests {

    @Test
    fun `valid sudoku 1`() {
        val board = arrayOf(
            arrayOf(5, 3, 4, 6, 7, 8, 9, 1, 2),
            arrayOf(6, 7, 2, 1, 9, 5, 3, 4, 8),
            arrayOf(1, 9, 8, 3, 4, 2, 5, 6, 7),
            arrayOf(8, 5, 9, 7, 6, 1, 4, 2, 3),
            arrayOf(4, 2, 6, 8, 5, 3, 7, 9, 1),
            arrayOf(7, 1, 3, 9, 2, 4, 8, 5, 6),
            arrayOf(9, 6, 1, 5, 3, 7, 2, 8, 4),
            arrayOf(2, 8, 7, 4, 1, 9, 6, 3, 5),
            arrayOf(3, 4, 5, 2, 8, 6, 1, 7, 9)
        )
        assertEquals(true, validate(board))
    }

    @Test
    fun `all are 5`() {
        val board = arrayOf(
            arrayOf(5, 5, 5, 5, 5, 5, 5, 5, 5),
            arrayOf(5, 5, 5, 5, 5, 5, 5, 5, 5),
            arrayOf(5, 5, 5, 5, 5, 5, 5, 5, 5),
            arrayOf(5, 5, 5, 5, 5, 5, 5, 5, 5),
            arrayOf(5, 5, 5, 5, 5, 5, 5, 5, 5),
            arrayOf(5, 5, 5, 5, 5, 5, 5, 5, 5),
            arrayOf(5, 5, 5, 5, 5, 5, 5, 5, 5),
            arrayOf(5, 5, 5, 5, 5, 5, 5, 5, 5),
            arrayOf(5, 5, 5, 5, 5, 5, 5, 5, 5)
        )
        assertEquals(false, validate(board))
    }

    @Test
    fun `all rows are 1 - 9`() {
        val board = arrayOf(
            arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9),
            arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9),
            arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9),
            arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9),
            arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9),
            arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9),
            arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9),
            arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9),
            arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        )
        assertEquals(false, validate(board))
    }

    @Test
    fun `all columns are 1 - 9`() {
        val board = arrayOf(
            arrayOf(1, 1, 1, 1, 1, 1, 1, 1, 1),
            arrayOf(2, 2, 2, 2, 2, 2, 2, 2, 2),
            arrayOf(3, 3, 3, 3, 3, 3, 3, 3, 3),
            arrayOf(4, 4, 4, 4, 4, 4, 4, 4, 4),
            arrayOf(5, 5, 5, 5, 5, 5, 5, 5, 5),
            arrayOf(6, 6, 6, 6, 6, 6, 6, 6, 6),
            arrayOf(7, 7, 7, 7, 7, 7, 7, 7, 7),
            arrayOf(8, 8, 8, 8, 8, 8, 8, 8, 8),
            arrayOf(9, 9, 9, 9, 9, 9, 9, 9, 9)
        )
        assertEquals(false, validate(board))
    }

    @Test
    fun `valid sudoku 2`() {
        val board = arrayOf(
            arrayOf(1, 3, 2, 5, 7, 9, 4, 6, 8),
            arrayOf(4, 9, 8, 2, 6, 1, 3, 7, 5),
            arrayOf(7, 5, 6, 3, 8, 4, 2, 1, 9),
            arrayOf(6, 4, 3, 1, 5, 8, 7, 9, 2),
            arrayOf(5, 2, 1, 7, 9, 3, 8, 4, 6),
            arrayOf(9, 8, 7, 4, 2, 6, 5, 3, 1),
            arrayOf(2, 1, 4, 9, 3, 5, 6, 8, 7),
            arrayOf(3, 6, 5, 8, 1, 7, 9, 2, 4),
            arrayOf(8, 7, 9, 6, 4, 2, 1, 5, 3)
        )
        assertEquals(true, validate(board))
    }

    @Test
    fun `valid sudoku 3`() {
        val board = arrayOf(
            arrayOf(7, 8, 4, 1, 5, 9, 3, 2, 6),
            arrayOf(5, 3, 9, 6, 7, 2, 8, 4, 1),
            arrayOf(6, 1, 2, 4, 3, 8, 7, 5, 9),
            arrayOf(9, 2, 8, 7, 1, 5, 4, 6, 3),
            arrayOf(3, 5, 7, 8, 4, 6, 1, 9, 2),
            arrayOf(4, 6, 1, 9, 2, 3, 5, 8, 7),
            arrayOf(8, 7, 6, 3, 9, 4, 2, 1, 5),
            arrayOf(2, 4, 3, 5, 6, 1, 9, 7, 8),
            arrayOf(1, 9, 5, 2, 8, 7, 6, 3, 4)
        )
        assertEquals(true, validate(board))
    }

    @Test
    fun `valid sudoku 4`() {
        val board = arrayOf(
            arrayOf(9, 2, 6, 5, 8, 3, 4, 7, 1),
            arrayOf(7, 1, 3, 4, 2, 6, 9, 8, 5),
            arrayOf(8, 4, 5, 9, 7, 1, 3, 6, 2),
            arrayOf(3, 6, 2, 8, 5, 7, 1, 4, 9),
            arrayOf(4, 7, 1, 2, 6, 9, 5, 3, 8),
            arrayOf(5, 9, 8, 3, 1, 4, 7, 2, 6),
            arrayOf(6, 5, 7, 1, 3, 8, 2, 9, 4),
            arrayOf(2, 8, 4, 7, 9, 5, 6, 1, 3),
            arrayOf(1, 3, 9, 6, 4, 2, 8, 5, 7)
        )
        assertEquals(true, validate(board))
    }

    @Test
    fun `valid sudoku 5`() {
        val board = arrayOf(
            arrayOf(7, 1, 5, 6, 2, 3, 8, 4, 9),
            arrayOf(6, 2, 4, 8, 1, 9, 3, 7, 5),
            arrayOf(3, 9, 8, 7, 4, 5, 6, 2, 1),
            arrayOf(5, 3, 9, 2, 7, 6, 4, 1, 8),
            arrayOf(4, 6, 2, 1, 9, 8, 5, 3, 7),
            arrayOf(8, 7, 1, 5, 3, 4, 9, 6, 2),
            arrayOf(2, 5, 3, 9, 6, 7, 1, 8, 4),
            arrayOf(1, 8, 6, 4, 5, 2, 7, 9, 3),
            arrayOf(9, 4, 7, 3, 8, 1, 2, 5, 6)
        )
        assertEquals(true, validate(board))
    }

    @Test
    fun `valid sudoku 6`() {
        val board = arrayOf(
            arrayOf(7, 8, 3, 4, 5, 6, 1, 2, 9),
            arrayOf(6, 9, 2, 1, 8, 7, 3, 4, 5),
            arrayOf(1, 4, 5, 2, 3, 9, 6, 7, 8),
            arrayOf(8, 1, 7, 3, 6, 2, 9, 5, 4),
            arrayOf(5, 6, 4, 7, 9, 8, 2, 1, 3),
            arrayOf(3, 2, 9, 5, 4, 1, 8, 6, 7),
            arrayOf(4, 7, 6, 8, 2, 3, 5, 9, 1),
            arrayOf(9, 3, 1, 6, 7, 5, 4, 8, 2),
            arrayOf(2, 5, 8, 9, 1, 4, 7, 3, 6)
        )
        assertEquals(true, validate(board))
    }

    @Test
    fun `valid sudoku 7`() {
        val board = arrayOf(
            arrayOf(1, 7, 3, 2, 6, 8, 9, 5, 4),
            arrayOf(4, 2, 5, 1, 9, 3, 7, 6, 8),
            arrayOf(8, 6, 9, 7, 4, 5, 1, 2, 3),
            arrayOf(6, 1, 2, 8, 3, 7, 4, 9, 5),
            arrayOf(3, 9, 8, 4, 5, 6, 2, 1, 7),
            arrayOf(5, 4, 7, 9, 1, 2, 3, 8, 6),
            arrayOf(9, 5, 4, 3, 8, 1, 6, 7, 2),
            arrayOf(2, 3, 6, 5, 7, 9, 8, 4, 1),
            arrayOf(7, 8, 1, 6, 2, 4, 5, 3, 9)
        )
        assertEquals(true, validate(board))
    }

    @Test
    fun `valid sudoku 8`() {
        val board = arrayOf(
            arrayOf(8, 4, 7, 2, 6, 5, 1, 9, 3),
            arrayOf(1, 3, 6, 7, 9, 8, 2, 4, 5),
            arrayOf(9, 5, 2, 1, 4, 3, 8, 6, 7),
            arrayOf(4, 2, 9, 6, 7, 1, 5, 3, 8),
            arrayOf(6, 7, 8, 5, 3, 2, 9, 1, 4),
            arrayOf(3, 1, 5, 4, 8, 9, 7, 2, 6),
            arrayOf(5, 6, 4, 9, 1, 7, 3, 8, 2),
            arrayOf(7, 8, 1, 3, 2, 4, 6, 5, 9),
            arrayOf(2, 9, 3, 8, 5, 6, 4, 7, 1)
        )
        assertEquals(true, validate(board))
    }

    @Test
    fun `invalid because of 0 instead of 9`() {
        val board = arrayOf(
            arrayOf(8, 4, 7, 2, 6, 5, 1, 0, 3),
            arrayOf(1, 3, 6, 7, 0, 8, 2, 4, 5),
            arrayOf(0, 5, 2, 1, 4, 3, 8, 6, 7),
            arrayOf(4, 2, 0, 6, 7, 1, 5, 3, 8),
            arrayOf(6, 7, 8, 5, 3, 2, 0, 1, 4),
            arrayOf(3, 1, 5, 4, 8, 0, 7, 2, 6),
            arrayOf(5, 6, 4, 0, 1, 7, 3, 8, 2),
            arrayOf(7, 8, 1, 3, 2, 4, 6, 5, 0),
            arrayOf(2, 0, 3, 8, 5, 6, 4, 7, 1)
        )
        assertEquals(false, validate(board))
    }

    /*@Test
    fun `invalid because of duplicate 3 in eighth column`() {
        val board = arrayOf(
            arrayOf(1, 3, 2, 5, 7, 9, 4, 6, 8),
            arrayOf(4, 9, 8, 2, 6, 1, 3, 7, 5),
            arrayOf(7, 5, 6, 3, 8, 4, 2, 1, 9),
            arrayOf(6, 4, 3, 1, 5, 8, 7, 9, 2),
            arrayOf(5, 2, 1, 7, 9, 3, 8, 4, 6),
            arrayOf(9, 8, 7, 4, 2, 6, 5, 3, 1),
            arrayOf(2, 1, 4, 9, 3, 5, 6, 8, 7),
            arrayOf(3, 6, 5, 8, 1, 7, 9, 2, 4),
            arrayOf(8, 7, 9, 6, 4, 2, 1, 3, 5)
        )
        assertEquals(false, validate(board))
    }*/

    /*@Test
    fun `invalid boxes`() {
        val board = arrayOf(
            arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9),
            arrayOf(2, 3, 4, 5, 6, 7, 8, 9, 1),
            arrayOf(3, 4, 5, 6, 7, 8, 9, 1, 2),
            arrayOf(4, 5, 6, 7, 8, 9, 1, 2, 3),
            arrayOf(5, 6, 7, 8, 9, 1, 2, 3, 4),
            arrayOf(6, 7, 8, 9, 1, 2, 3, 4, 5),
            arrayOf(7, 8, 9, 1, 2, 3, 4, 5, 6),
            arrayOf(8, 9, 1, 2, 3, 4, 5, 6, 7),
            arrayOf(9, 1, 2, 3, 4, 5, 6, 7, 8)
        )
        assertEquals(false, validate(board))
    }*/

    /*@Test
    fun `invalid sudoku 1`() {
        val board = arrayOf(
            arrayOf(0, 3, 4, 6, 7, 8, 9, 1, 2),
            arrayOf(6, 7, 2, 1, 9, 5, 3, 4, 8),
            arrayOf(1, 9, 8, 3, 4, 2, 5, 6, 7),
            arrayOf(8, 5, 9, 7, 6, 1, 4, 2, 3),
            arrayOf(4, 2, 6, 8, 5, 3, 7, 9, 1),
            arrayOf(7, 1, 3, 9, 2, 4, 8, 5, 6),
            arrayOf(9, 6, 1, 5, 3, 7, 2, 8, 4),
            arrayOf(2, 8, 7, 4, 1, 9, 6, 3, 5),
            arrayOf(3, 4, 5, 2, 8, 6, 1, 7, 9)
        )
        assertEquals(false, validate(board))
    }*/

   /* @Test
    fun `invalid sudoku 2`() {
        val board = arrayOf(
            arrayOf(1, 2, 3, 4, 5, 6, 6, 9, 9),
            arrayOf(4, 5, 6, 6, 9, 9, 1, 2, 3),
            arrayOf(6, 9, 9, 1, 2, 3, 4, 5, 6),
            arrayOf(2, 3, 4, 5, 6, 6, 9, 9, 1),
            arrayOf(5, 6, 6, 9, 9, 1, 2, 3, 4),
            arrayOf(9, 9, 1, 2, 3, 4, 5, 6, 6),
            arrayOf(3, 4, 5, 6, 6, 9, 9, 1, 2),
            arrayOf(6, 6, 9, 9, 1, 2, 3, 4, 5),
            arrayOf(9, 1, 2, 3, 4, 5, 6, 6, 9)
        )
        assertEquals(false, validate(board))
    }*/

    /*@Test
    fun `invalid sudoku 3`() {
        val board = arrayOf(
            arrayOf(1, 2, 3, 1, 2, 3, 1, 2, 3),
            arrayOf(4, 5, 6, 4, 5, 6, 4, 5, 6),
            arrayOf(7, 8, 9, 7, 8, 9, 7, 8, 9),
            arrayOf(2, 3, 1, 2, 3, 1, 2, 3, 1),
            arrayOf(5, 6, 4, 5, 6, 4, 5, 6, 4),
            arrayOf(8, 9, 7, 8, 9, 7, 8, 9, 7),
            arrayOf(3, 1, 2, 3, 1, 2, 3, 1, 2),
            arrayOf(6, 4, 5, 6, 4, 5, 6, 4, 5),
            arrayOf(9, 7, 8, 9, 7, 8, 9, 7, 8)
        )
        assertEquals(false, validate(board))
    }*/

    /*@Test
    fun `invalid because of repeated columns`() {
        val board = arrayOf(
            arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9),
            arrayOf(4, 5, 6, 7, 8, 9, 1, 2, 3),
            arrayOf(7, 8, 9, 1, 2, 3, 4, 5, 6),
            arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9),
            arrayOf(4, 5, 6, 7, 8, 9, 1, 2, 3),
            arrayOf(7, 8, 9, 1, 2, 3, 4, 5, 6),
            arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9),
            arrayOf(4, 5, 6, 7, 8, 9, 1, 2, 3),
            arrayOf(7, 8, 9, 1, 2, 3, 4, 5, 6)
        )
        assertEquals(false, validate(board))
    }

     */
}
