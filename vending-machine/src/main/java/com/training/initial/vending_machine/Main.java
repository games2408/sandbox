package com.training.initial.vending_machine;

public class Main 
{
    public static void main( String[] args )
    {
        VendingMachine vm = new VendingMachine();
        int currentNumSnacks = vm.getTotalSnacks();
        for(int i = 0; i < currentNumSnacks; i++){
        	System.out.println("Snack " + i + ": " + vm.getSnack(i));
        }
        
        vm.addSnack("Twizzlers");
        vm.addSnack("Sweet Tarts");
        vm.addSnack("Lemon Bars");
        
        for(int i = currentNumSnacks; i < vm.getTotalSnacks(); i++){
        	System.out.println("Snack " + i + ": " + vm.getSnack(i));
        }
    }
}
