package subtask3

class TelephoneFinder {

    private val numbers:Array<Array<Int>> =  arrayOf( arrayOf(8), arrayOf(2,4), arrayOf(1,5,3), arrayOf(2,6), arrayOf(1,5,7), arrayOf(2,4,8,6),
        arrayOf(3,5,9), arrayOf(4,8), arrayOf(7,5,9,0), arrayOf(6,8)
    )

    // TODO: Complete the following function
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        if(number.toInt()<0)return null
        var res = mutableListOf<String>()
        var temp = number.toMutableList()
        for(i in 0..temp.size-1){
            var temp = number.toMutableList()
            for(j in numbers[temp[i].toString().toInt()]){
                temp[i]=j.toString()[0]
                res.add(temp.joinToString(separator = ""))
            }
        }
        return res.toTypedArray()
    }
}
