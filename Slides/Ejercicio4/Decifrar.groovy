
/**
 * Created by ALMA on 9/03/15.
 */

sustituir = {
    def contenido = it
    def caracter = ""
    def posicion = 0
    def aumento = 20
    def cadenaObtenida = ""
    def abecedario = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z']
    def abecedarioM = ['A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z']

    contenido.each{ letra ->
        if(letra == " " || letra == "," || letra == "." ) {
            caracter = letra
            cadenaObtenida += caracter
        }

        if(letra == "\n"){
            cadenaObtenida += "\n"
        }

        else {
            for(int i=0 ; i < 27; i++){
                if(abecedario[i].equals(letra)){
                    posicion = i + aumento

                    if(posicion > 19){
                        posicion = posicion - 26
                        caracter = abecedario[posicion]
                        cadenaObtenida += caracter
                    }
                    else {
                        caracter = abecedario[posicion]
                        cadenaObtenida += caracter
                    }

                }
                if(abecedarioM[i].equals(letra)){
                    posicion = i + aumento

                    if(posicion > 19){
                        posicion = posicion - 26
                        caracter = abecedarioM[posicion]
                        cadenaObtenida += caracter
                    }
                    else {
                        caracter = abecedarioM[posicion]
                        cadenaObtenida += caracter
                    }

                }
            }
        }

    }
    cadenaObtenida += caracter
    println cadenaObtenida

    //   println "Caracter1 $cadenaObtenida"

//    println cadenaObtenida

}

def cadena = """Ynkxquip Nuqrky, wak ks as vxñsiñvñu Jueqk zksñg vxkbñyzu qqgrgx
Ynkxxñsluxj, ky as jkzkizñbk vxñbgju, gqzu, jkqmgju, lxñu, ñxusñiu,
ñsmksñuyu k ñszkqkizagqrkszk ñswañkzu. Cgzyus qu jkyixñhk lñyñigrkszk
jkq yñmañkszk ruju gq vuiu jk iusuikxykf

Ya kyzgzaxg yuhxkvgyghg quy ykñy vñky, e kxg zgs kdzxguxjñsgxñgrkszk
ksoazu, wak vxujaiñg qg ñrvxkyñus jk ykx gas rgy gqzu. Zksñg qg rñxgjg
gmajg e vkskzxgszk, e ya sgxñf, lñsg e gmañqktg, jghg gq iusoaszu jk yay
lgiiñusky as gñxk jk bñbkfg e jk xkyuqaiñus.

Gaswak rainuy ngs skmgju kyzg uviñus, kq kyixñzux hgyu ya jkyixñviñus
jk Nuqrky ks as gszñmau grñmu jk qg lgiaqzgj, qqgrgju Ynkxxñsluxj, kq
iagq qqkmu g luxrgx vgxzk jk Yiuzqgsj Egxj, mxgs grñmu e gqñgju jk iusgs
jueqk e iaegy jkyixñviñusky jk bñbksiñgy vuqñiñgigy ñsyvñxgxus raingy jk
yay uhxgy."""

cambioVariable(sustituir, cadena)

def cambioVariable(closure, valor){
    def cadena = valor
    closure.call(cadena)
}

