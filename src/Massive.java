public class Massive {
    public static void main(String[] args) {
        //int[] nums = {1, 1, 1, 1}; // [] - объявление массива
        //////////////  0  1  2  3   - номера ячеек в массиве
        int[] nums = new int[4]; // 4 элемента в массиве с типом инт
        for (int i = 0; i<4; i++){
            nums[i] = i;
        }

        nums[3]=100; // значение в третьей ячейке

        for (int e : nums){  // ДЛЯ КАЖДОГО элемента массива, е - переменная для каждого элемента массива в цикле
            System.out.println(e);
        }
        //for (int i = 0; i<4; i++){
         //   System.out.println("Элемент [" + i + "]" + nums[i]); // Номер ячейки и её значение
       // }
        int table[][] = new int[3][]; //массив из трех массивов с неопр. кол-вом ячеек
        table[0] = new int[4]; // определение кол-ва ячеек в данном массиве
        table[1] = new int[4];
        table[2] = new int[40];

    }
}
