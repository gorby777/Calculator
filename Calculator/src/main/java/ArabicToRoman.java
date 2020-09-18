
public class ArabicToRoman {

    public ArabicToRoman() {
    }

    String conversion(int number){
        String [] roman = {"","I","II","III","IV","V","VI","VII","VIII","IX",
                "","X","XX","XXX","XL","L","LX","LXX","LXXX","XC","C"};
        int units = number%10;
        int decades = number/10;
        return roman[decades+10]+roman[units];
    }
}
