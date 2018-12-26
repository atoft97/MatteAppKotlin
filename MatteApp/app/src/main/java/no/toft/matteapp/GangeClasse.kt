package no.toft.matteapp

import java.util.Random

class GangeClasse (val nedre: Int, val ovre: Int){
    var rette: Int = 0
    var totalt: Int = 0

    var svar = 0

    fun rett(){
        rette +=1
        totalt +=1
    }
    fun feil(){
        totalt +=1
    }

    fun getregnestykke() : String{
        val tall1 = Random().nextInt(ovre - nedre + 1 )+  nedre
        val tall2 = Random().nextInt(ovre) + 1

        svar = tall1 * tall2

        return("$tall1  *  $tall2  =")
        //return("10  *  10  =")
    }

    fun sjekkSvar(brukarSvar : Int): Boolean{
        when (brukarSvar){
            svar -> {
                rett()
                return (true)
            }
            else -> {
                feil()
                return (false)
            }
        }

    }

    fun stat() : String{
        val str = ("$rette av $totalt rette")
        return (str)
    }

}