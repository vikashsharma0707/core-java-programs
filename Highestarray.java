 class Highestarray{
       public static void main(String args[]){
       int arr[] ={100,20,200,300,30,500};
       int max = arr[0];  //500
       for(int i=0;i<arr.length;i++){
       if(arr[i]>max){
         max =arr[i];
       }

      }
        System.out.println("length elememt of the array : "+max);
   }
 }