fun endereco(rua: String = "", cidade: String, estado: String, cep: String, numero: Int =0){
    println("Rua: $rua")
    println("Cidade: $cidade, $estado - $cep")
}

fun main()  {
    endereco(cidade="Campinas", estado ="São Paulo",cep ="13023-320")
    endereco(estado ="São Paulo", cidade="Campinas",cep ="13023-320")
    endereco(cep ="13023-320",cidade="Campinas", estado ="São Paulo")
}