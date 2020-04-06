import java.util.*;

public class RGBConverter {
    static Scanner numInput = new Scanner(System.in);
    public static void main(String[] args){
        int redChannel, blueChannel, greenChannel;
        String hexColorOutput;

        redChannel = getColorValue("red");
        blueChannel = getColorValue("blue");
        greenChannel = getColorValue("green");

        System.out.print("Values entered: ");
        System.out.print(redChannel +", ");
        System.out.print(blueChannel +", ");
        System.out.println(greenChannel);

        hexColorOutput = hexConvert(redChannel, blueChannel, greenChannel);

        System.out.println("Hex color is : " +hexColorOutput);
    }

    public static String hexConvert(int red, int blue, int green){
        String redHex, blueHex, greenHex, outputHex;

        redHex = convertToHex(red);
        blueHex = convertToHex(blue);
        greenHex = convertToHex(green);

        outputHex = "#" + redHex + blueHex + greenHex;

        return outputHex;
    }

    public static int getColorValue(String valType){
        int value;
        System.out.println("Enter " + valType + " Value: ");
        value = numInput.nextInt();
            while (value < 0 || value > 255){
                System.out.println("Value must be between 0 and 255.");
                System.out.println("Please Try Again.");
                System.out.println("Enter " + valType + " Value: ");
                value = numInput.nextInt();
            }

        return value;
    }
    public static String convertToHex(int num){
        int remainder;
        String hexVal = "";
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while (num>0){
            remainder = num%16;
            hexVal = hex[remainder]+hexVal;
            num=num/16;
        }
        return hexVal;
    }
}
