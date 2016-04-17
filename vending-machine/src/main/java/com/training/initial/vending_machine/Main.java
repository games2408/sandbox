package com.training.initial.vending_machine;

public class Main 
{
    public static void main( String[] args )
    {
        VendingMachine vm = new VendingMachine();
        //int currentNumSnacks = vm.getTotalSnacks();
        
        vm.addSnack("Twizzlers");
        vm.addSnack("Sweet Tarts");
        vm.addSnack("Lemon Bars");
        
        for(int i = 0; i < vm.getTotalSnacks(); i++){
        	String currentSnack = vm.getSnack(i);
        	System.out.printf("%-12s :  $%2.2f \n", currentSnack, vm.getSnackPrice(currentSnack));
        }
    }
}
