
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }
    
    public Money plus(Money addition){
        
        
        int newEuro=this.euros+addition.euros;
        int newCents=this.cents+addition.cents;
        
        if (newCents>100){
            newCents=newCents-100;
            newEuro+=1;
        }
        
        Money newMoney= new Money(newEuro,newCents);
        
        return newMoney;
    }
    
    public Money minus(Money decreaser){
        
        int newEuro=this.euros-decreaser.euros;
        int newCents=this.cents-decreaser.cents;
        
        if (newCents<0){
            newCents=newCents+100;
            newEuro-=1;
        }
        
        if (newEuro<0){
            newEuro=0;
            newCents=0;
        }
        
       
        
        Money newMoney=new Money(newEuro,newCents);
        
        return newMoney;
        
        
        
    }
    
    
    public boolean lessThan(Money compared){
        int comparedtotal= (compared.euros*100)+compared.cents;
        int thistotal=(this.euros*100)+this.cents;
        
        if (thistotal<comparedtotal){
            return true;
        }
        
        return false;
        
    }

    public int euros() {
        return this.euros;
    }
    
    

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
