package study.exception;

public class InsufficientFundsException extends Exception{
    //此处的amount用来储存当出现异常（取出钱多于余额时）所缺乏的钱
    private double amount;
    //构造方法
    public InsufficientFundsException(double amount){
        this.amount = amount;
    }
    //获取amount
    public double getAmount(){
        return this.amount;
    }
}
