package subtask1

class Combinator {

    fun factorial(a: Int): Double{
        var ans=1.0
        var i: Int = a
        while(i>1){
            ans*=i
            i--
        }
        if(a==1){return 1.0}
        else return ans
    }

    fun checkChooseFromArray(array: Array<Int>): Int? {
        val c0=array[0].toDouble()
        val n=array[1]
        var C=0.0
        var k=0

        while(k<=c0 && k<n){
            C = factorial(n)/(factorial(n-k)*factorial(k))
            println(C)
            if(C==c0){break}
            else k++
        }

        if(C==c0){return k}
        else return null
    }
}
