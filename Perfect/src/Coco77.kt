fun main(){
    val list = mutableListOf<Int>()
    while(true){

        print("Ingrese un numero o 77 para finalizar: ")
        val input = readln()

        if(input == "77"){

            break;
        }
        val number = input?.toIntOrNull()

        if(number != null){
            list.add(number)
        }else{
            println("Ingrese un número valido!")
        }
    }

    if (!list.isEmpty()){
        println("la lista de los numeros son ${list.joinToString( ", ")}")
    }else{
        println("la lista esta vacia")
    }


}