/**
 * Created by hp on 06/03/2015.
 */



def aArabigos = {
    def letras = ['I','V','X','L','C','D','M']
    def valorLetras = [1, 5, 10, 50, 100, 500, 1000]

    for(int x = 0 ; x < 7; x++){
        if(it == letras[x]){
            return numero = valorLetras[x]
        }
    }
}


def aRomanos = {
    def valorLetras = ['I','IV','V','IX','X','VL','L','XC','C','CD','D','CM','M' ]
    def valorNumeros = [1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000]
    def numeroRomano = ""
    int valor = it
    int resultado = 0

    for(int i = 12 ; i > -1 ; i--){
        resultado = valor / valorNumeros[i]
        if(resultado  >= 1 && valor > 0){
            (1..resultado).each{
                numeroRomano += valorLetras[i]
                valor -= valorNumeros[i]
            }
        }
    }
    print "Numero Convertido de Decimal a Romano => $numeroRomano"

}

convertir(aRomanos, 2765)

convertir(aArabigos, "MMDCCLXV")


def convertir(closure, numeroAconvertir){
    def numeroConvertir = numeroAconvertir
    if(numeroConvertir instanceof Number){

        if(numeroConvertir <= 3888 && numeroConvertir >0){
            closure.call(numeroConvertir)
        }
        return
    }
    else{
    def valores = []
    def anterior = 0
    def aRomano = false
    def incremento = 0
    def numeroConvertido = 0
    def suma = 0
        numeroConvertir.each{
            closure.call(it)
            if(numero){
                valores.add(numero)
            }
            else{}
         }

    for (int i = 0; i <= valores.size() - 1; i++) {
        suma += valores[i]
        if (suma > 3888) {
            println "Los numeros mayores que 3888, no pueden ser evaluados"
            numeroConvertido = null
            break
        }
        if (i > 0 && i <= valores.size() - 2) {
            if ((valores[i] > anterior) && (valores[i] > valores[i + 1])) {
                println "Número romano incorrecto"
                numeroConvertido = null
                break
            }
        }

        if (valores[i] >= anterior) {
            numeroConvertido += valores[i]
            if (valores[i] == anterior) {
                if (valores[i] == 1000 || valores[i] == 100 || valores[i] == 10 || valores[i] == 1) {
                    incremento++
                    anterior = valores[i]
                }
                if (valores[i] == 5 || valores[i] == 50 || valores[i] == 500) {
                    println "Número romano incorrecto"
                    numeroConvertido = null
                    break
                }
                if (incremento == 3) {
                    println "Número romano incorrecto"
                    numeroConvertido = null
                    break
                }

            } else {
                incremento = 0
                anterior = valores[i]
            }

        }

        if (valores[i] < anterior) {
            if (valores[i] > valores[i + 1]) {
                numeroConvertido += valores[i]
                anterior = valores[i]
                incremento = 0
            }
            if (valores[i] == valores[i + 1]) {
                numeroConvertido += valores[i]
                anterior = valores[i]
                incremento++
            }
            if (valores[i] < valores[i + 1]) {
                numeroConvertido -= valores[i]
                anterior = valores[i]
            }
            incremento = 0
        }

    }
    println " "
    println "Numero Convertido de Romano a Decimal => $numeroConvertido"
  }

 }


