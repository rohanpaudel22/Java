public class String_Methods {
    public static void main(String[] args) {
        String name  = "Rohan";
        System.out.println(name);

        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedSting = "       Rohan     ";
        System.out.println(nonTrimmedSting);
        // System.out.println(nonTrimmedSting.trim());
        String trimmedString = nonTrimmedSting.trim();
        System.out.println(trimmedString);

        String subString = name.substring(3);
        System.out.println(subString);
        String subString1 = name.substring(2);
        System.out.println(subString1);

        String subString2 = name.substring(1, 3);
        System.out.println(subString2);

        String replacestring = name.replace('R', 'p');
        System.out.println(replacestring);
        System.out.println(name.replace("Roh", "Pat"));

        System.out.println(name.startsWith("Ro"));

        System.out.println(name.endsWith("an"));

        System.out.println(name.charAt(3));

        // String nextstring = "rohhhannnpaudel";
        // System.out.println(nextstring.indexOf("a"));
        // System.out.println(nextstring.indexOf("oh"));
        // System.out.println(nextstring.lastIndexOf("oh"));

        System.out.println(name.equals("Rohan"));        
        System.out.println(name.equals("rohan"));

        System.out.println(name.equalsIgnoreCase("roHaN"));



    }
}