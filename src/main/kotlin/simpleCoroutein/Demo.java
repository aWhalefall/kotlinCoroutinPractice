package simpleCoroutein;

public class Demo{

        public static boolean IsSpecialUri(String url) {

            String[] matchSchemes = {
                    "dmqk://",
                    "endmqk://",
                    "sgdmqk://",
            };
            for (String matchScheme : matchSchemes) {
                if (url.startsWith(matchScheme)) {
                    return true;
                }
            }
            return false;
        }

}
