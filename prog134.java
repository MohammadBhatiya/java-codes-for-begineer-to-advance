class prog134
{
    public static void main(String args[])
    {
        Thread t = Thread.currentThread();
        System.out.println(t);
        System.out.println(t.getName());
        System.out.println(t.getPriority());

        t.setName("My Thread");
        t.setPriority(7);
        System.out.println(t);
        System.out.println(t.getName());
        System.out.println(t.getPriority());
    }
}