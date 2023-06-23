public class lectureEight {
    
public static void main(String[] args){

    //representation of array
    // int[] ages 
   // creation 
    int[] ages = new int[10];
    ages[0] = 12;
    ages[1] = 67;
    ages[2] = 37;
    ages[3] = 97;
    ages[4] = 53;
    ages[5] = 94;
    // System.out.println(ages[0]);
    // System.out.println(ages[1]);
    // System.out.println(ages[2]);
    // System.out.println(ages[3]);
    // System.out.println(ages[4]);
    // System.out.println(ages[5]);hghg

    int marks[] = {2,4,2,6,4,8};
    System.out.println("this is marks " + marks[1] );
    //  print array using 
    //  for loop 
    for(int i = 0 ; i < 6 ; i++){
    System.out.println(ages[i]);
    }
    // for each loop : print complete array
    for(int age : ages){
        System.out.println(age);
    }
}

}


/*checklist 
->array introduction :it is a datastructure that stores a collection of homogenous items.indexing is zero based.contigous value.
->decleration
->creation
->types : 1-d and 2-d
->operations
->problems : 
1> find sum of array 
2> find no in arary and return its index 
3 find max value in an arary 
-> linear search problem
*/ 
