import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

class Telefoane 
{
   private String nume;
   private String[] s=new String[100];
   private int i=0;

   public Telefon(String nume)
   {
    this.nume=nume;
   }

   public boolean apeleaza(Telefoane t)
   {
        if(t.i<=99)
          {
            t.s[i]=this.nume;
            t.i++;
            return true;
          }
          return false;
   }

   public Integer numarDeApeluri(String num)
   {
    int j=0,cnt=0;
    for (j=0;j<i;j++)
    {
        if(this.v[i]==num)
        {
            cnt++;
        }
    }
    Integer in=new Integer(in);
    return in.intValue();
   }

   public String toString()
   {
    String s=this.nume;
    for(int j=0;j<i;j++)
    {
        s=s+" "+v[i];
    }
    return s;
   }
}

class MainTelefoane
{
    public static void main(String [] int argv)
       {
        int n,A;
        Random rand = new Random();
        Telefon[] t = new Telefon[100];
        //InputStreamReader keybord_char_stream = new InputStreamReader(System.in);
        try {
        BufferedReader in_stream_char = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Numarul de telefoane: ");
        n = Integer.parseInt(in_stream_char.readLine());
        for(int i=0;i<n;i++)
        {
            String s;
            System.out.print("Numele proprietarului telefonului "+ i+": ");
            s=in_stream_char.readLine();
            Telefon temp = new Telefon (s);
            t[i]=temp;

        }
        System.out.print("numarul de apeluri generate: ");
        A=Integer.parseInt(in_stream_char.readLine());
        System.out.println("perechi de telefoane: ");
        for(int k=0;k<A;k++)
        {
            
            int x = rand.nextInt(n);//Integer.parseInt(in_stream_char.readLine());
            int y = rand.nextInt(n);
            System.out.println(x+" "+y);
            t[x].apeleaza(t[y]);
        }
        System.out.print("Nume proprietar: ");
        String numeprop = in_stream_char.readLine();
        for(int i=0;i<n;i++)
        System.out.println(t[i].getnume()+" "+t[i].numarDeApeluri(numeprop));

        }
        catch(IOException e) {
            System.out.println("Eroare la operatiile de intrare-iesire!");
            System.exit(1);
            }
       }
}