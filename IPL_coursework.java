package ipl_coursework;
import java.text.DecimalFormat; //import for decimal point
import java.util.Scanner;  //import for choice statement
import javax.swing.JOptionPane;  //import for Dialog
public class IPL_coursework {
    private static final DecimalFormat df2 = new DecimalFormat("#.##");  //Assigned 2 Decimal point
    public synchronized static void main(String[] args) {  //main method
        
        Scanner console=new Scanner(System.in);  //Assigned scanner
        
        String str,str1,str2,str3,str4,str5;                    //initialized valiable
        double p1 = 0,p2 = 0,p3 = 0,p4 = 0,p5 = 0,price = 0;
        char choice;
        
        JOptionPane.showMessageDialog(null,"Welcome to Ng Hardware Sdn. Bhd.\n\nAll product will be charged 3%"); //Welcome Dialog with introduction and notice
        // Input Dialog with product list
        do{
            str=JOptionPane.showInputDialog("\nPlease select your item.\n1. Slimline Combination Wrench RM 54.00\n2. Ladder RM 229.00\n3. Hand glove RM 21.00\n4. Torch light RM 21.60\n5.Saw blade  RM 72.00");
            int opt=Integer.parseInt(str);
            //Switch statement for calculating and loop
            switch (opt) {
                case 1:  //First item
                    str1=JOptionPane.showInputDialog("You selected Slimline Conbination wrench, please enter the amount you need."); //input the amount of product
                    int num1=Integer.parseInt(str1);
                    p1 = (54*num1)*1.03;
                    JOptionPane.showMessageDialog(null,"You selected "+num1+" slimline conbination wrench and the price for those wrench is RM "+df2.format(p1));   //the detail and the price for a pacticular product
                    break;
                case 2: //second item
                    str2=JOptionPane.showInputDialog("You selected ladder, please enter the amount you need."); //input the amount of product
                    int num2=Integer.parseInt(str2);
                    p2 = (229*num2)*1.03;
                    JOptionPane.showMessageDialog(null,"You selected "+num2+" ladder and the price for those wrench is RM "+df2.format(p2));    //the detail and the price for a pacticular product
                    break;
                case 3:  //third item
                    str3=JOptionPane.showInputDialog("You selected hand glove, please enter the amount you need."); //input the amount of product
                    int num3=Integer.parseInt(str3);
                    p3 = (21*num3)*1.03;
                    JOptionPane.showMessageDialog(null,"You selected "+num3+" hand glove and the price for those wrench is RM "+df2.format(p3));    //the detail and the price for a pacticular product
                    break;
                case 4:  //fourth item
                    str4=JOptionPane.showInputDialog("You selected torch light, please enter the amount you need."); //input the amount of product
                    int num4=Integer.parseInt(str4);
                    p4 = (21.6*num4)*1.03;
                    JOptionPane.showMessageDialog(null,"You selected "+num4+" torch light and the price for those wrench is RM "+df2.format(p4));   //the detail and the price for a pacticular product
                    break;
                case 5: //fifth item
                    str5=JOptionPane.showInputDialog("You selected saw blade , please enter the amount you need."); //input the amount of product
                    int num5=Integer.parseInt(str5);
                    p5 = (72*num5)*1.03;
                    JOptionPane.showMessageDialog(null,"You selected "+num5+" saw blade and the price for those wrench is RM "+df2.format(p5)); //the detail and the price for a pacticular product
                    break;
                            
                default:    //this is shown up when you choose a invalid selection
                    JOptionPane.showMessageDialog(null,"Invalid option.");
                    break;
            }
            System.out.println("Do you wish to continue? If Yes type y, if No type n");  //coutinue statement, it will print out after choose a product
            choice=console.next().charAt(0);
        }
        while (choice =='y'||choice =='Y'); //type y as yes, type capitalized y or other character will consider as no
        price = p1+p2+p3+p4+p5; //calculation for total price
        JOptionPane.showMessageDialog(null,"The total price you need to pay is RM "+df2.format(price)); //the dialog that print out total price for user
        }
            
        
    }