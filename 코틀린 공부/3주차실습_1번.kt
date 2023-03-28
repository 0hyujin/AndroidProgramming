// Exercise: Bank Account
// 다음 속성(property)을 갖는 BankAccount 클래스를 만든다.
// •	Account number (계좌마다 서로 다른 값)
// •	Account holder name
// •	Balance (계좌 잔액)
// BankAccount 클래스는 다음 메소드(method)를 갖는다.
// •	Deposit (입금)
// •	Withdraw (출금, 성공하면 true, 잔액이 모자라서 실패하면 false 리턴)
// •	balance 속성 setter는 private으로 하여 외부에서 사용 금지
// 아래 사용 예시의 코드가 동작하도록 한다.
// 팁
// 유일한 Account Number를 할당하기 위해, 새 BankAccount 객체가 생성될 때마다 값을 증가시키는 카운트를 사용할 수 있다. 
// 이 카운트는 companion object에 저장한다.


class BankAccount (val accountHolderName: String, private var _balance: Double) {
    val accountNumber : Int = generateAccountNumber()
    companion object {
        private var accountNumberCount = 0

        private fun generateAccountNumber(): Int {
            accountNumberCount++
            return accountNumberCount
        }
    }

    val balance: Double
    	get()=_balance

    fun deposit(amount: Double) {
        
        _balance += amount
    }

    fun withdraw(amount: Double): Boolean {
       
        if (_balance >= amount) {
            _balance -= amount
            return true
        }
        return false
    }

   


fun main() {
    val account = BankAccount("John Smith", 100.0)
    println(account.accountNumber)   // Output: 10
    println(account.balance)         // Output: 100.0
    println(BankAccount("James Baker", 10.0).accountNumber) // Output: 11
    // account.balance = 10
    // Compile Error (Cannot assign to 'balance': the setter is private in 'BankAccount')

    account.deposit(50.0)
    println(account.balance)   // Output: 150.0

    val success = account.withdraw(75.0)
    println(success)           // Output: true
    println(account.balance)   // Output: 75.0

    val failure = account.withdraw(100.0)
    println(failure)           // Output: false
    println(account.balance)   // Output: 75.0
}
