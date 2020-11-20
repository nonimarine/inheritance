package inheritance;

public class HabitatDarat extends JenisHewan
{
    String makan;
   
    public void pemakan (String makanan)
    {
        makan=makanan;
        System.out.println ("Makanannya : " +makan);
    }
}