import java.util.*;
import java.util.Arrays;
class ArraySearch{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of element:");
int size=sc.nextInt();
int numbers[]=new int[size];
System.out.println("Enter elements:");
for(int i=0;i<size;i++){
numbers[i]=sc.nextInt();
}
ArraySearch as=new  ArraySearch();
System.out.println("Enter the element to search:");
int se=sc.nextInt();
System.out.println("Choose your option:");
System.out.println("1.Linear search\n2. Simple Binary search\n3.Recursive binary search\n4.EXIT....");
System.out.print("option:");
int opt=sc.nextInt();
int result=-1;
switch(opt){
case 1:result=as.linearSearch(se,numbers);
break;
case 2:	Arrays.sort(numbers);
result=as.simpleBinarySearch(se,numbers);
break;
case 3:Arrays.sort(numbers);
result=as.recursiveBinarySearch(numbers,0,size-1,se);
break;
case 4:Arrays.sort(numbers);
result=Arrays.binarySearch(numbers,se);
break;
default:System.out.print("\ninvalid option");
break;
}
if(result>-1){
System.out.println(se+" found ");
}
else{
System.out.println(se+" not found ");
}
}

//linear search
int linearSearch(int n,int[] numbers){
for(int i=0;i<numbers.length;i++){
if(numbers[i]==n){
return i;
}
}
return -1;
}

//simple binary search
int simpleBinarySearch(int n,int[] numbers){
int first=0;
int last=numbers.length -1;
int mid=(first+last)/2;
while(first <= last){
if(numbers[mid]<n){
first=mid + 1;
}
else if(numbers[mid]>n){
last=mid-1;
}
else{
return mid;
}
mid=(first+last)/2;
}
return -1;
}

//recursive binary search function
int recursiveBinarySearch(int[] numbers,int first,int last,int x){
if(first <= last && first <= numbers.length-1){
int mid = first + (last-first)/2;
if(numbers[mid] < x){
return recursiveBinarySearch(numbers,mid+1,last,x);
}
if(numbers[mid] > x){
return recursiveBinarySearch(numbers,first,mid-1,x);
}
return mid;
}
return -1;
}
}




	
