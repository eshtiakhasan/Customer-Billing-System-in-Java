
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eshti
 */
public class SuperClassParent {
    public double FiletFish;
    public double ChickenBurger;
    public double ChickenLegend;
    public double ChickenMeal;
    public double CheeseBurger;
    
    public double MilkShake;
    public double VanillCone;
    public double ClassicVanilla;
    public double VanillaShake;
    public double ChocolateShake;
    
    public double Meals;
    public double Drinks;
    public double TotalofMD;
    
    public double AllTotalofMD;
    
    public double GetAmount()
    {
        Meals=FiletFish+ChickenBurger+ChickenLegend+ChickenMeal+CheeseBurger;
        Drinks=MilkShake+VanillCone+ClassicVanilla+VanillaShake+ChocolateShake;
        AllTotalofMD=Meals+Drinks;
        return AllTotalofMD;
    }
    private JFrame frame;
    
    public void iExitSystem()
    {
        frame=new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Customer Billing System",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }
    
    
    public double pFiletFish=450;
    public double pChickenBurger=120;
    public double pChickenLegend=135;
    public double pChickenMeal=350;
    public double pCheeseBurger=200;
    
    public double pMilkShake=170;
    public double pVanillCone=90;
    public double pClassicVanilla=150;
    public double pVanillaShake=70;
    public double pChocolateShake=210 ;
    
    public double mcTax=0.90;
    
    public Double cFindTax(double cAmount)
    {
        double FindTax=cAmount-(cAmount*mcTax);
        return FindTax;
    }
}
