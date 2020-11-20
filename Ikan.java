package inheritance;

public class Ikan
{
    public static void main (String[] args)
    {
        HabitatAir ikan = new HabitatAir();
       
        System.out.println ("Ikan memiliki ciri-ciri : ");
        ikan.warnakulit("Bersisik");
        ikan.jumlahkaki(0);
        ikan.pemakan("Amoeba");
       
    }
}
