public class Grading {

    public static double[] Grades(int n, int[] array){

        double[] result = new double[3];
        int i;
        result[0] = average(n,array);
        result[1]=min(n,array);
        result[2]=max(n,array);
        return result;
    }

    public static double average(int n,int[] array){

        int i;
        double sum=0;
        for (i=0;i<n;i++){
            sum=sum+array[i];
        }
        double avg = sum/n;
        return avg;

    }

    public static int min(int n , int[] array)
    {
        int minimum = array[0];
        int i;
        for(i=1;i<n;i++)
        {
            if(minimum>array[i])
            {
                minimum = array[i];
            }
        }
        return minimum;
    }



    public static int max(int n , int[] array)
    {
        int maximum = array[0];
        int i;
        for(i=1;i<n;i++)
        {
            if(maximum<array[i])
            {
                maximum = array[i];
            }
        }
        return maximum;
    }





}
