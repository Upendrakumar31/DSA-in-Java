package BitManupulations;

public class bitManupulation {
    public static void main(String[] args) {
        System.out.println((5&6));  // Output = 4 //
        System.out.println(5|6);    // Output = 7 //
        System.out.println(5^6);    // Output = 3 //
        System.out.println(~5);     // Output = -6 // Minus esliye aata h kyuki jb bhi ham not krte hai tb uske piche bahot sare zeros inculded rehte hai or uska MSB positive rehta hai (+MSB=0) or uska NOT karne se MSB=1 hota (-MSB=1) or  jb uska hmlog ONE's complement nikalte or phir usme 1 ADD krte hai jisse  esliye answer negative me aata h //
        System.out.println(5<<2);   // Output = 20 //
         System.out.println(6>>1);   // Output = 3 //
    }
}
