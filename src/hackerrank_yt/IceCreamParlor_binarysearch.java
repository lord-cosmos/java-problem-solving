package hackerrank_yt;

//Menu
//1. Chocolate 5$   10-5 = 5
//2. Vanilla 5$
//3. Butterscotch 10$
//4. Strawberry 12$
//        ...
//
//Pocket 10$
//
//I want to spend all of my money to buy exactly 2 ice-creams. Any flavour but no same flavours.
//
//Chocolate + vanilla

import java.util.Arrays;





//Brute force,
//iterate over the menu and pick 2 flavours to sum
// O(n2)
public class IceCreamParlor_binarysearch {

  public static int indexOf(int[] arr, int key, int pleaseExcludeThis){
    for(int i = 0; i< arr.length; i++) {
      if(arr[i] == key && i != pleaseExcludeThis){
        return i;
      }
    }
    return -1;
  }

//  public static void inorderRecursion(TreeNode node) {
//    if(node == null) return;
//    inorderRecursion(node.left);
//    System.out.println(node.value);
//    inorderRecursion(node.right);
//  }

//  public static o

  public static int[] getIndicesFromValues(int[] menu, int value1, int compliment) {

    int index1 = indexOf(menu,value1 , 0 );
    int index2 = indexOf(menu, compliment, index1);
    int[] indices = {Math.min(index1,index2), Math.max(index1,index2)};
    return indices;
  }

  public  static int[] findPairs(int[] menu, int money){
    int[] sortedMenu = menu.clone();
    Arrays.sort(sortedMenu);

    for(int  i = 0; i < sortedMenu.length ; i++) {
      int compliment = money - menu[i];
      int location = Arrays.binarySearch(sortedMenu,i+1, sortedMenu.length,compliment);
      if( location >=0 && location < menu.length && menu[location] == compliment) {
          int[] indices = getIndicesFromValues(menu,menu[i],compliment);
          return indices;
      }
    }
    return null;
  }
}
