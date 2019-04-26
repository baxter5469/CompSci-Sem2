public class Coin implements Comparable {
    private double coinVal;
    private String coinName;
    public Coin(double val,String name){
        coinVal = val;
        coinName = name;
    }
    public double getValue(){
        return coinVal;
    }
    public String getName(){
        return coinName;
    }
    public double compareTo(Object other){
        Coin otherCoin = (Coin) other;
        return Double.compare(getValue(), otherCoin.getValue());
    }
}