package tsask2;
/**Напишите обобщенный метод compareArrays(), который
принимает два массива и возвращает true, если они
одинаковые, и false в противном случае.
Массивы могут быть любого типа данных, но должны иметь
одинаковую длину и содержать элементы одного типа по
парно по индексам.
*/
public class Main {
    public static void main(String[] args) {
        Integer[] intArr={1,2,3,4,5};
        Integer[] intArr2={1,2,3,4,5};
        boolean result1=compareArrays(intArr,intArr2);
        System.out.println("result for integer arrays: " + result1);

        String[] strArr={"A","B","C","D","E","F"};
        String[] strArr2={"A","B","C","D","E","F"};
        boolean result2=compareArrays(strArr,strArr2);
        System.out.println("result for string arrays: " + result2);

        Double[] doubleArr={1.1,2.2,3.3,4.4};
        Double[] doubleArr2={1.1,2.2,3.3};
        boolean result3=compareArrays(doubleArr,doubleArr2);
        System.out.println("result if arrays are of different lengths: " + result3);

        Float[] floatArr={1.1f, 2.2f, 3.3f, 4.4f};
        Float[] floatArr2={1.1f, 2.2f, 3.3f, 3.4f};
        boolean result4=compareArrays(floatArr,floatArr2);
        System.out.println("result if the arrays are not the same: " + result4);


    }
    public static<T> boolean compareArrays(T[] arr1, T[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].getClass().equals(arr2[i].getClass())) {
                return false;
            }
        }
        return true;
    }
}
