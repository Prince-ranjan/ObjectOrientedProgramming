public class StringStringBufferAndBuilder {

    // constant functions which cannot be changed are always thread safe. - String, StringBuffer
    // StringBuilder
    public static void main(String[] args) {
        String str = "Hello";
        str = str + " Thomas";

       // System.out.println(str);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Riya");

        //System.out.println(sb);

        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" Java!");

        System.out.println(sbf);
    }


}
