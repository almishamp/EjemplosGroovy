/**
 * Created by hp on 06/03/2015.
 */

Long time_end
Long time_start

time_start = System.currentTimeMillis()

100.times{
    def i = 0;
    if(it > 1) { (1..it).each { num ->
                if (it % num == 0) i++
               }
        if (i < 3) {
            println "${it} primo"
            i = 0;
        }
    }
}

time_end= System.currentTimeMillis()

println("Time: "+(time_end- time_start))
