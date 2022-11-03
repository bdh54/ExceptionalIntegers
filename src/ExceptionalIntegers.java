import java.util.ArrayList;

public class ExceptionalIntegers {

public static void main(String[] args) {

    ArrayList<Integer> intList = new ArrayList<>();

    argsCheck(intList, args);

    intList
    }
    public static ArrayList<Integer> argsCheck(ArrayList<Integer> intList, String[] args) throws NumberFormatException {
        int argsLength;
        int index;
        argsLength = args.length;
        Integer wrapperValue;
        for (index=0; index<argsLength; ++index) {
            try {
              wrapperValue = Integer.parseInt(args[index]);
            } catch (NumberFormatException e) {

            }

        }
        return(intList);
    }
}


