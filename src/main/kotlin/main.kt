/*fun endereco(rua: String = "", cidade: String, estado: String, cep: String, numero: Int =0){
    println("Rua: $rua")
    println("Cidade: $cidade, $estado - $cep")
}
*/
fun media(vararg notas: Float){
    if(notas.isNotEmpty()){
        var soma = 0f
        for(nota in notas){
            soma += nota
        }
        println("a média é: ${soma/notas.size}")

    }

}

fun <T>media3(vararg valores: T ){

}
fun main()  {
    media(8f,6f,4f,4f,35f,6f,76f,4f,2f,4f,4f,2f,432f,23f,1312f,23f,345f,234f,123f,12312f)
    /*
    endereco(cidade="Campinas", estado ="São Paulo",cep ="13023-320")
    endereco(estado ="São Paulo", cidade="Campinas",cep ="13023-320")
    endereco(cep ="13023-320",cidade="Campinas", estado ="São Paulo")
     */
}
