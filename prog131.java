import college.*;
class prog131
{
    public static void main(String args[])
    {
        branch b= new branch();
        b.setdata("Mohammad","BT_IT");
        b.display();

        student s = new student();
        s.setdata(2205034,2,"BT-IT","Mohammad");
        s.display();
    }
}