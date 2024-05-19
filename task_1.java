class task_1
{
    public static void main(String[] args)
    {
          int[] numbers = {1,4,17,7,25,3,100};
          largets(numbers);
          
    }

    public static void largets(int[] numbers)
    {
        int first,second, third;
        first = second = third = numbers[0];

        for(int i=1;i<numbers.length;i++)
        {
            if(numbers[i] > first)
            {
                third = second;
                second = first;
                first = numbers[i];
            }
            else if(second < numbers[i])

            {
                  third = second;
                  second = numbers[i]; 
            }
            else if(third < numbers[i])
            {
                third = numbers[i];
            }
        }
        System.out.println("3 largest elements of the said array are: " + first + " " + second +" "+third);
    }

    
}