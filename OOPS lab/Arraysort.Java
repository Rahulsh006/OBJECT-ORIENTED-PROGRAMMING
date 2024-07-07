class Arraysort{
    public static void main(String[] args){
        int a[]={33,4,8,5};
        int temp;
        int len = a.length;
        for(int i = 0; i < len; i++){
            System.out.println(a[i]);
        }
        
        for(int i = 0; i < len; i++){
            for(int j = 1; j < len; j++){
                if(a[j] < a[j-1]){
        			temp=a[j];
        			a[j]=a[j-1];
        			a[j-1]=temp;                    
                }
            }
        }

        System.out.println("\n");
               for(int i = 0; i < len; i++){
            System.out.println(a[i]);
        } 
        
    }
}
