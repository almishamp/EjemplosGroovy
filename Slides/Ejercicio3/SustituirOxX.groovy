/**
 * Created by ALMA on 9/03/15.
 */

sustituir = {
    def subst = "x"
    def cadena = ""

    it.each{ x ->
        if(x == "o" || x == "O"){
            cadena += subst
            subst += "x"
        }
        else   cadena += x
    }
    print "Cadena modificada: $cadena"

}

cambioVariable(sustituir, "Hola mundo op")

def cambioVariable(closure, valor){
    def cadena = valor
      closure.call(cadena)
}

