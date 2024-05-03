class Printer <T> {
    static <T> void printArray(T[] array) {
        for (T element:array) {
            System.out.println(element);
      }
   }
}