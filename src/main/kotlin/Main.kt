open class Pessoa(val nome: String, val altura: Double) {
    var data_nascimento: Int? = null
    private var idade: Int? = null
    override fun toString() = "$nome ($data_nascimento,$altura)"

    fun calcIdade(data_nascimento: Int) = 2021 - data_nascimento

    constructor(nome: String, data_nascimento: Int, altura: Double) : this(nome, altura) {
        this.data_nascimento = data_nascimento
        this.idade = calcIdade(data_nascimento)
    }


}
class Funcionario(nome: String,altura: Double,salario:Double):Pessoa(nome, altura){
    val salario:Double?=null
}

class Agenda(val tamanho: Int = 10) {
    var lista = ArrayList<Pessoa>()

    fun armazenaPessoa(p: Pessoa) = lista.add(p)

    fun removePessoa(nome: String) {

        for (i in lista) {
            if (nome === i.nome) {
                lista.remove(i)
            }

        }
    }

    fun buscaPessoa(nome: String):Pessoa {

        for (i in lista) {
            if (nome === i.nome) { return i }
        }

    }

    fun printAgenda(){
        for (i in lista){
            println(i)
        }
    }

    fun printPessoa(valor:Int){
        for (i in lista){
            if (lista.indexOf(i) == valor)
            print(i)
        }
    }

}

fun main() {
//    var p1: Pessoa
//    var p2: Pessoa
//    var p3: Pessoa
//    var f1:Funcionario
//    var a: Agenda
//    p1 = Pessoa("Eric", 2000, 1.8)
//    p2 = Pessoa("Lorenna", 2001, 1.7)
//    p3 = Pessoa("Giovana", 2001, 1.68)
//    f1 = Funcionario("Joao",1.8,500.00)
//    a = Agenda()
}