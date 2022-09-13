//Account list
var accounts:List[Account]=List()

def createAccount(accNo:Int,nic:String,amount:Double):Unit={
    val account=new Account(accNo,nic,amount)
    accounts=accounts ::: account :: Nil
    println(accounts)
}
//Account list functionalities
val overdraft_Accts=(y:List[Account])=>y.filter(account=>account.balance<0.0)
val total_balance=(y:List[Account])=>y.foldLeft(0.0)((x, y) => x + y.balance)
val apply_interest=(y:List[Account]) => y.map(account => if(account.balance > 0) account.balance*0.05 else account.balance*0.1)
//Account class
class Account(val accNo:Int,nic:String, var balance:Double=0.0){
  
    override def toString(): String = "AccNO: "+accNo+" | NIC: "+nic+" | Balance: "+balance 
}

object q4 extends App{
    createAccount(1,"981022017V",10000)
    createAccount(2,"982032017V",20000)
    createAccount(3,"993033017V",-20000)

    //List of Accounts with negative balances

    println(overdraft_Accts(accounts))

    //sum of all account balances
    println(total_balance(accounts))

    //After applying the interesr
    println(apply_interest(accounts))
}