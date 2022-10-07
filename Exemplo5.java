public class Exemplo5
{

    public static void main(String[] args)
    {
        int qtde = 5;

        for(int i = 0; i<qtde; i++)
        {
            System.out.println(i);
        }

        int cont = 0;
        while (cont <= qtde)
        {
            System.out.println(cont);
            cont++;
        }
        cont = 0;
        do
        {
            System.out.println(cont);
            cont++;
        } while (cont <= qtde);
    }
}
