package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isTakeAwayAdded;
     private int extraCheesePrice;
     private int takeAwayPrice;
     private int extraToppingsPrice;
     private boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.isCheeseAdded=false;
        this.isTakeAwayAdded=false;
        this.isToppingsAdded=false;
        this.extraCheesePrice=80;
        this.takeAwayPrice=20;
        this.isBillGenerated=false;
        this.isVeg=isVeg;

        if(isVeg==true){
            this.price=300;
            this.extraToppingsPrice=70;
        }
        else{
            this.price=400;
            this.extraToppingsPrice=120;
        }
        this.bill="Base Price Of The Pizza: "+this.price+"\n";

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded==false){
            this.price=this.price+this.extraCheesePrice;
            isCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingsAdded==false){
            this.price=this.price+this.extraToppingsPrice;
            isToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeAwayAdded==false){
            this.price=this.price+this.takeAwayPrice;
            isTakeAwayAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated==false) {

            isBillGenerated = true;
            if (isCheeseAdded == true) {
                this.bill = this.bill + "Extra Cheese Added: " + this.extraCheesePrice + "\n";
            }
            if (isToppingsAdded == true) {
                this.bill = this.bill + "Extra Toppings Added: " + this.extraToppingsPrice + "\n";
            }
            if (isTakeAwayAdded == true) {
                this.bill = this.bill + "Paperbag added: " + this.extraCheesePrice + "\n";
            }
            this.bill = this.bill + "Total Price: " + this.price + "\n";
        }
        return this.bill;
    }
}
