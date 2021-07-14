package subtask2

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        val new = number.toLong()
        val result = mutableListOf(new)
        var temp = 0L

        while (!result.isNullOrEmpty()) {
            val current = result.last()
            result.indexOfLast {
                result.remove(it)
            }

            temp += current*current
            for (i in current - 1 downTo 0) {
                if (temp - i*i >= 0) {
                    temp -= i*i
                    result.add(i)

                    if (temp == 0L) {
                        result.sort()
                        return result.map { it.toInt() }.toTypedArray()
                    }
                }
            }
        }
        return null
    }
}
