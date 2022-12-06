public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {2, 1, 3, 6, 9, 4, 153, 0, 253, 1488, 87, 12, 33};
        for (int i: nums){
            System.out.print(i+" "); // показываем неостортированный массив
        }
        int temp;
        boolean sorted = false;
        System.out.println(""); // просто перенос на другую стору в терминале вывода для удобства
        while (!sorted) {
            sorted = true; //когда sorted становится true , цикл прекращает работу

        for (int i = 0; i< nums.length-1; i++){
            if (nums[i] > nums[i+1]){
                temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
                sorted = false;
            }

        }

    }
        for (int i: nums){
            System.out.print(i+" "); // показываем отсортированный массив
        }
}
}