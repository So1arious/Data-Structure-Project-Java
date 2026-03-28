import java.util.ArrayList;
import java.io.Files;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class EmployeeHeapSort
{
  //Heap Sort Test
  public static void heapify(EmployeeCompare[] array. int lenggth, int i)
  {
    int left = 2*i+1;
    int right = 2*i+2;
    int largest = i;

    if (left < length && array[left].getId() < array[largest].getId())
    {
      largest = left;
    }

    if (right < length && array[right}.getId() < array[largest].getId())
    {
      largest = right;
    }

  if (largest != i)
  {
    EmployeeCompare temp = array[i];
    array[i] = array[largest];
    array[largest] = temp;
    heapify(array. length, largest);
  }
}
