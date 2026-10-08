
    package schleifen;

    public class EndloseSchleife
    {
        public static void main(String[] args)
        {
            int i = 0;

            //Eine while-Schleife
            while(i < 5)
            {
                System.out.println(i);
                //i++;  //Ohne diese Zeile hat man eine endlose Schleife!
            }
        }
    }

