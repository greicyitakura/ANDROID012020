package digitalhouse

import br.com.digitalhouse.Cliente
import br.com.digitalhouse.Conta

fun main() {
    val cliente = Cliente("Joao","Felipe")
    val conta = Conta(1, 0.0, cliente)
    conta.deposito(100.0)
    conta.saque(100.0)
    conta.saque(10.0)

    println(cliente.nome)

}