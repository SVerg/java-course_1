import java.io.IOException;
import java.util.Scanner;
public class Calculate
        {
   public static void main(String[] arg) 
{

System.out.println("Calculate...");
Scanner reader = new Scanner(System.in);

// Integer 
       
        System.out.println("Enter int nambers");
        System.out.print("first = ");
        int First =reader.nextInt();
        System.out.print("second = ");
        int Second =reader.nextInt();
        int Summ1 =Second+First;
        System.out.println("Summa = "+Summ1);
        int Delenie =Second/First;
        System.out.println("DelenieInt = "+Delenie);
        int Ymnojenie_1 = Second*First;
        System.out.println("YmnojenieInt = "+Ymnojenie_1);
        int Raznoct=First-Second;
        System.out.println("RaznoctInt = "+ Raznoct);
        System.out.println("KvadratInt First= "+First*First+", KvadratInt Second= "+Second*Second);
         
// Double
        
        System.out.println("Enter Double nambers");
        System.out.print("first = ");
        Double First2 =reader.nextDouble();
        System.out.print("second = ");
        Double Second2 =reader.nextDouble();
        Double Summ2 =Second2+First2;
        System.out.println("SummaDouble = "+Summ2);
        Double Delenie2 =Second2/First2;
        System.out.println("DelenieDouble = "+Delenie2);
        Double Ymnojenie2 = Second2*First2;
        System.out.println("YmnojenieDouble = "+Ymnojenie2);
        Double Raznoct2=First2-Second2;
        System.out.println("RaznoctDouble = "+ Raznoct2);
        System.out.println("KvadratDouble First= "+First2*First2+", KvadratDouble Second= "+Second2*Second2);

// Long

        System.out.println("Enter Long nambers");
        System.out.print("first = ");
        long  First3 =reader.nextLong();
        System.out.print("second = ");
        long Second3 =reader.nextLong();
        long Summ3 =  Second3+First3;
        System.out.println("Summalong = "+Summ3);
        long Delenie3 =Second3/First3;
        System.out.println("Delenielong = "+Delenie3);
        long Ymnojenie3 = Second3*First3;
        System.out.println("Ymnojenielong = "+Ymnojenie3);
        long Raznoct3=First3-Second3;
        System.out.println("Raznoctlong = "+ Raznoct3);
        System.out.println("KvadratLong First= "+First3*First3+", KvadratLong Second= "+Second3*Second3);

// short

        System.out.println("Enter Short nambers");
        System.out.print("first = ");
        short  First4 =reader.nextShort();
        System.out.print("second = ");
        short Second4 =reader.nextShort();
        int Summ4 =  Second4+First4;
        System.out.println("SummaShort = "+Summ4);
        short Delenie4 = (short) (Second4/First4);
        System.out.println("DelenieShort = "+Delenie4);
        short Ymnojenie4 = (short) (Second4*First4);
        System.out.println("YmnojenieShort = "+Ymnojenie4);
        short Raznoct4= (short) (First4-Second4);
        System.out.println("RaznoctShort = "+ Raznoct4);
        System.out.println("KvadratShort First= "+First4*First4+", KvadratShort Second= "+Second4*Second4);

// float

        System.out.print("first = ");
        float  First5 =reader.nextFloat();
        System.out.print("second = ");
        float Second5 =reader.nextFloat();
        float Summ5 =  Second5+First5;
        System.out.println("SummaFloat = "+Summ5);
        float Delenie5 =  Second5/First5;
        System.out.println("DelenieFloat = "+Delenie5);
        float Ymnojenie5 =  Second5*First5;
        System.out.println("YmnojenicFloat = "+Ymnojenie5);
        float Raznoct5 =  First5-Second5;
        System.out.println("RaznoctFloat = "+ Raznoct5);
        System.out.println("KvadratFloat First= "+First5*First5+", KvadratFloat Second= "+Second5*Second5);


         }
}