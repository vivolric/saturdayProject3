public class CamelCase {

    /*
       First letter to upper case
        parameter is one String
        return type is String
        words are delimited by a space.
        All the words first letter should be camel case

       For Example:

            my family live in united states

      Result should be

            My Family Live In United States

     */

    public String camelcase(String sentence) {
        String str = sentence;
        String[] newStr = str.split(" ");

        String results = "";

        for (int i = 0; i < newStr.length; i++) {
            String a = newStr[i];

            String x = a.substring(0, 1).toUpperCase() + a.substring(1);
            results = results.concat(x) + " ";

        }
        System.out.println(results.trim());
        return results.trim();
    }
}
