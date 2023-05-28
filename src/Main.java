public class Main {
  //  public static int getSum(int[] inputArra) {
    //    float summ = 0;
    //    for (int j = 0; j < inputArra.length; j++) {
   //         summ = summ + inputArra[j];
   //     }
    //    return summ;
   // }
 //   public static int getForAvg(int[] input) {
   //     int sumForAvg = 0;
    //    for (int i : input) {
  //          sumForAvg += i;
     //   }
     //   int days = input.length;
     //   double avgg = (double) sumForAvg / days;

      //  return avgg;
    //}
    //public static int getMax(int[] inputArray){
     //   int maxValue = inputArray[0];
     //   for(int i = 1; i < inputArray.length; i++){
      //      if(inputArray[i] > maxValue) {
       //         maxValue = inputArray[i];
       //     }
       // }
       // return maxValue;
    //}
   // public static int getMin(int[] inputArray){
     //   int minValue = inputArray[0];
     //   for(int i = 1; i < inputArray.length; i++){
      //      if(inputArray[i] < minValue){
       //         minValue = inputArray[i];
    //       }
     //   }
      //  return minValue;
   // }

    public static int getMinSalary(Employee[] employees) {
        float min = employees[0].getSalary();
        for (Employee e : employees) {
            if (e.getSalary() < min) {
                min = e.getSalary();
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Employee[] empl = new Employee[3];
        empl[0] = new Employee("Иванов Сидор Александрович", 1, 27000f);
        empl[1] = new Employee("Сидоров Александр Иванович", 2, 35000f);
        empl[2] = new Employee("Александров Иван Сидорович", 3, 40000f);

        for (Employee e : empl) {
            System.out.println(e);
        }

        float min = getMinSalary(empl);
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");

     //   int sum = getSum(empl.getSalary());
      ///  System.out.println("Сумма трат за месяц составила " + sum + " рублей");

      //  int max = getMax(empl.getSalary());
      //  System.out.println("Максимальная сумма трат за день составила " + max + " рублей");

      //  int min = getMin(empl.getSalary());
      //  System.out.println("Минимальная сумма трат за день составила " + min + " рублей");

      //  int avg = getForAvg(empl.getSalary());
      //  System.out.println("Минимальная сумма трат за день составила " + avg + " рублей");
    }

}