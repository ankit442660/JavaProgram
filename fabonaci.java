class fabonaci
{
    public static void main(String args[])
    {
        int x=10;
        int firstnumber=0;
        int secondnumber=1;
        int nextnumber,i;
        System.out.print(firstnumber+"  "+secondnumber);
        for(i=2;i<=x;i++)
    {
        nextnumber= firstnumber+secondnumber;
        System.out.print("  "+nextnumber);
        firstnumber=secondnumber;
        secondnumber=nextnumber;
    }
}
}