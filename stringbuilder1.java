public class stringbuilder1 {
    public static void main(String args[])
    {

        // StringBuilder sb = new StringBuilder("Ankit");
        // System.out.println(sb);
        // System.out.println(sb.charAt(0));
        StringBuilder sb = new StringBuilder("Tony");
    //     set char
    // sb.setCharAt(0, 'p');
    // System.out.println(sb);
    // Insert char
// sb.insert(0,'S');
// System.out.println(sb);
        // delete char
        // sb.delete(0, 1);
        // System.out.println(sb);
        // sb.append(" Stark");
        // System.out.println(sb);
        // System.out.println(sb.length());
        for (int i=0; i<sb.length()/2; i++)
        {
            int front = i;
            int back = sb.length()-1-i;

            char frontChar= sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
    
}
