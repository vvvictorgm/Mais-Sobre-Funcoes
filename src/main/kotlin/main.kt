/*fun endereco(rua: String = "", cidade: String, estado: String, cep: String, numero: Int =0){
    println("Rua: $rua")
    println("Cidade: $cidade, $estado - $cep")
}
*/
fun media(vararg notas: Int){
    if(notas.isNotEmpty()){
        var soma = 0f
        for(nota in notas){
            soma += nota
        }
        println("a média é: ${soma/notas.size}")

    }

}
fun main()  {
    media(8,6,4,4,35,6,76,4,2,4,4,2,432,23,1312,23,345,234,123,12312)
    /*
    endereco(cidade="Campinas", estado ="São Paulo",cep ="13023-320")
    endereco(estado ="São Paulo", cidade="Campinas",cep ="13023-320")
    endereco(cep ="13023-320",cidade="Campinas", estado ="São Paulo")
     */
}
