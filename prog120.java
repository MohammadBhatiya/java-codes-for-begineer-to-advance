class prog120
{
    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer("rahul");
        System.out.println("|"+sb+"|");
        sb.setLength(100);
        System.out.println("|"+sb+"|");
        sb.setLength(3);
        System.out.println("|"+sb+"|");
    }
}