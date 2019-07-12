public class Bitmask {
    public static void main(String[] args){
        // Creating bitmasks
        int flagA = 1 << 0;         //2^0
        int flagB = 1 << 1;    //2^1
        int flagC = 1 << 2;    //2^2
        int flagD = 1 << 3;    //2^3

        System.out.println("Flags - Dec - Bin no left padding");
        System.out.printf("FlagA - %3d - %4s\n", flagA, Integer.toBinaryString(flagA));
        System.out.printf("FlagB - %3d - %4s\n", flagB, Integer.toBinaryString(flagB));
        System.out.printf("FlagC - %3d - %4s\n", flagC, Integer.toBinaryString(flagC));
        System.out.printf("FlagD - %3d - %4s\n", flagD, Integer.toBinaryString(flagD));

        // Set a flag use binary or - n|0=n, n|1=1
        int myFlag = 0;
        myFlag |= flagC; // 3rd bit set
        myFlag |= flagA; // 1st and 3rd bit set

        // Check if one or more of specific bits are set use binary and, n&1=n, n&0=0
        if((myFlag & flagC) == flagC )
            System.out.println("3rd bit is set");

        if((myFlag & flagA) == flagA )
            System.out.println("1st bit is set");

        if((myFlag & (flagA | flagC)) == (flagA | flagC))
            System.out.println("1st and 3rd bits are set");

        // Unset bits if they are set - flip use & and ~
        myFlag = myFlag & ~flagC;
        if((myFlag & flagC) == flagC)
            System.out.println("3rd bit is set");
        else
            System.out.println("3rd bit is not set");


    }
}
