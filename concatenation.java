
public class concatenation {
    // Concatenation is the process of combining two or more strings to form a new string by subsequently appending the next string to the end of the previous strings. In Java, two strings can be concatenated by using the + or += operator, or through the concat() method, defined in the java. lang.
    public static void main(String args[]){
        String firstName="RISHABH";
        String lastName="Pandey";
        String fullname=firstName+" " +lastName;
        // System.out.println(fullname);
        System.out.println(fullname.length());
        for(int i=0;i<fullname.length() ; i++){
            System.out.println(fullname.charAt(i));
        }

    }
}
