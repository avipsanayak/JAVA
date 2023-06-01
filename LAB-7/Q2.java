import java.util.*;
class plate 
{
    int l1,w1;
    public plate(int a, int b) 
    {
        w1 = a;
        l1 = b;
    }
}
class box extends plate 
{
    int w2,l2,h2;
    public box(int a, int b, int c, int d, int e) 
    {
        super(a, b);
        w2 = c;
        l2 = d;
        h2 = e;
    }
}
class woodbox extends box 
{
    int w3,l3,h3,t3;
    public woodbox(int a, int b, int c, int d, int e, int f, int g, int h, int i) 
    {
        super(a, b, c, d, e);
        w3 = f;
        l3 = g;
        h3 = h;
        t3 = i;
    }
    void show() 
    {
        System.out.println("Length & width from class plate:" + l1 + w1 + "\nLength, width & height from class box:" + l2 + w2 + h2 + "\nLength, width, height & thickness from class woodbox:" + l3 + w3 + h3 + t3);
    }
}
class Q2
{
    public static void main(String args[]) 
    {
        woodbox w1 = new woodbox(10, 12, 23, 14, 15, 22, 27, 18, 20);
        w1.show();
    }
}