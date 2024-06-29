class BankAccount(var accountNumber: String, var balance: Double) {
    fun deposit(amount: Double) {
        balance = balance + amount
    }
    fun withdraw(amount: Double) {
        if (amount <= balance) {
            balance = balance - amount
        } else {
            println("Insufficient balance")
        }
    }
}

fun main() {
    val account = BankAccount("572592358", 19000.0)
    println("Initial balance: ${account.balance}")
    account.deposit(1020.0)
    println("Balance after deposit: ${account.balance}")
    account.withdraw(1300.0)
    println("Balance after withdrawal: ${account.balance}")
    account.withdraw(20000.0) 
}
