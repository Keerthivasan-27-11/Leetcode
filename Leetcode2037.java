public class Leetcode2037 {
    public static void main(String[] args) {
        int[] seats={2,2,6,6};
        int[] students={1,3,2,6};
        for(int i = 0;i<seats.length-1;i++){
            for(int j = 0;j<seats.length;j++){
                if(seats[i]>seats[i+1]){
                int a = seats[i];
                seats[i]=seats[i+1];
                seats[i+1]=a;
            }
            }
        }for(int i = 0;i<students.length-1;i++){
            for(int j = 0;j<students.length;j++){
                if(students[i]>students[i+1]){
                int a = students[i];
                students[i]=students[i+1];
                students[i+1]=a;
            }
            }
        }
        int count =0;
        for(int i = 0;i<seats.length;i++){
            count +=Math.abs((seats[i]-students[i]));
        }
        System.out.println(count);
    }
}
